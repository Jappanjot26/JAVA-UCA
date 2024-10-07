public class Loops{
  public void forLoop(int n){
    // print upto 'n' natural numbers
    for(int i = 1; i <= n; i++){
      System.out.print(i + " ");
    }
    System.out.println("");
  }
  public void whileLoop(int n){
    // print upto 'n' natural numbers
    int i = 1;
    while(i <= n){
      System.out.print(i + " ");
      i++;
    }
    System.out.println("");
  }
  public static void main(String args[]){
    Loops obj = new Loops();
    obj.forLoop(5);
    obj.whileLoop(6);
  }
}