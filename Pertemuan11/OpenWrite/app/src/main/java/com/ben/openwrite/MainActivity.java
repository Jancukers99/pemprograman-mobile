package com.ben.openwrite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button LihatData=findViewById(R.id.lihatbt);
        Button InputData=findViewById(R.id.unduhbt);
        Button informasi=findViewById(R.id.info);
        LihatData.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View arg0){
                Intent inte=new Intent(MainActivity.this,Mahasiswa.class);
                startActivity(inte);
            }
        });
        InputData.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Intent inte=new Intent(MainActivity.this,Inputdata.class);
                startActivity(inte);
            }
        });
        informasi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Intent inte=new Intent(MainActivity.this,informasi.class);
                startActivity(inte);
            }
        });
    }
}