package com.example.lempardadu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //deklar atribul
    private Button acak;
    private TextView hello;
    private ImageView gambar_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi berdasarkan id
        acak = findViewById(R.id.bt_acak);
        hello = findViewById(R.id.txt_view);
        gambar_ = findViewById(R.id.image);

        //memberikan listener pada button
        acak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //isi perintah button
                //toast();
                melempardadu();
                gantigambar();

            }
        });
    }

    private void gantigambar() {
        Random acak = new Random();
        int[] gambar = new int[6];
        gambar[0] = R.drawable.dice_1;
        gambar[1] = R.drawable.dice_2;
        gambar[2] = R.drawable.dice_3;
        gambar[3] = R.drawable.dice_4;
        gambar[4] = R.drawable.dice_5;
        gambar[5] = R.drawable.dice_6;
        gambar_.setImageResource(gambar[acak.nextInt(5)]);

    }


    private void melempardadu(){
        Random acak = new Random();
        String angka = String.valueOf(1 + acak.nextInt(6));
        hello.setText(angka);
        if(angka.equals("6")){
            Toast.makeText(MainActivity.this,"sudah maksimal",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        hello.setText("Hello Word!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
