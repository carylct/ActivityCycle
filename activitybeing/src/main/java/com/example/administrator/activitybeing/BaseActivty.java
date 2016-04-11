package com.example.administrator.activitybeing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by LCT
 * Time:2016/4/7 17:34.
 * Annotation：
 */
public class BaseActivty extends Activity implements ActivityInterface{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    @Override
    public void init() {

    }

    public void startActivty(Class<?> cla) {
        Intent intent = new Intent(this, cla);
        startActivity(intent);
    }

}
