package com.yujia.www.chapter11;

interface Processor {
    String name();
    Object process(Object input);
}

class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

class SwapPair {
    public String process(Object input) {
        int len = ((String) input).length();
        char[] result = new char[len];
        for (int i = 0; i< len - 1; i = i + 2) {
            result[i] = ((String) input).charAt(i+1);
            result[i+1] = ((String) input).charAt(i);
        }
        if (len % 2 != 0) {
            result[len - 1] = ((String) input).charAt(len - 1);
        }
        return new String(result);
    }
}
public class Exercise11_11 implements Processor {
    public String name() {
        return "StringAdapter";
    }
    SwapPair swapPair;
    public Exercise11_11(SwapPair s) {
        swapPair = s;
    }
    @Override
    public String process(Object input) {
        return swapPair.process(input);
    }
    public static void main(String[] args) {
        Apply.process(new Exercise11_11(new SwapPair()), "abcd");
        Apply.process(new Exercise11_11(new SwapPair()), "abcde");
    }
}
