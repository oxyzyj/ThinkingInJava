package com.yujia.www.chapter13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise13_18 {
    public static void main(final String[] args) {
        Map<Integer, Character> testMap = new HashMap<>();
        for (int i = 4; i >= 0; i--)
            testMap.put(i, (char) ('a' + i));
        System.out.println(testMap);

        Integer[] keys = testMap.keySet().toArray(new Integer[testMap.size()]);
        Arrays.sort(keys);

        Map<Integer, Character> testMap2 = new LinkedHashMap<>();
        for (int i = 0; i < keys.length; i++) {
            int key = keys[i];
            char value = testMap.get(key);
            testMap2.put(key, value);
        }
        System.out.println(testMap2);
    }
}
