package com.yujia.www.chapter13;

import java.util.ArrayList;

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
        for (Gerbil gerbil : gerbils)
            gerbil.hop();
    }
}
