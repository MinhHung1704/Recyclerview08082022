package com.example.recyclerview080820221704;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewFood;
    FoodAdapter foodAdapter;
    List<Food> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewFood = findViewById(R.id.recycler_view_food);
        foodList = Food.getMock();
        foodAdapter = new FoodAdapter(foodList);
        recyclerViewFood.setAdapter(foodAdapter);
        recyclerViewFood.setHasFixedSize(true);

    }
}