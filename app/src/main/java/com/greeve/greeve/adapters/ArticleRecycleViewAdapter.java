package com.greeve.greeve.adapters;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.greeve.greeve.DetailArticleActivity;
import com.greeve.greeve.FullVideoTutorialActivity;
import com.greeve.greeve.R;
import com.greeve.greeve.models.Article;

import java.util.ArrayList;
import java.util.List;


public class ArticleRecycleViewAdapter extends RecyclerView.Adapter<ArticleRecycleViewAdapter.MyViewHolder> {
    private Context mContext;
    List<Article> mData;

    public List<Article> getLishArticle() {
        return mData;
    }
    public ArticleRecycleViewAdapter(Context mContext, List<Article> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_card_view_article,parent,false);
        return new ArticleRecycleViewAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Article current = mData.get(position);
        holder.tv_title.setText(mData.get(position).getTitle());
        Glide.with(mContext).load(getLishArticle().get(position).getPhoto()).into(holder.img_article);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, DetailArticleActivity.class);
                i.putExtra("url",current.getLink());
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title;
        ImageView img_article;
        LinearLayout linearLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = (TextView)itemView.findViewById(R.id.title_article);
            img_article = (ImageView)itemView.findViewById(R.id.image_article);
            linearLayout = (LinearLayout)itemView.findViewById(R.id.item_article_id);
        }
    }
}
