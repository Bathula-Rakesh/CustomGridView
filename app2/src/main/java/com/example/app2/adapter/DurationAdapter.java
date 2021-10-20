package com.example.app2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app2.R;
import com.example.app2.model.DuartionModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DurationAdapter  extends RecyclerView.Adapter<DurationAdapter.DurationHolder> {
    Context context;
    List<DuartionModel> duartionModelList=new ArrayList<>();

    public DurationAdapter(Context context, List<DuartionModel> duartionModelList) {
        this.context = context;
        this.duartionModelList = duartionModelList;
    }

    @NonNull
    @NotNull
    @Override
    public DurationHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_duration,parent,false);
        return new DurationHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DurationAdapter.DurationHolder holder, int position) {
        holder.textView.setText(""+duartionModelList.get(position).getDuartion());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context.getApplicationContext(), ""+duartionModelList.get(position).getDuartion(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return duartionModelList.size();
    }

    public class DurationHolder extends RecyclerView.ViewHolder {
        TextView textView;
        LinearLayout linearLayout;
        public DurationHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.c_duration);
            linearLayout=itemView.findViewById(R.id.duration_layout);
        }
    }
}
