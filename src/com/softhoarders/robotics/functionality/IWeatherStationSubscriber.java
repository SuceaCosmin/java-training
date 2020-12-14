package com.softhoarders.robotics.functionality;

import com.softhoarders.robotics.data.IWeatherMessage;

public interface IWeatherStationSubscriber {

    void temperatureUpdate(IWeatherMessage message);

}
