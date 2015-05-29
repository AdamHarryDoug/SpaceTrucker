package com.example.mvhwhinnery.spacetrucker;

/**
 * Created by mv.awooten on 5/28/2015.
 */
public class Player
{
    private int uec = 0;
    private Ship pShip;
    private String name;

    Player(int uecin, Ship pShip, String name)
    {
        uec = uecin;
        this.pShip = pShip;
        this.name = name;
    }



    public void setUec(int uecin)
    {uec = uecin;}
    public int getUec()
    {return uec;}
    public void setpShip(Ship pShip) {
        this.pShip = pShip;
    }

    public Ship getpShip() {
        return pShip;
    }

}
