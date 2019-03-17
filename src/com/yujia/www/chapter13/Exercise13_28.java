package com.yujia.www.chapter13;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Exercise13_28 {
    public static void main(final String[] args) {
        Queue<Double> q = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            q.offer(random.nextDouble());
        while (!q.isEmpty())
            System.out.println(q.poll());
    }
}
