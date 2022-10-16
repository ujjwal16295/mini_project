package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenEarthquake(View view){
        Intent intent = new Intent(this,EarthQuakeActivity.class);
        startActivity(intent);
    }
    public void OpenFlood(View view){
        Intent intent = new Intent(this,FloodActivity.class);
        startActivity(intent);
    }
    public void OpenThunderstorm(View view){
        Intent intent = new Intent(this,ThunderStormActivity.class);
        startActivity(intent);
    }
    public void OpenFire(View view){
        Intent intent = new Intent(this,FireActivity.class);
        startActivity(intent);
    }
}