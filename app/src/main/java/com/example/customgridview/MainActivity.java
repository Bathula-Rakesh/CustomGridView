package com.example.customgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    GridModel girdModel;
    MyGridAdapter myGridAdapter;
    List<GridModel> gridModelList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.GridList);

        myGridAdapter=new MyGridAdapter(this,gridModelList);
        gridView.setAdapter(myGridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, ""+gridModelList.get(position).getTxt(), Toast.LENGTH_SHORT).show();
            }
        });

        loadData();
    }

    private void loadData() {

        girdModel=new GridModel(R.drawable.img_1,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_2,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_3,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_1,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_2,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_3,"HELLO");
        gridModelList.add(girdModel);


        girdModel=new GridModel(R.drawable.img_1,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_2,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_3,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_1,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_2,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_3,"HELLO");
        gridModelList.add(girdModel);


        girdModel=new GridModel(R.drawable.img_1,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_2,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_3,"HELLO");
        gridModelList.add(girdModel);


        girdModel=new GridModel(R.drawable.img_1,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_2,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_3,"HELLO");
        gridModelList.add(girdModel);


        girdModel=new GridModel(R.drawable.img_1,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_2,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_3,"HELLO");
        gridModelList.add(girdModel);


        girdModel=new GridModel(R.drawable.img_1,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_2,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_3,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_1,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_2,"HELLO");
        gridModelList.add(girdModel);

        girdModel=new GridModel(R.drawable.img_3,"HELLO");
        gridModelList.add(girdModel);

        myGridAdapter.notifyDataSetChanged();

    }
}