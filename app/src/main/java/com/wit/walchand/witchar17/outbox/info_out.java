package com.wit.walchand.witchar17.outbox;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public class info_out extends android.support.v4.app.Fragment {


    TextView infoTxt;
    int pos= OutOfBox.boxpos;

 @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.info_out, container, false);

     infoTxt=(TextView)v.findViewById(R.id.in);

    String[]inf=getResources().getStringArray(R.array.Out_of_box_basic_info);

     if(pos==0){
         infoTxt.setText(inf[pos]);
     }else
     {
         infoTxt.setText(inf[pos]);
     }

        return v;
    }
}
