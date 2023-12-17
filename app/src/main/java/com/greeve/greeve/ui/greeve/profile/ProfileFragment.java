package com.greeve.greeve.ui.greeve.profile;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.greeve.greeve.CartActivity;
import com.greeve.greeve.CollectionActivity;
import com.greeve.greeve.HistoryActivity;
import com.greeve.greeve.R;


public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Button bEditProfile = (Button) getView().findViewById(R.id.btn_edit_profile);
        final Button bCart = (Button) getView().findViewById(R.id.btn_keranjang);
        final Button bHistory = (Button) getView().findViewById(R.id.btn_riwayat_pemesanan);
        final Button bCollection = (Button) getView().findViewById(R.id.btn_koleksi);

        bEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInputDialog();
            }
        });

        bCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CartActivity.class);
                startActivity(i);
            }
        });
        bHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), HistoryActivity.class);
                startActivity(i);
            }
        });
        bCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CollectionActivity.class);
                startActivity(i);
            }
        });
    }

    protected void showInputDialog() {
        LayoutInflater layoutInflater = LayoutInflater.from(getActivity().getApplicationContext());
        View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setView(promptView);

        final TextView tNamaProfile = (TextView) getView().findViewById(R.id.text_editprofile);
        final EditText editText = (EditText) promptView.findViewById(R.id.ed_editprofile);
        alertDialog.setCancelable(false)
                .setPositiveButton("Edit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tNamaProfile.setText(editText.getText());
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = alertDialog.create();
        alert.show();

    }
}
