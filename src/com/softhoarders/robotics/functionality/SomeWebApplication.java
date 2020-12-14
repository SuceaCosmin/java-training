package com.softhoarders.robotics.functionality;

import com.softhoarders.robotics.data.IWeatherMessage;

public class SomeWebApplication implements IWeatherStationSubscriber {
    @Override
    public void temperatureUpdate(IWeatherMessage message) {

        System.out.println("Displaying message on some web page:....");
        System.out.println("Some fancy widget that displays temperature: " + message.getTemperature());
    }
}
