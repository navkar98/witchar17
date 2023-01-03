package com.wit.walchand.witchar17;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.wit.walchand.witchar17.detailevent.EventData;

import java.util.HashMap;

import static android.R.attr.fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener{


    public AboutUsFragment() {
        // Required empty public constructor
    }


    private SliderLayout imageSlider;
    View v;
    Button button;

    Button b;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        v = inflater.inflate(R.layout.fragment_about_us, container, false);;

        imageSlider = (SliderLayout)v.findViewById(R.id.slider);

        HashMap<String,String> url_maps = new HashMap<String, String>();
        url_maps.put("H", "http://static2.hypable.com/wp-content/uploads/2013/12/hannibal-season-2-release-date.jpg");
        url_maps.put("B", "http://tvfiles.alphacoders.com/100/hdclearart-10.png");
        url_maps.put("Ho", "http://cdn3.nflximg.net/images/3093/2043093.jpg");
        url_maps.put("G", "http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("1",R.drawable.slide_img1);
        file_maps.put("2",R.drawable.slide_img2);
        file_maps.put("3",R.drawable.slide_img11);
        file_maps.put("4", R.drawable.slide_img4);
        file_maps.put("5", R.drawable.slide_img5);
        file_maps.put("6", R.drawable.slide_img6);
        file_maps.put("7", R.drawable.slide_img7);
        file_maps.put("8", R.drawable.slide_img8);
        file_maps.put("9", R.drawable.slide_img9);
        file_maps.put("10", R.drawable.slide_img10);

        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(v.getContext());
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            imageSlider.addSlider(textSliderView);
        }
        imageSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        imageSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        imageSlider.setCustomAnimation(new DescriptionAnimation());
        imageSlider.setDuration(2000);
        imageSlider.addOnPageChangeListener(this);


        button = (Button)v.findViewById(R.id.privacy);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrivacyFragment privacyFragment = new PrivacyFragment();
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.llContent, privacyFragment, privacyFragment.getTag()).commit();
            }
        });
        // Inflate the layout for this fragment
        return v;
    }

//    public void forPrivacy(View v){
//        if (getView().getId()==R.id.privacy) {
//
//        }
//    }

    @Override
    public void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        imageSlider.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
      //  Toast.makeText(v.getContext(),slider.getBundle().get("extra") + "",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {
        Log.e("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {}
}

