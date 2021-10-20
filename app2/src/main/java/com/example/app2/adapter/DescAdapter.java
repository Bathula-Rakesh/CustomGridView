package com.example.app2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app2.MyRecyclerinterface;
import com.example.app2.R;
import com.example.app2.model.DescModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DescAdapter extends RecyclerView.Adapter<DescAdapter.DescHolder> {
    Context context;
    List<DescModel> descModelList=new ArrayList<>();
    MyRecyclerinterface myRecyclerinterface;
    int i;

    public DescAdapter(Context context, List<DescModel> descModelList,MyRecyclerinterface myRecyclerinterface) {
        this.context = context;
        this.descModelList = descModelList;
        this.myRecyclerinterface=myRecyclerinterface;
    }

    @NonNull
    @NotNull
    @Override
    public DescHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_desc,parent,false);
        return new DescHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DescAdapter.DescHolder holder, int position) {

        i=position;
        holder.textView.setText(""+descModelList.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return descModelList.size();
    }

    public class DescHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public DescHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.c_desc);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    myRecyclerinterface.setMyPosition(getAdapterPosition());

                    //Toast.makeText(context.getApplicationContext(), ""+descModelList.get(getAdapterPosition()).getDesc(),Toast.LENGTH_SHORT).show();

                }
            });

        }
    }
}
