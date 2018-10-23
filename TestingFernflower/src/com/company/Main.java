package com.company;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public native void displayHelloWorld();

    static {
        System.loadLibrary("hello");
    }

    public static void main(String[] args) {
        // All information is lost when calling via JNI
        new Main().displayHelloWorld();

        // Some information is lost due to optimizations
        // (in this case dead code elimination)
        int x = 5;
        x = 3;
        x = 9;
        int y = 3;
        System.out.println(x + y);
    }
}
