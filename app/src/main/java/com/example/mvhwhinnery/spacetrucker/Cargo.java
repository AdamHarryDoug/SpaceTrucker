package com.example.mvhwhinnery.spacetrucker;

/**
 * Created by mv.awooten on 5/29/2015.
 */
public class Cargo
{
    private String cName;
    private int basePrice;

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
}
