package com.yujia.www.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oxyzyj on 2019/4/1.
 * Chapter Strings, Exercise 2, page 511
 * Repair InfiniteRecursion.java
 */
public class Exercise15_2 {
    @Override
    public String toString() {
        return "address: " + super.toString() + "\n";
    }

    public static void main(final String[] args) {
        List<Exercise15_2> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(new Exercise15_2());
        System.out.println(list);
    }
}
