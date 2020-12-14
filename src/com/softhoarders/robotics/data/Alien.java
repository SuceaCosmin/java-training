package com.softhoarders.robotics.data;

public class Alien implements IEntity {

    public static final int SOME_VALUE = 100;

    private Alien() {
        //Should not be instantiated
    }

    public static void HelloFromMars() {
        System.out.println("Hey there, humanss!!");
    }


    @Override
    public void SayHello() {
        HelloFromMars();
    }
}
