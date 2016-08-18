package com.example.android.touringvancouver;

/**
 * Created by SunFire on 8/18/2016.
 */
public class Attraction {

    private String mName;

    private int mDetailID;

    private int mImageID = 0;

    public Attraction (String name, int detailID, int imageID){
        mName = name;
        mDetailID = detailID;
        mImageID = imageID;
    }

    public Attraction (String name, int detailID){
        mName = name;
        mDetailID = detailID;

    }

    public String getName(){ return mName; }

    public int getDetailID(){ return mDetailID; }

    public int getImageID(){ return mImageID; }
}
