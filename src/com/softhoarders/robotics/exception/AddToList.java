package com.softhoarders.robotics.exception;

import java.util.ArrayList;
import java.util.List;

public class AddToList {


    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        AddElement("value");
        AddElement("value2");
        AddElement("value3");
        AddElement("value4");
        AddElement("value");
        AddElement("value");
        AddElement("value");
        AddElement(null);

    }


    public static void AddElement(String value) {

        if (value == null) {
            return;
        }

        list.add(value);
    }


}
