package com.greeve.greeve.ui.greeve.article;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.greeve.greeve.R;
import com.greeve.greeve.adapters.ArticleRecycleViewAdapter;
import com.greeve.greeve.models.Article;

import java.util.ArrayList;
import java.util.List;


public class ArticleFragment extends Fragment {

    View v;
    RecyclerView myrecyclerview;
    List<Article> lstArticles;


    public ArticleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_article,container,false);
        // Inflate the layout for this fragment
        myrecyclerview = (RecyclerView) v.findViewById(R.id.rv_heroes_article);
        ArticleRecycleViewAdapter recycleViewAdapter = new ArticleRecycleViewAdapter(getContext(),lstArticles);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recycleViewAdapter);

        return v;

    }
//Ini tambah data
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstArticles = new ArrayList<>();
        lstArticles.add(new Article("Mengurangi Sampah Popok & Mengolahnya Menjadi Pupuk",
                "https://greevelaw.files.wordpress.com/2020/02/screenshot_2020-02-21-mengurangi-sampah-popok-mengolahnya-menjadi-pupuk-e28094-zerowaste-id.png",
                "https://greeve.law.blog/2020/02/21/mengurangi-sampah-popok-mengolahnya-menjadi-pupuk"));
        lstArticles.add(new Article("Lerak sebagai alternatif deterjen dan sabun",
                "https://greevelaw.files.wordpress.com/2020/02/screenshot_2020-02-21-lerak-sebagai-alternatif-deterjen-dan-sabun-e28094-zerowaste-id.png",
                "https://greeve.law.blog/2020/02/21/lerak-sebagai-alternatif-deterjen-dan-sabun"));
        lstArticles.add(new Article("DIY Deterjen Sehat",
                "https://greevelaw.files.wordpress.com/2020/02/screenshot_2020-02-21-diy-deterjen-sehat-e28094-zerowaste-id.png",
                "https://greeve.law.blog/2020/02/21/diy-deterjen-sehat"));
        lstArticles.add(new Article("Jejak Karbon Apa sih ?",
                "https://greevelaw.files.wordpress.com/2020/02/screenshot_2020-02-21-apa-itu-jejak-karbon-zerowaste-id.png",
                "https://greeve.law.blog/2020/02/21/jejak-karbon-apa-sih"));
        lstArticles.add(new Article("7 Simbol dan Jenis Plastik yang Perlu Kamu Ketahui",
                "https://greevelaw.files.wordpress.com/2020/02/screenshot_2020-02-21-7-simbol-dan-jenis-plastik-yang-perlu-kamu-ketahui-zerowaste-id.png",
                "https://greeve.law.blog/2020/02/21/7-simbol-dan-jenis-plastik-yang-perlu-kamu-ketahui"));
        lstArticles.add(new Article("7 Simbol dan Jenis Plastik yang Perlu Kamu Ketahui",
                "https://greevelaw.files.wordpress.com/2020/02/screenshot_2020-02-21-tentang-paper-cups-e28094-zerowaste-id.png",
                "https://greeve.law.blog/2020/02/21/tentang-paper-cups/"));
        lstArticles.add(new Article("Tentang Paper Cups",
                "https://greevelaw.files.wordpress.com/2020/02/screenshot_2020-02-21-tentang-paper-cups-e28094-zerowaste-id.png",
                "https://greeve.law.blog/2020/02/21/tentang-paper-cups/"));
        lstArticles.add(new Article("Jawaban dari masalah sampah di Indonesia",
                "https://greevelaw.files.wordpress.com/2020/02/screenshot_2020-02-21-jawaban-dari-masalah-sampah-di-indonesia-e28094-zerowaste-id.png",
                "https://greeve.law.blog/2020/02/21/jawaban-dari-masalah-sampah-di-indonesia"));
        lstArticles.add(new Article("Alternatif pengganti tisu (Sapu Tangan)",
                "https://greevelaw.files.wordpress.com/2020/02/screenshot_2020-02-21-alternatif-pengganti-tisu-sapu-tangan-e28094-zerowaste-id.png",
                "https://greevelaw.wordpress.com/2020/02/21/alternatif-pengganti-tisu-sapu-tangan/"));
        lstArticles.add(new Article("Ecobricks",
                "https://greevelaw.files.wordpress.com/2020/02/screenshot_2020-02-21-ecobricks-e28094-zerowaste-id4.png",
                "https://greeve.law.blog/2020/02/21/ecobricks/"));
    }

}
