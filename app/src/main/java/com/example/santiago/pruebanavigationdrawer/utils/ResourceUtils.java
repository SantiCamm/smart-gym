package com.example.santiago.pruebanavigationdrawer.utils;

import android.content.Context;
import android.graphics.BitmapFactory;

import com.example.santiago.pruebanavigationdrawer.R;
import com.example.santiago.pruebanavigationdrawer.models.EjercicioContent;

import java.util.Arrays;
import java.util.List;

public class ResourceUtils {

    private static final String PRESS_PLANO = "Press plano";
    private static final String PRESS_INCLINADO = "Press inclinado";

    public static EjercicioContent getEjercicio(String id, Context context){
        EjercicioContent ejercicioContent = new EjercicioContent();
        switch (id){
            case PRESS_PLANO:
                ejercicioContent.setTitle(context.getString(R.string.title_pressplano));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressplano));
                ejercicioContent.setEjecucion(context.getString(R.string.descripcion_pressplano));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressplanoconbarra));
                break;
            case PRESS_INCLINADO:
                ejercicioContent.setTitle(context.getString(R.string.title_pressinclinado));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressinclinado));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressinclinado));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressinclinadoconbarra));
                break;
        }
        return ejercicioContent;
    }

    public static List<String> getListaEjercicios() {
        return Arrays.asList(PRESS_PLANO, PRESS_INCLINADO);
    }


}



