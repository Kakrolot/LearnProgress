package com.example.a40272.constellation;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.a40272.constellation.bussiness.DataStore;
import com.example.a40272.constellation.bussiness.Star;
import com.example.a40272.constellation.utils.Constants;
import com.example.a40272.constellation.utils.NetworkUtils;

import org.json.JSONException;
import org.json.JSONObject;

public class DetailActivity extends AppCompatActivity {
    private TextView textView1,textView2,textView3;
    private DataStore mDataStore;
    private Star mStar;
    private String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        inti();
        //获取到传递过来的位置数据位置信息
        int position = getIntent().getIntExtra(Constants.EXTRA_KEY_POSITION,0);
        mStar = mDataStore.getmData().get(position);
        path = "http://web.juhe.cn:8080/constellation/getAll?consName="+mStar.getName()+"&type=today&key=57e6d3dd635baa6a79bdb6169870dd41";
        new DownLoadTask().execute(path);
    }

    private void inti() {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        mDataStore = DataStore.getINSTANCE();
    }

    private class DownLoadTask extends AsyncTask<String,Void,Star> {
        @Override
        protected Star doInBackground(String... strings) {
            String jsonText = NetworkUtils.getNetString(strings[0]);
            try {
                JSONObject root = new JSONObject(jsonText);
                String color = root.getString("color");
                String summary = root.getString("summary");
                //把相关数据设置到实体对象中
                mStar.setColor(color);
                mStar.setSummary(summary);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return mStar;
        }

        @Override
        protected void onPostExecute(Star star) {
            super.onPostExecute(star);
            textView1.setText(star.getName());
            textView2.setText(star.getColor());
            textView3.setText(star.getSummary());
        }
    }
}
