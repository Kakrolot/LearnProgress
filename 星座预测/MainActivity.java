package com.example.a40272.constellation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.a40272.constellation.bussiness.DataStore;
import com.example.a40272.constellation.utils.Constants;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private DataStore mDataStore;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inti();
        lv.setAdapter(myAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),DetailActivity.class);
                intent.putExtra(Constants.EXTRA_KEY_POSITION,position);
                startActivity(intent);
            }
        });
    }

    private void inti() {
        lv = findViewById(R.id.lv);
        mDataStore = DataStore.getINSTANCE();
        myAdapter = new MyAdapter(getApplicationContext(),R.layout.item_layout,mDataStore.getmData());
    }
}
