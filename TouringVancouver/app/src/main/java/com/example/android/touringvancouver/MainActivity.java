package com.example.android.touringvancouver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView foods = (TextView) findViewById(R.id.foods);
        foods.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent foodsIntent = new Intent(MainActivity.this, FoodsActivity.class);
                startActivity(foodsIntent);
            }
        });
    }
}
