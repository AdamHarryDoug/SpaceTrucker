package com.example.mvhwhinnery.spacetrucker;

/**
 * Created by mv.awooten on 5/28/2015.
 */
public class Ship
{
    private String sName = "";
    private int cargoSize,defence,fuel;

    public void setCargoSize(int cargoSize) {
        this.cargoSize = cargoSize;
    }

    public int getCargoSize() {
        return cargoSize;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsName() {
        return sName;
    }
}
