package com.example.casadoacaitcc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Perfil extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        drawerLayout = findViewById(R.id.drawer_layout);

    }

    ///////////////////////////////////////////////////////
    public void ClickMenuProdutos(View view) {
        //Recriar tela
        recreate();
    }

    public void ClickPerfil(View view) {
        Intent perfil = new Intent(this, Perfil.class);
        startActivity(perfil);
    }

    public void ClickFavoritos(View view) {
        Intent perfil = new Intent(this, Favoritos.class);
        startActivity(perfil);
    }

    public void ClickHistorico(View view) {
        Intent perfil = new Intent(this, Historico.class);
        startActivity(perfil);
    }

    public void ClickSobreApp(View view) {
        Intent perfil = new Intent(this, SobreApp.class);
        startActivity(perfil);
    }

    public void ClickRelatar(View view) {
        Intent perfil = new Intent(this, RelatarProblema.class);
        startActivity(perfil);
    }

    ///////////////////////////////////////////////////////
}