package com.example.two_words_37.wifiexample;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btntOn = findViewById(R.id.btnOn);
        Button btntOff = findViewById(R.id.btnOFF);

        btntOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wmgr = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wmgr.setWifiEnabled(true);
            }
        });

        btntOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wmgr = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wmgr.setWifiEnabled(false);
            }
        });
    }
}