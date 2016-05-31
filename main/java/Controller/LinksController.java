package Controller;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import Model.Link;
import Repository.LinksRepository;

/**
 * Created by Felipe on 29/05/2016.
 */
public class LinksController {

    public ArrayAdapter<Link> ObterTodosLinks(Context context) {
        ArrayAdapter<Link> todosLinks = new LinksRepository().ObterTodosLinks(context);

        return todosLinks;
    }
}
