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
        ArrayList<Cargo> temp;
        temp = getCargo();
        for (int i = 0; i < cargoin.size(); i++) {
                temp.add(cargoin.get(i));
                setCargo(temp);
         }
    }

    public void removeCargo(String type, Planet p)
    {
        int num = 0;
        for (int i = 0; i < cargo.size(); i++) {
            if (cargo.get(i).getcName().equalsIgnoreCase(type))
            {
                num++;
            }
        }
        if (num > 10)
        {
            for (int i = 0; i < cargo.size(); i++) {
                if (cargo.get(i).getcName().equalsIgnoreCase(type))
                {
                    cargo.remove(i);
                    num--;
                }
                if (num < 0)
                    break;
            }

        }
    }
}
