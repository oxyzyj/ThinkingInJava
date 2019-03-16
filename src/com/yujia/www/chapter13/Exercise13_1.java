package com.yujia.www.chapter13;

import java.util.ArrayList;
import java.util.Iterator;

class Gerbil {
    private int gerbilNumber;

    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop() {
        System.out.println(gerbilNumber);
    }

}

public class Exercise13_1 {
    public static void main(final String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            gerbils.add(new Gerbil(i));
        Iterator<Gerbil> iterator = gerbils.iterator();
        while(iterator.hasNext()){
            iterator.next().hop();
        }
//        for (Gerbil gerbil : gerbils)
//            gerbil.hop();
    }
}
