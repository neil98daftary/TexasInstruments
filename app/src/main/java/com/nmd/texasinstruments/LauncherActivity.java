package com.nmd.texasinstruments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    public void launchECG(View view) {
        Intent myIntent = new Intent(LauncherActivity.this, MainActivity.class);
        LauncherActivity.this.startActivity(myIntent);
    }

    public void launchECG2(View view) {
        Intent myIntent = new Intent(LauncherActivity.this, ECG.class);
        LauncherActivity.this.startActivity(myIntent);
    }

    public void launchTemp(View view) {
        Intent myIntent = new Intent(LauncherActivity.this, Main2Activity.class);
        LauncherActivity.this.startActivity(myIntent);
    }

    public void launchGSR(View view) {
        Intent myIntent = new Intent(LauncherActivity.this, EcgScreen.class);
        LauncherActivity.this.startActivity(myIntent);
    }
}
