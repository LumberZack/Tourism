package com.example.android.touringvancouver;

/**
 * Created by SunFire on 8/18/2016.
 */
public class Attraction {

    private String mName;

    private String mDescription;

    private int mImageID;

    public Attraction (String name, String description, int imageID){
        mName = name;
        mDescription = description;
        mImageID = imageID;
    }

    public Attraction (String name, String description){
        mName = name;
        mDescription = description;
    }

    public String getName(){ return mName; }

    public String getDescription(){ return mDescription; }

    public int getImageID(){ return mImageID; }
}
