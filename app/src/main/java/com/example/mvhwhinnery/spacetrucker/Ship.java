package com.example.mvhwhinnery.spacetrucker;

import java.util.ArrayList;

/**
 * Created by mv.awooten on 5/28/2015.
 */
public class Ship
{
    private String sName = "";
    private int cargoSize,defence,fuel;
    ArrayList<Cargo> cargo = new ArrayList<Cargo>();


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

    public ArrayList<Cargo> getCargo() {
        return cargo;
    }

    public void setCargo(ArrayList<Cargo> cargo) {
        this.cargo = cargo;
    }
}
