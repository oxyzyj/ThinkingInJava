package com.yujia.www.chapter9;
class Cleanser {
  private String s = "Cleanser";
  public void append(String a) {s += a;}
  public void dilute() { append(" dilute()");}
  public void apply() {append(" apply()");}
  public void scrub() {append(" scrub()");}
  public String toString() {return s;}
}
public class Exercise9_11 {
  Cleanser cleanser = new Cleanser();
  private String s = "DetergentDelegation";
  public void append(String a) {s += a;}
  public void dilute() {
    cleanser.dilute();}
  public void apply() {
    cleanser.apply();}
  public void scrub() {
    append(" DetergentDelegation.scrub()");
    cleanser.scrub();
  }
  public void foam() {
    append(" foam()");
  }
  public String toString() {return s + " & " + cleanser;}
  public static void main(String[] args) {
    Exercise9_11 x = new Exercise9_11();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    System.out.println(x);
  }
}
