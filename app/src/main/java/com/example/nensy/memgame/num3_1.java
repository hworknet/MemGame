package com.example.nensy.memgame;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;

public class num3_1 extends AppCompatActivity {
    // змінні для відслідковування успішних спроб і спроб взагалі
    private int success = 0;

    // змінна для визначення назви файлу, де будуть зберігатися дані
    private static final String USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // вибирається початковий layout
        setContentView(R.layout.num3_1);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // після відкриття activity через секунду початковий layout буде змінений на наступний
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.num3_2);
            }
        }, 1000);
    }

    // перевірка результату

    public void checkResult(){
        // отримання доступу до сховища даних
        SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
        if (success > 2 && success < 5){
            // записування результату гри
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate15", "0");
            e.commit();
        } else if (success > 4 && success < 9) {
            // записування результату гри
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate15", "5");
            e.commit();
        } else if (success > 8 && success < 13) {
            // записування результату гри
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate15", "10");
            e.commit();
        }

        // отримування даних про результат трьох ігор
        String rate13 = sp.getString("rate13", "0");
        String rate14 = sp.getString("rate14", "0");
        String rate15 = sp.getString("rate15", "0");

        // переведення результатів в цілочисельний тип
        int tempRate13 = Integer.parseInt(rate13);
        int tempRate14 = Integer.parseInt(rate14);
        int tempRate15 = Integer.parseInt(rate15);

        // сума балів за 3 гри
        int sum = tempRate13 + tempRate14 + tempRate15;

        if (sum == 0 || sum < 11) {
            ImageView imageView = (ImageView) findViewById(R.id.num3_star);
            imageView.setImageResource(R.drawable.rate1);
        } else if (sum > 10 && sum < 21){
            ImageView imageView = (ImageView) findViewById(R.id.num3_star);
            imageView.setImageResource(R.drawable.rate2);
        } else if (sum > 19 && sum < 31){
            ImageView imageView = (ImageView) findViewById(R.id.num3_star);
            imageView.setImageResource(R.drawable.rate3);
        }
    }

    // 1 завдання, перевірка

    public void check_num_3_1(View view) {

        // отримуємо доступ до editText
        EditText num1 = (EditText) findViewById(R.id.n1);
        EditText num2 = (EditText) findViewById(R.id.n2);
        EditText num3 = (EditText) findViewById(R.id.n3);

        // отримуємо дані в змінні
        String numb1 = num1.getText().toString();
        String numb2 = num2.getText().toString();
        String numb3 = num3.getText().toString();

        // перевірка на вірність цифр
        if (numb1.equals("2")) {
            success++;
            num1.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num1.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb2.equals("4")) {
            success++;
            num2.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num2.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb3.equals("8")) {
            success++;
            num3.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num3.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.num3_3);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        setContentView(R.layout.num3_4);
                    }
                }, 1000);
            }
        }, 500);
    }

    // 2 завдання, перевірка

    public void check_num_3_2(View view) {

        // отримуємо доступ до editText
        EditText num4 = (EditText) findViewById(R.id.n4);
        EditText num5 = (EditText) findViewById(R.id.n5);
        EditText num6 = (EditText) findViewById(R.id.n6);

        // отримуємо дані в змінні
        String numb4 = num4.getText().toString();
        String numb5 = num5.getText().toString();
        String numb6 = num6.getText().toString();

        // перевірка на вірність цифр
        if (numb4.equals("1")) {
            success++;
            num4.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num4.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb5.equals("6")) {
            success++;
            num5.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num5.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb6.equals("2")) {
            success++;
            num6.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num6.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.num3_5);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        setContentView(R.layout.num3_6);
                    }
                }, 1000);
            }
        }, 500);
    }

    // 3 завдання, перевірка

    public void check_num_3_3(View view) {

        // отримуємо доступ до editText
        EditText num7 = (EditText) findViewById(R.id.n7);
        EditText num8 = (EditText) findViewById(R.id.n8);
        EditText num9 = (EditText) findViewById(R.id.n9);

        // отримуємо дані в змінні
        String numb7 = num7.getText().toString();
        String numb8 = num8.getText().toString();
        String numb9 = num9.getText().toString();

        // перевірка на вірність цифр
        if (numb7.equals("3")) {
            success++;
            num7.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num7.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb8.equals("7")) {
            success++;
            num8.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num8.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb9.equals("9")) {
            success++;
            num9.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num9.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.num3_s);
                checkResult();
            }
        }, 500);
    }

    // перехід на головну activity

    public void goHome_num3_1_1(View view) {
        // очистка лічильників
        success = 0;

        Intent questionIntent = new Intent(num3_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void go_list_num3_1(View view) {
        Intent questionIntent = new Intent(num3_1.this, ListActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}
