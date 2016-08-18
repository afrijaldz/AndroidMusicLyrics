package com.example.afrijal.anggit;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    ImageView gmb;
    TextView textView, adi, adib;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        adi = (TextView)findViewById(R.id.adi);
        adib = (TextView)findViewById(R.id.adibwh);
        gmb = (ImageView)findViewById(R.id.gmb);

        //random lirik / teks
        handler.postDelayed(new ViewUpdater("Hei", textView), 9500);
        handler.postDelayed(new ViewUpdater(" apa kabarmu jauh di sana", textView), 11000);
        handler.postDelayed(new ViewUpdater("tiba-tiba teringat", textView), 17000);
        handler.postDelayed(new ViewUpdater("cerita yang pernah", textView), 21500);
        handler.postDelayed(new ViewUpdater("kita upayakan", textView), 23500);
        handler.postDelayed(new ViewUpdater("Ku pikir", textView), 25500);
        handler.postDelayed(new ViewUpdater("aku berhasil melupakanmu", textView), 28000);
        handler.postDelayed(new ViewUpdater("Berani-beraninya", textView), 32500);
        handler.postDelayed(new ViewUpdater("kenangan itu datang tersenyum", textView), 37500);
        handler.postDelayed(new ViewUpdater("Meskipun", textView), 41000);
        handler.postDelayed(new ViewUpdater("jalan kita tak bertemu", textView), 44000);
        handler.postDelayed(new ViewUpdater("Tapi tetap indah bagiku", textView), 48000);
        handler.postDelayed(new ViewUpdater("Semoga juga bagimu", textView), 53000);
        handler.postDelayed(new ViewUpdater("Kau tahu aku", textView), 58000);
        handler.postDelayed(new ViewUpdater("merelakanmu", textView), 61000);
        handler.postDelayed(new ViewUpdater("Aku cuma rindu,", textView), 65500);
        handler.postDelayed(new ViewUpdater("", textView), 68000);
        handler.postDelayed(new ViewUpdater("aku cuma rindu", textView), 70000);
        handler.postDelayed(new ViewUpdater("Takkan mencoba tuk merebutmu", textView), 75000);
        handler.postDelayed(new ViewUpdater("Aku cuma rindu,", textView), 82000);
        handler.postDelayed(new ViewUpdater("itu saja", textView), 86000);
        handler.postDelayed(new ViewUpdater("", textView), 90000);

        handler.postDelayed(new ViewUpdater("Gagal,", textView), 95000);
        handler.postDelayed(new ViewUpdater("kali ini gagal bersembunyi", textView), 97000);
        handler.postDelayed(new ViewUpdater("Di balik kata-kata bijak", textView), 102000);
        handler.postDelayed(new ViewUpdater("yang selalu mampu", textView), 107000);
        handler.postDelayed(new ViewUpdater("Membuat aku terlihat tangguh", textView), 109000);
        handler.postDelayed(new ViewUpdater("Padahal hancur lebur harapan", textView), 112500);
        handler.postDelayed(new ViewUpdater("Yang terlanjur ku percaya", textView), 118000);
        handler.postDelayed(new ViewUpdater("ahaaa", textView), 123000);
        handler.postDelayed(new ViewUpdater("haaa", textView), 125000);
        handler.postDelayed(new ViewUpdater("Meskipun", textView), 126500);
        handler.postDelayed(new ViewUpdater("jalan kita tak bertemu", textView), 129000);
        handler.postDelayed(new ViewUpdater("Tapi tetap indah bagiku", textView), 133000);
        handler.postDelayed(new ViewUpdater("Semoga juga bagimu", textView), 138500);
        handler.postDelayed(new ViewUpdater("Kau tahu aku merelakanmu", textView), 144000);
        handler.postDelayed(new ViewUpdater("Aku cuma rindu,", textView), 151000);
        handler.postDelayed(new ViewUpdater("", textView), 154200);
        handler.postDelayed(new ViewUpdater("aku cuma rindu", textView), 156000);
        handler.postDelayed(new ViewUpdater("Takkan mencoba tuk merebutmu", textView), 160000);
        handler.postDelayed(new ViewUpdater("Aku cuma rindu,", textView), 167000);
        handler.postDelayed(new ViewUpdater("", textView), 1690000);
        handler.postDelayed(new ViewUpdater("itu saja", textView), 171000);
        handler.postDelayed(new ViewUpdater("haaaa", textView), 175000);
        handler.postDelayed(new ViewUpdater("aaaa", textView), 177000);
        handler.postDelayed(new ViewUpdater("uuuuuuu", textView), 179000);
        handler.postDelayed(new ViewUpdater("haaaaa", textView), 183000);
        handler.postDelayed(new ViewUpdater("uuu", textView), 187000);

        handler.postDelayed(new ViewUpdater("Dan senyuman itu", textView), 189000);
        handler.postDelayed(new ViewUpdater("masih selalu menenangkanku", textView), 192000);
        handler.postDelayed(new ViewUpdater("*hehehehe*", textView), 202000);
        handler.postDelayed(new ViewUpdater("", textView), 206000);
        handler.postDelayed(new ViewUpdater("Kau tahu aku mrelakanmu", textView), 210000);
        handler.postDelayed(new ViewUpdater("Aku cuma rindu,", textView), 218000);
        handler.postDelayed(new ViewUpdater("", textView), 220000);
        handler.postDelayed(new ViewUpdater("aku cuma rindu", textView), 222000);
        handler.postDelayed(new ViewUpdater("Takkan mencoba tuk merebutmu", textView), 227000);
        handler.postDelayed(new ViewUpdater("huu", textView), 232000);
        handler.postDelayed(new ViewUpdater("aku cuma rindu", textView), 234000);
        handler.postDelayed(new ViewUpdater("itu sajaa", textView), 238000);
        handler.postDelayed(new ViewUpdater("", textView), 241000);
        handler.postDelayed(new ViewUpdater("itu saja", textView), 242500);
        handler.postDelayed(new ViewUpdater("aaaa", textView), 245000);
        handler.postDelayed(new ViewUpdater("Thanks to Adi Candra", adi), 255000);
        handler.postDelayed(new ViewUpdater("untuk fotonya, hahaha", textView), 258000);
        handler.postDelayed(new ViewUpdater("", adi), 262000);
        handler.postDelayed(new ViewUpdater("", textView), 262000);

        //random gambar


        handler.postDelayed(new Runnable() {

            @Override
            public void run() {gmb.setImageResource(R.drawable.afsd);}}, 5000);

        handler.postDelayed(new Runnable() {

            @Override
            public void run() {gmb.setImageResource(R.drawable.b);}}, 95000);

       handler.postDelayed(new Runnable() {

            @Override
            public void run() {gmb.setImageResource(R.drawable.c);}}, 189000);


        handler.postDelayed(new Runnable() {

            @Override
            public void run() {gmb.setImageResource(R.drawable.wpap);}}, 262000);
        mus();

    }
    private void mus(){
        final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gagal);
        mediaPlayer.start();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {mediaPlayer.stop();}}, 255000);
    }

    private class ViewUpdater implements Runnable{
        private String mString;
        private TextView mView;


        public ViewUpdater(String string, TextView view){
            mString = string;
            mView = view;

        }

        @Override
        public void run() {
            mView.setText(mString);

        }
    }
}
