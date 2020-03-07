package com.example.study99;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab1 extends Fragment implements View.OnClickListener{


    public tab1() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_tab1, container, false);


        RelativeLayout relativeLayout=v.findViewById(R.id.relative);
        RelativeLayout relativeLayout1=v.findViewById(R.id.relative1);
        relativeLayout.setOnClickListener(this);
        relativeLayout1.setOnClickListener(this);

        // Inflate the layout for this fragment
        return v;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.relative:
               startActivity(new Intent(getActivity(),openfromfragment.class));
               break;

            case R.id.relative1:
                startActivity(new Intent(getActivity(),openfromfragment1.class));
                break;


        }
    }
}
