package br.com.fbscorp.appaluno;

import android.app.AlertDialog;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.widget.*;
import android.content.Intent;
import android.net.Uri;

import br.com.fbscorp.appaluno.Controller.LinksController;
import br.com.fbscorp.appaluno.Model.Link;
import br.com.fbscorp.appaluno.database.DB;

import android.database.*;

public class ActLink extends AppCompatActivity {

    private ListView lst_links;
    private ArrayAdapter<Link> adpLinks;
    private LinksController linksController;

    private DB banco;
    private SQLiteDatabase conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_link);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        linksController = new LinksController();

        try {
            banco = new DB(this);
            conn = banco.getWritableDatabase();

            Toast.makeText(getApplicationContext(),"Banco criado com sucesso!", Toast.LENGTH_SHORT).show();

        }catch (SQLException ex){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro na criação do banco: " + ex.getMessage());
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }

        adpLinks = linksController.ObterTodosLinks(this,conn);

        lst_links = (ListView)findViewById(R.id.lst_links);
        lst_links.setAdapter(adpLinks);


        lst_links.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    default:
                        navegarInternet(id);
                }

            }
        });
    }

    private void navegarInternet(long id) {
        Link url = adpLinks.getItem((int) id);
        Uri uri = Uri.parse(url.getUrl());
        Intent itNavegar = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(itNavegar);
    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_link, menu);
        return true;
    }*/

/*    @Override
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
    }*/
}
