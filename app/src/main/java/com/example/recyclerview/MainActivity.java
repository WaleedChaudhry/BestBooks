package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.recyclerview.Adapter.BookAdapter;
import com.example.recyclerview.Model.Model_Class;
import com.example.recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        ArrayList<Model_Class> list=new ArrayList<>();
        list.add(new Model_Class(R.drawable.img,"Mystery and Detective"));
        list.add(new Model_Class(R.drawable.img_1,"Encyclopedia"));
        list.add(new Model_Class(R.drawable.img_2,"Veterinary"));
        list.add(new Model_Class(R.drawable.img_3,"Archaeology"));
        list.add(new Model_Class(R.drawable.img_4,"E_Book"));
        list.add(new Model_Class(R.drawable.img_5,"123 Magic"));
        list.add(new Model_Class(R.drawable.img_6,"Learning to feel"));
        list.add(new Model_Class(R.drawable.img_7,"65 Hours"));
       // list.add(new Model_Class(R.drawable.img_8,""));
        BookAdapter adapter=new BookAdapter(list,MainActivity.this);
        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
        binding.recyclerview.setLayoutManager(linearLayoutManager);

    }
}