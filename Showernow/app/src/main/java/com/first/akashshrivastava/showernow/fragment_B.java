package com.first.akashshrivastava.showernow;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by akashshrivastava on 31/07/16.
 */
public class fragment_B extends Fragment implements View.OnClickListener {

    Button nextButton;
    Button previousButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        Button nextButton = (Button) view.findViewById(R.id.nextPage_b);
        nextButton.setOnClickListener(this);

        Button previousButton = (Button) view.findViewById(R.id.previousPage_b);
        previousButton.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.nextPage_b) {
            ((MainActivity) getActivity()).setNextPage();
        }else if(view.getId() == R.id.previousPage_b){
            ((MainActivity) getActivity()).setPreviousPage();
        }
    }
}
