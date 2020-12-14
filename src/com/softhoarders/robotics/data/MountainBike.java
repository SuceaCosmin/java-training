package com.softhoarders.robotics.data;

public class MountainBike extends Bicycle {

    private int seatHeight;

    public MountainBike(int gear, int speed) {
        super(gear, speed);
    }

    @Override
    public void run() {
        System.out.println("Riding down the hill on a cool mountain bike...");
    }


    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void doSomething() {

        System.out.println("Bicycle is running...");
        System.out.println("Seat height is :" + seatHeight);
        System.out.println("Speed is: " + speed);
        System.out.println("Gear is: " + gear);
    }


    @Override
    public String toString() {
        return "MountainBike{" +
                "seatHeight=" + seatHeight +
                '}';
    }
}
