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
public class ActiveLifeFragment extends Fragment {


    public ActiveLifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<LocationSF> locations = new ArrayList<LocationSF>();

        locations.add(new LocationSF(getContext(), R.string.acname1, R.string.acaddress1, R.string.zip, R.string.four, R.drawable.ac1));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four, R.drawable.ac2));
        locations.add(new LocationSF(getContext(), R.string.acname3, R.string.acaddress3, R.string.zip, R.string.f_5, R.drawable.ac3));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four, R.drawable.ac5));
        locations.add(new LocationSF(getContext(), R.string.acname3, R.string.acaddress3, R.string.zip, R.string.f_5, R.drawable.ac5));
        locations.add(new LocationSF(getContext(), R.string.acname1, R.string.acaddress1, R.string.zip, R.string.four, R.drawable.ac6));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four, R.drawable.ac7));
        locations.add(new LocationSF(getContext(), R.string.acname3, R.string.acaddress3, R.string.zip, R.string.f_5, R.drawable.ac8));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four, R.drawable.ac9));
        locations.add(new LocationSF(getContext(), R.string.acname1, R.string.acaddress1, R.string.zip, R.string.four, R.drawable.ac10));

        locationAdapter adapter = new locationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
