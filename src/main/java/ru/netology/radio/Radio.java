package ru.netology.radio;

public class Radio {
    //номер текущей радиостанции
    //громкость звука

    private int currentRadioStation;
    private int currentRadioVolume;

    public void next() {
        if (currentRadioStation != 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
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
        if (currentRadioStation > 9) {
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