package com.example.mvhwhinnery.spacetrucker;

import java.util.ArrayList;

/**
 * Created by mv.awooten on 5/29/2015.
 */
public class Planet
{
    private String name,spec;
    ArrayList<Cargo> cargo = new ArrayList<Cargo>();

    Planet(String name,String spec, ArrayList<Cargo> cargo)
    {
        this.name = name;
        this.spec = spec;
        this.cargo = cargo;
    }

    public void setCargo(ArrayList<Cargo> cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Cargo> getCargo() {
        return cargo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getSpec() {
        return spec;
    }

    public void addCargo(ArrayList<Cargo> cargoin) {
        ArrayList<Cargo> temp = new ArrayList<Cargo>();
        temp = getCargo();
        for (int i = 0; i < cargoin.size(); i++) {
                temp.add(cargoin.get(i));
                setCargo(temp);
         }


    }
}
