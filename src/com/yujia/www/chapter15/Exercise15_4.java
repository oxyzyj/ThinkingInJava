package com.yujia.www.chapter15;

import java.util.Formatter;

/**
 * Created by oxyzyj on 2019/4/1.
 * Chapter Strings, Exercise 4, page 518
 * Modify Receipt.java so that the widths are all controlled by a single
 * set of constant values. The goal is to allow you to easily change a width
 * by changing a single value in one place.
 */
public class Exercise15_4 {
    private double total = 0;
    private final Formatter f = new Formatter(System.out);
    private final String format1;
    private final String format2;
    private final String format3;

    Exercise15_4(int W1, int W2, int W3) {
        this.format1 = "%-" + W1 + "s %" + W2 + "s %" + W3 + "s\n";
        this.format2 = "%-" + W1 + ".15s %" + W2 + "d %" + W3 + ".2f\n";
        this.format3 = "%-" + W1 + "s %" + W2 + "s %" + W3 + ".2f\n";
    }

    public void printTitle() {
        f.format(format1, "Item", "Qty", "Price");
        f.format(format1, "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(format2, name, qty, price);
        total += price * qty;
    }

    public void printTotal() {
        f.format(format3, "Tax", "", total * 0.06);
        f.format(format1, "", "", "-----");
        f.format(format3, "Total", "", total * 1.06);
    }

    public static void main(final String[] args) {
        Exercise15_4 e = new Exercise15_4(15, 5, 10);
        e.printTitle();
        e.print("Jack's Magic Beans", 4, 4.25);
        e.print("Princess Peas", 3, 5.1);
        e.print("Three Bears Porridge", 1, 14.29);
        e.printTotal();
    }
}
