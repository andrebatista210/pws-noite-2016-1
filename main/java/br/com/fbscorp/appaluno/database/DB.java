package br.com.fbscorp.appaluno.database;

import android.content.Context;
import android.database.sqlite.*;

/**
 * Created by Felipe on 01/06/2016.
 */
public class DB extends SQLiteOpenHelper{

    public DB(Context context) {

        super(context, "APPALUNO", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptSQL.getCreateLink());
        db.execSQL(ScriptSQL.getPopulaLink());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
