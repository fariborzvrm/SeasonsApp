package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.time.ZoneId;

public class MainActivity extends Madule{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void myClick(View view) {
        if (view.getId() == R.id.imgJanuary) {
            myToast("January");
        } else if (view.getId() == R.id.txtJanuary) {
            myToast("January");
        } else if (view.getId() == R.id.txtFebruary) {
            myToast("February");
        } else if (view.getId() == R.id.imgFebruary) {
            myToast("February");
        } else if (view.getId() == R.id.imgMarch) {
            myToast("March");
        } else if (view.getId() == R.id.txtMarch) {
            myToast("March");
        } else if (view.getId() == R.id.imgApril) {
            myToast("April");
        } else if (view.getId() == R.id.txtApril) {
            myToast("April");
        } else if (view.getId() == R.id.imgMay) {
            myToast("May");
        } else if (view.getId() == R.id.txtMay) {
            myToast("May");
        } else if (view.getId() == R.id.imgJune) {
            myToast("June");
        } else if (view.getId() == R.id.txtJune) {
            myToast("June");
        } else if (view.getId() == R.id.imgJuly) {
            myToast("July");
        } else if (view.getId() == R.id.txtJuly) {
            myToast("July");
        } else if (view.getId() == R.id.imgAugust) {
            myToast("August");
        } else if (view.getId() == R.id.txtAugust) {
            myToast("August");
        } else if (view.getId() == R.id.imgSeptember) {
            myToast("September");
        } else if (view.getId() == R.id.txtSeptember) {
            myToast("September");
        } else if (view.getId() == R.id.imgOctober) {
            myToast("October");
        } else if (view.getId() == R.id.txtOctober) {
            myToast("October");
        } else if (view.getId() == R.id.imgNovember) {
            myToast("November");
        } else if (view.getId() == R.id.txtNovember) {
            myToast("November");
        } else if (view.getId() == R.id.imgDecember) {
            myToast("December");
        } else if (view.getId() == R.id.txtDecember) {
            myToast("December");
        }
    }

    }


