package com.yujia.www.chapter15;

/**
 * Created by oxyzyj on 2019/4/7.
 * Chapter Strings, Exercise 6, page 523
 * Create a class that contains int, long, float, and double fields. Create
 * a toString() method for this class that uses String.format(), and demonstrate
 * that your class works correctly.
 */
public class Exercise15_6 {
    private final int a;
    private final long b;
    private final float c;
    private final double d;

    Exercise15_6(int _a, long _b, float _c, double _d) {
        a = _a;
        b = _b;
        c = _c;
        d = _d;
    }

    @Override
    public String toString() {
        return String.format("%d, %d, %f, %f", a, b, c, d);
    }

    public static void main(final String[] args) {
        Exercise15_6 e = new Exercise15_6(1, 1111111111111L, 1.111111F, 1.111111);
        System.out.print(e.toString());
    }
}
