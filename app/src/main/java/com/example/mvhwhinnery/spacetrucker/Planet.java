package com.example.mvhwhinnery.spacetrucker;

import java.util.ArrayList;

/**
 * Created by mv.awooten on 5/29/2015.
 */
public class Planet
{
    private String name,spec;
    ArrayList<Cargo> cargo = new ArrayList<Cargo>();

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
}
