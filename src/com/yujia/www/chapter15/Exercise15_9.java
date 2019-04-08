package com.yujia.www.chapter15;

/**
 * Created by oxyzyj on 2019/4/7.
 * Chapter Strings, Exercise 9, page 527
 * replace all the vowels in Splitting.knights with underscores.
 */
public class Exercise15_9 {
    static String s = Exercise15_8.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceAll("[aeiouAEIOU]", "_"));
    }
}
