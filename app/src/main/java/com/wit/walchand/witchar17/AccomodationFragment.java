package com.wit.walchand.witchar17;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccomodationFragment extends android.support.v4.app.Fragment {


    public AccomodationFragment() {
        // Required empty public constructor
    }

    ImageView fc_btn,sc_btna,sc_btnb,fc_btn2,sc_btna2;
    View v;
    Button req;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        v = inflater.inflate(R.layout.fragment_accomodation, container, false);
        String a ="Paper Presentation";

        req=(Button) v.findViewById(R.id.reqaccom);


        fc_btn=(ImageView)v.findViewById(R.id.accFal);
        sc_btna=(ImageView)v.findViewById(R.id.accStu1);
        sc_btnb=(ImageView)v.findViewById(R.id.accStu2);
        fc_btn2=(ImageView)v.findViewById(R.id.accFalg);
        sc_btna2=(ImageView)v.findViewById(R.id.accStu1g);


        fc_btn.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View v){
            Intent i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:9739317478"));
            startActivity(i);
        }

        });
        sc_btna.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent ia = new Intent(Intent.ACTION_DIAL);
                ia.setData(Uri.parse("tel:8983898649"));
                startActivity(ia);
            }

        });
        sc_btnb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent ib = new Intent(Intent.ACTION_DIAL);
                ib.setData(Uri.parse("tel:7276167948"));
                startActivity(ib);
            }

        });


        fc_btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:7709895496"));
                startActivity(i);
            }

        });
        sc_btna2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent ia = new Intent(Intent.ACTION_DIAL);
                ia.setData(Uri.parse("tel:9604844476"));
                startActivity(ia);
            }

        });
       req.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent bi=new Intent("android.intent.action.VIEW",Uri.parse("https://script.google.com/macros/s/AKfycbyBHJz5UnLUjxKM-Rabep5KUHz4gBasVyjc29wYMFGi_R5Hbjk/exec"));
               startActivity(bi);
           }
       });

        return v;
    }

}
