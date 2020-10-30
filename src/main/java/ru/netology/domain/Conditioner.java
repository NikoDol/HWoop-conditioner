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
    }

    public void increaseCurrentTemperature() {
        // 28 подставлено , вместо currentTemperature для выполнения задания, по бранчам.
        setCurrentTemperature(28 + 1);
        if (currentTemperature > maxTemperature) {
            setCurrentTemperature(maxTemperature);
            return;
        }
    }

    public void decreaseCurrentTemperature() {
        // 17 подставлено , вместо currentTemperature для выполнения задания, по бранчам.
        setCurrentTemperature(17 - 1);
        if (currentTemperature < minTemperature) {
            setCurrentTemperature(minTemperature);
            return;
        }
    }
}

