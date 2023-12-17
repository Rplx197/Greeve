package com.greeve.greeve.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.greeve.greeve.FullVideoTutorialActivity;
import com.greeve.greeve.R;
import com.greeve.greeve.models.Tutorial;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TutorialRecycleViewAdapter extends RecyclerView.Adapter<TutorialRecycleViewAdapter.MyViewHolder> {
    private Context mContext;
    List<Tutorial> mData;
    //Ini Adapter
    public TutorialRecycleViewAdapter(Context mContext, List<Tutorial> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_card_view_tutorial,parent,false);

        return new TutorialRecycleViewAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Tutorial current = mData.get(position);
        holder.tv_title.setText(mData.get(position).getTitle());
        holder.webView.loadUrl(current.getLink());
        holder.btn_fullscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, FullVideoTutorialActivity.class);
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
        WebView webView;
        Button btn_fullscreen;
        @SuppressLint("SetJavaScriptEnabled")
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = (TextView)itemView.findViewById(R.id.tv_title_videos);
            btn_fullscreen = (Button)itemView.findViewById(R.id.btn_fullscreen);
            webView = (WebView) itemView.findViewById(R.id.web_view_tutorial);
            webView.setWebViewClient(new WebViewClient());
            webView.setWebChromeClient(new WebChromeClient());
            webView.getSettings().setJavaScriptEnabled(true);
        }
    }
}
