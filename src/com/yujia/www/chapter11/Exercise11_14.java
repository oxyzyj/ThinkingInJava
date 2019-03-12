package com.yujia.www.chapter11;

interface A1 {
    void print_a11();

    void print_a12();
}

interface B1 {
    void print_b11();

    void print_b12();
}

interface C1 {
    void print_c11();

    void print_c12();
}

interface D1 extends A1, B1, C1 {
    void print_d11();
}

class D2 {
    public void print_d21() {
    }
}

class E1 extends D2 implements D1 {
    @Override
    public void print_a11() {
    }

    ;

    @Override
    public void print_a12() {
    }

    ;

    @Override
    public void print_b11() {
    }

    ;

    @Override
    public void print_b12() {
    }

    ;

    @Override
    public void print_c11() {
    }

    ;

    @Override
    public void print_c12() {
    }

    ;

    @Override
    public void print_d11() {
    }

    ;
}

public class Exercise11_14 {
    public static void f1(A1 a1) {
        a1.print_a11();
    }

    public static void f2(B1 b1) {
        b1.print_b11();
    }

    public static void f3(C1 c1) {
        c1.print_c11();
    }

    public static void f4(D1 d1) {
        d1.print_a11();
    }

    public static void main(final String[] args) {
        E1 e1 = new E1();
        f1(e1);
        f2(e1);
        f3(e1);
        f4(e1);
    }
}
