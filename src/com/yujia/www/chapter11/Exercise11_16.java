package com.yujia.www.chapter11;

import java.nio.*;
import java.util.*;

class RandomChars {
    private static Random rand = new Random();

    public char next() {
        return (char) (rand.nextInt(26) + 'a');
    }
}

// AdaptRandomChars
public class Exercise11_16 extends RandomChars implements Readable {
    private int count;

    public Exercise11_16(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count == 0)
            return -1;
        count--;
        String result = next() + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(final String[] args) {
        Scanner s = new Scanner(new Exercise11_16(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
