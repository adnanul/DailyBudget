package com.dbbl.adnan.dailybudget.activities.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dbbl.adnan.dailybudget.R;
import com.dbbl.adnan.dailybudget.activities.models.NavModels;

/**
 * Created by Asus on 1/7/2018.
 */

public class DrawerItemCustomAdapter extends ArrayAdapter<NavModels> {

    Context mContext;
    int layoutResourceId;
    NavModels data[] = null;

    public DrawerItemCustomAdapter(Context mContext, int layoutResourceId, NavModels[] data) {

        super(mContext, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem = convertView;

        LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        listItem = inflater.inflate(layoutResourceId, parent, false);

        ImageView imageViewIcon = (ImageView) listItem.findViewById(R.id.imageViewIcon);
        TextView textViewName = (TextView) listItem.findViewById(R.id.textViewName);

        NavModels folder = data[position];


        imageViewIcon.setImageResource(folder.icon);
        textViewName.setText(folder.name);

        return listItem;
    }
}