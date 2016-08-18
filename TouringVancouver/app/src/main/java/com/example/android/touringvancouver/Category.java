package com.example.android.touringvancouver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Create a list of words
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("one", "lutti", R.drawable.van));
        attractions.add(new Attraction("two", "otiiko", R.drawable.van));
        attractions.add(new Attraction("three", "tolookosu", R.drawable.van));
        attractions.add(new Attraction("four", "oyyisa", R.drawable.van));
        attractions.add(new Attraction("five", "massokka", R.drawable.van));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
