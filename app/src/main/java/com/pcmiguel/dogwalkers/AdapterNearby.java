package com.pcmiguel.dogwalkers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterNearby extends RecyclerView.Adapter<AdapterNearby.ViewHolder> {

    private List<Walker> walkerList;

    public AdapterNearby(List<Walker> walkerList) {
        this.walkerList = walkerList;
    }

    @NonNull
    @Override
    public AdapterNearby.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nearby, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterNearby.ViewHolder holder, int position) {

        int image = walkerList.get(position).getImg();
        String nome = walkerList.get(position).getName();
        String location = walkerList.get(position).getLocation();
        String classification = "4.5";
        String classificacaoNumber = "(2456)";
        String price = walkerList.get(position).getPrice();

        holder.setData(image, nome, location, classification, classificacaoNumber, price);

    }

    @Override
    public int getItemCount() {
        return walkerList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView text_nome, text_location, text_classification, text_classification_number, text_price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.walker_perfil_img);
            text_nome = itemView.findViewById(R.id.walker_name);
            text_location = itemView.findViewById(R.id.walker_location);
            text_classification = itemView.findViewById(R.id.walker_classification);
            text_classification_number = itemView.findViewById(R.id.walker_classification_number);
            text_price = itemView.findViewById(R.id.walker_price);

        }

        public void setData(int image, String name, String location, String classification, String classificacaoNumber, String price) {

            //Picasso.with(img.getContext()).load(image).into(img);

            img.setImageResource(image);

            text_nome.setText(name);
            text_location.setText(location);
            text_classification.setText(classification);
            text_classification_number.setText(classificacaoNumber);
            text_price.setText(price);

        }

    }

}
