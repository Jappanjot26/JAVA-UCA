import java.util.*;

public class Main{
  public static void main(String args[]){
    // sorting on based of length
    List<String> list = new ArrayList<>(List.of("abc", "nsffr", "skajrh", "dsj", "sder", "as"));
    // Comparator<String> comp = new Comparator<String>(){
    //   public int compare(String a, String b){
    //     if(a.length() > b.length()) return 1;
    //     else return -1;
    //   }
    // };

    Comparator<String> comp = (a, b) -> a.length() > b.length() ? 1 : -1;

    Collections.sort(list, comp);
    System.out.println(list);
  }
}