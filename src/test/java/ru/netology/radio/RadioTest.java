package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

      /*
       Теперь объекты радио в своём поле будут хранить и количество станций, заданное при создании объекта радио.
       Для этого вам понадобится создать свой конструктор для класса Radio с одним параметром,
       принимающим желаемое количество радиостанций и сохраняющим это значение у себя в поле.
       Ещё один конструктор потребуется без параметров,
       чтобы, если пользователь нашего класса не захотел указывать количество радиостанций,
       мы бы выставили их количество в 10 штук, как указано в требованиях, «по умолчанию — 10».
     */

public class RadioTest {


    @Test //new_1

    public void anyAmountOfStations() {
        Radio radio = new Radio(43);

        radio.setCurrentRadioStation(36);

        int expected = 36;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //1

    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //2

    public void shouldSetRadioStationUnderLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //3

    public void shouldSetRadioStationOverLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(15);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //4

    public void shouldSetRadioStationMinus1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //5

    public void shouldSetRadioStationNull() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //6

    public void shouldSetRadioStationOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //7

    public void shouldSetRadioStationEight() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //8

    public void shouldSetRadioStationNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //9

    public void shouldSetRadioStationTen() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //10

    public void shouldSetRadioStationNext() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);

        radio.next();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //11

    public void shouldSetRadioStationNextFromNull() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);
        radio.setCurrentRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //12

    public void shouldSetRadioStationNextFromOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //13

    public void shouldSetRadioStationNextFromEight() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //14

    public void shouldSetRadioStationNextFromNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //15

    public void shouldSetRadioStationPrev() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);

        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //16

    public void shouldSetRadioStationPrevNull() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //17

    public void shouldSetRadioStationPrevOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //18

    public void shouldSetRadioStationPrevNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    /*
    Требования к работе с уровнем громкости звука
    1) Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука в пределах от 0 до 100.
    2) Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на +
    (=вызов метода увеличения громкости на один, придумайте название сами) не должно ни к чему приводить.
    3) Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на -
    (=вызов метода уменьшения громкости на один, придумайте название сами) не должно ни к чему приводить.
     */

    @Test //19

    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(55);

        int expected = 55;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //20

    public void shouldSetCurrentVolumeUnderLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(-40);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //21

    public void shouldSetCurrentVolumeOverLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(140);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //22

    public void shouldSetCurrentVolumeMinusOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //23

    public void shouldSetCurrentVolumeNull() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(23);
        radio.setCurrentRadioVolume(0);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //24

    public void shouldSetCurrentVolumeOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(1);

        int expected = 1;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //25

    public void shouldSetCurrentVolume99() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(99);

        int expected = 99;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //26

    public void shouldSetCurrentVolume100() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(100);

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //27

    public void shouldSetCurrentVolume101() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(101);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //28

    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(15);

        radio.plus();

        int expected = 16;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //29

    public void shouldIncreaseCurrentVolumeOverLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(100);

        radio.plus();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //30

    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(54);

        radio.minus();

        int expected = 53;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //31

    public void shouldDecreaseCurrentVolumeUnderLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(0);

        radio.minus();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

}
