interface cal{
  public int add(int a, int b);
  public int sub(int a, int b);
}

public class Calculator implements cal{
  public int add(int a, int b){
    return a + b;
  }
  public int sub(int a, int b){
    return a - b;
  }
  public static void main(String[] args){
    System.out.println("Hello");
  }
}


// Interface dont allows implementation if not all function of interface in class is implemented.
// But newer JDK allows it somehow 