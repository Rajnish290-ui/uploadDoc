package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.demo.databinding.ActivityMainBinding;
import com.example.uploadfile.databinding.ActivityUploadBinding;
import com.example.uploadfile.uploadActivity;

public class MainActivity extends AppCompatActivity {

     ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Intent intent=new Intent(MainActivity.this, uploadActivity.class);
        startActivity(intent);


//        binding.btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });





    }
}