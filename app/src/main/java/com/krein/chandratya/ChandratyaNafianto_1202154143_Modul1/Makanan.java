package com.krein.chandratya.ChandratyaNafianto_1202154143_Modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Makanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);



        Intent intent = getIntent();


        String tempat =
                intent.getStringExtra(MainActivity.TEMPAT);
        TextView textTempat = (TextView) findViewById(R.id.getTempat);
        textTempat.setText(tempat);

        String message =
                intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.getMenu);
        textView.setText(message);

        String message2 =
                intent.getStringExtra(MainActivity.PORSI);
        TextView getPorsi = (TextView) findViewById(R.id.getPorsi);
        getPorsi.setText(message2);

        String HargaMakanan = intent.getStringExtra("Harga");
        TextView getHarga = (TextView) findViewById(R.id.getHarga);

        int total_harga = Integer.valueOf(message2)*Integer.valueOf(HargaMakanan);

        getHarga.setText(String.valueOf(total_harga));


        if (total_harga > 65500) {
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}