import java.util.*;
class Student implements Comparable<Student>
{
  Integer age;
  String name;

  Student(Integer age, String name){
    this.age = age;
    this.name = name;
  }

  public int compareTo(Student other){
    return (this.age > other.age) ? 1 : -1;
  }

  public String toString() {
        return "name = '" + name + "', age = " + age ;
    }
}

public class Comp{
  public static void main(String args[]){
    List<Student> list = new ArrayList<>();
    list.add(new Student(20, "Navin"));
    list.add(new Student(11, "Sachin"));
    list.add(new Student(24, "Rahul"));
    list.add(new Student(19, "Gill"));

    // as we implemented compareTo function, no need to add compare function while calling sort()
    Collections.sort(list);
    for(Student s: list){
      System.out.println(s);
    }
  }
}