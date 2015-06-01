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

    Ship(String name, int cargoSize,int defence,int fuel, ArrayList<Cargo> cargo)
    {
        this.sName = name;
        this.cargoSize = cargoSize;
        this.defence = defence;
        this.fuel = fuel;
        this.cargo = cargo;
    }


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

    public void addCargo(ArrayList<Cargo> cargoin) {
        ArrayList<Cargo> temp = new ArrayList<Cargo>();
        temp = getCargo();
        if ((temp.size() + cargoin.size()) <= getCargoSize())
        {

            for (int i = 0; i < cargoin.size(); i++) {
                temp.add(cargoin.get(i));
                setCargo(temp);
            }
        }

    }
}
