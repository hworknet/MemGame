package com.example.nensy.memgame;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class por1_1 extends AppCompatActivity {

    // змінні для обрахунку успішних спроб і просто спроб
    private int success = 0;
    private int success1 = 0;
    private int success2 = 0;
    private int success3 = 0;

    // змінна для визначення назви файлу, де будуть зберігатися дані
    private static final String USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // встановлення початкового layout
        setContentView(R.layout.por1_1);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.por1_2);
            }
        }, 1000);
    }

    // метод для перевірки результату в залежності від успішних спроб для 1, 2 і 3 гри
    public void checkResult(){
        // результат за спроби
        success = success1 + success2 + success3;

        // отримання доступу до сховища даних
        SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
        if (success > -1 && success < 4){
            // записування результату гри
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate7", "0");
            e.commit();
        } else if (success > 3 && success < 7) {
            // записування результату гри
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate7", "5");
            e.commit();
        } else if (success > 6 && success < 10) {
            // записування результату гри
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate7", "10");
            e.commit();
        }
    }

    // успіх і невдача для 1 завдання гри

    public void por1_1_1(View view) {
        // спочатку у змінної success1 значення 0
        // відносно нього буде перевірятися порядок в першій грі
        // якщо це значення нульове, отже, порядок вірний
        // якщо це значення уже не нульове, отже, спочатку була вибрана відповідь, яка порушила правильний порядок
        if (success1 == 0) {
            // збільшення змінної успіху для перевірки при наступному натисканні на іншу відповідь
            success1++;

            // заміна зображення на картинці
            ImageView imageView1 = (ImageView) findViewById(R.id.por2);
            imageView1.setImageResource(R.drawable.five);
        } else {
            // при невірному порядку через пів секунди відбувається перехід на наступне завдання
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується наступне завдання і через секунду відбувається перехід на наступний layout, де треба вибрати правильні відповіді
                    setContentView(R.layout.por1_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por1_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void por1_1_2(View view) {
        if (success1 == 1) {
            success1++;

            // заміна зображення на картинці
            ImageView imageView2 = (ImageView) findViewById(R.id.por1);
            imageView2.setImageResource(R.drawable.seven);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por1_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por1_4);
                        }
                    }, 1000);
                }
            }, 500);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por1_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por1_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // успіх і невдача для 2 завдання гри

    public void por1_2_1(View view) {
        if (success2 == 0) {
            success2++;

            // заміна зображення на картинці
            ImageView imageView3 = (ImageView) findViewById(R.id.por4);
            imageView3.setImageResource(R.drawable.four);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por1_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void por1_2_2(View view) {
        if (success2 == 1) {
            success2++;

            // заміна зображення на картинці
            ImageView imageView4 = (ImageView) findViewById(R.id.por5);
            imageView4.setImageResource(R.drawable.six);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por1_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void por1_2_3(View view) {
        if (success2 == 2) {
            success2++;

            // заміна зображення на картинці
            ImageView imageView5 = (ImageView) findViewById(R.id.por3);
            imageView5.setImageResource(R.drawable.nine);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por1_6);
                        }
                    }, 1000);
                }
            }, 500);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por1_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // успіх і невдача для 3 завдання гри

    public void por1_3_1(View view) {
        if (success3 == 0) {
            success3++;

            // заміна зображення на картинці
            ImageView imageView6 = (ImageView) findViewById(R.id.por6);
            imageView6.setImageResource(R.drawable.one);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевіряємо результат
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    success1 = 0;
                    success2 = 0;
                    success3 = 0;

                    // після перевірки результату переходимо відразу на наступну гру
                    Intent questionIntent = new Intent(por1_1.this, por2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 500);
        }
    }

    public void por1_3_2(View view) {
        if (success3 == 1) {
            success3++;

            // заміна зображення на картинці
            ImageView imageView7 = (ImageView) findViewById(R.id.por8);
            imageView7.setImageResource(R.drawable.two);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевіряємо результат
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    success1 = 0;
                    success2 = 0;
                    success3 = 0;

                    // після перевірки результату переходимо відразу на наступну гру
                    Intent questionIntent = new Intent(por1_1.this, por2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 500);
        }
    }

    public void por1_3_3(View view) {
        if (success3 == 2) {
            success3++;

            // заміна зображення на картинці
            ImageView imageView8 = (ImageView) findViewById(R.id.por9);
            imageView8.setImageResource(R.drawable.three);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевіряємо результат
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    success1 = 0;
                    success2 = 0;
                    success3 = 0;

                    // після перевірки результату переходимо відразу на наступну гру
                    Intent questionIntent = new Intent(por1_1.this, por2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 500);
        }
    }

    public void por1_3_4(View view) {
        if (success3 == 3) {
            success3++;

            // заміна зображення на картинці
            ImageView imageView9 = (ImageView) findViewById(R.id.por7);
            imageView9.setImageResource(R.drawable.eight);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевіряємо результат
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    success1 = 0;
                    success2 = 0;
                    success3 = 0;

                    // після перевірки результату переходимо відразу на наступну гру
                    Intent questionIntent = new Intent(por1_1.this, por2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 500);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // перевіряємо результат
                    checkResult();

                    // очистка лічильників
                    success = 0;
                    success1 = 0;
                    success2 = 0;
                    success3 = 0;

                    // після перевірки результату переходимо відразу на наступну гру
                    Intent questionIntent = new Intent(por1_1.this, por2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 500);
        }
    }

    // службові кнопки

    // перехід на головну activity
    public void goHome_por_1_1(View view) {
        // очистка лічильників
        success = 0;
        success1 = 0;
        success2 = 0;
        success3 = 0;

        Intent questionIntent = new Intent(por1_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}