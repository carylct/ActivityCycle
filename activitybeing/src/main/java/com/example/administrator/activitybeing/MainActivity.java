package com.example.administrator.activitybeing;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends BaseActivty {
    @Override
    public void init() {
        super.init();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        Button button1 = new Button(this);
        button1.setText("不销毁的跳转");
        button1.setGravity(Gravity.CENTER);
        linearLayout.addView(button1);

        Button button2 = new Button(this);
        button2.setText("销毁的跳转");
        button1.setGravity(Gravity.CENTER);
        linearLayout.addView(button2);

        setContentView(linearLayout);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivty(OneActivity.class);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivty(TwoActivity.class);
                finish();
            }
        });
        System.out.println("----onCreate------");
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("----onStart------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("----onStop------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("----onResume------");

    }
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("----onPause------");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("----onRestart------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("----onDestroy------");
    }
}

