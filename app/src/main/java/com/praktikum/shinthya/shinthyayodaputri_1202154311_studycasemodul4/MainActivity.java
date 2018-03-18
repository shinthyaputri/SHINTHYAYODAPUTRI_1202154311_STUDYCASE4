package com.praktikum.shinthya.shinthyayodaputri_1202154311_studycasemodul4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //membuat clikhandler
    public void cariNama(View view) {
        //membuat perpindahan antar layas
        Intent intent = new Intent (getApplicationContext(), NamaMahasiswa.class);
        startActivity(intent);
    }

    //membuat onclickhandler
    public void cariGambar(View view) {
        //membuat perpindahan antar layar
        Intent intent1 = new Intent (getApplicationContext(), searchImage.class);
        startActivity(intent1);

    }

}
