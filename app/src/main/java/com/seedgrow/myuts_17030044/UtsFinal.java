package com.seedgrow.myuts_17030044;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UtsFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menampilkan layout Uts final
        setContentView(R.layout.activity_uts_final);
        //mendapat data program studi dari activity data ujian
        String ProgramStudi = getIntent().getStringExtra("Program Studi");
        //mendapat data nama mahasiswa dari activity data ujian
        String NamaMahasiswa = getIntent().getStringExtra("Nama Mahasiswa");
        //mendapat data nim dari activity data ujian
        String Nim = getIntent().getStringExtra("Nim");
        //mendapat data nama mata kuliah dari activity data ujian
        String NamaMataKuliah = getIntent().getStringExtra("Nama MataKuliah");
        //mendapat data kelas dari activity data ujian
        String Kelas = getIntent().getStringExtra("Kelas");
        //mendapat data sks dari activity data ujian
        String Sks = getIntent().getStringExtra("Sks");
        //mendapat data dosen pengampu dari activity data ujian
        String DosenPengampu = getIntent().getStringExtra("Dosen Pengampu");
        //mendapat data tanggal dari activity data ujian
        String Tanggal = getIntent().getStringExtra("Tanggal");

        // untuk menampilkan tulisan program studi
        TextView programstudi = findViewById(R.id.inputprogramstudi);
        // untuk menampilkan tulisan nama mahasiswa
        TextView namamahasiswa = findViewById(R.id.inputannama);
        // untuk menampilkan tulisan nama mata kuliah
        TextView namamatakuliah = findViewById(R.id.inputanmatakuliah);
        // untuk menampilkan tulisan nim
        TextView nim = findViewById(R.id.inputannim);
        // untuk menampilkan tulisan kelas
        TextView kelas = findViewById(R.id.inputankelas);
        // untuk menampilkan tulisan sks
        TextView sks = findViewById(R.id.inputansks);
        // untuk menampilkan tulisan dosen pengampu
        TextView dosenpengampu = findViewById(R.id.inputandosenpengampu);
        // untuk menampilkan tulisan tanggal
        TextView tanggal = findViewById(R.id.inputantanggalpelaksanaan);

        programstudi.setText(ProgramStudi);
        namamahasiswa.setText(NamaMahasiswa);
        namamatakuliah.setText(NamaMataKuliah);
        nim.setText(Nim);
        tanggal.setText(Tanggal);
        kelas.setText(Kelas);
        sks.setText(Sks);
        dosenpengampu.setText(DosenPengampu);
    }
}