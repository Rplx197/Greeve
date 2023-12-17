package com.greeve.greeve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        final TextView tv_namaproduk = (TextView) findViewById(R.id.tv_namaproduk_cart);
        final TextView tv_hargaproduk = (TextView) findViewById(R.id.tv_hargaproduk_cart);
        final TextView tv_informasiproduk = (TextView) findViewById(R.id.tv_informasiproduk_cart);

        Intent i = getIntent();
        tv_namaproduk.setText(i.getStringExtra("Title"));
        tv_hargaproduk.setText(i.getStringExtra("Harga"));
        tv_informasiproduk.setText(i.getStringExtra("Informasi"));
    }
}
