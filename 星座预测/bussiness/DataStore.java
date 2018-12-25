package com.example.a40272.constellation.bussiness;

import com.example.a40272.constellation.R;

import java.util.ArrayList;

public class DataStore {
    private static final DataStore INSTANCE = new DataStore();
    private ArrayList<Star> mData;
    private DataStore(){
        mData = new ArrayList<>();
        mData.add(new Star("双鱼座",R.drawable.shuangyu));
        mData.add(new Star("白羊座",R.drawable.baiyang));
        mData.add(new Star("处女座",R.drawable.chunv));
        mData.add(new Star("金牛座",R.drawable.jinniu));
        mData.add(new Star("摩羯座",R.drawable.mojie));
        mData.add(new Star("射手座",R.drawable.sheshou));
        mData.add(new Star("狮子座",R.drawable.shizi));
        mData.add(new Star("双子座",R.drawable.shuangzi));
        mData.add(new Star("水瓶座",R.drawable.shuiping));
        mData.add(new Star("天平座",R.drawable.tianping));
        mData.add(new Star("天蝎座",R.drawable.tianxie));
        mData.add(new Star("巨蟹座",R.drawable.juxie));
    }

    public static DataStore getINSTANCE() {
        return INSTANCE;
    }

    public ArrayList<Star> getmData() {
        return mData;
    }
}
