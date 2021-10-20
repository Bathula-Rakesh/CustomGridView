package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.app2.adapter.DescAdapter;
import com.example.app2.adapter.DurationAdapter;
import com.example.app2.adapter.ImageAdapter;
import com.example.app2.model.DescModel;
import com.example.app2.model.DuartionModel;
import com.example.app2.model.ImageModel;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity implements MyRecyclerinterface {


    RecyclerView recyclerView_image,recyclerView_desc,recyclerView_duration;

    DescModel descModel;
    DuartionModel duartionModel;
    ImageModel imageModel;


    ImageAdapter imageAdapter;
    DescAdapter descAdapter;
    DurationAdapter durationAdapter;


    List<ImageModel> imageModelList=new ArrayList<>();
    List<DescModel> descModelList=new ArrayList<>();
    List<DuartionModel> duartionModelList=new ArrayList<>();


    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView_image=findViewById(R.id.image_recycler);
        recyclerView_desc=findViewById(R.id.dsc_recycler);
        recyclerView_duration=findViewById(R.id.duartion);

        //set has Fixed Size

        recyclerView_image.setHasFixedSize(true);
        recyclerView_desc.setHasFixedSize(true);
        recyclerView_duration.setHasFixedSize(true);

        //Layout Manger
        recyclerView_image.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView_desc.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_duration.setLayoutManager(new LinearLayoutManager(this));

        //Adapters set to recyelrview
        imageAdapter=new ImageAdapter(this,imageModelList);
        recyclerView_image.setAdapter(imageAdapter);

        descAdapter=new DescAdapter(this,descModelList,this);
        recyclerView_desc.setAdapter(descAdapter);

        durationAdapter=new DurationAdapter(this,duartionModelList);
        recyclerView_duration.setAdapter(durationAdapter);


        loadImage();
        LoadDesc();
        LoadDuartion();


    }

    private void LoadDuartion() {
        duartionModel=new DuartionModel("Duartion");
        duartionModelList.add(duartionModel);
        duartionModel=new DuartionModel("Duartion");
        duartionModelList.add(duartionModel);
        duartionModel=new DuartionModel("Duartion");
        duartionModelList.add(duartionModel);
        duartionModel=new DuartionModel("Duartion");
        duartionModelList.add(duartionModel);
        duartionModel=new DuartionModel("Duartion");
        duartionModelList.add(duartionModel);
        duartionModel=new DuartionModel("Duartion");
        duartionModelList.add(duartionModel);
        duartionModel=new DuartionModel("Duartion");
        duartionModelList.add(duartionModel);
        duartionModel=new DuartionModel("Duartion");
        duartionModelList.add(duartionModel);
        duartionModel=new DuartionModel("Duartion");
        duartionModelList.add(duartionModel);

        durationAdapter.notifyDataSetChanged();

    }

    private void LoadDesc() {
        descModel=new DescModel("Description1");
        descModelList.add(descModel);
        descModel=new DescModel("Description2");
        descModelList.add(descModel);
        descModel=new DescModel("Description3");
        descModelList.add(descModel);
        descModel=new DescModel("Description4");
        descModelList.add(descModel);
        descModel=new DescModel("Description5");
        descModelList.add(descModel);
        descModel=new DescModel("Description6");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);

        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);

        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);

        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);
        descModel=new DescModel("Description");
        descModelList.add(descModel);

        descAdapter.notifyDataSetChanged();

    }

    private void loadImage() {

        imageModel=new ImageModel(R.drawable.ic_launcher_background);
        imageModelList.add(imageModel);
        imageModel=new ImageModel(R.drawable.ic_launcher_background);
        imageModelList.add(imageModel);
        imageModel=new ImageModel(R.drawable.ic_launcher_background);
        imageModelList.add(imageModel);
        imageModel=new ImageModel(R.drawable.ic_launcher_background);
        imageModelList.add(imageModel);
        imageModel=new ImageModel(R.drawable.ic_launcher_background);
        imageModelList.add(imageModel);
        imageModel=new ImageModel(R.drawable.ic_launcher_background);
        imageModelList.add(imageModel);


        imageAdapter.notifyDataSetChanged();
    }

    @Override
    public void setMyPosition(int i) {

        Toast.makeText(getApplicationContext(),""+descModelList.get(i).getDesc(),Toast.LENGTH_SHORT).show();
    }
}