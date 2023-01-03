package com.wit.walchand.witchar17;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wit.walchand.witchar17.detailevent.EventData;
import com.wit.walchand.witchar17.outbox.OutBoxEventData;


/**
 * A simple {@link Fragment} subclass.
 */
public class OutOfBox extends Fragment {

    ImageView goog,logo;
    View v;
    public static int boxpos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_out_of_box, container, false);
        goog = (ImageView) v.findViewById(R.id.google);
        logo =(ImageView) v.findViewById(R.id.log);

        goog.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                boxpos=0;
                Intent i =new Intent(v.getContext(), OutBoxEventData.class);
                startActivity(i);
            }
        });

        logo.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                boxpos=1;
                Intent i =new Intent(v.getContext(), OutBoxEventData.class);
                startActivity(i);
            }
        });
        return v;
    }
}
