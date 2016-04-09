package com.example.febriyanafatma.tes_buta_warna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pertanyaan1 extends AppCompatActivity {

    EditText jawab;
    Button send;
    WebView view;
    String nilaiStr = "1";
    static String pembawa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan1);
        view = (WebView) this.findViewById(R.id.web);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyBrowser());
        view.loadUrl("http://3.bp.blogspot.com/-FhuG-nXnMyk/VoCb4ftSfxI/AAAAAAAAACo/zTZcUwsj9gU/s1600/dua.png");
    }


    public void Lanjut(View view) {
        jawab = (EditText) findViewById(R.id.jawab);
        send = (Button) findViewById(R.id.send);
        String jawaban = jawab.getText().toString();
        Intent intent = new Intent(Pertanyaan1.this, Pertanyaan2.class);
        if (jawaban.equals("2")) {

            intent.putExtra(pembawa, nilaiStr);
        }
        startActivity(intent);
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //ketika disentuh tombol back
        if ((keyCode == KeyEvent.KEYCODE_BACK) && view.canGoBack()) {
            view.goBack(); //method goback() dieksekusi untuk kembali pada halaman sebelumnya
            return true;
        }
        // Jika tidak ada history (Halaman yang sebelumnya dibuka)
        // maka akan keluar dari activity
        return super.onKeyDown(keyCode, event);
    }
}
