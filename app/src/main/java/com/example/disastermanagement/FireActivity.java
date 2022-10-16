package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
    }
    public  void OpenSubmitForm(View view){
        Intent intent = new Intent(this,SubmitForm.class);
        startActivity(intent);
    }
}