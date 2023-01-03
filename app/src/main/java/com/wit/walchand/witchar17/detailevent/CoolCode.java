package com.wit.walchand.witchar17.detailevent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.wit.walchand.witchar17.R;

import static com.wit.walchand.witchar17.HomeFrag.position;

public class CoolCode extends AppCompatActivity {

    CardView cv1,cv2,cv3;
    public static int sub_pos0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool_code);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cv1=(CardView)findViewById(R.id.cv1);
        cv2=(CardView)findViewById(R.id.cv2);
        cv3=(CardView)findViewById(R.id.cv3);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub_pos0=0;
                Intent i=new Intent(v.getContext(), EventData.class);
                startActivity(i);


            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sub_pos0=1;
                Intent i=new Intent(v.getContext(), EventData.class);
                startActivity(i);

            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sub_pos0=2;
                Intent i=new Intent(v.getContext(), EventData.class);
                startActivity(i);


            }
        });
    }

}
