package com.silentcodder.learningapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class Mulakshare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulakshare);

        findViewById(R.id.a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.a);
                tone.start();
                final View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_a, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        findViewById(R.id.aa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.aa);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_aa, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        findViewById(R.id.e).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.e);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_e, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        findViewById(R.id.ee).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.ee);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_ee, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        findViewById(R.id.u).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.u);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_u, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        findViewById(R.id.uu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.uu);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_uu, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        findViewById(R.id.ru).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.ru);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_ru, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        findViewById(R.id.ai).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.ai);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_ai, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        findViewById(R.id.aii).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.aii);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_aii, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        findViewById(R.id.ao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.ao);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_au, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        findViewById(R.id.aau).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.aau);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_aau, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        findViewById(R.id.am).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.am);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_am, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        findViewById(R.id.amm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Mulakshare.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                MediaPlayer tone = MediaPlayer.create(getApplicationContext(),R.raw.amm);
                tone.start();
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialogbox_amm, viewGroup, false);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                ImageView dialog_btn = (ImageView) dialogView.findViewById(R.id.btn_close);
                dialog_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

    }
}