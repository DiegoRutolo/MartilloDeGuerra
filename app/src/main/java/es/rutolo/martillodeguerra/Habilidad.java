package es.rutolo.martillodeguerra;

import java.util.ArrayList;

public class Habilidad {
    private NomHab nombre;
    private boolean avanzada;
    private Stat caracteristica;
    private String descripcion;
    private ArrayList<Talento> talentos;
    private String nota;

    public Habilidad(NomHab nombre){
        this.nombre = nombre;
        talentos = new ArrayList<>();
        switch (nombre){
            case ACTUAR:
                avanzada=true;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.CONTORSIONISTA));
                talentos.add(new Diccionario().getTalentos().get(NomTal.IMITADOR));
                nota="";
                break;
            case ADIESTRAR_ANIMALES:
                avanzada=true;
                caracteristica= Stat.Em;
                descripcion="";
                nota="";
                break;
            case BUSCAR:
                avanzada=false;
                caracteristica=Stat.I;
                descripcion="";
                nota="";
                break;
            case CARISMA:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.CALLEJEO));
                talentos.add(new Diccionario().getTalentos().get(NomTal.DON_GENTES));
                talentos.add(new Diccionario().getTalentos().get(NomTal.ETIQUETA));
                talentos.add(new Diccionario().getTalentos().get(NomTal.INTRIGANTE));
                talentos.add(new Diccionario().getTalentos().get(NomTal.ORADOR_EXPERTO));
                nota="";
                break;
            case CARISMA_ANIMAL:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                nota="";
                break;
            case CANALIZACION:
                avanzada=true;
                caracteristica=Stat.V;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.AFINIDAD_AETHYR));
                nota="";
                break;
            case CHARLATANERIA:
                avanzada=true;
                caracteristica=Stat.Em;
                descripcion="";
                nota="";
                break;
            case CODIGO_SECRETO:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                nota="";    // TODO Completar este "Varios": batidor, templario, ladron, montaraz
                break;
            case CONDUCIR:
                avanzada=false;
                caracteristica=Stat.F;
                descripcion="";
                nota="";
                break;
            case CONSUMIR_ALCOHOL:
                avanzada=false;
                caracteristica=Stat.R;
                descripcion="";
                nota="";
                break;
            case COTILLEO:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.CALLEJEO));
                talentos.add(new Diccionario().getTalentos().get(NomTal.ETIQUETA));
                nota="";
                break;
            case CRIAR_ANIMALES:
                avanzada=false;
                caracteristica=Stat.I;
                descripcion="";
                nota="";
                break;
            case DISFRAZ:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.IMITADOR));
                nota="";
                break;
            case ESCALAR:
                avanzada=false;
                caracteristica=Stat.F;
                descripcion="";
                nota="";
                break;
            case ESCONDERSE:
                avanzada=false;
                caracteristica=Stat.Ag;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.ERRANTE));
                talentos.add(new Diccionario().getTalentos().get(NomTal.GATO_CALLEJERO));
                talentos.add(new Diccionario().getTalentos().get(NomTal.PERICIA_SUBTERRANEA));
                nota="";
                break;
            case ESQUIVAR:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                nota="";
                break;
            case FORZAR_CERRADURAS:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.EXPERTO_TRAMPAS));
                nota="";
                break;
            case HABLAR_IDIOMA:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.IMITADOR));
                talentos.add(new Diccionario().getTalentos().get(NomTal.LINGUISTICA));
                talentos.add(new Diccionario().getTalentos().get(NomTal.VIAJERO_CURTIDO));
                nota="";        //TODO Varios: breton, eltharin, estaliano, halfling, khazalid, kisleviano, nordico, reikspiel, tileano, clasico, oscura, goblin, grumbarth
                break;
            case HIPNOTISMO:
                avanzada=true;
                caracteristica=Stat.V;
                descripcion="";
                nota="";
                break;
            case INTIMIDAR:
                avanzada=false;
                caracteristica=Stat.F;
                descripcion="Bajo algunas circunstancias se puede tirar por Empatia";
                talentos.add(new Diccionario().getTalentos().get(NomTal.AMENAZADOR));
                nota="";
                break;
            case JUGAR:
                avanzada=false;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.GENIO_ARITMETICO));
                nota="";
                break;
            case LEER_ESCRIBIR:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.LINGUISTICA));
                nota="";
                break;
            case LEER_LABIOS:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.VISTA_EXCELENTE));
                nota="";
                break;
            case LENGUA_ARCANA:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                nota="";        // TODO Varios: Magia, demoniaca, elfico arcano
                break;
            case LENGUA_SECRETA:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                nota="";        //TODO Varios: militar, ladrones, montaraz
                break;
            case MANDO:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                nota="";
                break;
            case MONTAR:
                avanzada=false;
                caracteristica=Stat.Ag;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.EQUITACION_ACROBATICA));
                nota="";
                break;
            case MOVIMIENTO_SILENCIOSO:
                avanzada=false;
                caracteristica=Stat.Ag;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.GATO_CALLEJERO));
                talentos.add(new Diccionario().getTalentos().get(NomTal.ERRANTE));
                talentos.add(new Diccionario().getTalentos().get(NomTal.PERICIA_SUBTERRANEA));
                nota="";
                break;
            case NADAR:
                avanzada=false;
                caracteristica=Stat.F;
                descripcion="";
                nota="";
                break;
            case NAVEGAR:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                nota="";
                break;
            case OFICIO:
                avanzada=true;
                caracteristica=Stat.F;  // Varía con el oficio -_- Le pongo fuerza porque somos enanos
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.ARTESANIA_ENANA));
                talentos.add(new Diccionario().getTalentos().get(NomTal.DOTES_ARTISTICAS));
                nota="";
                break;
            case ORIENTACION:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.GENIO_ARITMETICO));
                talentos.add(new Diccionario().getTalentos().get(NomTal.ORIENTACION));
                nota="";
                break;
            case PERCEPCION:
                avanzada=false;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.EXPERTO_TRAMPAS));
                talentos.add(new Diccionario().getTalentos().get(NomTal.GENIO_ARITMETICO));
                talentos.add(new Diccionario().getTalentos().get(NomTal.OIDO_AGUZADO));
                talentos.add(new Diccionario().getTalentos().get(NomTal.VISTA_EXCELENTE));
                nota="";
                break;
            case PONER_TRAMPAS:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                nota="";
                break;
            case PREPARAR_VENENOS:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                nota="";
                break;
            case PRESTIDIGITACION:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                nota="";
                break;
            case RASTREAR:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                nota="";
                break;
            case REGATEAR:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.NEGOCIADOR));
                nota="";
                break;
            case REMAR:
                avanzada=false;
                caracteristica=Stat.F;
                descripcion="";
                nota="";
                break;
            case SABIDURIA_ACADEMICA:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                nota="";        // TODO Varios: Arte, astronomia, ciencias, demonologia, estrategia, filosofia, genealogia, historia, ingenieria, leyes, magia, nigromancia, runas, teología
                break;
            case SABIDURIA_POPULAR:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.VIAJERO_CURTIDO));
                nota="";        // TODO Varios: bretonia,elfos, enanos, estalia, halflings, imperio, kislev, norsca, ogros, reinos fronterizos, tierras desoladas, tilea
                break;
            case SANAR:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.CIRUGIA));
                nota="";
                break;
            case SEGUIMIENTO:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                nota="";
                break;
            case SENTIR_MAGIA:
                avanzada=true;
                caracteristica=Stat.V;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.AFINIDAD_AETHYR));
                nota="";
                break;
            case SUPERVIVENCIA:
                avanzada=false;
                caracteristica=Stat.I;
                descripcion="";
                nota="";
                break;
            case TASAR:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.DOTES_ARTISTICAS));
                talentos.add(new Diccionario().getTalentos().get(NomTal.NEGOCIADOR));
                nota="";
                break;
            case TORTURA:
                avanzada=true;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(new Diccionario().getTalentos().get(NomTal.AMENAZADOR));
                nota="";
                break;
            case VENTRILOQUIARA:
                avanzada=true;
                caracteristica=Stat.Em;
                descripcion="";
                nota="";
                break;
        }

    }
}

