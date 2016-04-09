package com.example.febriyanafatma.tes_buta_warna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pertanyaan2 extends AppCompatActivity {
    EditText jawab;
    Button send;
    WebView view;
    Integer nilai;
    String nilaiStr = "1";
    static String pembawa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan2);
        view = (WebView) this.findViewById(R.id.web);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyBrowser());
        view.loadUrl("http://3.bp.blogspot.com/-yrTqijPGS7M/VoC8SV7q0oI/AAAAAAAAAC8/8MeydwHdCp4/s1600/duasembilan.png");
    }

        public void lanjut(View view) {
            jawab = (EditText) findViewById(R.id.jawab);
            send = (Button) findViewById(R.id.send);
            String jawaban = jawab.getText().toString();
            Intent intent = new Intent(Pertanyaan2.this, Pertanyaan3.class);
            if (jawaban.equals("29")) {
                nilai += 1;
                startActivity(intent);
            }
        }

                private class MyBrowser extends WebViewClient {
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        view.loadUrl(url);
                        return true;
                    }
                }
    public void kembali(View view) {
        Intent km = new Intent(Pertanyaan2.this,Pertanyaan1.class);
        startActivity(km);
    }
}
