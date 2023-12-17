package com.greeve.greeve.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.greeve.greeve.DetailArticleActivity;
import com.greeve.greeve.DetailShopActivity;
import com.greeve.greeve.R;
import com.greeve.greeve.models.Shop;

import java.util.List;

public class ShopRecycleViewAdapter extends RecyclerView.Adapter<ShopRecycleViewAdapter.MyViewHolder> {
    private Context mContext;
    List<Shop> mData;
    //Ini Adapter
    public ShopRecycleViewAdapter(Context mContext, List<Shop> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_card_view_shop,parent,false);

        return new ShopRecycleViewAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        holder.tv_title.setText(mData.get(position).getTitle());
        holder.tv_price.setText(mData.get(position).getPrice());
        holder.photo.setImageResource(mData.get(position).getPhoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailShopActivity.class);
                intent.putExtra("Title", holder.tv_title.getText().toString());
                intent.putExtra("Price", holder.tv_price.getText().toString());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title,tv_price;
        ImageView photo;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_price = (TextView)itemView.findViewById(R.id.tv_title_harga);
            tv_title = (TextView)itemView.findViewById(R.id.tv_title_shop);
            photo = (ImageView)itemView.findViewById(R.id.img_item_shop);
        }
    }
}
