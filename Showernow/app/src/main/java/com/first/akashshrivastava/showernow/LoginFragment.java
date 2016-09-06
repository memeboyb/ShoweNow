package com.first.akashshrivastava.showernow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by akashshrivastava on 31/07/16.
 */
public class LoginFragment extends Fragment {

    Context context; //Declare the variable context

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

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

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.login_fragment,container, false);




    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if(savedInstanceState==null)
        {

            Log.d("First ","onCreate FIRST TIME");
        }
        else
        {
            Log.d("Next","onCreate SUBSEQUENT TIME");
        }

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Activity created","onActivityCreated");

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
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("On destroy view","onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("on destroy","onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("On detatch","onDetach");

    }
}
