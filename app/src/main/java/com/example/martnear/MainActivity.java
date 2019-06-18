package com.example.martnear;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ExpandListAdapter adapter;
    private Toolbar toolbar;
    String[] item = new String[] { "Electronics", "Electronics", "Electronics", "Electronics", "Electronics" };
    public static int [] imageID={R.drawable.bread,R.drawable.bread,R.drawable.bread,R.drawable.bread,R.drawable.bread};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listView.setAdapter(adapter);

    }

    private void init() {

        toolbar =  findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Search");
        adapter = new ExpandListAdapter(this,item, imageID);
        listView = findViewById(R.id.listview);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}
