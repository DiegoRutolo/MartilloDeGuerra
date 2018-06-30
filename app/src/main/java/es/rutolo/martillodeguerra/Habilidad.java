package es.rutolo.martillodeguerra;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Habilidad {
    private NomHab nombre;
    private boolean avanzada;
    private Stat caracteristica;
    private String descripcion;
    private ArrayList<NomTal> talentos;

    public Habilidad(NomHab nombre){
        this.nombre = nombre;
        talentos = new ArrayList<>();
        switch (nombre){
            case ACTUAR:
                avanzada=true;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(NomTal.CONTORSIONISTA);
                talentos.add(NomTal.IMITADOR);
                break;
            case ADIESTRAR_ANIMALES:
                avanzada=true;
                caracteristica= Stat.Em;
                descripcion="";
                break;
            case BUSCAR:
                avanzada=false;
                caracteristica=Stat.I;
                descripcion="";
                
                break;
            case CARISMA:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(NomTal.CALLEJEO);
                talentos.add(NomTal.DON_GENTES);
                talentos.add(NomTal.ETIQUETA);
                talentos.add(NomTal.INTRIGANTE);
                talentos.add(NomTal.ORADOR_EXPERTO);
                
                break;
            case CARISMA_ANIMAL:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                
                break;
            case CANALIZACION:
                avanzada=true;
                caracteristica=Stat.V;
                descripcion="";
                talentos.add(NomTal.AFINIDAD_AETHYR);
                
                break;
            case CHARLATANERIA:
                avanzada=true;
                caracteristica=Stat.Em;
                descripcion="";
                
                break;
            case CODIGO_SECRETO:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                    // TODO Varios: batidor, templario, ladron, montaraz
                break;
            case CONDUCIR:
                avanzada=false;
                caracteristica=Stat.F;
                descripcion="";
                break;
            case CONSUMIR_ALCOHOL:
                avanzada=false;
                caracteristica=Stat.R;
                descripcion="";
                break;
            case COTILLEO:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(NomTal.CALLEJEO);
                talentos.add(NomTal.ETIQUETA);
                
                break;
            case CRIAR_ANIMALES:
                avanzada=false;
                caracteristica=Stat.I;
                descripcion="";
                break;
            case DISFRAZ:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(NomTal.IMITADOR);
                break;
            case ESCALAR:
                avanzada=false;
                caracteristica=Stat.F;
                descripcion="";
                break;
            case ESCONDERSE:
                avanzada=false;
                caracteristica=Stat.Ag;
                descripcion="";
                talentos.add(NomTal.ERRANTE);
                talentos.add(NomTal.GATO_CALLEJERO);
                talentos.add(NomTal.PERICIA_SUBTERRANEA);
                break;
            case ESQUIVAR:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                
                break;
            case FORZAR_CERRADURAS:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                talentos.add(NomTal.EXPERTO_TRAMPAS);
                
                break;
            case HABLAR_IDIOMA:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(NomTal.IMITADOR);
                talentos.add(NomTal.LINGUISTICA);
                talentos.add(NomTal.VIAJERO_CURTIDO);
                        //TODO Varios: breton, eltharin, estaliano, halfling, khazalid, kisleviano, nordico, reikspiel, tileano, clasico, oscura, goblin, grumbarth
                break;
            case HIPNOTISMO:
                avanzada=true;
                caracteristica=Stat.V;
                descripcion="";
                
                break;
            case INTIMIDAR:
                avanzada=false;
                caracteristica=Stat.F;
                descripcion="Bajo algunas circunstancias se puede tirar por Empatia";
                talentos.add(NomTal.AMENAZADOR);
                
                break;
            case JUGAR:
                avanzada=false;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(NomTal.GENIO_ARITMETICO);
                
                break;
            case LEER_ESCRIBIR:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(NomTal.LINGUISTICA);
                
                break;
            case LEER_LABIOS:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(NomTal.VISTA_EXCELENTE);
                
                break;
            case LENGUA_ARCANA:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                        // TODO Varios: Magia, demoniaca, elfico arcano
                break;
            case LENGUA_SECRETA:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                        //TODO Varios: militar, ladrones, montaraz
                break;
            case MANDO:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                
                break;
            case MONTAR:
                avanzada=false;
                caracteristica=Stat.Ag;
                descripcion="";
                talentos.add(NomTal.EQUITACION_ACROBATICA);
                
                break;
            case MOVIMIENTO_SILENCIOSO:
                avanzada=false;
                caracteristica=Stat.Ag;
                descripcion="";
                talentos.add(NomTal.GATO_CALLEJERO);
                talentos.add(NomTal.ERRANTE);
                talentos.add(NomTal.PERICIA_SUBTERRANEA);
                
                break;
            case NADAR:
                avanzada=false;
                caracteristica=Stat.F;
                descripcion="";
                
                break;
            case NAVEGAR:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                
                break;
            case OFICIO:
                avanzada=true;
                caracteristica=Stat.F;  // Varía con el oficio -_- Le pongo fuerza porque somos enanos
                descripcion="";
                talentos.add(NomTal.ARTESANIA_ENANA);
                talentos.add(NomTal.DOTES_ARTISTICAS);
                
                break;
            case ORIENTACION:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(NomTal.GENIO_ARITMETICO);
                talentos.add(NomTal.ORIENTACION);
                
                break;
            case PERCEPCION:
                avanzada=false;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(NomTal.EXPERTO_TRAMPAS);
                talentos.add(NomTal.GENIO_ARITMETICO);
                talentos.add(NomTal.OIDO_AGUZADO);
                talentos.add(NomTal.VISTA_EXCELENTE);
                
                break;
            case PONER_TRAMPAS:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                
                break;
            case PREPARAR_VENENOS:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                
                break;
            case PRESTIDIGITACION:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                
                break;
            case RASTREAR:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                
                break;
            case REGATEAR:
                avanzada=false;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(NomTal.NEGOCIADOR);
                
                break;
            case REMAR:
                avanzada=false;
                caracteristica=Stat.F;
                descripcion="";
                
                break;
            case SABIDURIA_ACADEMICA:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                        // TODO Varios: Arte, astronomia, ciencias, demonologia, estrategia, filosofia, genealogia, historia, ingenieria, leyes, magia, nigromancia, runas, teología
                break;
            case SABIDURIA_POPULAR:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(NomTal.VIAJERO_CURTIDO);
                        // TODO Varios: bretonia,elfos, enanos, estalia, halflings, imperio, kislev, norsca, ogros, reinos fronterizos, tierras desoladas, tilea
                break;
            case SANAR:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(NomTal.CIRUGIA);
                
                break;
            case SEGUIMIENTO:
                avanzada=true;
                caracteristica=Stat.Ag;
                descripcion="";
                
                break;
            case SENTIR_MAGIA:
                avanzada=true;
                caracteristica=Stat.V;
                descripcion="";
                talentos.add(NomTal.AFINIDAD_AETHYR);
                
                break;
            case SUPERVIVENCIA:
                avanzada=false;
                caracteristica=Stat.I;
                descripcion="";
                
                break;
            case TASAR:
                avanzada=true;
                caracteristica=Stat.I;
                descripcion="";
                talentos.add(NomTal.DOTES_ARTISTICAS);
                talentos.add(NomTal.NEGOCIADOR);
                
                break;
            case TORTURA:
                avanzada=true;
                caracteristica=Stat.Em;
                descripcion="";
                talentos.add(NomTal.AMENAZADOR);
                
                break;
            case VENTRILOQUIA:
                avanzada=true;
                caracteristica=Stat.Em;
                descripcion="";
                
                break;
        }

    }

    public NomHab getNombre() {
        return nombre;
    }

    public boolean isAvanzada() {
        return avanzada;
    }

    public Stat getCaracteristica() {
        return caracteristica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<NomTal> getTalentos() {
        return talentos;
    }
}

