package com.example.mvhwhinnery.spacetrucker;

import android.widget.Toast;

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

    public ArrayList addCargo(ArrayList<Cargo> cargoin) {
        ArrayList<Cargo> temp;
        temp = getCargo();
        for (int i = 0; i < cargoin.size(); i++) {
                temp.add(cargoin.get(i));
                setCargo(temp);
         }
        return temp;
    } //adds cargo to planet

    public ArrayList removeCargo(String type) //removes cargo from planet
    {
        ArrayList<Cargo> temp;
        temp = getCargo();
        int num = 0;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).getcName().equalsIgnoreCase(type))
                num++;
        }
        if (num > 10)
        {
            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i).getcName().equalsIgnoreCase(type)) {
                    temp.remove(i);
                    i--;
                    num--;
                }
                if (num < 0)
                    break;
            }
        }
        //else
        //    Toast.makeText(MainActivity,"No cargo in your bay.",Toast.LENGTH_SHORT).show();
        return temp;
    }

}
