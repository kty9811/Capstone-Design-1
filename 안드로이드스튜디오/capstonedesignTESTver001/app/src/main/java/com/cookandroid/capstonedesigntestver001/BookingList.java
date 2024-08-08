package com.cookandroid.capstonedesigntestver001;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.InputStream;


public class BookingList extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_list);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        final TextView textView=findViewById(R.id.textView);
        Button btn=(Button) findViewById(R.id.rechange);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                switch (view.getId()){
                    case R.id.rechange:
                        try{
                            FileInputStream infs=openFileInput("test.txt");
                            byte[]txt=new byte[100];
                            infs.read(txt);
                            String str=new String(txt);
                            infs.close();
                            textView.setText(str);

                        }catch (Exception e){

                        }break;
                }

            }
        });




    }}