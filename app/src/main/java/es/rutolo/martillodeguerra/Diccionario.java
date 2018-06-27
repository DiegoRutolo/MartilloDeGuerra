package es.rutolo.martillodeguerra;

import java.util.HashMap;

//Implementa el patrón de diseño Singleton
public class Diccionario {
    private static Diccionario instancia = null;

    private HashMap<NomTal,Talento> talentos;
    private HashMap<NomHab,Habilidad> habilidades;
    private HashMap<NomProf,Profesion> profesiones;

    public Diccionario(){
        talentos = new HashMap<>();
        talentos.put(NomTal.A_CORRER,new Talento(NomTal.A_CORRER));
        talentos.put(NomTal.AFINIDAD_AETHYR,new Talento(NomTal.AFINIDAD_AETHYR));
        talentos.put(NomTal.AMBIDIESTRO,new Talento(NomTal.AMBIDIESTRO));
        talentos.put(NomTal.AMENAZADOR,new Talento(NomTal.AMENAZADOR));
        talentos.put(NomTal.ARMAS_NATURALES,new Talento(NomTal.ARMAS_NATURALES));
        talentos.put(NomTal.ARTESANIA_ENANA,new Talento(NomTal.ARTESANIA_ENANA));
        talentos.put(NomTal.ATERRADOR,new Talento(NomTal.ATERRADOR));
        talentos.put(NomTal.AUDAZ,new Talento(NomTal.AUDAZ));
        talentos.put(NomTal.BRIOSO,new Talento(NomTal.BRIOSO));
        talentos.put(NomTal.CALLEJEO,new Talento(NomTal.CALLEJEO));
        talentos.put(NomTal.CERTERO,new Talento(NomTal.CERTERO));
        talentos.put(NomTal.CIRUGIA,new Talento(NomTal.CIRUGIA));
        talentos.put(NomTal.CONTORSIONISTA,new Talento(NomTal.CONTORSIONISTA));
        talentos.put(NomTal.CORTES,new Talento(NomTal.CORTES));
        talentos.put(NomTal.DESARMAR,new Talento(NomTal.DESARMAR));
        talentos.put(NomTal.DESENVAINADO_RAPIDO,new Talento(NomTal.DESENVAINADO_RAPIDO));
        talentos.put(NomTal.DISPARO_CERTERO,new Talento(NomTal.DISPARO_CERTERO));
        talentos.put(NomTal.DISPARO_INFALIBLE,new Talento(NomTal.DISPARO_INFALIBLE));
        talentos.put(NomTal.DON_GENTES,new Talento(NomTal.DON_GENTES));
        talentos.put(NomTal.DOTES_ARTISTICAS,new Talento(NomTal.DOTES_ARTISTICAS));
        talentos.put(NomTal.EQUITACION_ACROBATICA,new Talento(NomTal.EQUITACION_ACROBATICA));
        talentos.put(NomTal.ERRANTE,new Talento(NomTal.ERRANTE));
        talentos.put(NomTal.ESPECIALISTA_ARMAS,new Talento(NomTal.ESPECIALISTA_ARMAS));
        talentos.put(NomTal.ETIQUETA,new Talento(NomTal.ETIQUETA));
        talentos.put(NomTal.EXPERTO_TRAMPAS,new Talento(NomTal.EXPERTO_TRAMPAS));
        talentos.put(NomTal.FRENESI,new Talento(NomTal.FRENESI));
        talentos.put(NomTal.GATO_CALLEJERO,new Talento(NomTal.GATO_CALLEJERO));
        talentos.put(NomTal.GENIO_ARITMETICO,new Talento(NomTal.GENIO_ARITMETICO));
        talentos.put(NomTal.GOLPE_CONMOCIONADOR,new Talento(NomTal.GOLPE_CONMOCIONADOR));
        talentos.put(NomTal.GOLPE_LETAL,new Talento(NomTal.GOLPE_LETAL));
        talentos.put(NomTal.GOLPE_PODEROSO,new Talento(NomTal.GOLPE_PODEROSO));
        talentos.put(NomTal.GUERRERO_NATO,new Talento(NomTal.GUERRERO_NATO));
        talentos.put(NomTal.HECHIZOS_ARMADURA,new Talento(NomTal.HECHIZOS_ARMADURA));
        talentos.put(NomTal.IMITADOR,new Talento(NomTal.IMITADOR));
        talentos.put(NomTal.IMPERTURBABLE,new Talento(NomTal.IMPERTURBABLE));
        talentos.put(NomTal.INQUIETANTE,new Talento(NomTal.INQUIETANTE));
        talentos.put(NomTal.INTELECTUAL,new Talento(NomTal.INTELECTUAL));
        talentos.put(NomTal.INTREPIDO,new Talento(NomTal.INTREPIDO));
        talentos.put(NomTal.INTRIGANTE,new Talento(NomTal.INTRIGANTE));
        talentos.put(NomTal.LEVITACION,new Talento(NomTal.LEVITACION));
        talentos.put(NomTal.LINGUISTICA,new Talento(NomTal.LINGUISTICA));
        talentos.put(NomTal.LUCHA,new Talento(NomTal.LUCHA));
        talentos.put(NomTal.MAGIA_MENOR,new Talento(NomTal.MAGIA_MENOR));
        talentos.put(NomTal.MAGIA_OSCURA,new Talento(NomTal.MAGIA_OSCURA));
        talentos.put(NomTal.MAGIA_PUERIL,new Talento(NomTal.MAGIA_PUERIL));
        talentos.put(NomTal.MAGIA_VULGAR,new Talento(NomTal.MAGIA_VULGAR));
        talentos.put(NomTal.MANOS_RAPIDAS,new Talento(NomTal.MANOS_RAPIDAS));
        talentos.put(NomTal.MEDITACION,new Talento(NomTal.MEDITACION));
        talentos.put(NomTal.MUY_FUERTE,new Talento(NomTal.MUY_FUERTE));
        talentos.put(NomTal.MUY_RESISTENTE,new Talento(NomTal.MUY_RESISTENTE));
        talentos.put(NomTal.NEGOCIADOR,new Talento(NomTal.NEGOCIADOR));
        talentos.put(NomTal.NO_MUERTO,new Talento(NomTal.NO_MUERTO));
        talentos.put(NomTal.ODIO_VISCERAL,new Talento(NomTal.ODIO_VISCERAL));
        talentos.put(NomTal.OIDO_AGUZADO,new Talento(NomTal.OIDO_AGUZADO));
        talentos.put(NomTal.ORADOR_EXPERTO,new Talento(NomTal.ORADOR_EXPERTO));
        talentos.put(NomTal.ORIENTACION,new Talento(NomTal.ORIENTACION));
        talentos.put(NomTal.PARADA_VELOZ,new Talento(NomTal.PARADA_VELOZ));
        talentos.put(NomTal.PELEA_CALLEJERA,new Talento(NomTal.PELEA_CALLEJERA));
        talentos.put(NomTal.PERICIA_SUBTERRANEA,new Talento(NomTal.PERICIA_SUBTERRANEA));
        talentos.put(NomTal.PIES_LIGEROS,new Talento(NomTal.PIES_LIGEROS));
        talentos.put(NomTal.PISTOLERO_EXPERTO,new Talento(NomTal.PISTOLERO_EXPERTO));
        talentos.put(NomTal.PROYECTIL_INFALIBLE,new Talento(NomTal.PROYECTIL_INFALIBLE));
        talentos.put(NomTal.PUNTERIA,new Talento(NomTal.PUNTERIA));
        talentos.put(NomTal.RECARGA_RAPIDA,new Talento(NomTal.RECARGA_RAPIDA));
        talentos.put(NomTal.RECIO,new Talento(NomTal.RECIO));
        talentos.put(NomTal.REFLEJOS_RAPIDOS,new Talento(NomTal.REFLEJOS_RAPIDOS));
        talentos.put(NomTal.RESISTENCIA_CAOS,new Talento(NomTal.RESISTENCIA_CAOS));
        talentos.put(NomTal.RESISTENCIA_ENFERMEDADES,new Talento(NomTal.RESISTENCIA_ENFERMEDADES));
        talentos.put(NomTal.RESISTENCIA_MAGIA,new Talento(NomTal.RESISTENCIA_MAGIA));
        talentos.put(NomTal.RESISTENCIA_VENENOS,new Talento(NomTal.RESISTENCIA_VENENOS));
        talentos.put(NomTal.ROBUSTO,new Talento(NomTal.ROBUSTO));
        talentos.put(NomTal.SABER_ARCANO,new Talento(NomTal.SABER_ARCANO));
        talentos.put(NomTal.SABER_DIVINO,new Talento(NomTal.SABER_DIVINO));
        talentos.put(NomTal.SABER_OSCURO,new Talento(NomTal.SABER_OSCURO));
        talentos.put(NomTal.SANGRE_FRIA,new Talento(NomTal.SANGRE_FRIA));
        talentos.put(NomTal.SENTIDOS_DESARROLLADOS,new Talento(NomTal.SENTIDOS_DESARROLLADOS));
        talentos.put(NomTal.SEXTO_SENTIDO,new Talento(NomTal.SEXTO_SENTIDO));
        talentos.put(NomTal.SUERTE,new Talento(NomTal.SUERTE));
        talentos.put(NomTal.TEMIBLE,new Talento(NomTal.TEMIBLE));
        talentos.put(NomTal.VIAJERO_CURTIDO,new Talento(NomTal.VIAJERO_CURTIDO));
        talentos.put(NomTal.VISION_NOCTURNA,new Talento(NomTal.VISION_NOCTURNA));
        talentos.put(NomTal.VISTA_EXCELENTE,new Talento(NomTal.VISTA_EXCELENTE));
        talentos.put(NomTal.VOLADOR,new Talento(NomTal.VOLADOR));

        habilidades = new HashMap<>();

        profesiones = new HashMap<>();
    }

    public static Diccionario getInstancia(){
        if(instancia == null){
            instancia = new Diccionario();
        }
        return instancia;
    }

    public HashMap<NomTal, Talento> getTalentos() {
        return talentos;
    }
}

