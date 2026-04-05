import java util.*;
abstract class Person {
  private Sring nae;
  private int age;
  pblic Person(String name,int age) {
    if(age<=0)
      throw new IllegalArgumentException("Invalid Age");
    this.age=age;
    this.name=name;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public abstract void displayInfo();
}
class Student extends Person
