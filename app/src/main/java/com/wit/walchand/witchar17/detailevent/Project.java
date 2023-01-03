package com.wit.walchand.witchar17.detailevent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.wit.walchand.witchar17.R;

public class Project extends AppCompatActivity {

    /*ImageView a1,a2,a3,a4;

    public static int sub_pos0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        a1=(ImageView)findViewById(R.id.im1);
        a2=(ImageView)findViewById(R.id.im2);
        a3=(ImageView)findViewById(R.id.im3);
        a4=(ImageView)findViewById(R.id.im4);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub_pos0=0;
                Intent i=new Intent(v.getContext(), EventData.class);
                startActivity(i);

            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub_pos0=1;
                Intent i=new Intent(v.getContext(), EventData.class);
                startActivity(i);

            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub_pos0=2;
                Intent i=new Intent(v.getContext(), EventData.class);
                startActivity(i);

            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub_pos0=3;
                Intent i=new Intent(v.getContext(), EventData.class);
                startActivity(i);

            }
        });
    }


}*/
    ImageView a1,a2,a3,a4;

    public static int sub_pos0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        a1=(ImageView)findViewById(R.id.im1);
        a2=(ImageView)findViewById(R.id.im2);
        a3=(ImageView)findViewById(R.id.im3);
        a4=(ImageView)findViewById(R.id.im4);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub_pos0=0;
                Intent i=new Intent(v.getContext(), EventData.class);
                startActivity(i);

            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub_pos0=1;
                Intent i=new Intent(v.getContext(), EventData.class);
                startActivity(i);

            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub_pos0=2;
                Intent i=new Intent(v.getContext(), EventData.class);
                startActivity(i);

            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub_pos0=3;
                Intent i=new Intent(v.getContext(), EventData.class);
                startActivity(i);

            }
        });
    }


}

