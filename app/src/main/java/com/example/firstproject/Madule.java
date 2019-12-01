package com.example.firstproject;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Madule extends AppCompatActivity {

    Context mContext=this;

    TextView txtJanuary,txtFebruary,txtMarch,txtApril,txtMay,txtJune,txtJuly,txtAugust,txtSeptember,txtOctober,txtNovember,txtDecember;

    ImageView imgJanuary,imgFebruary,imgMarch,imgApril,imgMay,imgJune,imgJuly,imgAugust,imgSeptember,imgOctober,imgNovember,imgDecember;


public void myToast(String text){

    Toast.makeText(mContext, text, Toast.LENGTH_LONG).show();

}



}





