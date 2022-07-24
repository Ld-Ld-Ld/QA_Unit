package org.example.transport;

public class Vehicle {

    public int passengers;
    private int fuelcap; //объем топливного бака в галлонах
    private int mpg; // потребление топлива в милях на галлон

    //    eto konstructor:
    public Vehicle(int numberOfPassengers, int fuelCapVolume, int milesPerGallon) {
        passengers = numberOfPassengers;
        fuelcap = fuelCapVolume;
        mpg = milesPerGallon;

    }

    //    etot metod ni4ego ne prinimaet i ni4ego ne vozvrashaet
    void range() {
        System.out.println("maximum distance with full fuelcap is " + fuelcap + mpg + "miles");
    }


    //    etot metood ni4ego ne prinimaet, no vozvrashet tselocisl znacenia:
    public int rangeInt() {
        return mpg * fuelcap;
    }

    //       etot metod prinimaet tselocisl znacenia i vozvrashet drobnie:
    public double fuelNeeded(int distance) {
        return (double) distance / mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

}


