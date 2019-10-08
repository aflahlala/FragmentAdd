package com.example.acer.jobsheet2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
       /* *getSupportFragmentManager = inisialisasi nilai FragmentManager untuk berinteraksi
            dengan Activity saat ini
         */
        FragmentTransaction transaction = fm.beginTransaction();
        //memulai transaction fragment manager

        FragSatu fragmentPertama = new FragSatu();
        //membuat object fragmentPertama
        transaction.add(R.id.frame_content, fragmentPertama);
        //menambahkan fragment
        transaction.addToBackStack("fragmentPertama");
        //dapat menyimpan fragment ke dalam state ,ketika tombol back diklik
        transaction.commit();
        //mengeksekusi fragment transaction
    }

}
