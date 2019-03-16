package com.yujia.www.chapter10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id;

    public Shared() {
        id = counter;
        counter++;
        System.out.println("Creating " + this);
    }

    public int getRefcount() {
        return refcount;
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0)
            System.out.println("disposing " + this);
    }

    protected void finalize() {
        if (refcount > 0)
            System.out.println("Error:  " + refcount + " Shared" + id + " objects in use");
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
}

class Rodent {
    private Characteristic c = new Characteristic("has tail");
    private Shared shared;
    static long counter = 0;

    final long id;

    Rodent(Shared shared) {
        System.out.println("Rodent()");
        this.shared = shared;
        this.shared.addRef();
        id = counter;
        counter++;
    }

    void eat() {
        System.out.println("Rodent eat");
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Rodent " + id;
    }
}

class Mouse extends Rodent {
    private Characteristic c = new Characteristic("likes cheese");

    Mouse(Shared shared) {
        super(shared);
        System.out.println("Mouse()");
    }

    @Override
    void eat() {
        System.out.println("Mouse eat");
    }

    @Override
    public String toString() {
        return "Mouse " + id;
    }
}

class Gerbil extends Rodent {
    private Characteristic c = new Characteristic("from India");

    Gerbil(Shared shared) {
        super(shared);
        System.out.println("Gerbil()");
    }

    @Override
    void eat() {
        System.out.println("Gerbil eat");
    }

    @Override
    public String toString() {
        return "Gerbil " + id;
    }
}

class Hamster extends Rodent {
    Hamster(Shared shared) {
        super(shared);
        System.out.println("Hamster()");
    }

    @Override
    void eat() {
        System.out.println("Hamster eat");
    }

    @Override
    public String toString() {
        return "Hamster " + id;
    }
}

public class Exercise10_12 {
    public static void main(final String[] args) {
        Shared shared = new Shared();
        List<Rodent> rodents = new ArrayList<>();
        System.out.println(shared.getRefcount());
        rodents.add(new Rodent(shared));
        System.out.println(shared.getRefcount());
        rodents.add(new Mouse(shared));
        System.out.println(shared.getRefcount());
        rodents.add(new Gerbil(shared));
        System.out.println(shared.getRefcount());
        rodents.add(new Hamster(shared));
        System.out.println(shared.getRefcount());
        System.out.println();

        Iterator<Rodent> iterator = rodents.iterator();
        while (iterator.hasNext()) {
            Rodent rodent = iterator.next();
            rodent.eat();
            rodent.dispose();
            System.out.println(shared.getRefcount());
        }
        shared.finalize();
    }
}
