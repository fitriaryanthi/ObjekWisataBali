package com.example.objekwisatabali;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>{

        private static final String TAG = "RecyclerViewAdapter";

        private ArrayList<String> names = new ArrayList<>();
        private ArrayList<String> alamat = new ArrayList<>();
        private ArrayList<String> deskripsi = new ArrayList<>();
        private ArrayList<String> mimages = new ArrayList<>();
        private ArrayList<String> mLokasi = new ArrayList<>();
        private ArrayList<String> mKategori = new ArrayList<>();
        private Context mContext;

        public RecycleViewAdapter(Context context, ArrayList<String> nama, ArrayList<String> alamatwisata, ArrayList<String> deskripsiwisata, ArrayList<String> foto, ArrayList<String> lokasi, ArrayList<String> kategori) {
            names = nama;
            alamat = alamatwisata;
            deskripsi = deskripsiwisata;
            mimages = foto;
            mLokasi = lokasi;
            mKategori = kategori;
            mContext = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listobjek, parent, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            Log.d(TAG, "onBindViewHolder: called.");

            Glide.with(mContext)
                    .asBitmap()
                    .load(mimages.get(position))
                    .into(holder.foto);

            holder.nama.setText(names.get(position));

            holder.lokasi.setText(mLokasi.get(position));
            holder.kategori.setText(mKategori.get(position));


            holder.parentLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d(TAG, "onClick: clicked on: " + names.get(position));

                    Intent intent = new Intent(mContext, ObjekWisataDetail.class);
                    intent.putExtra("image_url", mimages.get(position));
                    intent.putExtra("image_name", names.get(position));
                    intent.putExtra("alamat", alamat.get(position));
                    intent.putExtra("deskripsi", deskripsi.get(position));
                    intent.putExtra("lokasi",mLokasi.get(position));
                    intent.putExtra("kategori",mKategori.get(position));
                    mContext.startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return names.size();
        }


        public class ViewHolder extends RecyclerView.ViewHolder{

            CircleImageView foto;
            TextView nama;
            TextView kategori;
            TextView lokasi;
            RelativeLayout parentLayout;

            public ViewHolder(View itemView) {
                super(itemView);
                kategori = itemView.findViewById(R.id.kategori);
                lokasi = itemView.findViewById(R.id.alamat);
                foto = itemView.findViewById(R.id.image);
                nama = itemView.findViewById(R.id.image_name);
                parentLayout = itemView.findViewById(R.id.parent_layout);
            }
        }
}
