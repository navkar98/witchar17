package com.wit.walchand.witchar17.detailevent;

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

/**
 * Created by Raj on 20-Feb-17.
 */

public class contact extends android.support.v4.app.Fragment {
    int pos = HomeFrag.position;

    int sub_pos3 = Project.sub_pos0;
    int sub_pos2 = Paper.sub_pos0;
    int sub_pos1 = CoolCode.sub_pos0;
    int sub_pos4 = Robotics.sub_pos0;
    //int obb= OutOfBox.ob;


    ImageView fcBtn, scBtn;
    View v;
    TextView t, ta, t_stu, t_fac;
    ImageView fc_picview,sc_picview;
    int[] fc_main = {R.drawable.kathavate, R.drawable.t_meenakshi, R.drawable.pg_chitte, R.drawable.kumawat,R.drawable
            .sb_thalange, R.drawable.thalange_maam, R.drawable.shelke_maam, R.drawable.karpe, R.drawable.kulkarni_civil,
            R.drawable.dj_doshi, R.drawable.patnaik_sir, R.drawable.sc_deshmukh,R.drawable.kalyanshetti,R.drawable.attar, R.drawable.kulkarni, R.drawable.rd_mistry,
            R.drawable.cg_konapure, R.drawable.ambarkar, R.drawable.sb_gosavi};
    int[] sc_main = {R.drawable.manohar,R.drawable.basavaraj,R.drawable.swapnil,R.drawable.sonali,R.drawable.shubham,
            R.drawable.dpali,R.drawable.dipti_k,R.drawable.kirti,R.drawable.lakhan,R.drawable.adityaawaikr,R.drawable.apurva_patwardhan,
            R.drawable.pavas,R.drawable.ankita,R.drawable.deepika,R.drawable.riya,R.drawable.dipesh,R.drawable.bhaktyi,R.drawable.rashmi,R.drawable.nilesh};
    int[] sc_cool = {R.drawable.sonali,R.drawable.ananna,R.drawable.smita};
    int[] sc_paper = {R.drawable.pavas,R.drawable.ankita,R.drawable.kirankumar,R.drawable.raman};
    int[] sc_proj = {R.drawable.vishal,R.drawable.ankita,R.drawable.ayush_j,R.drawable.venktesh};
    int[] sc_robo = {R.drawable.dipesh,R.drawable.dipesh};
    int[] fc_cool = {R.drawable.kumawat, R.drawable.asgundale, R.drawable.vipulkondekar};
    int[] fc_paper = {R.drawable.sc_deshmukh, R.drawable.dixit_maam, R.drawable.jamge_sir, R.drawable.naik_sb};
    int[] fc_proj = {R.drawable.kalyanshetti, R.drawable.dixit_maam, R.drawable.mergu_maam, R.drawable.dhulange};
    int[] fc_robo = {R.drawable.rd_mistry, R.drawable.rd_mistry};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.contact, container, false);

        final String[] fc_no = getResources().getStringArray(R.array.Faculty_Mobile);
        final String[] sc_no = getResources().getStringArray(R.array.Student_Mobile);
        final String[] fc_cool_no=getResources().getStringArray(R.array.code_faculty_Mobile);
        final String[] sc_cool_no = getResources().getStringArray(R.array.code_student_Mobile);
        final String[] fc_pap_no=getResources().getStringArray(R.array.paper_faculty_Mobile);
        final String[] sc_pap_no = getResources().getStringArray(R.array.paper_student_Mobile);
        final String[] fc_pro_no=getResources().getStringArray(R.array.project_faculty_Mobile);
        final String[] sc_pro_no = getResources().getStringArray(R.array.project_student_Mobile);
        final String[] fc_robo_no=getResources().getStringArray(R.array.robotics_faculty_Mobile);
        final String[] sc_robo_no = getResources().getStringArray(R.array.robotics_student_Mobile);
        fc_picview = (ImageView) v.findViewById(R.id.fcpic);
        sc_picview = (ImageView) v.findViewById(R.id.scpic);
        if (pos == 3) {
            String[] s_cool_fac = getResources().getStringArray(R.array.code_faculty);
            String[] s_cool_stu = getResources().getStringArray(R.array.code_student);
            String[] s_cool_stu_mob = getResources().getStringArray(R.array.code_student_Mobile);
            if (sub_pos1 == 0) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos1]);
                t_stu.setText(s_cool_stu[sub_pos1]);
                sc_picview.setImageResource(sc_cool[sub_pos1]);
                fc_picview.setImageResource(fc_cool[sub_pos1]);
            } else if (sub_pos1 == 1) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos1]);
                t_stu.setText(s_cool_stu[sub_pos1]);
                sc_picview.setImageResource(sc_cool[sub_pos1]);
                fc_picview.setImageResource(fc_cool[sub_pos1]);
            }
            if (sub_pos1 == 2) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos1]);
                t_stu.setText(s_cool_stu[sub_pos1]);
                sc_picview.setImageResource(sc_cool[sub_pos1]);
                fc_picview.setImageResource(fc_cool[sub_pos1]);
            }
        } else if (pos == 11) {

            String[] s_cool_fac = getResources().getStringArray(R.array.paper_faculty);
            String[] s_cool_stu = getResources().getStringArray(R.array.paper_student);
            if (sub_pos2 == 0) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos2]);
                t_stu.setText(s_cool_stu[sub_pos2]);
                sc_picview.setImageResource(sc_paper[sub_pos2]);
                fc_picview.setImageResource(fc_paper[sub_pos2]);
            } else if (sub_pos2 == 1) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos2]);
                t_stu.setText(s_cool_stu[sub_pos2]);
                sc_picview.setImageResource(sc_paper[sub_pos2]);
                fc_picview.setImageResource(fc_paper[sub_pos2]);
            } else if (sub_pos2 == 2) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos2]);
                t_stu.setText(s_cool_stu[sub_pos2]);
                sc_picview.setImageResource(sc_paper[sub_pos2]);
                fc_picview.setImageResource(fc_paper[sub_pos2]);


            } else if (sub_pos2 == 3) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos2]);
                t_stu.setText(s_cool_stu[sub_pos2]);
                sc_picview.setImageResource(sc_paper[sub_pos2]);
                fc_picview.setImageResource(fc_paper[sub_pos2]);
            }
        } else if (pos == 12) {
            String[] s_cool_fac = getResources().getStringArray(R.array.project_faculty);
            String[] s_cool_stu = getResources().getStringArray(R.array.project_student);
            if (sub_pos3 == 0) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos3]);
                t_stu.setText(s_cool_stu[sub_pos3]);

                sc_picview.setImageResource(sc_proj[sub_pos3]);
                fc_picview.setImageResource(fc_proj[sub_pos3]);

            } else if (sub_pos3 == 1) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos3]);
                t_stu.setText(s_cool_stu[sub_pos3]);
                sc_picview.setImageResource(sc_proj[sub_pos3]);

                fc_picview.setImageResource(fc_proj[sub_pos3]);

            } else if (sub_pos3 == 2) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos3]);
                t_stu.setText(s_cool_stu[sub_pos3]);

                sc_picview.setImageResource(sc_proj[sub_pos3]);
                fc_picview.setImageResource(fc_proj[sub_pos3]);

            } else if (sub_pos3 == 3) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos3]);
                t_stu.setText(s_cool_stu[sub_pos3]);

                sc_picview.setImageResource(sc_proj[sub_pos3]);
                fc_picview.setImageResource(fc_proj[sub_pos3]);

            }
        } else if (pos == 15) {
            String[] s_cool_fac = getResources().getStringArray(R.array.robotics_faculty);
            String[] s_cool_stu = getResources().getStringArray(R.array.robotics_student);
            if (sub_pos4 == 0) {

                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos4]);
                t_stu.setText(s_cool_stu[sub_pos4]);
                sc_picview.setImageResource(sc_robo[sub_pos4]);
                fc_picview.setImageResource(fc_robo[sub_pos4]);

            } else if (sub_pos4 == 1) {
                t_fac = (TextView) v.findViewById(R.id.fac);
                t_stu = (TextView) v.findViewById(R.id.stu);
                t_fac.setText(s_cool_fac[sub_pos4]);
                t_stu.setText(s_cool_stu[sub_pos4]);
                sc_picview.setImageResource(sc_robo[sub_pos4]);
                fc_picview.setImageResource(fc_robo[sub_pos4]);

            }

        } else {
            String[] s = getResources().getStringArray(R.array.Faculty_Name);

            t = (TextView) v.findViewById(R.id.fac);
            t.setText(s[pos]);

            String[] sa = getResources().getStringArray(R.array.Student_Name);
            ta = (TextView) v.findViewById(R.id.stu);
            ta.setText(sa[pos]);
            sc_picview.setImageResource(sc_main[pos]);
            fc_picview.setImageResource(fc_main[pos]);

        }

        // call option

        fcBtn = (ImageView) v.findViewById(R.id.calla);
        scBtn = (ImageView) v.findViewById(R.id.callb);
        if (pos == 3) {
            if(sub_pos1==0) {
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_cool_no[sub_pos1]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_cool_no[sub_pos1]));
                        startActivity(i);
                    }
                });
            }
            else if(sub_pos1==1) {
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_cool_no[sub_pos1]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_cool_no[sub_pos1]));
                        startActivity(i);
                    }
                });
            }
            else if(sub_pos1==2) {
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_cool_no[sub_pos1]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_cool_no[sub_pos1]));
                        startActivity(i);
                    }
                });
            }
        }
        else if (pos == 11) {

            if(sub_pos2==0) {
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_pap_no[sub_pos2]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_pap_no[sub_pos2]));
                        startActivity(i);
                    }
                });

            }
            else if(sub_pos2==1) {
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_pap_no[sub_pos2]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_pap_no[sub_pos2]));
                        startActivity(i);
                    }
                });

            }
            else if(sub_pos2==2){
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_pap_no[sub_pos2]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_pap_no[sub_pos2]));
                        startActivity(i);
                    }
                });
            }
            else if(sub_pos2==3) {
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_pap_no[sub_pos2]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_pap_no[sub_pos2]));
                        startActivity(i);
                    }
                });
            }
        }
        else if (pos == 12) {
            if(sub_pos3==0) {
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_pro_no[sub_pos3]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_pro_no[sub_pos3]));
                        startActivity(i);
                    }
                });
            }
            else if(sub_pos3==1) {
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_pro_no[sub_pos3]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_pro_no[sub_pos3]));
                        startActivity(i);
                    }
                });
            }
            else if(sub_pos3==2){
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_pro_no[sub_pos3]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_pro_no[sub_pos3]));
                        startActivity(i);
                    }
                });
            }
            else if(sub_pos3==3) {
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_pro_no[sub_pos3]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_pro_no[sub_pos3]));
                        startActivity(i);
                    }
                });
            }
        } else if (pos == 15) {
            if(sub_pos4==0) {
                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_robo_no[sub_pos4]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_robo_no[sub_pos4]));
                        startActivity(i);
                    }
                });
            }
            else {


                fcBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + fc_robo_no[sub_pos4]));
                        startActivity(i);
                    }
                });


                scBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:" + sc_robo_no[sub_pos4]));
                        startActivity(i);
                    }
                });
            }

        } else {
            fcBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" + fc_no[pos]));
                    startActivity(i);
                }
            });


            scBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" + sc_no[pos]));
                    startActivity(i);
                }
            });
        }
            return v;
        }

}
