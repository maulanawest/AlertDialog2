package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {

    Dialog dialog;
    Button btn_dialog, btn_cancel, btn_ok;

    GifImageView gifImageView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gifImageView = (GifImageView) findViewById(R.id.gifImageView);
        btn_dialog = (Button) findViewById(R.id.btn_dialog);

        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.incliudedev8_alertdialog);

        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_cancel = (Button) dialog.findViewById(R.id.btn_cancel);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(), "Cancel", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();
            }
        });
    }
}