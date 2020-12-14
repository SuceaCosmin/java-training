package com.softhoarders.robotics.data;

public class BMX extends Bicycle {

    public BMX(int gear, int speed) {
        super(gear, speed);
    }

    @Override
    public void run() {
        System.out.println("Doing some cool ticks on the BMX bike....");
    }


}
