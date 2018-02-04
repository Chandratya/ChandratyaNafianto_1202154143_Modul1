package com.krein.chandratya.ChandratyaNafianto_1202154143_Modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.krein.chandratya.studycase.extra.MESSAGE";
    public static final String PORSI =
            "com.krein.chandratya.studycase.extra.PORSI";
    public static final String TEMPAT =
            "com.krein.chandratya.studycase.extra.TEMPAT";
    public static final String HARGA =
            "com.krein.chandratya.studycase.extra.HARGA";
    private EditText mMessageEditText;
    private EditText mMessageEditText2;
    private String validateText;
    private String validateText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessageEditText = (EditText) findViewById(R.id.editText_Makanan);
        mMessageEditText2 = (EditText) findViewById(R.id.editText_Porsi);

    }

    public void launchAbnormal(View view) {
        Log.d(LOG_TAG, "Button clicked!");




        Intent intent = new Intent(this, Makanan.class);

        String message = mMessageEditText.getText().toString();

        EditText validasiEditText = (EditText) findViewById(R.id.editText_Makanan);
        validateText = validasiEditText.getText().toString();
        if (validateText.matches("")) {
            Toast.makeText(this, "Di isi dulu data makanan nya", Toast.LENGTH_SHORT).show();
            return;
        }

        String message2 = mMessageEditText2.getText().toString();
        EditText validasiEditText2 = (EditText) findViewById(R.id.editText_Porsi);
        validateText2 = validasiEditText2.getText().toString();
        if (validateText2.matches("")) {
            Toast.makeText(this, "Di isi dulu porsi nya", Toast.LENGTH_SHORT).show();
            return;
        }

        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(PORSI, message2);
        intent.putExtra(TEMPAT, "ABNORMAL");
        intent.putExtra("Harga", "30000");
        startActivity(intent);
    }

    public void launchEatbus(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, Makanan.class);
        String message = mMessageEditText.getText().toString();

        EditText validasiEditText = (EditText) findViewById(R.id.editText_Makanan);
        validateText = validasiEditText.getText().toString();
        if (validateText.matches("")) {
            Toast.makeText(this, "Di isi dulu data makanan nya", Toast.LENGTH_SHORT).show();
            return;
        }

        String message2 = mMessageEditText2.getText().toString();
        EditText validasiEditText2 = (EditText) findViewById(R.id.editText_Porsi);
        validateText2 = validasiEditText2.getText().toString();
        if (validateText2.matches("")) {
            Toast.makeText(this, "Di isi dulu porsi nya", Toast.LENGTH_SHORT).show();
            return;
        }
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(PORSI, message2);
        intent.putExtra(TEMPAT, "EATBUS");
        intent.putExtra("Harga", "50000");
        startActivity(intent);
    }
}
