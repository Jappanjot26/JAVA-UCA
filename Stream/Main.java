import java.util.*;
import java.util.stream.*;


public class Main {
  public static void main(String[] args) {
    
    // 1st method - list to stream
    List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
    List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).collect(Collectors.toList());
    System.out.println(filteredList);

    // 2nd method - arr to stream
    int[] arr = {11,23,13,64,23};
    Integer sum = Arrays.stream(arr).reduce(0,(x, acc) -> acc + x);
    System.out.println(sum);

    // 3rd method - arr to list to stream;
    List<String> listString = Arrays.asList("a", "ab", "abc");
    List<String> doubledList = listString.stream().map(x -> x + x).collect(Collectors.toList());
    System.out.println(doubledList);
    
    // 4th method - direct from values
    Stream<Integer> stream = Stream.of(3,2,1,4,5,2,1,5,6,8,2,2,3,4);
    List<Integer> sortDistinctList = stream.distinct().sorted((a,b) -> b - a).collect(Collectors.toList());
    System.out.println(sortDistinctList);

    // 5th method - using Iterate
    Stream<Integer> listIterate = Stream.iterate(0, n-> n + 1).limit(11).skip(1);
    System.out.println(listIterate.collect(Collectors.toList()));

    // 6th method - using generate
    List<String> listGenerate = Stream.generate(() -> "hello").limit(5).collect(Collectors.toList());
    System.out.println(listGenerate);

    // Ex - "n" random numbers list
    int n = 10;
    List<Integer> randomNums = Stream.generate(() -> (int)(Math.random() * 33)).distinct().limit(n).sorted().collect(Collectors.toList()); 
    System.out.println(randomNums);

    // using peek and terminal function (min, max, count)

    Integer maximumNum = List.of(1,2,3,4,5).stream().filter(x -> x > 2).peek((x) -> System.out.println(x)).map(x -> x * 2).max((a,b) -> a-b).get();
    // Optional<Integer> maximumNum = List.of(1,2,3,4,5).stream().filter(x -> x > 2).peek((x) -> System.out.println(x)).map(x -> x * 2).max((a,b) -> a-b);
    System.out.println(maximumNum);




  }
}
  