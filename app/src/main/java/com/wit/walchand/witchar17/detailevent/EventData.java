package com.wit.walchand.witchar17.detailevent;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.TextView;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;
import com.wit.walchand.witchar17.HomeFrag;
import com.wit.walchand.witchar17.R;

import java.util.LinkedList;


public class EventData extends AppCompatActivity {

    KenBurnsView image;
    int pos = HomeFrag.position;
    BottomBar bottomBar;
    /*
        public final String[] proj_info= getResources().getStringArray(R.array.project_base_info);
        public final String[] proj_rule= getResources().getStringArray(R.array.project_rules);
        public final String[] proj_fac= getResources().getStringArray(R.array.project_faculty);
        public final String[] proj_stud= getResources().getStringArray(R.array.project_student);
        public final String[] proj_fc= getResources().getStringArray(R.array.project_faculty_Mobile);
        public final String[] proj_sc= getResources().getStringArray(R.array.project_student_Mobile);
    */
    int sub_pos1 = CoolCode.sub_pos0; // cool code  sub pos
    int sub_pos2 = Paper.sub_pos0;  // paper
    int sub_pos3 = Project.sub_pos0; // project
    int sub_pos4 = Robotics.sub_pos0;  // robotic

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_data);
        //String[] s =getResources().getStringArray(R.array.code_rules);

        String[] allinone = getResources().getStringArray(R.array.allinOne);
        String[] coolcodename = getResources().getStringArray(R.array.coolcodename);
        String[] roboname = getResources().getStringArray(R.array.robonames);

        int[] event_pic = {R.drawable.android, R.drawable.ap_tech_pic, R.drawable.catia_pic, R.drawable.coola_pic, R.drawable.cad_pic, R.drawable.electromech_pic, R.drawable.energy_pic, R.drawable.graphity_pic, R.drawable.infracivil_pic, R.drawable.expert_pic, R.drawable.treasure_pic, R.drawable.civi_pic, R.drawable.civi_pic, R.drawable.poster_pic, R.drawable.quizotronic_pic, R.drawable.robob__pic, R.drawable.stad_pic, R.drawable.web_pic, R.drawable.tender};
        int[] cool = {R.drawable.coola_pic, R.drawable.matlab_pic, R.drawable.micro_pic};
        int[] paper = {R.drawable.civi_pic, R.drawable.computer_pic, R.drawable.electronic_pic, R.drawable.mechenical_pic};
        int[] project = {R.drawable.civi_pic, R.drawable.computer_pic, R.drawable.electronic_pic, R.drawable.mechenical_pic};
        int[] robotics = {R.drawable.roboa_pic, R.drawable.robob__pic};

        image = (KenBurnsView) findViewById(R.id.kens);
        image.resume();



        if(pos==3)
        {
            if(sub_pos1==0)
            {

                String a = coolcodename[sub_pos1];
                this.setTitle(a);
                image.setImageResource(cool[sub_pos1]);
            }
            else if(sub_pos1==1)
            {

                String a = coolcodename[sub_pos1];
                this.setTitle(a);
                image.setImageResource(cool[sub_pos1]);
            }
            else if(sub_pos1==2)
            {

                String a = coolcodename[sub_pos1];
                this.setTitle(a);
                image.setImageResource(cool[sub_pos1]);
            }

        }
        else if(pos==11)
        {
            String a ="Paper Presentation";
            this.setTitle(a);
            if(sub_pos2==0) {

                image.setImageResource(paper[sub_pos2]);
            }
            else if(sub_pos2==1) {
                image.setImageResource(paper[sub_pos2]);
            }
            else if(sub_pos2==2) {
                image.setImageResource(paper[sub_pos2]);
            }
            else if(sub_pos2==3) {
                image.setImageResource(paper[sub_pos2]);
            }
        }
       else if(pos==12)
        {
            String a ="Project Competition";
            this.setTitle(a);
            if(sub_pos3==0) {
                image.setImageResource(project[sub_pos3]);
            }
           else if(sub_pos3==1) {
                image.setImageResource(project[sub_pos3]);
            }
           else if(sub_pos3==2) {
                image.setImageResource(project[sub_pos3]);
            }
           else if(sub_pos3==3) {
                image.setImageResource(project[sub_pos3]);
            }

        }
        else if(pos==15)
        {
            if(sub_pos4==0)
            {
                String a= roboname[sub_pos4];
                this.setTitle(a);
                image.setImageResource(robotics[sub_pos4]);
            }
            else
            {
                String a= roboname[sub_pos4];
                this.setTitle(a);
                image.setImageResource(robotics[sub_pos4]);
            }
        }
        else
        {
            String a =allinone[pos];
            this.setTitle(a);
            image.setImageResource(event_pic[pos]);
        }
    bottomBar=BottomBar.attach(this,savedInstanceState);


    bottomBar.setItemsFromMenu(R.menu.menumain,new

    OnMenuTabClickListener() {
        @Override
        public void onMenuTabSelected ( @IdRes int menuItemId){
            if (menuItemId == R.id.first) {
                info f = new info();
                getSupportFragmentManager().beginTransaction().replace(R.id.frames, f).commit();
            } else if (menuItemId == R.id.second) {
                CardsFragment f = new CardsFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.frames, f).commit();
            } else if (menuItemId == R.id.third) {
                contact f = new contact();
                getSupportFragmentManager().beginTransaction().replace(R.id.frames, f).commit();
            }
        }

        @Override
        public void onMenuTabReSelected ( @IdRes int menuItemId){

        }

    }

    );
    bottomBar.mapColorForTab(0,"#F44336");
    //bottomBar.mapColorForTab(1, "#FF6F00");
    bottomBar.mapColorForTab(2,"#795548");

}

    public boolean onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menumain, menu);
        return true;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}







