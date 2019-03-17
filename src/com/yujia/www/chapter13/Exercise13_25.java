package com.yujia.www.chapter13;

import java.util.*;

public class Exercise13_25 {
    public static Map<String, ArrayList<Integer>> transformToMap(List<String> words) {
        Map<String, ArrayList<Integer>> result = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (result.containsKey(word)) {
                ArrayList<Integer> index = result.get(word);
                index.add(i);
                result.put(word, index);
            } else {
                result.put(word, new ArrayList<>(Arrays.asList(i)));
            }
        }
        return result;
    }

    public static void replay(Map<String, ArrayList<Integer>> map) {
        Map<Integer, String> replay = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
            ArrayList<Integer> index = entry.getValue();
            for (int i : index)
                replay.put(i, entry.getKey());
        }
        for (int i = 0; i < replay.size(); i++)
            System.out.print(replay.get(i) + " ");

    }

    public static void main(final String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("the", "basic", "philosophy", "of", "java", "is", "that", "badly", "formed", "code", "will", "not", "be", "run", "java", "is", "good"));
        replay(transformToMap(words));
    }
}
