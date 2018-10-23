//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

public class Main_decompiled {
    public Main_decompiled() {
    }

    public native void displayHelloWorld();

    public static void main(String[] args) {
        (new Main()).displayHelloWorld();
        //int x = true;
        //x = true;
        int x = 9;
        int y = 3;
        System.out.println(x + y);
    }

    static {
        System.loadLibrary("hello");
    }
}
