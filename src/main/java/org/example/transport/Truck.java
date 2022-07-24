package org.example.transport;

public class Truck extends Vehicle{
    private int cargocap;

    public Truck(int numberOfPassengers, int fuelCapVolume, int milesPerGallon, int cargocap) {
        super(numberOfPassengers, fuelCapVolume, milesPerGallon);
        this.cargocap = cargocap;
    }

    public int getCargocap() {
        return cargocap;
    }

    public void putCargo(int cargocap) {
        this.cargocap = cargocap;
    }
}
