package com.yujia.www.chapter13;

import java.util.Iterator;
import java.util.Random;

class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void amend() {
        System.out.println("Shape.amend()");
    }

    @Override
    public String toString() {
        return "Shape";
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void amend() {
        System.out.println("Circle.amend()");
    }

    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void amend() {
        System.out.println("Square.amend()");
    }

    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void amend() {
        System.out.println("Triangle.amend()");
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}

public class Exercise13_31 implements Iterable<Shape> {
    private Random random = new Random();
    private Shape[] shapes;

    public Shape make() {
        switch (random.nextInt(3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            default:
                return new Triangle();
        }
    }

    Exercise13_31(int n) {
        shapes = new Shape[n];
        for (int i = 0; i < n; i++)
            shapes[i] = make();
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < shapes.length;
            }

            @Override
            public Shape next() {
                return shapes[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(final String[] args) {
        Exercise13_31 exercise13_31 = new Exercise13_31(20);
        for (Shape s : exercise13_31)
            System.out.println(s);
    }


}
