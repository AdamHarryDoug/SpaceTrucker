package com.example.mvhwhinnery.spacetrucker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Store extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        //weaponUpgradeButton
        final Button weapon = (Button)findViewById(R.id.weaponButton);
        weapon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView weaponNums = (TextView) findViewById(R.id.weaponUp);
                String temp = weaponNums.toString();
                int weaponNum = Integer.parseInt(temp) + 10; //adding 10 to the Cargo Space
                weaponNums.setText(weaponNum);
            }
        });

        //cargoUpgradeButton
        final Button cargo = (Button)findViewById(R.id.cargoButton);
        cargo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView cargoNum = (TextView)findViewById(R.id.cargoUp);
                String temp = cargoNum.toString();
                int cargospace = Integer.parseInt(temp) + 10; //adding 10 to the Cargo Space
                cargoNum.setText(cargospace);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_store, menu);
        return true;
    }

    @Override
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
    }
}
