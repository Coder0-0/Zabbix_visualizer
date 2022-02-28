package com.example.zabbixviewer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LoginActivity extends AppCompatActivity {


    FuelManager.instance.basePath = "http://demosmushtaq.16mb.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.activity_login);




    }
    public void onBtnClick (View view){
        TextView servername= findViewById(R.id.serverlink_txt);
        servername.setText("I WANT Address");

    }

}