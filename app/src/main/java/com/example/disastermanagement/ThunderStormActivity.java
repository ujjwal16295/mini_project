package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThunderStormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thunder_storm);
    }
    public  void OpenSubmitForm(View view){
        Intent intent = new Intent(this,SubmitForm.class);
        startActivity(intent);
    }
}