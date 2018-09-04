package br.com.adrianoantonucci.meninooumenina;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;


public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnEmailDesenvolvedor, btnSiteDesenvolvedor, btnFoneDesenvolvedor, btnVoltar;
        ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobre_activity);

        btnSiteDesenvolvedor = (Button) findViewById(R.id.btnSiteDesenvolvedor);
        btnEmailDesenvolvedor = (Button) findViewById(R.id.btnEmailDesenvolvedor);
        btnFoneDesenvolvedor = (Button) findViewById(R.id.btnFoneDesenvolvedor);

        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnSiteDesenvolvedor.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.adrianoantonucci.com.br/"));
                startActivity(browserIntent);
            }
        });

        btnEmailDesenvolvedor.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"adriano@adrianoantonucci.com.br"});
                startActivity(Intent.createChooser(emailIntent, "Enviar e-mail..."));
            }
        });
    }

}
