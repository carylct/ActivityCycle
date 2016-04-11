package com.example.administrator.activitybeing;

/**
 * Created by LCT
 * Time:2016/4/7 17:25.
 * Annotation：
 */
public class OneActivity extends BaseActivty {
    @Override
    public void init() {
        super.init();
      setContentView(R.layout.activity_main);
        System.out.println("--OneActivity--onCreate------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("-OneActivity---onStart------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("--OneActivity--onStop------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("--OneActivity--onPause------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("--OneActivity--onResume------");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("--OneActivity--onRestart------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("--OneActivity--onDestroy------");
    }
}
