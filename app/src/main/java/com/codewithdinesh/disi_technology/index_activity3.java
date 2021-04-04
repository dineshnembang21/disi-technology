package com.codewithdinesh.disi_technology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class index_activity3 extends AppCompatActivity {

    Button btn_algebra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_activity3);


        btn_algebra=(Button) findViewById(R.id.button11);

        btn_algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(index_activity3.this,algebra_pdf.class);
                startActivity(in);
            }
        });
    }
}
