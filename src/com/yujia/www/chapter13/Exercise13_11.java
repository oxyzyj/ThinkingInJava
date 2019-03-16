package com.yujia.www.chapter13;

import java.util.*;

public class Exercise13_11 {
    public static void printCollection(Collection c) {
        Iterator iterator = c.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + ", ");
        System.out.println();
    }

    public static void main(final String[] args) {
        List<Integer> c1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        printCollection(c1);
        List<Character> c2 = new LinkedList<>(Arrays.asList('a', 'b', 'c', 'd'));
        printCollection(c2);
        Set<Double> c3 = new HashSet<>(Arrays.asList(1.1, 1.1, 1.2, 1.3));
        printCollection(c3);
        Set<String> c4 = new TreeSet<>(Arrays.asList("i", "love", "you", "you"));
        printCollection(c4);
    }
}
