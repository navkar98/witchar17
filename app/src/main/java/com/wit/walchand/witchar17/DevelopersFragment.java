package com.wit.walchand.witchar17;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DevelopersFragment extends Fragment implements View.OnClickListener {

    ImageView im1, im2, im3, im4, im5, im6, im7, im8, im9, im10;

    Button b1;

    public DevelopersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_developers, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        im1 = (ImageView) getView().findViewById(R.id.fbs);
        im2 = (ImageView) getView().findViewById(R.id.fbn);
        im3 = (ImageView) getView().findViewById(R.id.linkn);
        im4 = (ImageView) getView().findViewById(R.id.fbr);
        im5 = (ImageView) getView().findViewById(R.id.linkr);
        im6 = (ImageView) getView().findViewById(R.id.fbsh);
        im7 = (ImageView) getView().findViewById(R.id.linksh);
        im8 = (ImageView) getView().findViewById(R.id.fbp);
        im9 = (ImageView) getView().findViewById(R.id.linkp);
        im10 = (ImageView) getView().findViewById(R.id.links);
        /*im11 = (ImageView) getView().findViewById(R.id.imageView231116);
        im12 = (ImageView) getView().findViewById(R.id.imageView331116);
        im13 = (ImageView) getView().findViewById(R.id.imageView141116);
        im14 = (ImageView) getView().findViewById(R.id.imageView241116);
        im15 = (ImageView) getView().findViewById(R.id.imageView341116);
        im16 = (ImageView) getView().findViewById(R.id.imageView151116);
        im17 = (ImageView) getView().findViewById(R.id.imageView251116);
        im18 = (ImageView) getView().findViewById(R.id.imageView351116);*/
        im1.setOnClickListener(this);
        im2.setOnClickListener(this);
        im3.setOnClickListener(this);
        im4.setOnClickListener(this);
        im5.setOnClickListener(this);
        im6.setOnClickListener(this);
        im7.setOnClickListener(this);
        im8.setOnClickListener(this);
        im9.setOnClickListener(this);
        im10.setOnClickListener(this);
        /*im11.setOnClickListener(this);
        im12.setOnClickListener(this);
        im13.setOnClickListener(this);
        im14.setOnClickListener(this);
        im15.setOnClickListener(this);
        im16.setOnClickListener(this);
        im17.setOnClickListener(this);
        im18.setOnClickListener(this);*/

        b1=(Button)getView().findViewById(R.id.feed);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bi=new Intent("android.intent.action.VIEW",Uri.parse("https://goo.gl/forms/Z2MqONsDZLPT5m4H2"));
                startActivity(bi);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fbs:
//abhi linked in
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/saksham.jain.98"));
                startActivity(i);

                break;
            case R.id.links:
                Intent i10 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://in.linkedin.com/in/saksham-jain-761631139"));
                startActivity(i10);
                break;
            case R.id.linkp:
//praj linked in
                Intent i12 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://in.linkedin.com/in/prajyot-gulhane-76b1859b"));
                startActivity(i12);

                break;
            case R.id.fbp:
                Intent i32 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/prajyot.gulhane?fref=ts"));
                startActivity(i32);
                break;
            case R.id.fbn:
                Intent i3 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/navkar.jain.10?ref=bookmarks"));
                startActivity(i3);
                break;
            case R.id.linkn:
                Intent i4 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/navkar-j-1b7594110"));
                startActivity(i4);
                break;
            case R.id.fbr:
                Intent i5 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/reeck.chakraborty"));
                startActivity(i5);
                break;
            case R.id.linkr:
                Intent i6 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://in.linkedin.com/in/reeck-chakraborty-56998964"));
                startActivity(i6);
                break;
            case R.id.fbsh:
                Intent i7 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/shravani.chintakindi.3?ref_component=mbasic_home_header&ref_page=%2Fwap%2Fhome.php&refid=7&ref=opera_speed_dial"));
                startActivity(i7);
                break;
            case R.id.linksh:
                Intent i8 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://in.linkedin.com/in/shravani-chintakindi-806a84127"));
                startActivity(i8);
                break;
        }
    }
}