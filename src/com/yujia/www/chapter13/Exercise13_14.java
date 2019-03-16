package com.yujia.www.chapter13;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercise13_14 {
    public static List<Integer> list;

    public static void addMiddle(int i) {
        ListIterator<Integer> listIterator = list.listIterator(list.size() / 2);
        listIterator.add(i);
    }

    public static void main(final String[] args) {
        list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            addMiddle(i);
            System.out.println(list);
        }
    }
}
