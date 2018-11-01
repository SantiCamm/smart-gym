package com.example.santiago.pruebanavigationdrawer.utils;

import android.content.Context;
import android.graphics.BitmapFactory;

import com.example.santiago.pruebanavigationdrawer.R;
import com.example.santiago.pruebanavigationdrawer.models.EjercicioContent;

import java.util.Arrays;
import java.util.List;

public class ResourceUtils {

    //PECHO
    private static final String PRESS_PLANO_CON_BARRA = "Press plano con barra";
    private static final String PRESS_PLANO_CON_MANCUERNA = "Press plano con mancuerna";
    private static final String PRESS_INCLINADO_CON_BARRA = "Press inclinado con barra";
    private static final String PRESS_INCLINADO_CON_MANCUERNA = "Press inclinado con mancuerna";
    private static final String PRESS_DECLINADO_CON_BARRA = "Press declinado con barra";
    private static final String PRESS_DECLINADO_CON_MANCUERNA = "Press declinado con mancuerna";
    private static final String FONDOS_EN_PARALELAS = "Fondos en paralelas";
    private static final String FLEXIONES = "Flexiones";
    private static final String PULLOVER_CON_MANCUERNA = "Pull-over con mancuerna";
    private static final String CRUCES_DE_POLEAS = "Cruces de poleas";
    private static final String PECKDECK = "Peck-deck";
    private static final String APERTURAS_PLANAS = "Aperturas planas";
    private static final String APERTURAS_INCLINADAS = "Aperturas inclinadas";

    //ESPALDA
    private static final String DORSALERA_AL_PECHO_O_TRASNUCA = "Dorsalera al pecho/tras nuca";
    private static final String REMO_CON_BARRA_PARADO = "Remo con barra parado";
    private static final String REMO_CON_BARRA_EN_BANCO = "Remo con barra en banco";
    private static final String REMO_CON_MANCUERNA = "Remo con mancuerna";
    private static final String DOMINADAS = "Dominadas";
    private static final String CHINUPS = "Chin-ups";
    private static final String REMO_HAMMER = "Remo hammer";
    private static final String REMO_MEDIO = "Remo medio";
    private static final String PULLOVER_EN_POLEA = "Pull-over en polea";

    //HOMBROS
    private static final String PRESS_MILITAR = "Press militar";
    private static final String PRESS_TRAS_NUCA = "Press tras nuca";
    private static final String PRESS_CON_MANCUERNAS = "Press con mancuernas";
    private static final String VUELOS_LATERALES_CON_MANCUERNA = "Vuelos laterales con mancuerna";
    private static final String VUELOS_LATERALES_EN_POLEA = "Vuelos laterales en polea";
    private static final String VUELOS_FRONTALES_CON_MANCUERNA = "Vuelos frontales con mancuerna";
    private static final String VUELOS_FRONTALES_CON_DISCO = "Vuelos frontales con disco";
    private static final String VUELOS_POSTERIORES_EN_MAQUINA = "Vuelos posteriores en maquina";
    private static final String VUELOS_POSTERIORES_CON_MANCUERNA = "Vuelos posteriores con mancuerna";
    private static final String VUELOS_POSTERIORES_EN_POLEA = "Vuelos posteriores en polea";

    //BICEPS
    private static final String CURL_CON_BARRA_RECTA = "Curl con barra recta";
    private static final String CURL_CON_MANCUERNAS = "Curl con mancuernas";
    private static final String CURL_EN_BANCO_SCOTT_CON_BARRA = "Curl en banco Scott con barra";
    private static final String CURL_EN_BANCO_SCOTT_CON_MANCUERNAS = "Curl en banco Scott con mancuernas";
    private static final String CURL_CONCENTRADO = "Curl concentrado";
    private static final String CURL_CON_BARRA_EN_POLEA = "Curl con barra en polea";
    private static final String CURL_CON_SOGA = "Curl con soga";
    private static final String CURL_CONCENTRADO_EN_POLEA = "Curl concentrado en polea";

    //TRICEPS
    private static final String EXTENSIONES_EN_POLEA_CON_BARRA = "Extensiones en polea con barra";
    private static final String EXTENSIONES_EN_POLEA_CON_SOGA = "Extensiones en polea con soga";
    private static final String PRESS_FRANCES_A_DOS_MANOS_CON_MANCUERNAS = "Press francés a dos manos con mancuerna";
    private static final String PRESS_FRANCES_A_UNA_MANO_CON_MANCUERNA = "Press francés a una mano con mancuerna";
    private static final String PRESS_FRANCES_ACOSTADO_CON_BARRA = "Press francés acostado con barra";
    private static final String PRESS_FRANCES_ACOSTADO_CON_MANCUERNAS = "Press francés acostado con mancuernas";
    private static final String PRESS_PLANO_CERRADO = "Press plano cerrado";

    //PIERNAS
    private static final String SENTADILLAS = "Sentadillas";
    private static final String PESO_MUERTO = "Peso muerto";
    private static final String CAMILLA_CUADRICEPS = "Camilla cuádriceps";
    private static final String PRENSA = "Prensa";
    private static final String CAMILLA_DE_ISQUIOTIBIALES = "Camilla de isquiotibiales";
    private static final String SILLON_DE_GLUTEOS = "Sillón de glúteos";
    private static final String ADUCTORES = "Aductores";

    //ABDOMINALES
    private static final String ABDOMINALES_CORTITOS = "Abdominales cortitos";
    private static final String ABDOMINALES_OBLICUOS = "Abdominales oblicuos";
    private static final String ABDOMINALES_BOLITA = "Abdominales bolita";
    private static final String ELEVACION_DE_PIERNAS = "Elevación de piernas";
    private static final String RUEDA = "Rueda";
    private static final String PLANCHA_FRONTAL = "Plancha frontal";
    private static final String PLANCHA_LATERAL = "Plancha lateral";

    //ESPINALES
    private static final String ESPINALES_ALTERNADOS = "Espinales alternados";





    public static EjercicioContent getEjercicio(String id, Context context){
        EjercicioContent ejercicioContent = new EjercicioContent();
        switch (id){
            case PRESS_PLANO_CON_BARRA:
                ejercicioContent.setTitle(context.getString(R.string.title_pressplanoconbarra));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_title_pressplanoconbarra));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressplanoconbarra));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressplanoconbarra));
                ejercicioContent.setVideo(context.getString(R.string.video_pressplanoconbarra));
                break;
            case PRESS_PLANO_CON_MANCUERNA:
                ejercicioContent.setTitle(context.getString(R.string.title_pressplanoconmancuerna));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressplanoconmancuerna));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressplanoconmancuerna));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressplanoconmancuernas));
                ejercicioContent.setVideo(context.getString(R.string.video_pressplanoconmancuerna));
                break;
            case PRESS_INCLINADO_CON_BARRA:
                ejercicioContent.setTitle(context.getString(R.string.title_pressinclinadoconbarra));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressinclinadoconbarra));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressinclinadoconbarra));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressinclinadoconbarra));
                ejercicioContent.setVideo(context.getString(R.string.video_pressinclinadoconbarra));
                break;
            case PRESS_INCLINADO_CON_MANCUERNA:
                ejercicioContent.setTitle(context.getString(R.string.title_pressinclinadoconmancuerna));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressinclinadoconmancuerna));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressinclinadoconmancuerna));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressinclinadoconmancuerna));
                ejercicioContent.setVideo(context.getString(R.string.video_pressinclinadoconmancuerna));
                break;
            case PRESS_DECLINADO_CON_BARRA:
                ejercicioContent.setTitle(context.getString(R.string.title_pressdeclinadoconbarra));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressdeclinadoconbarra));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressdeclinadoconbarra));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressdeclinadoconbarra));
                ejercicioContent.setVideo(context.getString(R.string.video_pressdeclinadoconbarra));
                break;
            case PRESS_DECLINADO_CON_MANCUERNA:
                ejercicioContent.setTitle(context.getString(R.string.title_pressdeclinadoconmancuerna));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressdeclinadoconmancuerna));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressdeclinadoconmancuerna));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressdeclinadoconmancuerna));
                ejercicioContent.setVideo(context.getString(R.string.video_pressdeclinadoconmancuerna));
                break;
            case FONDOS_EN_PARALELAS:
                ejercicioContent.setTitle(context.getString(R.string.title_fondosenparalelas));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_fondosenparalelas));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_fondosenparalelas));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.fondos));
                ejercicioContent.setVideo(context.getString(R.string.video_fondosenparalelas));
                break;
            case FLEXIONES:
                ejercicioContent.setTitle(context.getString(R.string.title_flexiones));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_flexiones));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_flexiones));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.flexiones));
                ejercicioContent.setVideo(context.getString(R.string.video_flexiones));
                break;
            case PULLOVER_CON_MANCUERNA:
                ejercicioContent.setTitle(context.getString(R.string.title_pulloverconmancuerna));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pulloverconmancuerna));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pulloverconmancuerna));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pulloverconmancuerna));
                ejercicioContent.setVideo(context.getString(R.string.video_pulloverconmancuerna));
                break;
            case CRUCES_DE_POLEAS:
                ejercicioContent.setTitle(context.getString(R.string.title_crucesdepoleas));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_crucesdepoleas));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_crucesdepoleas));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.crucesdepoleas));
                ejercicioContent.setVideo(context.getString(R.string.video_crucesdepoleas));
                break;
            case PECKDECK:
                ejercicioContent.setTitle(context.getString(R.string.title_peckdeck));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_peckdeck));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_peckdeck));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.peckdeck));
                ejercicioContent.setVideo(context.getString(R.string.video_peckdeck));
                break;
            case APERTURAS_PLANAS:
                ejercicioContent.setTitle(context.getString(R.string.title_aperturasplanas));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_aperturasplanas));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_aperturasplanas));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.aperturasplanas));
                ejercicioContent.setVideo(context.getString(R.string.video_aperturasplanas));
                break;
            case APERTURAS_INCLINADAS:
                ejercicioContent.setTitle(context.getString(R.string.title_aperturasinclinadas));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_aperturasinclinadas));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_aperturasinclinadas));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.aperturasinclinadas));
                ejercicioContent.setVideo(context.getString(R.string.video_aperturasinclinadas));
                break;
            case DORSALERA_AL_PECHO_O_TRASNUCA:
                ejercicioContent.setTitle(context.getString(R.string.title_dorsaleraalpechotrasnuca));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_dorsaleraalpechotrasnuca));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_dorsaleraalpechotrasnuca));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.dorsalera));
                ejercicioContent.setVideo(context.getString(R.string.video_dorsaleraalpechotrasnuca));
                break;
            case REMO_CON_BARRA_PARADO:
                ejercicioContent.setTitle(context.getString(R.string.title_remoconbarraparado));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_remoconbarraparado));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_remoconbarraparado));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.remoconbarraparado));
                ejercicioContent.setVideo(context.getString(R.string.video_remoconbarraparado));
                break;
            case REMO_CON_BARRA_EN_BANCO:
                ejercicioContent.setTitle(context.getString(R.string.title_remoconbarraenbanco));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_remoconbarraenbanco));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_remoconbarraenbanco));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.remoconbarrasentado));
                ejercicioContent.setVideo(context.getString(R.string.video_remoconbarraenbanco));
                break;
            case REMO_CON_MANCUERNA:
                ejercicioContent.setTitle(context.getString(R.string.title_remoconmancuerna));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_remoconmancuerna));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_remoconmancuerna));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.remoconmancuerna));
                ejercicioContent.setVideo(context.getString(R.string.video_remoconmancuerna));
                break;
            case DOMINADAS:
                ejercicioContent.setTitle(context.getString(R.string.title_dominadas));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_dominadas));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_dominadas));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.dominadas));
                ejercicioContent.setVideo(context.getString(R.string.video_dominadas));
                break;
            case CHINUPS:
                ejercicioContent.setTitle(context.getString(R.string.title_chinups));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_chinups));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_chinups));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.chinups));
                ejercicioContent.setVideo(context.getString(R.string.video_chinups));
                break;
            case REMO_HAMMER:
                ejercicioContent.setTitle(context.getString(R.string.title_remohammer));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_remohammer));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_remohammer));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.remohammer));
                ejercicioContent.setVideo(context.getString(R.string.video_remohammer));
                break;
            case REMO_MEDIO:
                ejercicioContent.setTitle(context.getString(R.string.title_remomedio));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_remomedio));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_remomedio));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.remomedio));
                ejercicioContent.setVideo(context.getString(R.string.video_remomedio));
                break;
            case PULLOVER_EN_POLEA:
                ejercicioContent.setTitle(context.getString(R.string.title_pulloverenpolea));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pulloverenpolea));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pulloverenpolea));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pulloverenpolea));
                ejercicioContent.setVideo(context.getString(R.string.video_pulloverenpolea));
                break;
            case PRESS_MILITAR:
                ejercicioContent.setTitle(context.getString(R.string.title_pressmilitar));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressmilitar));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressmilitar));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressmilitar));
                ejercicioContent.setVideo(context.getString(R.string.video_pressmilitar));
                break;
            case PRESS_TRAS_NUCA:
                ejercicioContent.setTitle(context.getString(R.string.title_presstrasnuca));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_presstrasnuca));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_presstrasnuca));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.presstrasnuca));
                ejercicioContent.setVideo(context.getString(R.string.video_presstrasnuca));
                break;
            case PRESS_CON_MANCUERNAS:
                ejercicioContent.setTitle(context.getString(R.string.title_pressconmancuernas));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressconmancuernas));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressconmancuernas));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressconmancuernas));
                ejercicioContent.setVideo(context.getString(R.string.video_pressconmancuernas));
                break;
            case VUELOS_LATERALES_CON_MANCUERNA:
                ejercicioContent.setTitle(context.getString(R.string.title_vueloslateralesconmancuerna));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_vueloslateralesconmancuerna));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_vueloslateralesconmancuerna));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.vueloslateralesconmancuerna));
                ejercicioContent.setVideo(context.getString(R.string.video_vueloslateralesconmancuerna));
                break;
            case VUELOS_LATERALES_EN_POLEA:
                ejercicioContent.setTitle(context.getString(R.string.title_vueloslateralesenpolea));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_vueloslateralesenpolea));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_vueloslateralesenpolea));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.vueloslateralesenpolea));
                ejercicioContent.setVideo(context.getString(R.string.video_vueloslateralesenpolea));
                break;
            case VUELOS_FRONTALES_CON_MANCUERNA:
                ejercicioContent.setTitle(context.getString(R.string.title_vuelosfrontalesconmancuerna));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_vuelosfrontalesconmancuerna));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_vuelosfrontalesconmancuerna));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.vuelosfrontalesconmancuerna));
                ejercicioContent.setVideo(context.getString(R.string.video_vuelosfrontalesconmancuerna));
                break;
            case VUELOS_FRONTALES_CON_DISCO:
                ejercicioContent.setTitle(context.getString(R.string.title_vuelosfrontalescondisco));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_vuelosfrontalescondisco));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_vuelosfrontalescondisco));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.vuelosfrontalescondisco));
                ejercicioContent.setVideo(context.getString(R.string.video_vuelosfrontalescondisco));
                break;
            case VUELOS_POSTERIORES_EN_MAQUINA:
                ejercicioContent.setTitle(context.getString(R.string.title_vuelosposterioresenmaquina));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_vuelosposterioresenmaquina));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_vuelosposterioresenmaquina));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.vuelosposterioresenmaquina));
                ejercicioContent.setVideo(context.getString(R.string.video_vuelosposterioresenmaquina));
                break;
            case VUELOS_POSTERIORES_CON_MANCUERNA:
                ejercicioContent.setTitle(context.getString(R.string.title_vuelosposterioresconmancuerna));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_vuelosposterioresconmancuerna));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_vuelosposterioresconmancuerna));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.vuelosposterioresconmancuerna));
                ejercicioContent.setVideo(context.getString(R.string.video_vuelosposterioresconmancuerna));
                break;
            case VUELOS_POSTERIORES_EN_POLEA:
                ejercicioContent.setTitle(context.getString(R.string.title_vuelosposterioresenpolea));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_vuelosposterioresenpolea));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_vuelosposterioresenpolea));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.vuelosposterioresenpolea));
                ejercicioContent.setVideo(context.getString(R.string.video_vuelosposterioresenpolea));
                break;
            case CURL_CON_BARRA_RECTA:
                ejercicioContent.setTitle(context.getString(R.string.title_curlconbarrarecta));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_curlconbarrarecta));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_curlconbarrarecta));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.curlconbarrarecta));
                ejercicioContent.setVideo(context.getString(R.string.video_curlconbarrarecta));
                break;
            case CURL_CON_MANCUERNAS:
                ejercicioContent.setTitle(context.getString(R.string.title_curlconmancuernas));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_curlconmancuernas));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_curlconmancuernas));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.curlconmancuernas));
                ejercicioContent.setVideo(context.getString(R.string.video_curlconmancuernas));
                break;
            case CURL_EN_BANCO_SCOTT_CON_BARRA:
                ejercicioContent.setTitle(context.getString(R.string.title_curlenbancoscottconbarra));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_curlenbancoscottconbarra));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_curlenbancoscottconbarra));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.curlenbancoscottconbarra));
                ejercicioContent.setVideo(context.getString(R.string.video_curlenbancoscottconbarra));
                break;
            case CURL_EN_BANCO_SCOTT_CON_MANCUERNAS:
                ejercicioContent.setTitle(context.getString(R.string.title_curlenbancoscottconmancuernas));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_curlenbancoscottconmancuernas));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_curlenbancoscottconmancuernas));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.curlenbancoscottconmancuernas));
                ejercicioContent.setVideo(context.getString(R.string.video_curlenbancoscottconmancuernas));
                break;
            case CURL_CONCENTRADO:
                ejercicioContent.setTitle(context.getString(R.string.title_curlconcentrado));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_curlconcentrado));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_curlconcentrado));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.curlconcentrado));
                ejercicioContent.setVideo(context.getString(R.string.video_curlconcentrado));
                break;
            case CURL_CON_BARRA_EN_POLEA:
                ejercicioContent.setTitle(context.getString(R.string.title_curlconbarraenpolea));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_curlconbarraenpolea));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_curlconbarraenpolea));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.curlconbarraenpolea));
                ejercicioContent.setVideo(context.getString(R.string.video_curlconbarraenpolea));
                break;
            case CURL_CON_SOGA:
                ejercicioContent.setTitle(context.getString(R.string.title_curlconsoga));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_curlconsoga));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_curlconsoga));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.curlconsoga));
                ejercicioContent.setVideo(context.getString(R.string.video_curlconsoga));
                break;
            case CURL_CONCENTRADO_EN_POLEA:
                ejercicioContent.setTitle(context.getString(R.string.title_curlconcentradoenpolea));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_curlconcentradoenpolea));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_curlconcentradoenpolea));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.curlconcentradoenpolea));
                ejercicioContent.setVideo(context.getString(R.string.video_curlconcentradoenpolea));
                break;
            case EXTENSIONES_EN_POLEA_CON_BARRA:
                ejercicioContent.setTitle(context.getString(R.string.title_extensionesenpoleaconbarra));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_extensionesenpoleaconbarra));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_extensionesenpoleaconbarra));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.extensionesenpoleaconbarra));
                ejercicioContent.setVideo(context.getString(R.string.video_extensionesenpoleaconbarra));
                break;
            case EXTENSIONES_EN_POLEA_CON_SOGA:
                ejercicioContent.setTitle(context.getString(R.string.title_extensionesenpoleaconsoga));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_extensionesenpoleaconsoga));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_extensionesenpoleaconsoga));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.extensionesenpoleaconsoga));
                ejercicioContent.setVideo(context.getString(R.string.video_extensionesenpoleaconsoga));
                break;
            case PRESS_FRANCES_A_DOS_MANOS_CON_MANCUERNAS:
                ejercicioContent.setTitle(context.getString(R.string.title_pressfrancesadosmanosconmancuerna));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressfrancesadosmanosconmancuerna));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressfrancesadosmanosconmancuerna));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressfrancesadosmanosconmancuerna));
                ejercicioContent.setVideo(context.getString(R.string.video_pressfrancesadosmanosconmancuerna));
                break;
            case PRESS_FRANCES_A_UNA_MANO_CON_MANCUERNA:
                ejercicioContent.setTitle(context.getString(R.string.title_pressfrancesaunamanoconmancuerna));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressfrancesaunamanoconmancuerna));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressfrancesaunamanoconmancuerna));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressfrancesaunamanoconmancuerna));
                ejercicioContent.setVideo(context.getString(R.string.video_pressfrancesaunamanoconmancuerna));
                break;
            case PRESS_FRANCES_ACOSTADO_CON_BARRA:
                ejercicioContent.setTitle(context.getString(R.string.title_pressfrancesacostadoconbarra));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressfrancesacostadoconbarra));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressfrancesacostadoconbarra));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressfrancesacostadoconbarra));
                ejercicioContent.setVideo(context.getString(R.string.video_pressfrancesacostadoconbarra));
                break;
            case PRESS_FRANCES_ACOSTADO_CON_MANCUERNAS:
                ejercicioContent.setTitle(context.getString(R.string.title_pressfrancesacostadoconmancuernas));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressfrancesacostadoconmancuernas));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressfrancesacostadoconmancuernas));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressfrancesacostadoconmancuernas));
                ejercicioContent.setVideo(context.getString(R.string.video_pressfrancesacostadoconmancuernas));
                break;
            case PRESS_PLANO_CERRADO:
                ejercicioContent.setTitle(context.getString(R.string.title_pressplanocerrado));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pressplanocerrado));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pressplanocerrado));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pressplanocerrado));
                ejercicioContent.setVideo(context.getString(R.string.video_pressplanocerrado));
                break;
            case SENTADILLAS:
                ejercicioContent.setTitle(context.getString(R.string.title_sentadillas));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_sentadillas));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_sentadillas));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.sentadillas));
                ejercicioContent.setVideo(context.getString(R.string.video_sentadillas));
                break;
            case PESO_MUERTO:
                ejercicioContent.setTitle(context.getString(R.string.title_pesomuerto));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_pesomuerto));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_pesomuerto));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.pesomuerto));
                ejercicioContent.setVideo(context.getString(R.string.video_pesomuerto));
                break;
            case CAMILLA_CUADRICEPS:
                ejercicioContent.setTitle(context.getString(R.string.title_camillacuadriceps));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_amillacuadriceps));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_amillacuadriceps));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.camillacuadriceps));
                ejercicioContent.setVideo(context.getString(R.string.video_camillacuadriceps));
                break;
            case PRENSA:
                ejercicioContent.setTitle(context.getString(R.string.title_prensa));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_prensa));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_prensa));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.prensa));
                ejercicioContent.setVideo(context.getString(R.string.video_prensa));
                break;
            case CAMILLA_DE_ISQUIOTIBIALES:
                ejercicioContent.setTitle(context.getString(R.string.title_camilladeisquiotibiales));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_camilladeisquiotibiales));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_camilladeisquiotibiales));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.camilladeisquiotibiales));
                ejercicioContent.setVideo(context.getString(R.string.video_camilladeisquiotibiales));
                break;
            case SILLON_DE_GLUTEOS:
                ejercicioContent.setTitle(context.getString(R.string.title_sillondegluteos));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_sillondegluteos));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_sillondegluteos));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.sillondegluteos));
                ejercicioContent.setVideo(context.getString(R.string.video_sillondegluteos));
                break;
            case ADUCTORES:
                ejercicioContent.setTitle(context.getString(R.string.title_aductores));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_aductores));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_aductores));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.aductores));
                ejercicioContent.setVideo(context.getString(R.string.video_aductores));
                break;
            case ABDOMINALES_CORTITOS:
                ejercicioContent.setTitle(context.getString(R.string.title_abdominalescortitos));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_abdominalescortitos));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_abdominalescortitos));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.abscortitos));
                ejercicioContent.setVideo(context.getString(R.string.video_abdominalescortitos));
                break;
            case ABDOMINALES_OBLICUOS:
                ejercicioContent.setTitle(context.getString(R.string.title_abdominalesoblicuos));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_abdominalesoblicuos));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_abdominalesoblicuos));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.absoblicuos));
                ejercicioContent.setVideo(context.getString(R.string.video_abdominalesoblicuos));
                break;
            case ABDOMINALES_BOLITA:
                ejercicioContent.setTitle(context.getString(R.string.title_abdominalesbolita));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_abdominalesbolita));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_abdominalesbolita));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.absbolita));
                ejercicioContent.setVideo(context.getString(R.string.video_abdominalesbolita));
                break;
            case ELEVACION_DE_PIERNAS:
                ejercicioContent.setTitle(context.getString(R.string.title_elevaciondepiernas));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_elevaciondepiernas));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_elevaciondepiernas));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.elevaciondepiernas));
                ejercicioContent.setVideo(context.getString(R.string.video_elevaciondepiernas));
                break;
            case RUEDA:
                ejercicioContent.setTitle(context.getString(R.string.title_rueda));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_rueda));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_rueda));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.rueda));
                ejercicioContent.setVideo(context.getString(R.string.video_rueda));
                break;
            case PLANCHA_FRONTAL:
                ejercicioContent.setTitle(context.getString(R.string.title_planchafrontal));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_planchafrontal));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_planchafrontal));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.planchafrontal));
                ejercicioContent.setVideo(context.getString(R.string.video_planchafrontal));
                break;
            case PLANCHA_LATERAL:
                ejercicioContent.setTitle(context.getString(R.string.title_planchalateral));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_planchalateral));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_planchalateral));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.planchalateral));
                ejercicioContent.setVideo(context.getString(R.string.video_planchalateral));
                break;
            case ESPINALES_ALTERNADOS:
                ejercicioContent.setTitle(context.getString(R.string.title_espinalesalternados));
                ejercicioContent.setDescripcion(context.getString(R.string.descripcion_espinalesalternados));
                ejercicioContent.setEjecucion(context.getString(R.string.ejecucion_espinalesalternados));
                ejercicioContent.setImagen(BitmapFactory.decodeResource(context.getResources(),R.drawable.espinalesalternados));
                ejercicioContent.setVideo(context.getString(R.string.video_espinalesalternados));
                break;
        }
        return ejercicioContent;
    }

    public static List<String> getListaEjercicios() {
        return Arrays.asList(PRESS_PLANO_CON_BARRA, PRESS_PLANO_CON_MANCUERNA,PRESS_INCLINADO_CON_BARRA, PRESS_INCLINADO_CON_MANCUERNA,PRESS_DECLINADO_CON_BARRA, PRESS_DECLINADO_CON_MANCUERNA, FONDOS_EN_PARALELAS, FLEXIONES, PULLOVER_CON_MANCUERNA, CRUCES_DE_POLEAS,
                PECKDECK, APERTURAS_PLANAS,APERTURAS_INCLINADAS, DORSALERA_AL_PECHO_O_TRASNUCA,REMO_CON_BARRA_PARADO,REMO_CON_BARRA_EN_BANCO,REMO_CON_MANCUERNA,DOMINADAS, CHINUPS, REMO_HAMMER, REMO_MEDIO, PULLOVER_EN_POLEA,
                PRESS_MILITAR, PRESS_TRAS_NUCA, PRESS_CON_MANCUERNAS, VUELOS_LATERALES_CON_MANCUERNA, VUELOS_LATERALES_EN_POLEA, VUELOS_FRONTALES_CON_MANCUERNA, VUELOS_FRONTALES_CON_DISCO, VUELOS_POSTERIORES_EN_MAQUINA, VUELOS_POSTERIORES_CON_MANCUERNA, VUELOS_POSTERIORES_EN_POLEA,
                CURL_CON_BARRA_RECTA, CURL_CON_MANCUERNAS, CURL_EN_BANCO_SCOTT_CON_BARRA, CURL_EN_BANCO_SCOTT_CON_MANCUERNAS, CURL_CONCENTRADO, CURL_CON_BARRA_EN_POLEA, CURL_CON_SOGA, CURL_CONCENTRADO_EN_POLEA, EXTENSIONES_EN_POLEA_CON_BARRA, EXTENSIONES_EN_POLEA_CON_SOGA, PRESS_FRANCES_A_DOS_MANOS_CON_MANCUERNAS,
                PRESS_FRANCES_A_UNA_MANO_CON_MANCUERNA, PRESS_FRANCES_ACOSTADO_CON_BARRA, PRESS_FRANCES_ACOSTADO_CON_MANCUERNAS, PRESS_PLANO_CERRADO, SENTADILLAS, PESO_MUERTO, CAMILLA_CUADRICEPS, PRENSA, CAMILLA_DE_ISQUIOTIBIALES, SILLON_DE_GLUTEOS,
                ADUCTORES, ABDOMINALES_CORTITOS, ABDOMINALES_OBLICUOS, ABDOMINALES_BOLITA, ELEVACION_DE_PIERNAS,  RUEDA, PLANCHA_FRONTAL, PLANCHA_LATERAL, ESPINALES_ALTERNADOS);
    }


}



