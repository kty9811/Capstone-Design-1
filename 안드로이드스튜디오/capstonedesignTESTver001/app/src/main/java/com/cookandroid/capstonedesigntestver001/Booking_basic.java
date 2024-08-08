package com.cookandroid.capstonedesigntestver001;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;


import android.widget.Toast;

import java.io.FileOutputStream;


public class Booking_basic extends AppCompatActivity {
Button button10;
EditText editText, editText2,editText3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_basic);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        button10=findViewById(R.id.button10);
        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        editText3=findViewById(R.id.editText3);



        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
    switch(view.getId()){
        case R.id.button10:
            try{
                String str="/";
                String str1="\n";
                String txt=editText.getText().toString();
                String txt2=editText2.getText().toString();
                String txt3=editText3.getText().toString();

                FileOutputStream outFs=openFileOutput("test.txt", Context.MODE_PRIVATE);

               outFs.write(txt.getBytes());
               outFs.write(str.getBytes());
                outFs.write(txt2.getBytes());
                outFs.write(str.getBytes());
                outFs.write(txt3.getBytes());
                outFs.write(str1.getBytes());
                outFs.close();
                Toast.makeText(getApplicationContext(),"저장완료",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),BookingList.class);
                startActivity(intent);
            }catch (Exception e){
                e.printStackTrace();
                Toast.makeText(getApplicationContext(),"저장실패",Toast.LENGTH_SHORT).show();
            }
    }

            }
        });




    }

}