interface Shape{
  public double area();
  public int numSides();
  public String shapeName();
}

class Circle implements Shape{
  private double radius;
  public Circle(double radius){
    this.radius = radius;
  }
  public double area(){
    return Math.PI * radius * radius;
  }
  public int numSides(){
    return 0;
  }
  public String shapeName(){
    return "Circle";
  }
}

abstract class Triangle implements Shape{
  private double base;
  private double height;

  public Triangle(double base, double height){
    this.base = base;
    this.height = height;
  }
  public double area(){
    return 0.5 * base * height;
  }
  public int numSides(){
    return 3;
  }
  public abstract String shapeName();
}

abstract class Quadilateral implements Shape{
  public int numSides(){
    return 4;
  }
  public abstract double area();
  public abstract String shapeName();
}

class Isoceles extends Triangle{
  public Isoceles(double base, double height){
    super(base, height);
  }
  public String shapeName(){
    return "Isoceles Triangle";
  }
}

class Scalene extends Triangle{
  public Scalene(double base, double height){
    super(base, height);
  }
  public String shapeName(){
    return "Scalene Triangle";
  }
}

class Equilateral extends Triangle{
  public Equilateral(double base, double height){
    super(base, height);
  }
  public String shapeName(){
    return "Equilateral Triangle";
  }
}

class Rectangle extends Quadilateral{
  double length;
  double breadth;
  Rectangle(double length, double breadth){
    this.length = length;
    this.breadth = breadth;
  }
  public double area(){
    return length * breadth;
  }
  public String shapeName(){
    return "Rectangle";
  }
}

class Square extends Rectangle{
  Square(double length){
    super(length, length);
  }
  public String shapeName(){
    return "Square";
  }
}



public class ShapeEntity{
  public static void main(String args[]){
    Shape s = new Square(8);
    System.out.println("Area - "+s.area());
    System.out.println("Number of Sides - "+s.numSides());
    System.out.println("Shape Name - "+s.shapeName());
  }
}