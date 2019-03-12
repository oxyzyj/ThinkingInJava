package com.yujia.www.chapter9;

class Component1{
  Component1(int i) {
    System.out.println("Component1 "+ i);
  }
  void dispose() {
    System.out.println("Component1.dispose");
  }
}
class Component2{
  Component2(int i) {
    System.out.println("Component2 "+ i);
  }
  void dispose() {
    System.out.println("Component2.dispose");
  }
}
class Component3{
  Component3(int i) {
    System.out.println("Component3 "+ i);
  }
  void dispose() {
    System.out.println("Component3.dispose");
  }
}
class Root{
  private Component1 c1;
  private Component2 c2;
  private Component3 c3;
  Root(int i) {
    c1 = new Component1(1);
    c2 = new Component2(2);
    c3 = new Component3(3);
    System.out.println("Root "+ i);
  }
  void dispose() {
    System.out.println("Root.dispose");
    c3.dispose();
    c2.dispose();
    c1.dispose();
  }
}
public class Exercise9_10 extends Root {
  Component1 c1;
  Component2 c2;
  Component3 c3;
  Exercise9_10(int i) {
    super(i);
    c1 = new Component1(4);
    c2 = new Component2(5);
    c3 = new Component3(6);
    System.out.println("Stem " + i);
  }
  void dispose() {
    System.out.println("Stem.dispose");
    c3.dispose();
    c2.dispose();
    c1.dispose();
    super.dispose();
  }
  public static void main(final String[] args) {
    Exercise9_10 e = new Exercise9_10(7);
    try {
      //TODO
    } finally {
      e.dispose();
    }
  }
}
