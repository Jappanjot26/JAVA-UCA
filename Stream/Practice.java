import java.util.*;
import java.util.stream.*;
// Lambdas, Predicate, Supplier, Consumer, Streams, 

public class Practice {
  public static void main(String[] args) {
    
    long start = System.currentTimeMillis();
    
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", null, null, "Rohit", "Ash", "Cob");
    
    // filter the names with starting 'A'
    List<String> filtered = names.stream()
    .filter(name -> name != null && name.charAt(0) == 'A')
    .collect(Collectors
    .toList());
    System.out.println(filtered);

    // uppercase all names
    List<String> uppercased = names.stream()
    // .filter(name -> name != null)
    .filter(Objects::nonNull)
    // .map(name -> name.toUpperCase())
    .map(String::toUpperCase)
    .collect(Collectors
    .toList());
    System.out.println(uppercased);

    // combine all the names
    String combinedName = names.stream()
    .filter(Objects::nonNull)
    .reduce("", (a, b) -> a + b);
    System.out.println(combinedName);

    List<Integer> nums = Stream.iterate(1, num -> num + 1)
    .limit(10)
    .collect(Collectors.toList());
    Integer sum = nums.stream()
    // .reduce(0, (num1, num2) -> num1 + num2);
    .reduce(0, Integer::sum);
    System.out.println(sum);

    // Grouping of names by Starting letter
    Map<Character, List<String>> grouped = names.stream()
    .filter(Objects::nonNull)
    .collect(Collectors.groupingBy(name -> name.charAt(0)));

    grouped.forEach((key, value) -> System.out.println(key + " -> " + value));

    // groups names by length
    Map<Integer, List<String>> groupedLength = names.stream()
    .filter(Objects::nonNull)
    .collect(Collectors.groupingBy(name -> name.length()));

    groupedLength.forEach((key, value) -> System.out.println(key + " -> " + value));

    List<Integer> nums10000 = Stream.iterate(1, num -> num + 1)
    .limit(10000)
    .collect(Collectors.toList());
    
    System.out.println(nums10000.parallelStream()
    .reduce(0, Integer::sum));
    

    long end = System.currentTimeMillis();
    long timeElapsed = end - start;
    System.out.println("Execution time: " + timeElapsed +"ms");


  }
}
