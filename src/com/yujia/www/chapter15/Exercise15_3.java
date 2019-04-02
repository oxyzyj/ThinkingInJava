package com.yujia.www.chapter15;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by oxyzyj on 2019/4/1.
 * Chapter Strings, Exercise 3, page516
 * Modify Turtle.java so that it sends all output to System.err.
 */
public class Exercise15_3 {
    private final String name;
    private Formatter f;

    public Exercise15_3(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s is at (%d, %d)\n", name, x, y);
    }

    public static void main(final String[] args) {
        PrintStream outAlias = System.err;
        Exercise15_3 e = new Exercise15_3("Tom", new Formatter(System.err));
        Exercise15_3 e1 = new Exercise15_3("Jerry", new Formatter(outAlias));
        e.move(0, 0);
        e1.move(1, 1);
    }
}
