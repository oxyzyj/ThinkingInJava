package com.yujia.www.chapter6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise6_10 {

  public static void main(final String[] args) {
    final Set<Integer> result = new HashSet<>();
    for (int x = 10; x <= 99; x++) {
      for (int y = 10; y <= x; y++) {
        final int z = x * y;
        final char a[] = Integer.toString(z).toCharArray();
        final char b[] = (Integer.toString(x) + Integer.toString(y)).toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b))
          result.add(z);
      }
    }
    for (final int i : result)
      System.out.println(i);
  }
}
