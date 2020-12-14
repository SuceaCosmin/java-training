package com.softhoarders.robotics.example;

import com.softhoarders.robotics.functionality.NewSubscriber;
import com.softhoarders.robotics.functionality.RadioStation;
import com.softhoarders.robotics.functionality.SomeWebApplication;
import com.softhoarders.robotics.functionality.WeatherStation;

public class Main {
    public static void main(String[] args) throws Exception {

        WeatherStation station = new WeatherStation();

        RadioStation radio = new RadioStation();
        SomeWebApplication webApp = new SomeWebApplication();

        station.addSubscriber(radio);
        station.addSubscriber(webApp);

        NewSubscriber subscriber = new NewSubscriber();
        station.addSubscriber(subscriber);


        while (true) {
            station.readTemperature();
            Thread.sleep(2000);
        }

    }
}
