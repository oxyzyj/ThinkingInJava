class MyString {
  static String a1 = "abc";
  static String a2;
  static {
    a2 = "def";
    System.out.println("aaaaa");
  }
  static void print() {
    System.out.println(a1);
    System.out.println(a2);
  }
  MyString() {
    System.out.println("constructor");
  }
}

public class Exercise7_13 {
  public static void main(String[] args) {
    System.out.println("inside main");
    MyString.print();
  }
  static MyString m1 = new MyString();
  static MyString m2 = new MyString();
}

//class Cup {
//  Cup(int marker) {
//    System.out.println("Cup(" + marker + ")");
//  }
//  void f(int marker) {
//    System.out.println("f(" + marker + ")");
//  }
//}
//
//class Cups {
//  static Cup cup1;
//  static Cup cup2;
//  static {
//    cup1 = new Cup(1);
//    cup2 = new Cup(2);
//  }
//  Cups() {
//    System.out.println("Cups()");
//  }
//}
//
//public class Exercise7_13 {
//  public static void main(String[] args) {
//    System.out.println("Inside main()");
//    // Cups.cup1.f(99); // (1)
//  }
//  static Cups cups1 = new Cups(); // (2)
//  static Cups cups2 = new Cups(); // (2)
//}