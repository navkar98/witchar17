package com.wit.walchand.witchar17;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.wit.walchand.witchar17.detailevent.CoolCode;
import com.wit.walchand.witchar17.detailevent.EventData;
import com.wit.walchand.witchar17.detailevent.Paper;
import com.wit.walchand.witchar17.detailevent.Project;
import com.wit.walchand.witchar17.detailevent.Robotics;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFrag extends android.support.v4.app.Fragment implements AdapterView.OnItemClickListener {


    View rtv;
    public static int position=100;

    public HomeFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rtv = inflater.inflate(R.layout.layout_content_main, container, false);
        GridView gridView = (GridView) rtv.findViewById(R.id.gridview);

        gridView.setAdapter(new GridViewAdapter(getActivity().getApplicationContext()));
        gridView.setOnItemClickListener(this);
        return rtv;
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        this.position = position;

        if (position == 3) {
            Intent i = new Intent(rtv.getContext(), CoolCode.class);
            startActivity(i);

        } else if (position == 11) {
            Intent i = new Intent(rtv.getContext(), Paper.class);
            startActivity(i);

        } else if (position == 12) {
            Intent i = new Intent(rtv.getContext(), Project.class);
            startActivity(i);

        } else if (position == 15) {
            Intent i = new Intent(rtv.getContext(), Robotics.class);
            startActivity(i);

        } else {
            Intent i = new Intent(rtv.getContext(), EventData.class);
            startActivity(i);
            //Toast.makeText(getActivity().getApplicationContext(), "" + position, Toast.LENGTH_SHORT).show();
        }

    }
}