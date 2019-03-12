package com.yujia.www.chapter7;

class Tank {
    private boolean _isFilled = false;

    Tank() {
        this(false);
    }

    Tank(boolean isFilled) {
        this._isFilled = isFilled;
    }

    void fill() {
        _isFilled = true;
    }

    void empty() {
        _isFilled = false;
    }

    @Override
    protected void finalize() {
        if (_isFilled) {
            System.err.println("Err: the tank is still be filled");
        }
    }
}

public class Exercise7_12 {
    public static void main(final String[] args) {
        final Tank t1 = new Tank();
        t1.fill();
        final Tank t2 = new Tank();
        t2.fill();
        t2.empty();
        new Tank(true);  // drop the reference, forget to clean up
        System.gc();
        System.runFinalization();
    }
}