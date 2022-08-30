package com.example.uteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button back = (Button) findViewById(R.id.back_profile);
        context = this;

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);

//            // send data if need
//            intent.putExtra(KEY_USER_TO_MAIN, userName);
//            intent.putExtra(KEY_PASSWORD_TO_MAIN, password);

                // start Main Activity
                startActivity(intent);
            }
        });
    }
}