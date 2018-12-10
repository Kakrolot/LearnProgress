package com.example.a40272.app16;

import android.app.Application;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private TextView tvGameTitle;
    private EditText edtGameInput;
    private TextView tvTime;
    private Button btnGmae;
    private Player mPlayer;
    private TimeTask mTimeTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        inti();
        btnGmae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = edtGameInput.getText().toString();
                String result = mPlayer.compare(Integer.parseInt(inputText));
                if(result.equals("win")){
                    setResult(AppConstants.WIN);
                    finish();
                }else{
                    tvGameTitle.setText(result);
                }
                edtGameInput.setText("");
            }
        });
        changeUI();
        mTimeTask.execute();

    }

    @Override
    protected void onPause() {
        super.onPause();
        mTimeTask.cancel(true);
    }

    private void changeUI() {
        tvGameTitle.setText(mPlayer.getmGame().getTitle());
    }

    private void inti() {
        tvGameTitle = findViewById(R.id.tvTitle);
        edtGameInput = findViewById(R.id.edtGameInput);
        btnGmae = findViewById(R.id.btnGame);
        mPlayer = Player.getINSTANCE();
        tvTime = findViewById(R.id.tvTime);
        mTimeTask = new TimeTask();
    }
    private class TimeTask extends AsyncTask<Void,String,Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            for(int i=0;i<30;i++)
            {
                if(isCancelled()){
                    break;
                }
                publishProgress(i+"s");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
            tvTime.setText(values[0]);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            setResult(AppConstants.FAIL);
            finish();
        }
    }

}
