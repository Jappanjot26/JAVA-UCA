import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    // Predicate
    Predicate<Integer> isEven = number -> number % 2 == 0;
    System.out.println("Is 4 even? " + isEven.test(4));
    System.out.println("Is 7 even? " + isEven.test(7)); 

    // Consumer
    Consumer<String> printMessage = message -> System.out.println("Message: " + message);
    printMessage.accept("Hello, World!");
    printMessage.accept("Java is fun!"); 

    // Supplier
    Supplier<Integer> randomNum = () -> {
      return (int)(Math.random() * 100d);
    };

    System.out.println("Random number: " + randomNum.get());

    // Function
    Function<String, Integer> stringLength = str -> str.length();
    System.out.println(stringLength.apply("Hello"));
    System.out.println(stringLength.apply("Lambda"));
  }
}

