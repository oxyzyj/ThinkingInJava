package com.yujia.www.chapter7;

class Tank{
  boolean isFilled = false;
  Tank() {
    this(false);
  }
  Tank(boolean isFilled) {
    this.isFilled = isFilled;
  }
  void Fill() {
    isFilled = true;
  }
  void Empty() {
    isFilled = false;
  }
  protected void finalize() {
    if (isFilled) {
      System.out.println("Err: the tank is still be filled");
    }
  }
}

public class Exercise7_12 {
  public static void main(String[] args) {
    Tank t1 = new Tank();
    t1.Fill();
    Tank t2 = new Tank();
    t2.Fill();
    t2.Empty();
    new Tank(true);  // drop the reference, forget to clean up
    System.gc();
    System.runFinalization();
  }
}