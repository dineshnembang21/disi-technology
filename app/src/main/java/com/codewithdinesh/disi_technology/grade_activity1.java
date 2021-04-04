package com.codewithdinesh.disi_technology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class grade_activity1 extends AppCompatActivity {
Button btn_sub;
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


    }
}
