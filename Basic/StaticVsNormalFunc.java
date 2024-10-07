public class StaticVsNormalFunc{
  public void printPrimary(){
    System.out.println("Primary Class!");
  }

  public static void printStatic(){
    System.out.println("Primary Class but Static Function!");
  }

  public static void main(String args[]){
    // as printPrimary is not a static function, we need to create a object first to access it.
    StaticVsNormalFunc obj = new StaticVsNormalFunc();
    obj.printPrimary();

    // as printStatic is a static function in same class, can be called directly
    printStatic();

    // to access a non-static function from another class
    Another obj2 = new Another();
    obj2.printAnother();

    // to access a static function from another class
    // specify className
    Another.printAnotherStatic();
  }
}

class Another{
  public void printAnother(){
    System.out.println("Another Class!");
  }
  
  public static void printAnotherStatic(){
    System.out.println("Another Class but Static Function!");
  }
}