package com.yujia.www.chapter11;

interface Cycle2 {
    void ride();
}

interface Cycle2Factory {
    Cycle2 getCycle();
}

class Unicycle2 implements Cycle2 {
    @Override
    public void ride() {
        System.out.println("Unicycle2 ride");
    }
}

class Bicycle2 implements Cycle2 {
    @Override
    public void ride() {
        System.out.println("Bicycle2 ride");
    }
}

class Tricycle2 implements Cycle2 {
    @Override
    public void ride() {
        System.out.println("Tricycle2 ride");
    }
}

class Unicycle2Factory implements Cycle2Factory {
    @Override
    public Cycle2 getCycle() {
        return new Unicycle2();
    }
}

class Bicycle2Factory implements Cycle2Factory {
    @Override
    public Cycle2 getCycle() {
        return new Bicycle2();
    }
}

class Tricycle2Factory implements Cycle2Factory {
    @Override
    public Cycle2 getCycle() {
        return new Tricycle2();
    }
}

public class Exercise11_18 {
    public static void Rider(Cycle2Factory f) {
        Cycle2 c = f.getCycle();
        c.ride();
    }

    public static void main(final String[] args) {
        Rider(new Unicycle2Factory());
        Rider(new Bicycle2Factory());
        Rider(new Tricycle2Factory());
    }
}
