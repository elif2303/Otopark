package com.fehimenuruysal.otoparksistemi;



public class tipSecimi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_secimi);
    }

    /**
     * musteri_gecis fonksiyonu ;
     * ilk giris ekranındaki iki farklı yetkiye sahip görevli ve müşteriden
     * müsterinin  müsteriActivity aktivitesine geçişini sağlamaaktır.
     */
    public void musteri_gecis(View view) {
        //Intent classından bagla2 nesnesi oluşturarak butona basıldığında musteriActivity ekranımıza geçişi sağlarız.
        Intent bagla2 = new Intent(getApplicationContext(),musteriActivity.class);
        //Sonrada baglamayı başlatmak için alt satırdaki komut kullanılır
        startActivity(bagla2);
    }

    /**
     * gorevli_gecis fonksiyonu;
     * gorevlinin yetkinliklerini kullanması için
     * "gorevliler" veritabanındaki "görevli" tablosunda kayıtlı ad ve parolasıyla kontrollü giriş yapacağı
     * gorevliGirisActivity aktivitesine yönlendirilir.
     */
    public void gorevli_gecis(View view) {
        //Intent classından bagla1 nesnesi oluşturarak butona basıldığında gorevliGirisActivity ekranımıza geçişi sağlarız.
        Intent bagla1 = new Intent(getApplicationContext() , gorevliGirisActivity.class);
        //Sonrada baglamayı başlatmak için alt satırdaki komut kullanılır
        startActivity(bagla1);
    }
}
