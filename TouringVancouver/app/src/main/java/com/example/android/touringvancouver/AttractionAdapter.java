package com.example.android.touringvancouver;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by SunFire on 8/18/2016.
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);

        nameTextView.setText(currentAttraction.getName());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);

        locationTextView.setText(currentAttraction.getLocation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentAttraction.getImageID());

        return listItemView;
    }

    public AttractionAdapter(Activity context, ArrayList<Attraction> words){
        super(context, 0, words);
    }
}