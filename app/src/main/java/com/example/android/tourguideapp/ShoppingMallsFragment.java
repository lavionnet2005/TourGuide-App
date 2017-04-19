package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingMallsFragment extends Fragment {


    public ShoppingMallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<LocationSF> locations = new ArrayList<LocationSF>();

        locations.add(new LocationSF(getContext(), R.string.acname1, R.string.acaddress1, R.string.zip, R.string.four, R.drawable.hotel));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four,  R.drawable.hotel2));
        locations.add(new LocationSF(getContext(), R.string.acname3, R.string.acaddress3, R.string.zip, R.string.four,R.drawable.hotel3));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four, R.drawable.hotel4));
        locations.add(new LocationSF(getContext(), R.string.acname1, R.string.acaddress1, R.string.zip, R.string.four,R.drawable.hotel5));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four, R.drawable.hotel7));
        locations.add(new LocationSF(getContext(), R.string.acname3, R.string.acaddress3, R.string.zip, R.string.four, R.drawable.hotel8));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four, R.drawable.hotel9));
        locations.add(new LocationSF(getContext(), R.string.acname1, R.string.acaddress1, R.string.zip, R.string.four, R.drawable.hotel10));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four,R.drawable.hotel1));

        locationAdapter adapter = new locationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
