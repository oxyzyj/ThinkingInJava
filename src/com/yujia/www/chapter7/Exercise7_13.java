package com.yujia.www.chapter7;

public class Exercise7_13 {
  public enum Currency {
    ONE,
    TWO,
    FIVE,
    TEN,
    TWENTY,
    HUNDRED,
  }
  public static void main(String[] args) {
    for(Currency c : Currency.values()) {
      switch (c) {
        case ONE: System.out.println("ONE"); break;
        case TWO: System.out.println("TWO"); break;
        case FIVE: System.out.println("FIVE"); break;
        case TEN: System.out.println("TEN"); break;
        case TWENTY: System.out.println("TWENTY"); break;
        default: System.out.println("HUNDRED");
      }
    }
  }
}
