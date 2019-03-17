package com.yujia.www.chapter13;

import java.util.*;

public class Exercise13_23 {
    private static Map<Integer, Integer> statistics() {
        Random random = new Random();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        return m;
    }

    private static int getMostFrequentNumber(Map<Integer, Integer> m) {
        int maxFrequency = -1;
        int mostFrequentNumber = -1;
        for (Map.Entry<Integer, Integer> entry : m.entrySet())
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentNumber = entry.getKey();
            }
        return mostFrequentNumber;
    }

    public static void main(final String[] args) {
        Map<Integer, Integer> mostFrequentNumbersDist = new TreeMap<>();
        for (int i = 0; i < 10000; i++) {
            Map<Integer, Integer> stats = statistics();
            int mostFrequentNumber = getMostFrequentNumber(stats);
            Integer freq = mostFrequentNumbersDist.get(mostFrequentNumber);
            mostFrequentNumbersDist.put(mostFrequentNumber, freq == null ? 1 : freq + 1);
        }
        System.out.println(mostFrequentNumbersDist);
    }
}
