package com.codewithdinesh.disi_technology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class grade_activity1 extends AppCompatActivity {
Button btn_sub,btn_sub1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_activity1);


        btn_sub=(Button) findViewById(R.id.button);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grade_activity1.this,subject_activity2.class);
                startActivity(in);

            }
        });

        btn_sub1=(Button) findViewById(R.id.activity2);

        btn_sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grade_activity1.this,compulsory_maths.class);
                startActivity(in);

            }
        });


    }
}
