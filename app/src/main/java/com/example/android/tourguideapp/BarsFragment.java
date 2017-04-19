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
public class BarsFragment extends Fragment {


    public BarsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<LocationSF> locations = new ArrayList<LocationSF>();

        locations.add(new LocationSF(getContext(), R.string.acname1, R.string.acaddress1, R.string.zip, R.string.four, R.drawable.bar1));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four,  R.drawable.bar2));
        locations.add(new LocationSF(getContext(), R.string.acname3, R.string.acaddress3, R.string.zip, R.string.four,R.drawable.bar3));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four, R.drawable.ar4));
        locations.add(new LocationSF(getContext(), R.string.acname1, R.string.acaddress1, R.string.zip, R.string.four,R.drawable.bar5));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four, R.drawable.bar6));
        locations.add(new LocationSF(getContext(), R.string.acname3, R.string.acaddress3, R.string.zip, R.string.four, R.drawable.bar7));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four, R.drawable.bar8));
        locations.add(new LocationSF(getContext(), R.string.acname1, R.string.acaddress1, R.string.zip, R.string.four, R.drawable.var9));
        locations.add(new LocationSF(getContext(), R.string.acname2, R.string.acaddress2, R.string.zip, R.string.four,R.drawable.bar10));

        locationAdapter adapter = new locationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }

}
