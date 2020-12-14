package com.softhoarders.robotics.functionality;

import com.softhoarders.robotics.data.IWeatherMessage;

public class NewSubscriber implements IWeatherStationSubscriber {
    @Override
    public void temperatureUpdate(IWeatherMessage message) {
        System.out.println(message.getTemperatureMessage());
    }
}
