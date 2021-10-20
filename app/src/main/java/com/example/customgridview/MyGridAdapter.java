package com.example.customgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyGridAdapter extends BaseAdapter {
    Context context;
    List<GridModel> girdModels=new ArrayList<>();

    LayoutInflater layoutInflater;

    public MyGridAdapter(Context context, List<GridModel> girdModels) {
        this.context = context;
        this.girdModels = girdModels;

        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return girdModels.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=layoutInflater.inflate(R.layout.custom_grid,null);
        TextView textView=view.findViewById(R.id.mytext);
        ImageView imageView=view.findViewById(R.id.myimg);

        textView.setText(""+girdModels.get(position).getTxt());
        imageView.setImageResource(girdModels.get(position).getImg());
        return view;
    }
}
