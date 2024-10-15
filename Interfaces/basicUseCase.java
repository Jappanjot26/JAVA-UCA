import java.util.*;
import java.lang.*;
import java.io.*;

// interface list<K> {
//   public int add(K a);
//   public int remove(int idx);
//   public boolean isEmpty();
//   public int getSize();
// }

public class basicUseCase{
  public static void main(String[] args){
    List<Integer> array = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    array.add(1);
    array.add(2);
    array.add(3);

    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);

    System.out.println("Array :" + array);
    System.out.println("Linked List :" + linkedList);
  }
}