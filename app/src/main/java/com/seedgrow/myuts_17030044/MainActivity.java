package com.seedgrow.myuts_17030044;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // mendeklarasikan radio button dan radio group beserta tag untuk main activity
    String TAG = "Main Activity";
    RadioGroup rg_kelas;
    RadioButton radioButton;

    //untuk menggabungkan contoh yang tersimpan
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menampilkan layout activity_main.xml
        setContentView(R.layout.activity_main);
        //untuk memilih komponen radiogroup yang ada di layout activity_main untuk dijadikan objek pada Java.
        rg_kelas = findViewById(R.id.rg_kelas);

    }

    public void input(View view){
        int radioID = rg_kelas.getCheckedRadioButtonId();
        //untuk memilih komponen nim yang ada di layout activity_main untuk dijadikan objek pada Java.
        EditText inputNim = findViewById(R.id.nim);
        //untuk memilih komponen nama mahasiswa yang ada di layout activity_main untuk dijadikan objek pada Java.
        EditText inputNamaMahasiswa = findViewById(R.id.namamahasiswa);
        //untuk memilih komponen radio button yang ada di layout activity_main untuk dijadikan objek pada Java.
        radioButton = findViewById(radioID);
        //untuk mendapatkan text dari inputan nim
        String Nim = inputNim.getText().toString();
        Log.d(TAG, Nim);
        //untuk mendapatkan text dari inputan mahasiswa
        String NamaMahasiswa = inputNamaMahasiswa.getText().toString();
        Log.d(TAG,NamaMahasiswa);
        //untuk mendapatkan text dari inputan kelas
        String Kelas = radioButton.getText().toString();
        Log.d(TAG, Kelas);
        //untuk perpindahan halaman ke activity data ujian
        Intent intent = new Intent(this, DataUjianActivity.class);
        //untuk menaruh data inputan nim ke data ujian activity
        intent.putExtra("Nim", Nim);
        //untuk menaruh data inputan nama mahasiswa ke data ujian activity
        intent.putExtra("Nama Mahasiswa", NamaMahasiswa);
        //untuk menaruh data inputan kelas ke data ujian activity
        intent.putExtra("Kelas", Kelas);
        startActivity(intent);
    }

}