package com.mobile.teamc2tech.meetpar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    private Button btnLiveTV,btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_dashboard);

        btnLiveTV = findViewById(R.id.btnLive);
        btnInfo = findViewById(R.id.btnInfo);


        btnLiveTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this,FullScreenVideoActivity.class);
                startActivity(intent);
                finish();

            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this,AddressActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}
