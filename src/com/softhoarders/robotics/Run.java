package com.softhoarders.robotics;

import com.softhoarders.robotics.data.BMX;
import com.softhoarders.robotics.data.Bicycle;
import com.softhoarders.robotics.data.MountainBike;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        Bicycle bike1 = new MountainBike(1, 10);
        System.out.println(bike1);
        System.out.println("HashCode: " + bike1.hashCode());


        Bicycle bike2 = new BMX(1, 10);
        System.out.println(bike2);
        System.out.println("HashCode: " + bike2.hashCode());


        List<Bicycle> list = new ArrayList<>();
        list.add(bike1);
        list.add(bike2);

        for (Bicycle bike : list) {
            bike.run();
        }


    }


}


