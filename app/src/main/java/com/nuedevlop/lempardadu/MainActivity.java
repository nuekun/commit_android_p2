package com.nuedevlop.lempardadu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //deklar atribut dari xml
    private Button btnAcak;
    private TextView txtView;
    private ImageView gbrView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi berdasarkan id
        btnAcak = findViewById(R.id.btnAcak);
        txtView = findViewById(R.id.txtView);
        gbrView = findViewById(R.id.gbrView);

        //memberikan listener pada button
        btnAcak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // isi printah untuk button
                // toast();
                 melemparDadu();
                 gantiGambar();

            }
        });

    }

    private void gantiGambar() {

        Random acak = new Random();
        //membuat array drawable(gambar) dadu
        int[] gambar = new int[6];
        gambar[0] = R.drawable.dice_1;
        gambar[1] = R.drawable.dice_2;
        gambar[2] = R.drawable.dice_3;
        gambar[3] = R.drawable.dice_4;
        gambar[4] = R.drawable.dice_5;
        gambar[5] = R.drawable.dice_6;
        //mengeset gambar dengan drawable baru + di acak
        gbrView.setImageResource(gambar[acak.nextInt(5)]);

    }

    private void melemparDadu() {
        //memanggil funsi acak
        Random acak = new Random();
        //membuat variabel angka
        String angka = String.valueOf(1+ acak.nextInt(6));
        txtView.setText(angka);

    }

    //memunculkan pesan toast
    private void toast() {

        Toast.makeText(MainActivity.this,
                "tombol di tekan",Toast.LENGTH_LONG).show();
    }
}
