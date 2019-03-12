package com.yujia.www.chapter11;

interface A {
    void print1();
}

interface B extends A {
    void print2();
}

interface C extends A {
    void print3();
}

interface D extends B, C {
    void print4();
}

class E implements D {
    @Override public void print1() {};
    @Override public void print2() {};
    @Override public void print3() {};
    @Override public void print4() {};
}
public class Exercise11_13 {
    public static void main(final String[] args) {
        E e = new E();
        e.print1();
        e.print2();
        e.print3();
        e.print4();
    }
}
