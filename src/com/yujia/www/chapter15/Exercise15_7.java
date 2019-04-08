package com.yujia.www.chapter15;

/**
 * Created by oxyzyj on 2019/4/7.
 * Chapter Strings, Exercise 7, page 527
 * write and test a regular expression that checks a sentence to see
 * that it begins with a capital letter and ends with a period.
 */
public class Exercise15_7 {
    public static void main(final String[] args) {
        String pattern = "^[A-Z].*\\.$";
        String s1 = "Once upon a time.";
        String s2 = "abcd.";
        String s3 = "Abcd?";
        String s4 = "An easy way out.";
        String s5 = "Zorro.";
        String s6 = "X.";
        System.out.println(s1.matches(pattern));
        System.out.println(s2.matches(pattern));
        System.out.println(s3.matches(pattern));
        System.out.println(s4.matches(pattern));
        System.out.println(s5.matches(pattern));
        System.out.println(s6.matches(pattern));
    }
}
