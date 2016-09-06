package com.first.akashshrivastava.showernow;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by akashshrivastava on 31/07/16.
 */
public class fragment_A extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_a,container, false);
        View view = inflater.inflate(R.layout.fragment_a,
                container, false);

        Button button = (Button) view.findViewById(R.id.next1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.d("NEXT","NEXT!");
               // CustomViewPager.setCurrentItem(2);
                //CustomViewPager.nextFragment();
            }
        });
        return view;
    }


}
