package com.example.mvhwhinnery.spacetrucker;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Planet p1 = new Planet("Aquarius","water",null);
    private Planet p2 = new Planet("Golden pastures", "crops", null);
    private Planet p3 = new Planet("SmokeyTown", "industrial", null);
    private Planet p4 = new Planet("Woodlands", "lumber",null);
    private Planet p5 = new Planet("Mines", "minerals", null);
    private Ship pShip = new Ship("Van",300,2,300,null);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        final Button popupMars = (Button)findViewById(R.id.Mars);
        popupMars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                //MenuInflater menuInflater = popupMenu.getMenuInflater();
                popupMenu.inflate(R.menu.menu_main);
                popupMenu.show();
                //popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                //    @Override
                //    public boolean onMenuItemClack(MenuItem item){
                //        Toast.makeText(getApplicationContext().item.toString(), Toast.LENGTH_SHORT).show();
                //        return false;
                //    }
                //});
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
                //popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                //    @Override
                //    public boolean onMenuItemClack(MenuItem item){
                //        Toast.makeText(getApplicationContext().item.toString(), Toast.LENGTH_SHORT).show();
                //        return false;
                //    }
                //});
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
                //popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                //    @Override
                //    public boolean onMenuItemClack(MenuItem item){
                //        Toast.makeText(getApplicationContext().item.toString(), Toast.LENGTH_SHORT).show();
                //        return false;
                //    }
                //});
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
                //popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                //    @Override
                //    public boolean onMenuItemClack(MenuItem item){
                //        Toast.makeText(getApplicationContext().item.toString(), Toast.LENGTH_SHORT).show();
                //        return false;
                //    }
                //});
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
                //popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                //    @Override
                //    public boolean onMenuItemClack(MenuItem item){
                //        Toast.makeText(getApplicationContext().item.toString(), Toast.LENGTH_SHORT).show();
                //        return false;
                //    }
                //});
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
