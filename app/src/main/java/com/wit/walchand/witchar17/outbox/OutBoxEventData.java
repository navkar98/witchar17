package com.wit.walchand.witchar17.outbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wit.walchand.witchar17.OutOfBox;
import com.wit.walchand.witchar17.R;
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
import com.wit.walchand.witchar17.detailevent.CardsFragment;
import com.wit.walchand.witchar17.detailevent.Project;
import com.wit.walchand.witchar17.detailevent.contact;
import com.wit.walchand.witchar17.detailevent.info;

import java.util.LinkedList;


public class OutBoxEventData extends AppCompatActivity {

    KenBurnsView image;
    BottomBar bottomBar;
    int pos = OutOfBox.boxpos;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_data);

        image = (KenBurnsView) findViewById(R.id.kens);
        int[] out_pic={R.drawable.g,R.drawable.logos};
        image.resume();
        if(pos==0)
        {

           String a="Google It";
            this.setTitle(a);
            image.setImageResource(out_pic[pos]);

        }
        else
        {

            String a="Logo Quiz";
            this.setTitle(a);
            image.setImageResource(out_pic[pos]);
        }

        bottomBar=BottomBar.attach(this,savedInstanceState);

        bottomBar.setItemsFromMenu(R.menu.menumain,new

                OnMenuTabClickListener() {
                    @Override
                    public void onMenuTabSelected ( @IdRes int menuItemId){
                        if (menuItemId == R.id.first) {
                            info_out f = new info_out();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frames, f).commit();
                        } else if (menuItemId == R.id.second) {
                            CardsFragment_out f = new CardsFragment_out();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frames, f).commit();
                        } else if (menuItemId == R.id.third) {
                            contact_out f = new contact_out();
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







