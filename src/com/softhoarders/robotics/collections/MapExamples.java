package com.softhoarders.robotics.collections;

import com.softhoarders.robotics.data.Human;
import com.softhoarders.robotics.data.Occupation;

import java.util.*;

public class MapExamples {

    public static void main(String[] args) {


        Map<Occupation, List<Human>> map = new HashMap();

        map.put(Occupation.HTML, new ArrayList<>());
        map.putIfAbsent(Occupation.HTML, new ArrayList<>());
        map.put(Occupation.GOBLIN, new ArrayList<>());
        map.put(Occupation.OIER, new ArrayList<>());
        map.put(Occupation.STUDENT, new ArrayList<>());
        map.put(Occupation.TEACHER, new ArrayList<>());


        map.get(Occupation.HTML).add(new Human("Ramy", 15, 0));
        map.get(Occupation.HTML).add(new Human("CreatieMaster", 20, 1000));


//
//        map.put(Occupation.HTML, new Human("Ramy", 15, 0));
//        map.putIfAbsent(Occupation.HTML, new Human("Ramy_2", 15, 0));
//        map.put(Occupation.GOBLIN, new Human("CreatieMaster", 20, 1000));
//        map.put(Occupation.OIER, new Human("Becali", 20, 1000));
//        map.put(Occupation.STUDENT, new Human("N/A", 20, 1000));
//        map.put(Occupation.TEACHER, new Human("Camelia", 20, 1000));

//        for (Occupation occupation : map.keySet()) {
//            System.out.println(occupation);
//        }

//        for (Map.Entry<Occupation, Human> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }


//        for (Occupation occupation : map.keySet()) {
//
//            System.out.println(occupation);
//
//        }

        for (List<Human> list : map.values()) {

            for (Human human :
                    list) {
                System.out.println(human);
            }

        }


//        System.out.println(map.isEmpty());
//        System.out.println(map.size());
//        System.out.println();
//        System.out.println(map.containsKey(Occupation.GOBLIN));
//        System.out.println(map.containsValue(new Human("Ramy", 15, 0)));
//
//        System.out.println();
//        System.out.println(map.getOrDefault(Occupation.GOBLIN,new Human("N/A",100,1000000)));


    }

}
