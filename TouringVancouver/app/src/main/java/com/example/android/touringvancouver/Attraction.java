package com.example.android.touringvancouver;

/**
 * Created by SunFire on 8/18/2016.
 */
public class Attraction {

    private String mName;

    private String mLocation;

    private int mImageID;

    public Attraction (String name, String location, int imageID){
        mName = name;
        mLocation = location;
        mImageID = imageID;
    }

    public Attraction (String name, String description){
        mName = name;
        mLocation = description;
    }

    public String getName(){ return mName; }

    public String getLocation(){ return mLocation; }

    public int getImageID(){ return mImageID; }
}
