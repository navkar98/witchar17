package com.wit.walchand.witchar17.outbox;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wit.walchand.witchar17.HomeFrag;
import com.wit.walchand.witchar17.OutOfBox;
import com.wit.walchand.witchar17.R;
import com.wit.walchand.witchar17.detailevent.CoolCode;
import com.wit.walchand.witchar17.detailevent.Paper;
import com.wit.walchand.witchar17.detailevent.Project;
import com.wit.walchand.witchar17.detailevent.Robotics;

/**
 * Created by Raj on 20-Feb-17.
 */

public class contact_out extends android.support.v4.app.Fragment {

    ImageView scBtn, scpic;
    View v;
    TextView scname;
    int pos = OutOfBox.boxpos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.contact_out, container, false);

        scname=(TextView)v.findViewById(R.id.stu);
        scBtn=(ImageView)v.findViewById(R.id.callb);
        int [] a= {R.drawable.raj,R.drawable.saksham};
        scpic =(ImageView)v.findViewById(R.id.pic);
        String stud[] = getResources().getStringArray(R.array.outboxstud);



        if (pos==0) {
            scname.setText(stud[pos]);
            scpic.setImageResource(a[pos]);



        } else {
            scname.setText(stud[pos]);
            scpic.setImageResource(a[pos]);

        }
        final String cont[] = getResources().getStringArray(R.array.outboxcont);

        // call option
       if(pos==0)
       {
           scBtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i = new Intent(Intent.ACTION_DIAL);
                   i.setData(Uri.parse("tel:" + cont[pos]));
                   startActivity(i);
               }
           });
       }
        else {
           scBtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i = new Intent(Intent.ACTION_DIAL);
                   i.setData(Uri.parse("tel:" + cont[pos]));
                   startActivity(i);
               }
           });

       }




        return v;
    }
}
