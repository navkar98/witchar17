package com.wit.walchand.witchar17.detailevent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.wit.walchand.witchar17.HomeFrag;
import com.wit.walchand.witchar17.OutOfBox;
import com.wit.walchand.witchar17.PrivacyFragment;
import com.wit.walchand.witchar17.R;
import com.wit.walchand.witchar17.Theme;


/**
 * Created by Raj on 20-Feb-17.
 */

public class CardsFragment extends android.support.v4.app.Fragment {

    int pos = HomeFrag.position;
    int sub_pos1 = Project.sub_pos0;
    int sub_pos2 = Paper.sub_pos0;
    int sub_pos3 = CoolCode.sub_pos0;
    int sub_pos4 = Robotics.sub_pos0;

    TextView t, t_proC, t_proCS, t_proE, t_proM, t_out;

    Button submitLink,track;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.rules, container, false);
        submitLink = (Button) v.findViewById(R.id.submitlink);



        if (pos == 12) {


            String[] s_proa = getResources().getStringArray(R.array.project_rules);
            submitLink.setText("Submit Project Synopsis");

            final String[] link = getResources().getStringArray(R.array.reglink_project);
            if (sub_pos1 == 0) {
                String pro_C = getResources().getString(R.string.project_basic_civil_rule);
                t_proC = (TextView) v.findViewById(R.id.rule);
                t_proC.setText(s_proa[sub_pos1]);
            } else if (sub_pos1 == 1) {
                String pro_CS = getResources().getString(R.string.project_basic_cse_rule);
                t_proCS = (TextView) v.findViewById(R.id.rule);
                t_proCS.setText(s_proa[sub_pos1]);
            } else if (sub_pos1 == 2) {
                String proE = getResources().getString(R.string.project_basic_eln_rule);
                t_proE = (TextView) v.findViewById(R.id.rule);
                t_proE.setText(s_proa[sub_pos1]);
            } else if (sub_pos1 == 3) {
                String pro_M = getResources().getString(R.string.project_basic_mech_rule);
                t_proM = (TextView) v.findViewById(R.id.rule);
                t_proM.setText(s_proa[sub_pos1]);
            }

            submitLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent bi = new Intent("android.intent.action.VIEW", Uri.parse(link[sub_pos1]));
                    startActivity(bi);
                }
            });

        } else if (pos == 11) {


            String[] s_prob = getResources().getStringArray(R.array.paper_rules);
            final String[] link = getResources().getStringArray(R.array.reglink_paper);
            track.setVisibility(View.INVISIBLE);

            submitLink.setText("Submit Paper Abstract");
            if (sub_pos2 == 0) {
                String pro_C = getResources().getString(R.string.Paper_civil_basic_rules);
                t_proC = (TextView) v.findViewById(R.id.rule);
                t_proC.setText(s_prob[sub_pos2]);
            } else if (sub_pos2 == 1) {
                String pro_CS = getResources().getString(R.string.Paper_cse_basic_rules);
                t_proCS = (TextView) v.findViewById(R.id.rule);
                t_proCS.setText(s_prob[sub_pos2]);
            } else if (sub_pos2 == 2) {
                String proE = getResources().getString(R.string.Paper_eln_basic_rules);
                t_proE = (TextView) v.findViewById(R.id.rule);
                t_proE.setText(s_prob[sub_pos2]);
            } else if (sub_pos2 == 3) {
                String pro_M = getResources().getString(R.string.Paper_mech_basic_rules);
                t_proM = (TextView) v.findViewById(R.id.rule);
                t_proM.setText(s_prob[sub_pos2]);
            }

            submitLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent bi = new Intent("android.intent.action.VIEW", Uri.parse(link[sub_pos2]));
                    startActivity(bi);
                }
            });

        } else if (pos == 3) {


            submitLink.setVisibility(View.INVISIBLE);

            String[] s_prob = getResources().getStringArray(R.array.code_rules);
            if (sub_pos3 == 0) {
                String pro_C = getResources().getString(R.string.Marathone_Rules);
                t_proC = (TextView) v.findViewById(R.id.rule);
                t_proC.setText(s_prob[sub_pos3]);
            } else if (sub_pos3 == 1) {
                String pro_CS = getResources().getString(R.string.Matlab_rules);
                t_proCS = (TextView) v.findViewById(R.id.rule);
                t_proCS.setText(s_prob[sub_pos3]);
            } else if (sub_pos3 == 2) {
                String proE = getResources().getString(R.string.Microcontroller_rules);
                t_proE = (TextView) v.findViewById(R.id.rule);
                t_proE.setText(s_prob[sub_pos3]);

            }

        } else if (pos == 15) {

            submitLink.setText("Check robotrack");
            String[] s_prob = getResources().getStringArray(R.array.robotics_rules);
            if (sub_pos4 == 0) {
                String pro_C = getResources().getString(R.string.ifyoucan_rules);
                t_proC = (TextView) v.findViewById(R.id.rule);
                t_proC.setText(s_prob[sub_pos4]);
            } else if (sub_pos4 == 1) {
                String pro_CS = getResources().getString(R.string.line_seguidor_rule);
                t_proCS = (TextView) v.findViewById(R.id.rule);
                t_proCS.setText(s_prob[sub_pos4]);
            }

            submitLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Robotrack rf = new Robotrack();
                    FragmentManager fm = getFragmentManager();
                    fm.beginTransaction().replace(R.id.frames,rf,rf.getTag()).commit();

                }
            });
        } else {
            //submitLink.setVisibility(View.INVISIBLE);
            String[] s = getResources().getStringArray(R.array.Rule);
            t = (TextView) v.findViewById(R.id.rule);
            t.setText(s[pos]);

            if(pos==16)
            {
                submitLink.setText("Theme for Staad War");
                submitLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Staadwar rf = new Staadwar();
                        FragmentManager fm = getFragmentManager();
                        fm.beginTransaction().replace(R.id.frames,rf,rf.getTag()).commit();

                    }
                });
            }
           else if(pos==4)
            {
                submitLink.setText("Theme for Dream cad ");
                submitLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Staadwar rf = new Staadwar();
                        FragmentManager fm = getFragmentManager();
                        fm.beginTransaction().replace(R.id.frames,rf,rf.getTag()).commit();

                    }
                });
            }
            else if(pos==8)
            {
                submitLink.setText("Theme for Infra Civil ");
                submitLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Staadwar rf = new Staadwar();
                        FragmentManager fm = getFragmentManager();
                        fm.beginTransaction().replace(R.id.frames,rf,rf.getTag()).commit();

                    }
                });
            }
            else if(pos==18)
            {
                submitLink.setText("Theme for Wonder Tender");
                submitLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(v.getContext(), Theme.class);
                        startActivity(i);

                    }
                });
            }
            else {
                submitLink.setVisibility(View.INVISIBLE);
            }
        }
        return v;
    }
}
