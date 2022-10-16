package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HelpForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_form);
        //Get the bundle
        Bundle bundle = getIntent().getExtras();

        //Extract the data…
        String name = bundle.getString("name");
        String location = bundle.getString("location");
        TextView tl = (TextView)findViewById(R.id.locationarea);
        tl.setText(location);
    }

}