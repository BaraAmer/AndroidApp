package com.android.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ShowIteam extends AppCompatActivity {

    TextView tv_name,tv_price,tv_content;
    ImageView iteam_image;
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_iteam);

        tv_name =findViewById(R.id.txt_deatail_name);
        tv_price =findViewById(R.id.txt_detail_price);
        tv_content =findViewById(R.id.txt_deatail_content);
        iteam_image = findViewById(R.id.image_iteam);
        btn_back =findViewById(R.id.btn_iteam);

        Intent in = getIntent();
        String iteam_name = in.getStringExtra("Mname");
        String iteam_cont = in.getStringExtra("Mcont");
        String iteam_price = in.getStringExtra("Mpric");
        String iteam_image_url = in.getStringExtra("Mimage");

        tv_name.setText(iteam_name);
        tv_price.setText(iteam_price);
        tv_content.setText(iteam_cont);

        Glide.with(this)
                .load(iteam_image_url)
                .into(iteam_image);



        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}