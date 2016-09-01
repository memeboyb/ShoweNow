package com.first.akashshrivastava.showernow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by akashshrivastava on 31/07/16.
 */
public class LoginActivity extends Activity{

//        TextView mloginAct = (TextView) getActivity().findViewById(R.id.link_signup);
//
//        mloginAct.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent i = new Intent(getActivity(), SignupActivity.class);
//                startActivity(i);
//
//            }
//        });

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_fragment);

        if(savedInstanceState==null)
        {

            Log.d("First ","onCreate FIRST TIME");
        }
        else
        {
            Log.d("Next","onCreate SUBSEQUENT TIME");
        }

        TextView mloginAct = (TextView) findViewById(R.id.link_signup);

        mloginAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ONCLICK","ONCLICK!");
                Intent i = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(i);

            }
        });

        Button button = (Button) findViewById(R.id.btn_login);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Log.d("ONCLICK","ONCLICK!");
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);

            }

        });

    }


    @Override
    public void onStart() {
        super.onStart();
        Log.d("On Start","onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("OnResume","onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("On Pause","onPause");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("On save instance state","onSaveInstanceState");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("On stop","onStop");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("on destroy","onDestroy");

    }


}
