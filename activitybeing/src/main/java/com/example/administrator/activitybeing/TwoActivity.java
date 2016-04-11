package com.example.administrator.activitybeing;

/**
 * Created by LCT
 * Time:2016/4/7 17:25.
 * Annotation：
 */
public class TwoActivity extends BaseActivty {
    @Override
    public void init() {
        super.init();
        setContentView(R.layout.activity_main);
        System.out.println("--TwoActivity--onCreate------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("-TwoActivity---onStart------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("--TwoActivity--onStop------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("--TwoActivity--onResume------");

    }
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("--TwoActivity--onPause------");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("-TwoActivity---onRestart------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("-TwoActivity---onDestroy------");
    }
}
