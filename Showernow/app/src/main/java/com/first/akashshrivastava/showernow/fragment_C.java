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
public class fragment_C extends Fragment implements View.OnClickListener {

    Button nextButton;
    Button previousButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c, container, false);

        Button nextButton = (Button) view.findViewById(R.id.nextPage_c);
        nextButton.setOnClickListener(this);

        Button previousButton = (Button) view.findViewById(R.id.previousPage_c);
        previousButton.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.nextPage_c) {
            Log.d("ONCLICK","START SOOON");
            Intent i = new Intent(getActivity(), ShowerActivity.class);
            startActivity(i);
            Log.d("ONCLICK","START SHOWER");
        }else if(view.getId() == R.id.previousPage_c){
            ((MainActivity) getActivity()).setPreviousPage();
        }
    }
}
