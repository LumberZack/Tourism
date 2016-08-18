package com.example.android.touringvancouver;

/**
 * Created by SunFire on 8/18/2016.
 */
public class Attraction {

    private int mNameID;

    private int mDetailID;

    private int mImageID = 0;

    public Attraction (int nameID, int detailID, int imageID){
        mNameID = nameID;
        mDetailID = detailID;
        mImageID = imageID;
    }

    public Attraction (int nameID, int detailID){
        mNameID = nameID;
        mDetailID = detailID;

    }

    public int getName(){ return mNameID; }

    public int getDetailID(){ return mDetailID; }

    public int getImageID(){ return mImageID; }
}
