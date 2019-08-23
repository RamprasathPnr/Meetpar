package com.mobile.teamc2tech.meetpar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(AddressActivity.this,DashboardActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}
