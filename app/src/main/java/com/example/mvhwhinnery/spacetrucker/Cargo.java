package com.example.mvhwhinnery.spacetrucker;

import java.util.ArrayList;

/**
 * Created by mv.awooten on 5/29/2015.
 */
public class Cargo
{
    private String cName;
    private int basePrice;
    private int realPrice;

    Cargo(String cName, int basePrice)
    {
        this.cName = cName;
        this.basePrice = basePrice;
    }


    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getcName() {
        return cName;
    }

    public void setRealPrice(int realPrice) {
        this.realPrice = realPrice;
    }

    public int getRealPrice() {
        return realPrice;
    }

    public void calculateRealPrice(ArrayList<Cargo> cargos,String name)
    {
        int amount =0;
        for (int i = 0;i < cargos.size(); i++)
        {
            if (cargos.get(i).getcName().equalsIgnoreCase(name))
            {
                amount++;
            }
        }
        if (amount< 50)
        {
            realPrice = basePrice *2;
        }
        if (amount >= 50 && amount<75)
        {
            realPrice =(int) (basePrice * 1.75);
        }
        if (amount >=75 && amount < 100)
            realPrice = (int)(basePrice * 1.50);
        if (amount >= 100 && amount < 125)
            realPrice = (int)(basePrice * 1.25);
        if (amount >= 125 && amount < 150)
            realPrice = (int)(basePrice * 1);
        if (amount >= 150 && amount < 175)
            realPrice = (int)(basePrice * .75);
        if (amount >= 175 && amount < 200)
            realPrice = (int)(basePrice * .5);
        if (amount > 225)
            realPrice = (int)(basePrice * .25);
    }
}
