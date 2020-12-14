package com.softhoarders.robotics.functionality;

import com.softhoarders.robotics.data.IWeatherMessage;
import com.softhoarders.robotics.data.StandardMessage;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private double temperature;
    private List<IWeatherStationSubscriber> subscriberList;


    public WeatherStation() {
        subscriberList = new ArrayList<>();
    }

    public void readTemperature() {

        double newTemperature = Math.random();

        if (temperature != newTemperature) {
            temperature = newTemperature;

            IWeatherMessage message = new StandardMessage("Current temperature is : " + temperature, temperature);

            if (subscriberList != null) {
                for (IWeatherStationSubscriber subscriber : subscriberList) {
                    subscriber.temperatureUpdate(message);
                }
            }
        }
    }

    public void addSubscriber(IWeatherStationSubscriber subscriber) {
        subscriberList.add(subscriber);
    }
}
