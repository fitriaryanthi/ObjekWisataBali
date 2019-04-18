package com.example.objekwisatabali;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class RecyclerViewCard extends RecyclerView.Adapter<RecyclerViewCard.ViewHolder> {

    private Context mContext;
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> deskripsi = new ArrayList<>();
    private ArrayList<String> mimages = new ArrayList<>();
    private ArrayList<String> mLokasi = new ArrayList<>();
    private ArrayList<String> mKategori = new ArrayList<>();


    public RecyclerViewCard(Context context, ArrayList<String> nama, ArrayList<String> alamatwisata, ArrayList<String> deskripsiwisata, ArrayList<String> foto, ArrayList<String> lokasi, ArrayList<String> kategori) {
        names = nama;
        alamat = alamatwisata;
        deskripsi = deskripsiwisata;
        mimages = foto;
        mLokasi = lokasi;
        mKategori = kategori;
        mContext = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_card, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {

        Glide.with(mContext)
                .asBitmap()
                .load(mimages.get(position))
                .apply(new RequestOptions().override(350,550))
                .into(holder.foto);

        holder.alamat.setText(alamat.get(position));
        holder.nama.setText(names.get(position));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,ObjekWisataDetail.class);
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

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView foto;
        TextView nama;
        TextView alamat;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            foto = itemView.findViewById(R.id.img_item_photo);
            nama = itemView.findViewById(R.id.tv_item_name);
            alamat = itemView.findViewById(R.id.tv_item_remarks);
        }
    }
}
