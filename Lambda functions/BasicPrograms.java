import java.util.*;
import java.util.function.*;

public class BasicPrograms{
  public static void main(String args[]){
    // // Square Root
    // Function<Integer, Double> sqRoot = num -> Math.sqrt(num);
    // System.out.println(sqRoot.apply(16));

    // // UpperCase
    // Function<String, String> upperCase = str -> str.toUpperCase();
    // System.out.println(upperCase.apply("hello"));

    // // Remove extra spaces
    // Function<String, String> removeExtraSpaces = str -> str.trim();
    // System.out.println(removeExtraSpaces.apply(" hello "));

    // Use supplier and cosumer in Function
    Function<Supplier<String>, Consumer<String>>  randomUUID = (supplier) -> {
      String randomId = supplier.get();
      Consumer<String> consumer = (random) ->{
        for(int i = 0; i < 10; i++){
          // Thread.sleep(2000);
          System.out.println(i + " " + random + " "+ randomId);
        }
      };
      return consumer;
    };

    randomUUID.apply(() -> String.valueOf("randomId -- " + (Math.random() * 1000))).accept("Hello");

  }
}
