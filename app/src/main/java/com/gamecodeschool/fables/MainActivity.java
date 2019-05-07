package com.gamecodeschool.fables;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnF1;
    Button btnF2;
    Button btnF3;
    Button btnF4;
    Button btnF5;
    Button btnF6;
    Button btnF7;
    Button btnF8;
    Button btnF9;
    Button btnF10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnF1 = findViewById(R.id.btnF1);
        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext() ,TheAssAndTheCharger.class));
            }
        });

        btnF2 = findViewById(R.id.btnF2);
                btnF2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getBaseContext() ,TheBaldManAndTheFlyFable.class));
                }
        });
        btnF3 = findViewById(R.id.btnF3);
        btnF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext() ,TheBoysAndTheFrogs.class));
            }
        });
        btnF4 = findViewById(R.id.btnF4);
        btnF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext() ,TheCamelAndTheArab.class));
            }
        });
        btnF5 = findViewById(R.id.btnF5);
        btnF5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext() ,TheFisherFable.class));
            }
        });
        btnF6 = findViewById(R.id.btnF6);
        btnF6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext() ,TheLionAndTheMouseFable.class));
            }
        });
        btnF7 = findViewById(R.id.btnF7);
        btnF7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext() ,TheLionInLoveFable.class));
            }
        });
        btnF8 = findViewById(R.id.btnF8);
        btnF8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext() ,TheMischievousDog.class));
            }
        });
        btnF9 = findViewById(R.id.btnF9);
        btnF9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext() ,TheOldManAndDeathFable.class));
            }
        });
        btnF10 = findViewById(R.id.btnF10);
        btnF10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext() ,TheVainJackdaw.class));
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
