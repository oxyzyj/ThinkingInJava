package com.yujia.www.chapter15;

import java.util.Arrays;

/**
 * Created by oxyzyj on 2019/4/7.
 * Chapter Strings, Exercise 8, page 527
 * Split the string Splitting.knights on the words "the" or "you."
 */
public class Exercise15_8 {
    public static final String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a herring!";

    public static void split(String regex) {
        System.out.println(
                Arrays.toString(knights.split(regex)));
    }

    public static void main(final String[] args) {
        split("the|you");
    }
}
