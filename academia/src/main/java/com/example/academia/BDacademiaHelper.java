package com.example.academia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jesus on 27/01/14.
 */
public class BDacademiaHelper extends SQLiteOpenHelper {


    public BDacademiaHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

            String sqlCreate = "CREATE TABLE cursos (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT" +
                    ", nombre VARCHAR(50)" +
                    ", descripcion VARCHAR(200)" +
                    ", activo  INTEGER" +
                    ", fecha_inicio DATE" +
                    ")";
        sqLiteDatabase.execSQL(sqlCreate);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {


    }
}
