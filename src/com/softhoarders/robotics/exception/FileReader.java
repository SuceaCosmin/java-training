package com.softhoarders.robotics.exception;

import com.softhoarders.robotics.data.Human;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {


    public List<Human> LoadInformationFromFile(File file) throws Exception {

        BufferedReader reader = new BufferedReader(new java.io.FileReader(file));

        String line;

        List<Human> list = new ArrayList<>();
        int currentLine = 1;
        while ((line = reader.readLine()) != null) {

            try {

                String[] values = line.split(",");

                String name = values[0];
                int age = Integer.valueOf(values[1]);
                int money = Integer.valueOf(values[2]);

                list.add(new Human(name, age, money));
            } catch (Exception e) {

                System.err.println("Failed to read information from line " + currentLine + " due to: " + e.getMessage());
            }
            currentLine++;
        }

        return list;
    }


}
