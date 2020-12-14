package com.softhoarders.robotics.data;

public class StandardMessage implements IWeatherMessage {

    private String messageContent;
    private double temperature;

    public StandardMessage(String messageContent, double temperature) {
        this.messageContent = messageContent;
        this.temperature = temperature;
    }

    @Override
    public String getTemperatureMessage() {
        return messageContent;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }
}
