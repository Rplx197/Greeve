package com.greeve.greeve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class DetailShopActivity extends AppCompatActivity {


    private TextView dTitle;
    private ImageView dImage;
    private TextView dPrice;

    private TextView edJumlah;

    private String dUkuran;
    private String dWarna;
    private int dJumlah = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_shop);

        final Button btnUkuranSatu = (Button) findViewById(R.id.btn_ukuran_satu);
        final Button btnUkuranDua = (Button) findViewById(R.id.btn_ukuran_dua);
        final Button btnUkuranTiga = (Button) findViewById(R.id.btn_ukuran_tiga);
        final Button btnUkuranEmpat = (Button) findViewById(R.id.btn_ukuran_empat);
        final Button btnBeli = (Button) findViewById(R.id.btn_beli);

        final Button btnWarnaSatu = (Button) findViewById(R.id.btn_warna_satu);
        final Button btnWarnaDua = (Button) findViewById(R.id.btn_warna_dua);

        edJumlah = (TextView) findViewById(R.id.ed_jumlah_hasil);

        dTitle = (TextView) findViewById(R.id.tv_title_detail_shop);
        dImage = (ImageView) findViewById(R.id.img_view_detail_shop);
        dPrice = (TextView) findViewById(R.id.tv_title_detail_harga);
        Intent intent = getIntent();
        dTitle.setText(intent.getStringExtra("Title"));
        dPrice.setText(intent.getStringExtra("Price"));

        if (dTitle.getText().toString().equals("Trashe Shoe")){
            dImage.setImageResource(R.drawable.barang1);
        }
        else if (dTitle.getText().toString().equals("Celemek")){
            dImage.setImageResource(R.drawable.barang2);
        }
        else if (dTitle.getText().toString().equals("Cermin Hias")){
            dImage.setImageResource(R.drawable.barang3);
        }
        else if (dTitle.getText().toString().equals("Lampu Gantung Hias")){
            dImage.setImageResource(R.drawable.barang4);
        }
        else if (dTitle.getText().toString().equals("Hiasan dari Cangkir")){
            dImage.setImageResource(R.drawable.barang5);
        }
        else if (dTitle.getText().toString().equals("Sandalas")){
            dImage.setImageResource(R.drawable.barang6);
        }

        btnUkuranSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Button btnUkuranSatu = (Button) findViewById(R.id.btn_ukuran_satu);
                final Button btnUkuranDua = (Button) findViewById(R.id.btn_ukuran_dua);
                final Button btnUkuranTiga = (Button) findViewById(R.id.btn_ukuran_tiga);
                final Button btnUkuranEmpat = (Button) findViewById(R.id.btn_ukuran_empat);

                btnUkuranSatu.setBackgroundResource(R.color.navigationIcon);
                btnUkuranDua.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                btnUkuranTiga.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                btnUkuranEmpat.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                dUkuran = "XL";
            }
        });

        btnUkuranDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Button btnUkuranSatu = (Button) findViewById(R.id.btn_ukuran_satu);
                final Button btnUkuranDua = (Button) findViewById(R.id.btn_ukuran_dua);
                final Button btnUkuranTiga = (Button) findViewById(R.id.btn_ukuran_tiga);
                final Button btnUkuranEmpat = (Button) findViewById(R.id.btn_ukuran_empat);

                btnUkuranSatu.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                btnUkuranDua.setBackgroundResource(R.color.navigationIcon);
                btnUkuranTiga.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                btnUkuranEmpat.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                dUkuran = "L";
            }
        });

        btnUkuranTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Button btnUkuranSatu = (Button) findViewById(R.id.btn_ukuran_satu);
                final Button btnUkuranDua = (Button) findViewById(R.id.btn_ukuran_dua);
                final Button btnUkuranTiga = (Button) findViewById(R.id.btn_ukuran_tiga);
                final Button btnUkuranEmpat = (Button) findViewById(R.id.btn_ukuran_empat);

                btnUkuranSatu.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                btnUkuranDua.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                btnUkuranTiga.setBackgroundResource(R.color.navigationIcon);
                btnUkuranEmpat.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                dUkuran = "M";
            }
        });

        btnUkuranEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Button btnUkuranSatu = (Button) findViewById(R.id.btn_ukuran_satu);
                final Button btnUkuranDua = (Button) findViewById(R.id.btn_ukuran_dua);
                final Button btnUkuranTiga = (Button) findViewById(R.id.btn_ukuran_tiga);
                final Button btnUkuranEmpat = (Button) findViewById(R.id.btn_ukuran_empat);

                btnUkuranSatu.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                btnUkuranDua.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                btnUkuranTiga.setBackgroundResource(R.color.common_google_signin_btn_text_dark_default);
                btnUkuranEmpat.setBackgroundResource(R.color.navigationIcon);
                dUkuran = "S";
            }
        });

        btnWarnaSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Button btnWarnaSatu = (Button) findViewById(R.id.btn_warna_satu);
                final Button btnWarnaDua = (Button) findViewById(R.id.btn_warna_dua);

                btnWarnaSatu.setBackgroundResource(R.color.navigationIcon);
                btnWarnaDua.setBackgroundResource(R.color.colorPrimary);
                dWarna = "Hitam";
            }
        });

        btnWarnaDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Button btnWarnaSatu = (Button) findViewById(R.id.btn_warna_satu);
                final Button btnWarnaDua = (Button) findViewById(R.id.btn_warna_dua);

                btnWarnaSatu.setBackgroundResource(R.color.colorPrimary);
                btnWarnaDua.setBackgroundResource(R.color.navigationIcon);
                dWarna = "Putih";
            }
        });

        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailShopActivity.this, "Ukuran : "+dUkuran+" Warna : "+dWarna
                        +" Jumlah : "+edJumlah.getText().toString()+" Harga : "+dPrice.getText().toString()
                        , Toast.LENGTH_SHORT).show();

                Intent i = new Intent(DetailShopActivity.this, CartActivity.class);
                i.putExtra("Title", dTitle.getText().toString());
                i.putExtra("Harga", dPrice.getText().toString());
                i.putExtra("Informasi", "Ukuran : "+dUkuran+" Warna : "+dWarna
                        +" Jumlah : "+edJumlah.getText().toString()+" Harga : "+dPrice.getText().toString());
                startActivity(i);
            }
        });
    }

}
