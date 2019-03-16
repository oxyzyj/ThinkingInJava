package com.yujia.www.chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Exercise13_12 {
    public static void main(final String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());
        while (listIterator1.hasPrevious())
            list2.add(listIterator1.previous());
        System.out.println(list2);
    }
}
