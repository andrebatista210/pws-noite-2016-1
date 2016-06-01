package br.com.fbscorp.appaluno.Controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;

import br.com.fbscorp.appaluno.Model.Link;
import br.com.fbscorp.appaluno.Repository.LinksRepository;

/**
 * Created by Felipe on 29/05/2016.
 */
public class LinksController {

    public ArrayAdapter<Link> ObterTodosLinks(Context context, SQLiteDatabase conn) {
        ArrayAdapter<Link> todosLinks = new LinksRepository(conn).ObterTodosLinks(context);

        return todosLinks;
    }
}
