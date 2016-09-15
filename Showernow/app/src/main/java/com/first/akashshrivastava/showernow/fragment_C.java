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
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by akashshrivastava on 31/07/16.
 */
public class fragment_C extends Fragment implements View.OnClickListener {

    Button nextButton;
    Button previousButton;
    EditText weight;
    EditText height;
    EditText age;

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

            //int weightInt = Integer.parseInt(weight.getText().toString());
            weight = (EditText)getView().findViewById(R.id.input_weight);
            height = (EditText)getView().findViewById(R.id.input_height);
            age = (EditText)getView().findViewById(R.id.input_age);
            if (weight.getText().toString().matches("")) {
                Toast.makeText(getActivity(), "Enter your weight in kg", Toast.LENGTH_LONG).show();
            }else if(height.getText().toString().matches("")){
                Toast.makeText(getActivity(), "Enter your height in cm", Toast.LENGTH_LONG).show();
            }else if(age.getText().toString().matches("")) {
                Toast.makeText(getActivity(), "Enter your age", Toast.LENGTH_LONG).show();
            }else{
                Intent i = new Intent(getActivity(), ShowerActivity.class);
                startActivity(i);
            }

        }else if(view.getId() == R.id.previousPage_c){
            ((MainActivity) getActivity()).setPreviousPage();
        }
    }
}
