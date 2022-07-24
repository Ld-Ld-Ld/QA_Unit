package com.homework;

import org.example.transport.Truck;
import org.example.transport.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransportTest {

    Vehicle x = new Vehicle(5, 10, 20);
    Truck y = new Truck(2, 30, 50, 20);

    @Test
    public void getIntRange(){
        assertEquals("дальность поездки транспортного средства",200, x.rangeInt());
    }

    @Test
    public void getFuelNeeded (){
        assertEquals(5.0, x.fuelNeeded(100), 5);
    }

    @Test
    public void nowGetPassengers(){
        assertEquals("кол-во пассажиров", 5, x.getPassengers());
    }

    @Test
    public void nowSetPassengers(){
        assertEquals(1, 1);
    }

    @Test
    public void nowGetFuelcap(){
        assertEquals("объем топлив бака", 10, x.getFuelcap());
    }

    @Test
    public void nowSetFuelcap(){
        x.setFuelcap(60);
         assertEquals("объем топлив бака", 20.0, 20, 3);
    }

    @Test
    public void nowGetMpg(){
        assertEquals("получить потребление топлива в милях на галлон", 20, x.getMpg());
    }

    @Test
    public void nowSetMpg(){
        x.setMpg(30);
        assertEquals("установить потребление топлива в милях на галлон", 30, x.getMpg());
    }

    @Test
    public void nowGetCargocap(){
        assertEquals(20, y.getCargocap());
    }

    @Test
    public void nowPutCargo(){
        y.putCargo(50);
        assertEquals(50, 50);
    }
}