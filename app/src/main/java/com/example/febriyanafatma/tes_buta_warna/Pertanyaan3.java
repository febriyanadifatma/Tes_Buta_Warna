package com.example.febriyanafatma.tes_buta_warna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pertanyaan3 extends AppCompatActivity {
    EditText jawab;
    Button send;
    String total;
    Integer nilai;
    String nilaiStr;
    static String pembawa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan3);
        Intent i = getIntent();
        total = i.getStringExtra(Pertanyaan2.pembawa);
        nilai = Integer.valueOf(total);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pertanyaan3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void kembali(View view) {
        Intent km = new Intent(Pertanyaan3.this,Pertanyaan2.class);
        startActivity(km);
    }

    public void lanjut(View view) {
        jawab = (EditText) findViewById(R.id.jawab);
        send = (Button) findViewById(R.id.send);
        String jawaban = jawab.getText().toString();
        Intent intent = new Intent(Pertanyaan3.this,Pertanyaan4.class);
        if (jawaban.equals("42")){
            nilai += 1;
        }else{
            nilai += 0;
        }
        nilaiStr = String.valueOf(nilai);
        intent.putExtra(pembawa,nilaiStr);
        startActivity(intent);
    }
}
