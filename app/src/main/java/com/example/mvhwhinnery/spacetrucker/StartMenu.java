package com.example.mvhwhinnery.spacetrucker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;


public class StartMenu extends ActionBarActivity {

    Button btnNew;
    RelativeLayout back;
    public  String playerName;
    EditText txtEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_start_menu);




        btnNew = (Button) findViewById(R.id.btnNew);
        back = (RelativeLayout) findViewById(R.id.backround);
        btnNew.setOnClickListener(new View.OnClickListener() {
             @Override
                  public void onClick(View v) {
                 SharedPreferences prefs = getSharedPreferences("data", Context.MODE_PRIVATE);
                 SharedPreferences.Editor editor = getSharedPreferences("data",Context.MODE_PRIVATE).edit();
                 editor.putString("name",txtEdit.getText().toString());
                 playerName = txtEdit.getText().toString();
                       Intent myIntent = new Intent(StartMenu.this, MainActivity.class);
                       StartMenu.this.startActivity(myIntent);

                  }
             }
        );
        //Creation of the button that makes the name field and start new game button visible (previously invisible)
        final Button createGame = (Button)findViewById(R.id.createGame);
        createGame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txtEdit = (EditText)findViewById(R.id.editText);
                txtEdit.setVisibility(View.VISIBLE);
                //Button theButton = (Button)findViewById(R.id.createGame);
                btnNew.setVisibility(View.VISIBLE);
                createGame.setVisibility(View.INVISIBLE);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start_menu, menu);
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
