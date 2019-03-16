package com.yujia.www.chapter13;

import java.util.ArrayList;
import java.util.List;

class TestObject {
    static int counter = -1;
    private int id;

    TestObject() {
        counter++;
        id = counter;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}

public class Exercise13_7 {
    public static void main(final String[] args) {
        TestObject[] testObjects = new TestObject[10];
        for (int i = 0; i < 10; i++)
            testObjects[i] = new TestObject();
        List<TestObject> testObjectList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            testObjectList.add(testObjects[i]);
        System.out.println(testObjectList);
        List<TestObject> sub = new ArrayList<>(testObjectList.subList(1, 5));
        testObjectList.removeAll(sub);
        System.out.println(testObjectList);
    }
}
