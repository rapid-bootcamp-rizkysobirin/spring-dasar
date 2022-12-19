package com.rapitech.springdasar.singleton;

public class Pemerintah {
    private static Pemerintah pemerintah = new Pemerintah();

    public static Pemerintah getInstance(){
        return pemerintah;
    }

    private Pemerintah(){
        System.out.println("object created...");
    }
}
