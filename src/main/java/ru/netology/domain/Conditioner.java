package ru.netology.domain;

public class Conditioner {


    private int maxTemperature = 28;
    private int minTemperature = 17;
    private int currentTemperature = 22;


    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
        if (currentTemperature > maxTemperature) {
            setCurrentTemperature(maxTemperature);
            return;
        }
        if (currentTemperature < minTemperature) {
            setCurrentTemperature(minTemperature);
            return;
        }
    }

    public void increaseCurrentTemperature() {
        setCurrentTemperature(currentTemperature + 1);
    }

    public void decreaseCurrentTemperature() {
        setCurrentTemperature(currentTemperature - 1);
    }
}

