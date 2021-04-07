package com.codewithdinesh.disi_technology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class subject_activity2 extends AppCompatActivity {
Button btn_index,btn_prev,btn_com;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_activity2);


        btn_index=(Button) findViewById(R.id.button2);

        btn_index.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(subject_activity2.this,index_activity3.class);
                startActivity(in);
            }
        });


        btn_prev=(Button) findViewById(R.id.prev);

        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(subject_activity2.this,grade_activity1.class);
                startActivity(in);
            }
        });

        btn_com=(Button) findViewById(R.id.activity3_3);

        btn_com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(subject_activity2.this,compulsory_maths.class);
                startActivity(in);
            }
        });

    }
}
