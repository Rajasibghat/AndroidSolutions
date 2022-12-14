package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.splashscreen.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> fruitsList=new ArrayList<>();
        fruitsList.add("Mango");
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Guava");
        fruitsList.add("Grapes");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fruitsList);
        binding.designSpinner.setAdapter(adapter);
        binding.designSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked "+fruitsList.get(position), Toast.LENGTH_SHORT).show();
            }
        });



    }
}