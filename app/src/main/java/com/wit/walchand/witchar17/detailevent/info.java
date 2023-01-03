package com.wit.walchand.witchar17.detailevent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wit.walchand.witchar17.EventIconItem;
import com.wit.walchand.witchar17.HomeFrag;
import com.wit.walchand.witchar17.OutOfBox;
import com.wit.walchand.witchar17.R;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Raj on 20-Feb-17.
 */

public class info extends android.support.v4.app.Fragment {


    int pos = HomeFrag.position;

    TextView t, t_proC, t_proCS, t_proE, t_proM, t_out;

    int sub_pos1 = Project.sub_pos0;
    int sub_pos2 = Paper.sub_pos0;
    int sub_pos3 = CoolCode.sub_pos0;
    int sub_pos4 = Robotics.sub_pos0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.info, container, false);
       /* KenBurnsView image=(KenBurnsView)v.findViewById(R.id.kens);
        image.resume();*/


        if (pos == 12) {
            String[] s_pro = getResources().getStringArray(R.array.project_base_info);
            if (sub_pos1 == 0) {
                String pro_C = getResources().getString(R.string.project_basic_civil_info);
                t_proC = (TextView) v.findViewById(R.id.in);
                t_proC.setText(s_pro[sub_pos1]);
            } else if (sub_pos1 == 1) {
                String pro_CS = getResources().getString(R.string.project_basic_cse_info);
                t_proCS = (TextView) v.findViewById(R.id.in);
                t_proCS.setText(s_pro[sub_pos1]);
            } else if (sub_pos1 == 2) {
                String proE = getResources().getString(R.string.project_basic_eln_info);
                t_proE = (TextView) v.findViewById(R.id.in);
                t_proE.setText(s_pro[sub_pos1]);
            } else if (sub_pos1 == 3) {
                String pro_M = getResources().getString(R.string.project_basic_mech_info);
                t_proM = (TextView) v.findViewById(R.id.in);
                t_proM.setText(s_pro[sub_pos1]);
            }
        } else if (pos == 11) {

            String[] s_prob = getResources().getStringArray(R.array.paper_base_info);
            if (sub_pos2 == 0) {
                String pro_C = getResources().getString(R.string.Paper_civil_basic_info);
                t_proC = (TextView) v.findViewById(R.id.in);
                t_proC.setText(s_prob[sub_pos2]);
            } else if (sub_pos2 == 1) {
                String pro_CS = getResources().getString(R.string.Paper_cse_basic_info);
                t_proCS = (TextView) v.findViewById(R.id.in);
                t_proCS.setText(s_prob[sub_pos2]);
            } else if (sub_pos2 == 2) {
                String proE = getResources().getString(R.string.Paper_eln_basic_info);
                t_proE = (TextView) v.findViewById(R.id.in);
                t_proE.setText(s_prob[sub_pos2]);
            } else if (sub_pos2 == 3) {
                String pro_M = getResources().getString(R.string.Paper_mech_basic_info);
                t_proM = (TextView) v.findViewById(R.id.in);
                t_proM.setText(s_prob[sub_pos2]);
            }
        } else if (pos == 3) {

            String[] s_cool = getResources().getStringArray(R.array.code_base_info);
            if (sub_pos3 == 0) {
                String cool_C = getResources().getString(R.string.Marathone_Basic_Info);
                t_proC = (TextView) v.findViewById(R.id.in);
                t_proC.setText(s_cool[sub_pos3]);
            } else if (sub_pos3 == 1) {
                String cool_cs = getResources().getString(R.string.Matlab_Basic_Info);
                t_proCS = (TextView) v.findViewById(R.id.in);
                t_proCS.setText(s_cool[sub_pos3]);
            } else if (sub_pos3 == 2) {
                String proE = getResources().getString(R.string.Microcontroller_Basic_Info);
                t_proE = (TextView) v.findViewById(R.id.in);
                t_proE.setText(s_cool[sub_pos3]);
            }

        } else if (pos == 15) {

            String[] s_robo = getResources().getStringArray(R.array.robotics_base_info);
            if (sub_pos4 == 0) {

                String ro_line = getResources().getString(R.string.ifyoucan_basic_Info);
                t_proC = (TextView) v.findViewById(R.id.in);
                t_proC.setText(s_robo[sub_pos4]);
            } else if (sub_pos4 == 1) {

                String ro_line = getResources().getString(R.string.line_seguidor_basic_Info);
                t_proC = (TextView) v.findViewById(R.id.in);
                t_proC.setText(s_robo[sub_pos4]);
            }

        } else {
            String[] s = getResources().getStringArray(R.array.Basic_Info);
            t = (TextView) v.findViewById(R.id.in);
            t.setText(s[pos]);

        }



        return v;
    }
}
