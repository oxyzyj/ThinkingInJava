package com.yujia.www.chapter13;

import java.util.*;

class Word {
    private String s;
    private int count;

    Word(String s, int count) {
        this.s = s;
        this.count = count;
    }

    @Override
    public String toString() {
        return s + ": " + count;
    }
}

public class Exercise13_21 {
    public static void main(final String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("interesting", "interesting", "Computer", "Science", "world"));
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println(words);

        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            if (!countMap.containsKey(word)) {
                countMap.put(word, 1);
            } else {
                int count = countMap.get(word);
                countMap.put(word, count + 1);
            }
        }

        Set<Word> wordObjects = new HashSet<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet())
            wordObjects.add(new Word(entry.getKey(), entry.getValue()));
        System.out.println(wordObjects);
    }
}
