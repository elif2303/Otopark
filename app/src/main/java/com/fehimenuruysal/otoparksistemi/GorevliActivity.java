package com.fehimenuruysal.otoparksistemi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GorevliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorevli);
    }

    public void ekleme_gecis(View view) {
        //Intent classından bagla_eklme_sayfasi nesnesi oluşturarak butona basıldığında GorevliEkleActivity ekranımıza geçişi sağlarız.
        Intent bagla_eklme_sayfasi = new Intent(getApplicationContext(),GorevliEkleActivity.class);
        //Sonrada baglamayı başlatmak için alt satırdaki komut kullanılır
        startActivity(bagla_eklme_sayfasi);

    }

    public void silme_gecis(View view) {
        //Intent classından bagla_silme_sayfasi nesnesi oluşturarak butona basıldığında GorevliSilActivity ekranımıza geçişi sağlarız.
        Intent bagla_silme_sayfasi= new Intent(getApplicationContext(),GorevliSilActivity.class);
        //Sonrada baglamayı başlatmak için alt satırdaki komut kullanılır
        startActivity(bagla_silme_sayfasi);
    }
}
