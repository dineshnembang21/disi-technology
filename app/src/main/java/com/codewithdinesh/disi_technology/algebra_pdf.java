package com.codewithdinesh.disi_technology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class algebra_pdf extends AppCompatActivity {

    PDFView algebra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra_pdf);
        algebra = (PDFView) findViewById(R.id.pdf_algebra);
        algebra.fromAsset("algebra.pdf").load();
    }
}