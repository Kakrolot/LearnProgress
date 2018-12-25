package com.example.a40272.constellation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a40272.constellation.bussiness.Star;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Context mContext;
    private int mItemLayout;
    private ArrayList<Star> mData;

    public MyAdapter(Context context,int itemLayout,ArrayList<Star> data){
        mContext = context;
        mItemLayout = itemLayout;
        mData = data;
    }


    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder =null;
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(mItemLayout,parent,false);
            holder = new ViewHolder();
            holder.imgItem = convertView.findViewById(R.id.imgItem);
            holder.tvItem = convertView.findViewById(R.id.tvItem);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        Star star = mData.get(position);
        holder.imgItem.setImageResource(star.getNumber());
        holder.tvItem.setText(star.getName());

        return convertView;
    }

    private class ViewHolder {
        ImageView imgItem;
        TextView tvItem;
    }
}
