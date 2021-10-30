package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 10;
        int actual = radio.switchNextStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchNextOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.switchNextStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        int expected = 0;
        int actual = radio.switchPreviousStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchPreviousOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 10;
        int actual = radio.switchPreviousStation();
        assertEquals(expected, actual);
    }
}