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

public class CardsFragment_out extends android.support.v4.app.Fragment {


    TextView ruleTxt;
    int pos = OutOfBox.boxpos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.rules_out, container, false);

        ruleTxt = (TextView) v.findViewById(R.id.rule);

        String[] rl = getResources().getStringArray(R.array.Out_of_box_basic_rules);
        if (pos == 0) {
            ruleTxt.setText(rl[pos]);
        } else {
            ruleTxt.setText(rl[pos]);
        }
        return v;
    }
}
