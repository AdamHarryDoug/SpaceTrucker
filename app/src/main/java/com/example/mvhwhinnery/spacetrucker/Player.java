package com.example.mvhwhinnery.spacetrucker;

/**
 * Created by mv.awooten on 5/28/2015.
 */
public class Player
{
    private int uec = 0;
    private Ship pShip;
    private String name;
    private String location;

    Player(int uecin, Ship pShip, String name)
    {
        uec = uecin;
        this.pShip = pShip;
        this.name = name;
        location = "Earth";
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

    public void removeUEC(int uecout)
    {
        uec = uec - uecout;
    }

    public void addUEC(int uec)
    {
        this.uec = this.uec + uec;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
