package ru.netology.domain;

public class Radio {
    private int currentStation;

    public void setToMax() {
        currentStation = 10;
    }

    //public void setToMin() {
      //  currentStation = 0;
    //}

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 10) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int switchNextStation() {
        if (currentStation > 0) {
            currentStation = currentStation + 1;
        }
        if (currentStation > 10) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int switchPreviousStation() {
        if (currentStation < 10) {
            currentStation = currentStation - 1;
        }
        if (currentStation < 0) {
            currentStation = 10;
        }
        return currentStation;
    }

    public int getCurrentStation() {
       return currentStation;
    }

    private int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 10) {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            return;
        }
    }
}
