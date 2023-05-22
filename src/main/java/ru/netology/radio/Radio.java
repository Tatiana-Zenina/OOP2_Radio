package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int currentRadioVolume;
    private int maxRadioStations;

    public Radio () {
        this.maxRadioStations = 9;
    }

    public Radio (int amountOfStations) {
        this.maxRadioStations = amountOfStations - 1;
    }

    public void next() {
        if (currentRadioStation != maxRadioStations) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStations;
        }
    }

    public void plus() {
        if (currentRadioVolume < 100) {
            currentRadioVolume++;
        }
    }

    public void minus () {
        if (currentRadioVolume > 0) {
            currentRadioVolume--;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStations) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int currentRadioVolume) {
        if (currentRadioVolume < 0) {
            return;
        }
        if (currentRadioVolume > 100) {
            return;
        }
        this.currentRadioVolume = currentRadioVolume;
    }



}