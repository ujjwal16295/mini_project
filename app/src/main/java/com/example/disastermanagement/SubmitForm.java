package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SubmitForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_form);
    }

    public void Help(View view){
        EditText nameText = (EditText)findViewById(R.id.name);
        EditText locationText = (EditText)findViewById(R.id.location);
        String getname = nameText.getText().toString();
        String getlocation = locationText.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("location",getlocation);
        Intent i = new Intent(this,HelpForm.class);
        i.putExtras(bundle);
        startActivity(i);

    }
}