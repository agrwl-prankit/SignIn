package com.prankit.info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        Button gotofb = findViewById(R.id.gotofb);
        Button gotogoogle = findViewById(R.id.gotogoogle);

//        gotofb.setOnClickListener(v -> {
//            startActivity(new Intent(this, ));
//        });

        gotogoogle.setOnClickListener(v -> startActivity(new Intent(this, GoogleSignInActivity.class)));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}