package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lkatta on 1/30/17.
 */

public class locationAdapter extends ArrayAdapter {
    public locationAdapter(Activity activity, ArrayList<LocationSF> locations) {
        super(activity, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.location_linear_layout, parent, false);
        }

        LocationSF loc = (LocationSF) getItem(position);

        TextView name = (TextView) listView.findViewById(R.id.name);
        name.setText(loc.getName());

        TextView streetName = (TextView) listView.findViewById(R.id.streetName);
        streetName.setText(loc.getStreetName());


        TextView cityName = (TextView) listView.findViewById(R.id.cityName);
        cityName.setText(loc.getCityName());

        TextView zipCode = (TextView) listView.findViewById(R.id.zipCode);
        zipCode.setText(loc.getZipCode());

        TextView rating = (TextView) listView.findViewById(R.id.rating);
        rating.setText("Rating: " + loc.getRatings() + "/5.0");

        ImageView image = (ImageView) listView.findViewById(R.id.image);

        if (loc.isImage()) {
            image.setImageResource(loc.getImage());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);

        }


        return listView;
    }
}
