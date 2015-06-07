package com.example.mvhwhinnery.spacetrucker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


   // SharedPreferences sharedPreferences = getSharedPreferences("data",Context.MODE_PRIVATE);
    private TextView txtName;
    private TextView txtMoney;
    private TextView txtShip;
    private TextView txtLocation;

    private Planet p1 = new Planet("Aquarius","water",null);
    private Planet p2 = new Planet("Golden pastures", "crops", null);
    private Planet p3 = new Planet("SmokeyTown", "industrial", null);
    private Planet p4 = new Planet("Woodlands", "lumber",null);
    private Planet p5 = new Planet("Mines", "minerals", null);
    private Cargo cargo = new Cargo("cargo",100);

    private Ship pShip = new Ship("Van",300,2,300,null);


    private Player player = new Player(10000,pShip,null);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setTexts();
        setContentView(R.layout.activity_main);




        final Button goToStore= (Button)findViewById(R.id.button3);
        goToStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Store.class);
                MainActivity.this.startActivity(myIntent);
            }
        });


        //the following buttons are all the same.
        //they each create a button on start up and when the onCLick method
        //is called they bring up a popup menu featuring cargo
        final Button popupMars = (Button)findViewById(R.id.Mars); //finds the button ID in xml file
        popupMars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                //MenuInflater menuInflater = popupMenu.getMenuInflater();
                popupMenu.inflate(R.menu.menu_main);
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item){
                        Toast.makeText(getApplicationContext(),"You have traded cargo", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
            }
        });
        final Button popupEarth = (Button)findViewById(R.id.Earth);
        popupEarth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                //MenuInflater menuInflater = popupMenu.getMenuInflater();
                popupMenu.inflate(R.menu.menu_main);
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item){
                        Toast.makeText(getApplicationContext(),"You have traded cargo", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
            }
        });
        final Button popupRed = (Button)findViewById(R.id.Red);
        popupRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                //MenuInflater menuInflater = popupMenu.getMenuInflater();
                popupMenu.inflate(R.menu.menu_main);
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item){
                        Toast.makeText(getApplicationContext(),"You have traded cargo", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
            }
        });
        final Button popupGreen = (Button)findViewById(R.id.Green);
        popupGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                //MenuInflater menuInflater = popupMenu.getMenuInflater();
                popupMenu.inflate(R.menu.menu_main);
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item){
                        Toast.makeText(getApplicationContext(),"You have traded cargo", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
            }
        });
        final Button popupPurple = (Button)findViewById(R.id.Purple);
        popupPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                //MenuInflater menuInflater = popupMenu.getMenuInflater();
                popupMenu.inflate(R.menu.menu_main);
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item){
                        Toast.makeText(getApplicationContext(),"You have traded cargo", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
            }
        });
    }
    public void setStartName(String namein)
    {
        player.setName(namein);
    }
    public void setTexts()
    {
        txtName = (TextView) findViewById(R.id.playerName);
        txtMoney = (TextView) findViewById(R.id.money);
        txtShip = (TextView) findViewById(R.id.ship);
        txtLocation = (TextView) findViewById(R.id.location);

        txtName.setText(player.getName());
        txtMoney.setText(player.getUec());
        txtShip.setText(player.getpShip().getsName());
        txtLocation.setText(player.getLocation());

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
