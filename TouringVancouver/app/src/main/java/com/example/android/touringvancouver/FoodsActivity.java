package com.example.android.touringvancouver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Create a list of attractions
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.gothamName, R.string.gotham));
        attractions.add(new Attraction(R.string.SushiyamaName, R.string.sushiyama));
        attractions.add(new Attraction(R.string.firePizzaName, R.string.firepizza));
        attractions.add(new Attraction(R.string.warehouseName, R.string.warehouse));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        // The adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // category.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }
}
