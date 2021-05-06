package com.seedgrow.myuts_17030044;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class DataUjianActivity extends AppCompatActivity {
    //untuk mendeklarasikan string tag data ujian activity
    String TAG = "Data Ujian Activity";
    //mendeklarasikan button dan text view
    private Button button;
    private TextView textView;

    //untuk menggabungkan contoh yang tersimpan
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_ujian);
        //untuk mendapatkan perpindahan data nim dari activity main
        String Nim = getIntent().getStringExtra("Nim");
        //untuk mendapatkan perpindahan data nnama mahasiswa dari activity main
        String NamaMahasiswa = getIntent().getStringExtra("Nama Mahasiswa");
        //untuk mendapatkan perpindahan data kelas dari activity main
        String Kelas = getIntent().getStringExtra("Kelas");
        //untuk memilih komponen nim yang ada di layout data ujuan activity untuk dijadikan objek pada Java.
        TextView nim = findViewById(R.id.nim);
        //untuk memilih komponen nama mahasiswa  yang ada di layout data ujian activity untuk dijadikan objek pada Java.
        TextView namamahasiswa = findViewById(R.id.namamhs);
        //untuk memilih komponen kelss m yang ada di layout data ujian activity untuk dijadikan objek pada Java.
        TextView kelas = findViewById(R.id.kelas);

        nim.setText(Nim);
        namamahasiswa.setText(NamaMahasiswa);
        kelas.setText(Kelas);

        button = findViewById(R.id.pilihtanggalujian);
        textView = findViewById(R.id.tanggal);

        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilTanggal();
            }
        }));
    }
    public void TampilTanggal(){
        DatePickerFragment datePickerFragment = new DatePickerFragment();
        datePickerFragment.show(getSupportFragmentManager(), "data");
        datePickerFragment.setOnDateClickListener(new DatePickerFragment.onDateClickListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                String tahun = ""+datePicker.getYear();
                String bulan = ""+(datePicker.getMonth()+1);
                String hari = ""+datePicker.getDayOfMonth();
                String text = ""+hari+" - "+bulan+" - "+tahun;
                textView.setText(text);
            }
        });
    }
    // untuk membawa data setelah di klik input
    public void input(View view){
        EditText inputNamaMataKuliah = findViewById(R.id.namamatakuliah);
        EditText inputSks = findViewById(R.id.sks);
        EditText inputSifatUjian = findViewById(R.id.sifatujian);
        EditText inputProgramStudi = findViewById(R.id.programstudi);
        EditText inputDosenPengampu = findViewById(R.id.dosenpengampu);

        String Nim = getIntent().getStringExtra("Nim");
        String NamaMahasiswa = getIntent().getStringExtra("Nama Mahasiswa");
        String Kelas = getIntent().getStringExtra("Kelas");

        String NamaMataKuliah = inputNamaMataKuliah.getText().toString();
        Log.d(TAG, NamaMataKuliah);
        String Sks = inputSks.getText().toString();
        Log.d(TAG, Sks);
        String SifatUjian = inputSifatUjian.getText().toString();
        Log.d(TAG, SifatUjian);
        String ProgramStudi = inputProgramStudi.getText().toString();
        Log.d(TAG, ProgramStudi);
        String DosenPengampu = inputDosenPengampu.getText().toString();
        Log.d(TAG, DosenPengampu);
        String Tanggal = textView.getText().toString();
        Log.d(TAG, Tanggal);
        //untuk perpindahan halaman dan menbawa data dari data ujian activity ke uts final
        Intent intent = new Intent(this, UtsFinal.class);
        intent.putExtra("Nim", Nim);
        intent.putExtra("Nama Mahasiswa", NamaMahasiswa);
        intent.putExtra("Kelas", Kelas);
        intent.putExtra("Tanggal", Tanggal);
        intent.putExtra("Nama MataKuliah", NamaMataKuliah);
        intent.putExtra("Sks", Sks);
        intent.putExtra("Sifat Ujian", SifatUjian);
        intent.putExtra("Program Studi", ProgramStudi);
        intent.putExtra("Dosen Pengampu", DosenPengampu);
        startActivity(intent);
    }
    //untuk mengosongkan data inputan
    public void Reset(View view){
        EditText inputNamaMataKuliah = findViewById(R.id.namamatakuliah);
        EditText inputSks = findViewById(R.id.sks);
        EditText inputSifatUjian = findViewById(R.id.sifatujian);
        EditText inputProgramStudi = findViewById(R.id.programstudi);
        EditText inputDosenPengampu = findViewById(R.id.dosenpengampu);
        textView = findViewById(R.id.tanggal);

        inputNamaMataKuliah.setText("");
        inputSks.setText("");
        textView.setText("Tanggal");
        inputSifatUjian.setText("");
        inputProgramStudi.setText("");
        inputDosenPengampu.setText("");


    }
}