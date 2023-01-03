package com.wit.walchand.witchar17.detailevent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wit.walchand.witchar17.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Staadwar extends Fragment {

    View v;
    public Staadwar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_staadwar,container,false);
        return v;
    }

}
