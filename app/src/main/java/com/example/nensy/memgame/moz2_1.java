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
import android.widget.Button;

public class moz2_1 extends AppCompatActivity {
    // змінні для відслідковування успішних спроб і спроб взагалі
    private int success = 0;
    private int attempts1 = 0;
    private int attempts2 = 0;
    private int attempts3 = 0;

    // змінна для визначення назви файлу, де будуть зберігатися дані
    private static final String USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moz2_1);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.moz2_2);
            }
        }, 500);
    }

    // 1 завдання

    // помилки

    public void error2_1_1(View view) {
        // додаємо кількість загальних спроб
        attempts1++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button35);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error2_1_2(View view) {
        // додаємо кількість загальних спроб
        attempts1++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button37);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error2_1_3(View view) {
        // додаємо кількість загальних спроб
        attempts1++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button39);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error2_1_4(View view) {
        // додаємо кількість загальних спроб
        attempts1++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button41);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error2_1_5(View view) {
        // додаємо кількість загальних спроб
        attempts1++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button42);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error2_1_6(View view) {
        // додаємо кількість загальних спроб
        attempts1++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button43);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // успіх

    public void success2_1_1(View view){
        // зміна кольору кнопки на синій
        Button button1;
        button1 = (Button)findViewById(R.id.button36);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        // додаємо кількість загальних спроб і успішних
        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success2_1_2(View view){
        // зміна кольору кнопки на синій
        Button button1;
        button1 = (Button)findViewById(R.id.button38);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        // додаємо кількість загальних спроб і успішних
        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success2_1_3(View view){
        // зміна кольору кнопки на синій
        Button button1;
        button1 = (Button)findViewById(R.id.button40);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        // додаємо кількість загальних спроб і успішних
        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // 2 завдання

    // помилки

    public void error2_2_1(View view) {
        // додаємо кількість загальних спроб
        attempts2++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button44);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error2_2_2(View view) {
        // додаємо кількість загальних спроб
        attempts2++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button45);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error2_2_3(View view) {
        // додаємо кількість загальних спроб
        attempts2++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button46);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error2_2_4(View view) {
        // додаємо кількість загальних спроб
        attempts2++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button48);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error2_2_5(View view) {
        // додаємо кількість загальних спроб
        attempts2++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button50);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error2_2_6(View view) {
        // додаємо кількість загальних спроб
        attempts2++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button51);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // успіх

    public void success2_2_1(View view){
        // зміна кольору кнопки на синій
        Button button1;
        button1 = (Button)findViewById(R.id.button47);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        // додаємо кількість загальних спроб і успішних
        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success2_2_2(View view){
        // зміна кольору кнопки на синій
        Button button1;
        button1 = (Button)findViewById(R.id.button49);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        // додаємо кількість загальних спроб і успішних
        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success2_2_3(View view){
        // зміна кольору кнопки на синій
        Button button1;
        button1 = (Button)findViewById(R.id.button52);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        // додаємо кількість загальних спроб і успішних
        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // 3 завдання

    // помилки

    public void error2_3_1(View view) {
        // додаємо кількість загальних спроб
        attempts3++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button55);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевірка результату
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    attempts1 = 0;
                    attempts2 = 0;
                    attempts3 = 0;

                    Intent questionIntent = new Intent(moz2_1.this, moz3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void error2_3_2(View view) {
        // додаємо кількість загальних спроб
        attempts3++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button57);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевірка результату
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    attempts1 = 0;
                    attempts2 = 0;
                    attempts3 = 0;

                    Intent questionIntent = new Intent(moz2_1.this, moz3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void error2_3_3(View view) {
        // додаємо кількість загальних спроб
        attempts3++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button58);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевірка результату
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    attempts1 = 0;
                    attempts2 = 0;
                    attempts3 = 0;

                    Intent questionIntent = new Intent(moz2_1.this, moz3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void error2_3_4(View view) {
        // додаємо кількість загальних спроб
        attempts3++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button59);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевірка результату
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    attempts1 = 0;
                    attempts2 = 0;
                    attempts3 = 0;

                    Intent questionIntent = new Intent(moz2_1.this, moz3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void error2_3_5(View view) {
        // додаємо кількість загальних спроб
        attempts3++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button60);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевірка результату
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    attempts1 = 0;
                    attempts2 = 0;
                    attempts3 = 0;

                    Intent questionIntent = new Intent(moz2_1.this, moz3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void error2_3_6(View view) {
        // додаємо кількість загальних спроб
        attempts3++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button61);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевірка результату
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    attempts1 = 0;
                    attempts2 = 0;
                    attempts3 = 0;

                    Intent questionIntent = new Intent(moz2_1.this, moz3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    // результат

    public void checkResult(){
        SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
        if (success > -1 && success < 4){
            // отримання доступу до сховища даних
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate2", "0");
            e.commit();
        } else if (success > 3 && success < 7) {
            // отримання доступу до сховища даних
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate2", "5");
            e.commit();
        } else if (success > 6 && success < 10) {
            // отримання доступу до сховища даних
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate2", "10");
            e.commit();
        }
    }

    // успіх

    public void success2_3_1(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button53);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        // додаємо кількість загальних спроб і успішних
        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевірка результату
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    attempts1 = 0;
                    attempts2 = 0;
                    attempts3 = 0;

                    Intent questionIntent = new Intent(moz2_1.this, moz3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void success2_3_2(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button54);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        // додаємо кількість загальних спроб і успішних
        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевірка результату
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    attempts1 = 0;
                    attempts2 = 0;
                    attempts3 = 0;

                    Intent questionIntent = new Intent(moz2_1.this, moz3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void success2_3_3(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button56);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        // додаємо кількість загальних спроб і успішних
        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевірка результату
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    attempts1 = 0;
                    attempts2 = 0;
                    attempts3 = 0;

                    Intent questionIntent = new Intent(moz2_1.this, moz3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    // службові кнопки

    public void goHome2_1(View view) {
        // очистка лічильників
        success = 0;
        attempts1 = 0;
        attempts2 = 0;
        attempts3 = 0;

        Intent questionIntent = new Intent(moz2_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}