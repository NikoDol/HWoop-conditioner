package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldIncreaseTemperature() {
        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        conditioner.decreaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldMaxTemperature() {
        conditioner.setCurrentTemperature(29);
        assertEquals(28, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldMinTemperature() {
        conditioner.setCurrentTemperature(16);
        assertEquals(17, conditioner.getCurrentTemperature());
    }
}
