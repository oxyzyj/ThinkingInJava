package com.yujia.www.chapter13;

import java.util.*;

class Generator {
    private String[] dictionaries = new String[]{"Snow White", "Star Wars", "Happy", "Sleepy", "Sneezy"};
    private int key = -1;

    public String next() {
        key = (key + 1) % 5;
        return dictionaries[key];
    }

    public String[] fill(String[] result) {
        for (int i = 0; i < result.length; i++)
            result[i] = next();
        return result;
    }

    public Collection<String> fill(Collection<String> c, int len) {
        for (int i = 0; i < len; i++)
            c.add(next());
        return c;
    }
}

public class Exercise13_4 {
    public static void main(String[] args) {
        Generator generator = new Generator();

        String[] result = generator.fill(new String[10]);
        for (int i = 0; i < 10; i++)
            System.out.print(result[i] + ", ");
        System.out.println();
        
        System.out.println(generator.fill(new ArrayList<>(), 10));
        System.out.println(generator.fill(new LinkedList<>(), 10));
        System.out.println(generator.fill(new HashSet<>(), 10));
        System.out.println(generator.fill(new LinkedHashSet<>(), 10));
        System.out.println(generator.fill(new TreeSet<>(), 10));
    }
}
