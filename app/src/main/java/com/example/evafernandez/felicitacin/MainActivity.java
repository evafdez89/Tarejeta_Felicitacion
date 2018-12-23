package com.example.evafernandez.felicitacin;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente = Typeface.createFromAsset(getAssets(),"christmas.ttf");
        TextView titulo = (TextView) findViewById(R.id.titulo);
        titulo.setTypeface(miFuente);

        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        titulo.startAnimation(animacion);

        TextView titulo2 = (TextView) findViewById(R.id.textView);
        TextView titulo3 = (TextView) findViewById(R.id.textView2);
        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slideup);
        titulo2.startAnimation(slideUp);
        titulo3.startAnimation(slideUp);

       // MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happybirthday);
       // mediaPlayer.start();
    }
}
