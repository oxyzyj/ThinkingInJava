package com.yujia.www.chapter13;

import java.util.*;

class Test {
    private int id = 0;

    Test(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Test:" + id;
    }
}

public class Exercise13_24 {
    public static void main(final String[] args) {
        Map<String, Test> map = new LinkedHashMap<>();
        map.put("one", new Test(1));
        map.put("two", new Test(2));
        map.put("three", new Test(3));
        map.put("four", new Test(4));

        Set<String> sortedKeys = new TreeSet<>(map.keySet());
        Map<String, Test> sortedMap = new HashMap<>();
        for (String s : sortedKeys)
            sortedMap.put(s, map.get(s));

        System.out.println(sortedMap);
    }
}
