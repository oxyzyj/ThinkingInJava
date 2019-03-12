package com.yujia.www.chapter10;

class Cycle {
  private String name = "Cycle";
  private int wheels = 0;
  public int getWheels() {return wheels; }
  static void travel(Cycle c) {
    System.out.println("cycle ride "+ c);
  }
  @Override public String toString() {
// if do not want to override toString in Unicycle and Bicycle, need to add this:
//   if (this instanceof Unicycle) {
//     return ((Unicycle) this).name;
//   }
    return this.name;
  }
}
class Unicycle extends Cycle {
  private String name = "Unicycle";
  private int wheels = 1;
  @Override public int getWheels() {return wheels; }
  public void balance() {System.out.println("Unicycle balance");}
  @Override public String toString() {
    return this.name;
  }
}
class Bicycle extends Cycle {
  private String name = "Bicycle";
  private int wheels = 2;
  @Override public int getWheels() {return wheels; }
  @Override public String toString() {
    return this.name;
  }
}
public class Exercise10_1 {
  static void ride(Cycle c) {
    c.travel(c);
    System.out.println(c.getWheels());
  }
  public static void main(final String[] args) {
    Unicycle u = new Unicycle();
    ride(u);
    Bicycle b = new Bicycle();
    ride(b);
    Cycle[] cycles = {new Cycle(), new Unicycle(), new Bicycle()};
    ((Unicycle) cycles[1]).balance();
  }
}
