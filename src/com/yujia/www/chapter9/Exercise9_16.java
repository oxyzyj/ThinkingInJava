package com.yujia.www.chapter9;

class Amphibian{
  Amphibian() {
    System.out.println("Amphibian constructor");
  }
  void speak2() {
    System.out.println("gua");
  }
  static void speak(Amphibian a) {
    a.speak2();
  }
}
public class Exercise9_16 extends Amphibian {
  @Override
  void speak2() {
    System.out.println("guagua");
  }
  public static void main(String[] args) {
    Exercise9_16 e = new Exercise9_16();
    Amphibian.speak(e);  // upcase
  }
}
