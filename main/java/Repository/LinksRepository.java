package Repository;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import Model.Link;

/**
 * Created by Felipe on 29/05/2016.
 */
public class LinksRepository {
    public LinksRepository() {
    }

    public ArrayAdapter<Link> ObterTodosLinks(Context context) {
        ArrayAdapter<Link> todosLinks = new ArrayAdapter<Link>(context, android.R.layout.simple_list_item_1);

        todosLinks.add(CreateLink("Google", "http://www.google.com"));
        todosLinks.add(CreateLink("G1", "http://www.g1.com.br"));
        todosLinks.add(CreateLink("Yahoo", "http://www.yahoo.com.br"));
        todosLinks.add(CreateLink("Google", "http://www.google.com"));
        todosLinks.add(CreateLink("G1", "http://www.g1.com.br"));
        todosLinks.add(CreateLink("Yahoo", "http://www.yahoo.com.br"));
        todosLinks.add(CreateLink("Google", "http://www.google.com"));
        todosLinks.add(CreateLink("G1", "http://www.g1.com.br"));
        todosLinks.add(CreateLink("Yahoo", "http://www.yahoo.com.br"));
        todosLinks.add(CreateLink("Google", "http://www.google.com"));
        todosLinks.add(CreateLink("G1", "http://www.g1.com.br"));
        todosLinks.add(CreateLink("Yahoo", "http://www.yahoo.com.br"));
        todosLinks.add(CreateLink("Google", "http://www.google.com"));
        todosLinks.add(CreateLink("G1", "http://www.g1.com.br"));
        todosLinks.add(CreateLink("Yahoo", "http://www.yahoo.com.br"));
        todosLinks.add(CreateLink("Google", "http://www.google.com"));
        todosLinks.add(CreateLink("G1", "http://www.g1.com.br"));
        todosLinks.add(CreateLink("Yahoo", "http://www.yahoo.com.br"));
        todosLinks.add(CreateLink("Google", "http://www.google.com"));
        todosLinks.add(CreateLink("G1", "http://www.g1.com.br"));
        todosLinks.add(CreateLink("Yahoo", "http://www.yahoo.com.br"));
        return todosLinks;
    }

    private Link CreateLink(String desc, String url) {
        Link link = new Link();
        link.setDesc(desc);
        link.setUrl(url);

        return link;
    }
}
