package com.softhoarders.robotics.exception;

import com.softhoarders.robotics.data.Human;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainException {

    public static void main(String[] args) {

        try {
            System.out.println("Hello from MainException application...");

            List<Human> list = getHumansFromFile();
            PrintInformation(null);

        } catch (RuntimeException e) {
            System.err.println("[Error]Some exception occurred while iterating the list of humans : " + e.getMessage());
        }
    }


    private static void PrintInformation(List<Human> list) {

        if (list == null) {
            return;
        }

        for (Human human : list) {
            try {
                human.SayHello();
            } catch (Exception e) {
                System.err.println("[Error] Some exception occurred on one of the human related information provided by the server: " + e.getMessage());
            }
        }

    }

    private static List<Human> getHumansFromService() {
        List<Human> list = new ArrayList<>();
        list.add(new Human("John", 25, 100));
        list.add(new Human("Jessica", 26, 100));
        list.add(new Human("Marry", 32, 100));
        list.add(null);
        list.add(new Human("Mike", 26, 100));
        list.add(new Human("Tom", 32, 100));
        return list;
    }

    private static List<Human> getHumansFromFile() {

        FileReader reader = new FileReader();
        try {
            return reader.LoadInformationFromFile(new File("C:\\Users\\HP\\Desktop\\New folder (2)\\text.txt"));
        } catch (Exception e) {
            System.err.println("[Error] Failed to ready file due to: " + e.getMessage());
            return new ArrayList<>();
        }
    }


}
