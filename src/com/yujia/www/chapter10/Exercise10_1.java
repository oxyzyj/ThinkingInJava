package com.yujia.www.chapter10;

class Cycle {
  String name = "Cycle";
  int wheels = 0;
  public int getWheels() {return wheels; }
  static void travel(Cycle c) {
    System.out.println("cycle ride "+ c);
  }

  public String toString() {
// if do not want to override toString in Unicycle and Bicycle, need to add this:
//   if (this instanceof Unicycle) {
//     return ((Unicycle) this).name;
//   }
    return this.name;
  }
}
class Unicycle extends Cycle {
  String name = "Unicycle";
  int wheels = 1;
  public int getWheels() {return wheels; }
  public String toString() {
    return this.name;
  }
}
class Bicycle extends Cycle {
  String name = "Bicycle";
  int wheels = 2;
  public int getWheels() {return wheels; }
  public String toString() {
    return this.name;
  }
}
public class Exercise10_1 {
  static void ride(Cycle c) {
    c.travel(c);
    System.out.println(c.getWheels());
  }
  public static void main(String[] args) {
    Unicycle u = new Unicycle();
    ride(u);
    Bicycle b = new Bicycle();
    ride(b);
  }
}
