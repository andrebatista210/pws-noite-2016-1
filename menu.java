package com.coruja.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void irParaTurmas(View view)
    {
        Intent intencao = new Intent(this, links.class);
        startActivity(intencao);
    }

    public void irParaGrade(View view)
    {
        Intent intencao = new Intent(this, links.class);
        startActivity(intencao);
    }

    public void irParaMensagens(View view)
    {
        Intent intencao = new Intent(this, links.class);
        startActivity(intencao);
    }

    public void irParaHistorico(View view)
    {
        Intent intencao = new Intent(this, historico.class);
        startActivity(intencao);
    }

    public void irParaProfessores(View view)
    {
        Intent intencao = new Intent(this, professores.class);
        startActivity(intencao);
    }

    public void irParaLinks(View view)
    {
        Intent intencao = new Intent(this, links.class);
        startActivity(intencao);
    }

}