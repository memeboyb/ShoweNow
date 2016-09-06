package com.first.akashshrivastava.showernow;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity{

    ViewPager mViewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mViewPager = (ViewPager)findViewById(R.id.pager);



        FragmentManager fragmentManager = getSupportFragmentManager();

        mViewPager.setAdapter(new MyAdapter(fragmentManager));

        final View touchView = findViewById(R.id.pager);
        touchView.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                return true;
            }
        });



    }

}



class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm) {
    super(fm);

    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        if (position == 0){

            fragment = new fragment_A();
        }

        if (position == 1){

            fragment = new fragment_B();
        }

        if (position == 2){

            fragment = new fragment_C();
        }

        return fragment;
    }
}

 class CustomViewPager extends ViewPager {
    private boolean enabled;

     public void nextFragment(){
         setCurrentItem(2);
         return;
     }


     public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.enabled = true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onTouchEvent(event);
        }

        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onInterceptTouchEvent(event);
        }

        return false;
    }

    public void setPagingEnabled(boolean enabled) {
        this.enabled = enabled;
    } }


