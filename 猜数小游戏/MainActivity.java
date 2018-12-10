package com.example.a40272.app16;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView image1;
    private Button btnA1,btnA2;
    private Player mPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inti();
        setListener();
        }

    private void setListener() {
        final ButtonListener listener = new ButtonListener();
        btnA1.setOnClickListener(listener);
        btnA2.setOnClickListener(listener);
    }

    private void inti() {
        image1 = findViewById(R.id.image1);
        btnA1 = findViewById(R.id.btnA1);
        btnA2 = findViewById(R.id.btnA2);
        mPlayer = Player.getINSTANCE();
    }

    private class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(getApplicationContext(),GameActivity.class);
            switch (v.getId())
            {
                case R.id.btnA1:
                    mPlayer.setLevel(Game.NORMAL);
                    startActivityForResult(intent,AppConstants.NORMAL_LEVEL);
                    break;
                case R.id.btnA2:
                    mPlayer.setLevel(Game.HARD);
                    startActivityForResult(intent,AppConstants.HARD_LEVEL);
                    break;
                    default:

            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == AppConstants.NORMAL_LEVEL){
            if(resultCode == AppConstants.WIN){
            image1.setImageResource(R.drawable.win);
            }
            if(resultCode == AppConstants.FAIL){
                image1.setImageResource(R.drawable.fail);
            }
        }
        if(requestCode == AppConstants.HARD_LEVEL){
            if(resultCode == AppConstants.WIN)
            {
                image1.setImageResource(R.drawable.win);
            }
            if(resultCode == AppConstants.FAIL){
                image1.setImageResource(R.drawable.fail);
            }
        }

    }
}
