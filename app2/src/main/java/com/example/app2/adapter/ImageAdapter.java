package com.example.app2.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app2.R;
import com.example.app2.model.ImageModel;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageHolder> {
    Context context;
    List<ImageModel> imageModelList=new ArrayList<>();

    public ImageAdapter(Context context, List<ImageModel> imageModelList) {
        this.context = context;
        this.imageModelList = imageModelList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ImageHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_image,parent,false);
        return new ImageHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull ImageAdapter.ImageHolder holder, int position) {

        holder.imageView.setImageResource(imageModelList.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return imageModelList.size();
    }

    public class ImageHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ImageHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.c_image);
        }
    }
}
