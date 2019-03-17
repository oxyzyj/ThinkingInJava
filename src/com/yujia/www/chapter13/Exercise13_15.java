package com.yujia.www.chapter13;

import java.util.Stack;

public class Exercise13_15 {
    public static void main(final String[] args) {
        String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '+') {
                stack.push(s.charAt(i + 1));
                i += 2;
            } else if (s.charAt(i) == '-') {
                System.out.print(stack.pop());
                i++;
            }
        }
    }
}
