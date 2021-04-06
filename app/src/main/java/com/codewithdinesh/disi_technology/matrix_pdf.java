package com.codewithdinesh.disi_technology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class matrix_pdf extends AppCompatActivity {


    PDFView matrix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_pdf);

            matrix = (PDFView) findViewById(R.id.pdf_matrix);
            matrix.fromAsset("matrix.pdf").load();
        }



    }
