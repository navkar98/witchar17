package com.wit.walchand.witchar17;


import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mzule.fantasyslide.SideBar;
import com.github.mzule.fantasyslide.SimpleFantasyListener;
import com.github.mzule.fantasyslide.Transformer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.wit.walchand.witchar17.R;
import com.wit.walchand.witchar17.UniversalActivity;

import static android.R.attr.tag;
import static com.wit.walchand.witchar17.R.id.time;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private FirebaseAnalytics mFirebaseAnalytics;

    FragmentManager fm;
    int backpressed = 0;
    Handler hd = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fm = getSupportFragmentManager();
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
       /* Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "id");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "name");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);*/

//        adb shell setprop log.tag.FA VERBOSE;
//        adb shell setprop log.tag.FA-SVC VERBOSE;
//        adb logcat -v time -s FA FA-SVC;

        final DrawerArrowDrawable indicator = new DrawerArrowDrawable(this);
        indicator.setColor(Color.WHITE);
        getSupportActionBar().setHomeAsUpIndicator(indicator);

        //setTransformer();
        // setListener();
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawerLayout.setScrimColor(Color.TRANSPARENT);
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                if (((ViewGroup) drawerView).getChildAt(1).getId() == R.id.leftSideBar) {
                    indicator.setProgress(slideOffset);
                }
            }
        });
        HomeFrag setHome = new HomeFrag();
        setHomeFragment(setHome);
    }

    public void setHomeFragment(Fragment fragment) {

        //FragmentManager fm = getSupportFragmentManager();

        fm.beginTransaction().add(R.id.llContent, fragment, fragment.getTag()).commit();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START);
            } else {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        }
        return true;
    }

    public void onClick(View view) {

        backpressed = 0;
        String a;
        if (view.getId() == R.id.userInfo) {
            hd.postDelayed(new Runnable() {
                @Override
                public void run() {
                    fm.beginTransaction().replace(R.id.llContent, new AboutUsFragment()).commit();
                }
            }, 300);

            a = "About Us";
            this.setTitle(a);
        }

        if (view instanceof TextView) {

            String title = ((TextView) view).getText().toString();

            if (title.startsWith("Events")) {
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        fm.beginTransaction().replace(R.id.llContent, new HomeFrag()).commit();
                    }
                }, 300);

                a = "Events";
                this.setTitle(a);

            } else if (title.startsWith("Initiatives")) {
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        fm.beginTransaction().replace(R.id.llContent, new InitiativeFragment()).commit();

                    }
                }, 300);

                a = "Initiative";
                this.setTitle(a);
            } else if (title.startsWith("Registration")) {
                    hd.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            fm.beginTransaction().replace(R.id.llContent, new RegistrationFragment()).commit();

                        }
                    }, 300);

                    a = "Registration";
                    this.setTitle(a);
            } else if (title.startsWith("Online Quiz")) {
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        fm.beginTransaction().replace(R.id.llContent, new OnlineQuizFragment()).commit();

                    }
                }, 100);

                a = "Online Quiz";
                this.setTitle(a);

            } else if (title.startsWith("Schedule")) {

                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        fm.beginTransaction().replace(R.id.llContent, new ScheduleFragment()).commit();

                    }
                }, 200);

                a = "Schedule";
                this.setTitle(a);

                //Toast.makeText(this, title, Toast.LENGTH_SHORT).show();

            } else if (title.startsWith("Accommodation")) {
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        fm.beginTransaction().replace(R.id.llContent, new AccomodationFragment()).commit();

                    }
                }, 300);

                a = "Accommodation";
                this.setTitle(a);
                // Toast.makeText(this, title, Toast.LENGTH_SHORT).show();

            } else if (title.startsWith("Credits")) {
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        fm.beginTransaction().replace(R.id.llContent, new DevelopersFragment()).commit();
                    }
                }, 300);

                a = "Credits";
                this.setTitle(a);
            } else if (title.startsWith("Out Of Box")) {
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        fm.beginTransaction().replace(R.id.llContent, new OutOfBox()).commit();
                    }
                }, 300);

                a = "Out Of Box";
                this.setTitle(a);
            }/* else if (title.startsWith("Privacy Policy")) {
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        fm.beginTransaction().replace(R.id.llContent, new PrivacyFragment()).commit();
                    }
                }, 200);

                a = "Privacy Policy";
                this.setTitle(a);
            }*/
        }
    }

    @Override
    public void onBackPressed() {

        if (backpressed == 0) {

            HomeFrag frag = new HomeFrag();
            fm.beginTransaction().replace(R.id.llContent, frag, frag.getTag()).commit();
            this.setTitle("Events");
            backpressed = 1;
        } else if (backpressed == 1) {
            super.onBackPressed();
        }
    }
}
