package com.softhoarders.robotics.collections;

import com.softhoarders.robotics.data.Human;

import java.util.*;

public class ListExamples {

    public static void main(String[] args) {

        List<Human> list = new ArrayList<>();

        Human human = new Human("Jessica", 32, 100);


        list.add(new Human("John", 30, 100));
        list.add(new Human("Jessica", 32, 200));
        list.add(new Human("Tom", 23, 3250));

        // print(list);


        Comparator<Human> ageBasedComparator = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Comparator<Human> moneyBaseComparator = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Comparator<Human> nameBasedComparator = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };


        Iterator<Human> iterator = list.iterator();


        while (iterator.hasNext()) {

            Human h = iterator.next();
            System.out.println(h);

        }


    }


    public static void print(List<Human> list) {

        for (Object object : list) {
            System.out.println(object);
        }

    }


}
