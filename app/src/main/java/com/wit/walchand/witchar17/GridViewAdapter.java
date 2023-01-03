package com.wit.walchand.witchar17;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by navkar98 on 27/02/2017.
 */

public class GridViewAdapter extends BaseAdapter {

    private final List<EventIconItem> myEventIcons = new ArrayList<EventIconItem>();

    private final LayoutInflater myInflater;

    GridViewAdapter(Context context)
    {
        myInflater=LayoutInflater.from(context);

        myEventIcons.add(new EventIconItem(R.drawable.sk)); //1
        myEventIcons.add(new EventIconItem(R.drawable.aptechquiz)); //2
        myEventIcons.add(new EventIconItem(R.drawable.catia));
        myEventIcons.add(new EventIconItem(R.drawable.cool));
        myEventIcons.add(new EventIconItem(R.drawable.cad)); //5
        myEventIcons.add(new EventIconItem(R.drawable.electromech));
        myEventIcons.add(new EventIconItem(R.drawable.energy));
        myEventIcons.add(new EventIconItem(R.drawable.graphity)); //8
        myEventIcons.add(new EventIconItem(R.drawable.infracivil));
        myEventIcons.add(new EventIconItem(R.drawable.expertmanu)); //10
        myEventIcons.add(new EventIconItem(R.drawable.treasure));  //11
        myEventIcons.add(new EventIconItem(R.drawable.paper)); //12
        myEventIcons.add(new EventIconItem(R.drawable.project));
        myEventIcons.add(new EventIconItem(R.drawable.poster));
        myEventIcons.add(new EventIconItem(R.drawable.quizo)); //15
        myEventIcons.add(new EventIconItem(R.drawable.robotics));
        myEventIcons.add(new EventIconItem(R.drawable.staad));
        myEventIcons.add(new EventIconItem(R.drawable.web2)); //18
        myEventIcons.add(new EventIconItem(R.drawable.tende));


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View makeView=convertView;
        ImageView icon;

        if(makeView==null)
        {
            makeView=myInflater.inflate(R.layout.grid_item,parent,false);
            makeView.setTag(R.id.icon  ,makeView.findViewById(R.id.icon));

        }


        icon=(ImageView)makeView.getTag(R.id.icon);
        EventIconItem item=(EventIconItem)getItem(position);

        icon.setImageResource(item.iconId);


        return makeView;
    }

    @Override
    public long getItemId(int position) {
        return myEventIcons.indexOf(position);
    }

    @Override
    public Object getItem(int position) {
        return myEventIcons.get(position);
    }

    @Override
    public int getCount() {
        return myEventIcons.size();
    }

}
