package com.example.nensy.memgame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class RulesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    // перехід на правила 1 гри
    public void go_moz(View view){
        Intent questionIntent = new Intent(RulesActivity.this, rules_moz.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    // перехід на правила 2 гри
    public void go_vih(View view){
        Intent questionIntent = new Intent(RulesActivity.this, rules_vih.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    // перехід на правила 3 гри
    public void go_por(View view){
        Intent questionIntent = new Intent(RulesActivity.this, rules_por.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    // перехід на правила 4 гри
    public void go_col(View view){
        Intent questionIntent = new Intent(RulesActivity.this, rules_col.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    // перехід на правила 5 гри
    public void go_wor(View view){
        Intent questionIntent = new Intent(RulesActivity.this, rules_wor.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    // перехід на правила 6 гри
    public void go_num(View view){
        Intent questionIntent = new Intent(RulesActivity.this, rules_num.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }
}
