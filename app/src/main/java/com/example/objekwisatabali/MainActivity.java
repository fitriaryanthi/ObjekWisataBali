package com.example.objekwisatabali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    private ArrayList <String> names = new ArrayList<>();
    private ArrayList <String> alamat = new ArrayList<>();
    private ArrayList <String> deskripsi = new ArrayList<>();
    private ArrayList<String> mimages = new ArrayList<>();
    private ArrayList<String> mLokasi = new ArrayList<>();
    private ArrayList<String> mKategori = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        dataWisata();
    }

    private void dataWisata (){
        names.add("Bali Safari dan Marine Park");
        mimages.add("https://www.bali.com/images/obj/zoom/4124_12184.jpg");
        alamat.add("Jl. IB Mantra KM 19,8 Gianyar Bali");
        deskripsi.add("Bali Safari and Marine Park adalah pusat konservasi seluas 400.000 meter persegi yang menjadi rumah bagi lebih dari 60 spesies hewan. Saksikan beberapa dari mereka melakukan trik di beberapa pertunjukan bakat.");
        mLokasi.add("Keramas");
        mKategori.add("Flora & Fauna");


        names.add("Bali Elephant Camp");
        mimages.add("https://dnqtravel.com/wp-content/uploads/2018/06/Elephant-Riding-Holiday-in-Laos.jpg");
        alamat.add("Carangsari, Petang, Badung Regency, Bali 80353");
        deskripsi.add("Terletak jauh dari kesibukan dan kebisingan kota, di tengah hutan tropis yang rindang, Bali Elephant Camp wisata yang sempurna untuk Anda yang ingin dekat dengan alam. Untuk traveler yang menyukai hewan, karena Anda bisa bertemu dengan gajah Sumatera yang jinak!");
        mLokasi.add("Plaga");
        mKategori.add("Taman Rekreasi");


        names.add("Bali Bird Park");
        mimages.add("https://www.bali.com/images/obj/zoom/2809_2514.jpg");
        alamat.add("Jl. Serma Cok Ngurah Gambir, Singapadu, Batubulan Gianyar Bali");
        deskripsi.add("Bali Bird Park memiliki lebih dari 5.000 burung dengan area seluas 20.000 meter persegi. Temukan lebih dari 250 spesies burung, temui burung kakatua sawit hitam, dan beri makan burung-burung lori.");
        mLokasi.add("Batubulan");
        mKategori.add("Flora & Fauna");


        names.add("Bali Zoo");
        mimages.add("https://www.putrabalireservasi.com/wp-content/uploads/2017/12/Voucher-Bali-Zoo-seru.jpg");
        alamat.add("Jl. Raya Singapadu, Sukawati, Singapadu, Gianyar");
        deskripsi.add("Kebun binatang ini memiliki koleksi satwa yang beragam, dari orangutan, harimau, hingga gajah, dan masih banyak lagi! Berjalanlah berkeliling area kebun binatang dan Anda bisa bertemu dengan banyak hewan yang juga senang untuk bertemu dengan Anda!");
        mLokasi.add("Ubud");
        mKategori.add("Flora & Fauna");


        names.add("Waterbom Bali");
        mimages.add("https://www.whitewaterwest.com/drive/uploads/2016/08/Waterbom-Bali-Kuta-Bali.jpg");
        alamat.add("Jl. Kartika, Tuban, Kuta Badung");
        deskripsi.add("Bersenang-senang dan bermain air di salah satu waterpark terbaik di Asia Tenggara. Waterbom Bali menawarkan pengalaman yang seru dan tak terlupakan untuk segala usia, salah satu seluncuran tertinggi di Asia, atau yang ingin bersantai bersama keluarga!");
        mLokasi.add("Kuta");
        mKategori.add("Wahana Air");


        names.add("Dreamland Waterpark");
        mimages.add("https://cdn.rentalmobilbali.net/wp-content/uploads/2018/08/Water-Slide-Dreamland-Waterpark-Pecatu.jpg");
        alamat.add("Jl. New Kuta Raya, Pecatu, Kuta Badung");
        deskripsi.add("Awali petualangan air Anda di Dreamland Waterpark! Wahana serunya akan membuat Anda sibuk seharian, dengan Water Slide, Lazy River, dan Wave Pool. Dengan fasilitas lengkap seperti food court, cabana, servis foto, dan toko suvenir!");
        mLokasi.add("Pecatu");
        mKategori.add("Wahana Air");


        names.add("Taman Nusa");
        mimages.add("https://cdn.rentalmobilbali.net/wp-content/uploads/2015/10/Pintu-Masuk-Objek-Wisata-Taman-Budaya-Nusa-Gianyar.jpg");
        alamat.add("Jl. Taman Bali, Br. Blahpane Kelod, Desa Sidan, Gianyar Bali");
        deskripsi.add("Taman Nusa adalah tempat yang sempurna jika ingin belajar lebih banyak tentang budaya dan sejarah Indonesia. Desa dengan rumah-rumah adat tradisional beserta diorama dan berbagai macam kebudayaan dari kelompok etnik yang berbeda bisa Anda lihat di sini!");
        mLokasi.add("Gianyar");
        mKategori.add("Taman Rekreasi");


        names.add("Dream Museum Zone Bali");
        mimages.add("https://tempatwisatadibali.info/wp-content/uploads/2017/09/Museum-3-Dimensi-DMZ-Bali-2.jpg");
        alamat.add("Jl. Nakula No. 33X, Legian, Kuta, Badung Bali");
        deskripsi.add("DMZ memiliki sekitar 120 lukisan-lukisan 3D yang unik dan dirancang khusus untuk membuat Anda terlihat seperti bagian dari gambar, baik bertema dunia bawah laut, kanal yang romantis, atau melangkahi lava yang panas. Jangan lupa untuk foto-foto!");
        mLokasi.add("Legian");
        mKategori.add("Museum & Gallery");


        names.add("Taman Segara Madu");
        mimages.add("https://www.hargatiket.net/wp-content/uploads/2019/01/harga-tiket-taman-segara-madu-waterpark.jpg");
        alamat.add("Pantai Batu Bolong Street, Canggu, North Kuta, Badung Regency, Bali 80351");
        deskripsi.add("Lengkapi liburan Anda di Bali dengan mengajak keluarga Anda untuk bersenang-senang di Taman Segara Madu! Kolam renang lokal dan water park yang terletak di Jalan Raya Batu Bolong, Canggu ini menyediakan sebuah kolam renang utama berukuran Olimpik yang dibagi menjadi delapan jalur");
        mLokasi.add("Canggu");
        mKategori.add("Wahana Air");


        names.add("Toya Devasya Hot Spring");
        mimages.add("https://cdn.rentalmobilbali.net/wp-content/uploads/2016/12/kolam-air-panas-toya-devasya-kintamani-bali.jpg");
        alamat.add("Central Batur, Kintamani, Bangli Regency, Bali");
        deskripsi.add("Ayo berkunjung ke Toya Devasya Hot Spring Wellness Resort! Ada empat kolam air panas yang berbeda yang bisa Anda nikmati dengan air kolam yang dipanaskan di dalam bumi dan mengandung mineral-mineral yang alami dan baik untuk tubuh Anda.");
        mLokasi.add("Kintamani");
        mKategori.add("Wahana Air");


        names.add("Bali Butterfly Park");
        mimages.add("https://media-cdn.tripadvisor.com/media/photo-s/01/9d/4e/76/bali-butterfly-park-taman.jpg");
        alamat.add("Jl. Batukaru, Br. Sandan Lebah, Tabanan");
        deskripsi.add("Bali Butterfly Park merupakan fasilitas konservasi kupu-kupu dan serangga yang memiliki lebih dari 900 kupu-kupu dari berbagai spesies serta beragam jenis serangga lainnya. Taman ini juga memamerkan koleksi kupu-kupu dan serangga yang diawetkan secara informatif.");
        mLokasi.add("Tabanan");
        mKategori.add("Flora & Fauna");


        names.add("Kemenuh Butterfly Park");
        mimages.add("https://assets-a2.kompasiana.com/items/album/2016/01/13/img-9525-jpg-5695a8d075937389048b4587.jpg?t=o&v=760");
        alamat.add("Jl. Raya Kemenuh, Kemenuh, Sukawati, Kabupaten Gianyar");
        deskripsi.add("Kemenuh Butterfly Park adalah lokasi wisata yang pas untuk dikunjungi bersama keluarga. Di sini, Anda dapat menyaksikan cantiknya kupu-kupu yang berasal dari berbagai daerah tropis. Kemenuh Butterfly Park juga memiliki sarana edukasi dan atraksi untuk dinikmati pengunjung.");
        mLokasi.add("Kemenuh");
        mKategori.add("Flora & Fauna");


        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, names, alamat, deskripsi, mimages, mLokasi, mKategori);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initRecyclerViewCard(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewCard adapter = new RecyclerViewCard(this, names, alamat, deskripsi, mimages, mLokasi, mKategori);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initRecyclerViewGrid(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewGrid adapter = new RecyclerViewGrid(this, names, alamat, deskripsi, mimages, mLokasi, mKategori);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                setActionBarTitle("Mode List");
                initRecyclerView();
                break;

            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                initRecyclerViewGrid();
                break;

            case R.id.action_cardview:
                setActionBarTitle("Mode CardView");
                initRecyclerViewCard();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}

