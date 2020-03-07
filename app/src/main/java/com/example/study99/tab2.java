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
public class tab2 extends Fragment implements View.OnClickListener{


    public tab2() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_tab2, container, false);


        RelativeLayout relativeLayout2=v.findViewById(R.id.relative2);
        RelativeLayout relativeLayout3=v.findViewById(R.id.relative3);
        relativeLayout2.setOnClickListener(this);
        relativeLayout3.setOnClickListener(this);

        // Inflate the layout for this fragment
        return v;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.relative2:
                startActivity(new Intent(getActivity(),openfromfragment2.class));
                break;

            case R.id.relative3:
                startActivity(new Intent(getActivity(),openfromfragment3.class));
                break;


        }
    }
}
