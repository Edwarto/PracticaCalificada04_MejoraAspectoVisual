package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.List;

public class DetailsActivity extends AppCompatActivity  {


    private ImageView imgItemDetail;
    private TextView txtNombre;
    private TextView txtDescription;
    private Persona ItemDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle(getClass().getSimpleName());

        initViews();
        initValues();



    }
    private void initViews()
    {
        imgItemDetail = findViewById(R.id.imgPerson);
        txtNombre = findViewById(R.id.txtName);
        txtDescription = findViewById(R.id.txtDescription);
    }

    private void initValues()
    {
        ItemDetail = (Persona) getIntent().getExtras().getSerializable("ItemDetail");

        imgItemDetail.setImageResource(ItemDetail.getFoto());
        txtNombre.setText(ItemDetail.getNombre());
        txtDescription.setText(ItemDetail.getDescripcion());


    }

}