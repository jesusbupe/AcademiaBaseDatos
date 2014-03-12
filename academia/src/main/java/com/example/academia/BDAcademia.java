package com.example.academia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Jesus on 27/01/14.
 */
public class BDAcademia {

    protected static SQLiteDatabase bdAcademia;
    private static final int VERSION_BD=1;

    public static void abrir(Context context){

        BDacademiaHelper bdContactosHelper = new BDacademiaHelper (context, "Academia", null, VERSION_BD);
        bdAcademia = bdContactosHelper.getWritableDatabase();
    }

    public static void insertar(Curso curso){

        if(bdAcademia != null) {
            //Insertar datos en la base de datos
            bdAcademia.execSQL("INSERT INTO cursos (nombre,descripcion,activo) " +
                    "VALUES ('"+curso.getNombre()+"', '"+curso.getDescripcion()+"', '"+curso.getActivo()+"')");
        }
    }

    public static void cerrar(){
        bdAcademia.close();

    }
}
