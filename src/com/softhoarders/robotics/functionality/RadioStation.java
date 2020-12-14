package com.softhoarders.robotics.functionality;

import com.softhoarders.robotics.data.IWeatherMessage;

public class RadioStation implements IWeatherStationSubscriber {

    public void temperatureUpdate(IWeatherMessage message) {
        System.out.println("New Weather forecast!");
        System.out.println(message.getTemperatureMessage());
    }

}
