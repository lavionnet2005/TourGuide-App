package com.example.android.tourguideapp;

import android.content.Context;

/**
 * Created by lkatta on 1/30/17.
 */

public class LocationSF {

    private final String cityName = "San Francisco";
    private String name;
    private String streetName;
    private String zipCode;
    private int image;
    private String ratings;
    private boolean isImage = false;
    private Context context;

    public LocationSF(Context context, int name, int streetName, int zipCode, int ratings) {
        this.context = context;
        this.name = getAddressString(name);
        this.streetName = getAddressString(streetName);
        this.zipCode = getAddressString(zipCode);
        this.ratings = getAddressString(ratings);
    }

    public LocationSF(Context context, int name, int streetName, int zipCode, int ratings, int image) {
        this.context = context;
        this.name = getAddressString(name);
        this.streetName = getAddressString(streetName);
        this.zipCode = getAddressString(zipCode);
        this.ratings = getAddressString(ratings);
        this.image = image;
        isImage = true;
    }

    public String getName() {
        return name;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public int getImage() {
        return image;
    }

    public String getRatings() {
        return ratings;
    }

    public String getCityName() {
        return cityName;
    }


    public boolean isImage() {
        return isImage;
    }

    public String getAddressString(int id){
        String name = context.getResources().getString(id);
        if(!name.isEmpty()){
            return name;
        } else {
          return null;
        }
    }
}
