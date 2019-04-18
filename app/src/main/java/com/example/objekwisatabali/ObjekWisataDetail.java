package com.example.objekwisatabali;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ObjekWisataDetail extends AppCompatActivity {

        private static final String TAG = "ObjekDetail";

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_detail);
            Log.d(TAG, "onCreate: started.");

            getIncomingIntent();
        }

        private void getIncomingIntent(){
            Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

            if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") ){
                Log.d(TAG, "getIncomingIntent: found intent extras.");

                String imageUrl = getIntent().getStringExtra("image_url");
                String imageName = getIntent().getStringExtra("image_name");
                String alamat = getIntent().getStringExtra("alamat");
                String deskripsi = getIntent().getStringExtra("deskripsi");
                String lokasi = getIntent().getStringExtra("lokasi");
                String kategori = getIntent().getStringExtra("kategori");




                setImage(imageUrl, imageName, alamat,deskripsi, lokasi, kategori);

            }
        }


        private void setImage(String imageUrl, String imageName, String alamat, String deskripsi, String lokasi, String kategori){
            Log.d(TAG, "setImage: setting te image and name to widgets.");

            TextView alamatwisata = findViewById(R.id.alamat);
            alamatwisata.setText(alamat);

            TextView lokasii = findViewById(R.id.lokasii);
            lokasii.setText(lokasi);

            TextView kategorii = findViewById(R.id.katt);
            kategorii.setText(kategori);

            TextView name = findViewById(R.id.image_description);
            name.setText(imageName);

            TextView deskripsiwisata = findViewById(R.id.deskripsi);
            deskripsiwisata.setText(deskripsi);


            ImageView image = findViewById(R.id.image);
            Glide.with(this)
                    .asBitmap()
                    .load(imageUrl)
                    .into(image);
        }

}
