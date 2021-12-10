package edu.neu.madcourse.mathters;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.GridView;
import androidx.appcompat.widget.Toolbar;

import static edu.neu.madcourse.mathters.SplashActivity.catList;

import java.util.ArrayList;
import java.util.List;

import mathters.R;

public class CategoryActivity extends AppCompatActivity {

    private GridView catGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Grade");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        catGrid = findViewById(R.id.catGridview);

        CatGridAdapter adapter = new CatGridAdapter(catList);
        catGrid.setAdapter(adapter);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
            CategoryActivity.this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
