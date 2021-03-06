package es.rutolo.martillodeguerra;

public enum NomTal {
    A_CORRER("¡A Correr!"),
    AFINIDAD_AETHYR("Afinidad con el Aethyr"),
    AMBIDIESTRO("Ambidiestro"),
    AMENAZADOR("Amenazador"),
    ARMAS_NATURALES("Armas Naturales"),
    ARTESANIA_ENANA("Artesanía Enana"),
    ATERRADOR("Aterrador"),
    AUDAZ("Audaz"),
    BRIOSO("Brioso"),
    CALLEJEO("Callejeo"),
    CERTERO("Certero"),
    CIRUGIA("Cirugía"),
    CONTORSIONISTA("Contorsionista"),
    CORTES("Cortés"),
    DESARMAR("Desarmar"),
    DESENVAINADO_RAPIDO("Desenvainado Rápido"),
    DISPARO_CERTERO("Disparo Certero"),
    DISPARO_INFALIBLE("Disparo Infalible"),
    DON_GENTES("Don de Gentes"),
    DOTES_ARTISTICAS("Dotes Artísticas"),
    EQUITACION_ACROBATICA("Equitación Acrobática"),
    ERRANTE("Errante"),
    ESPECIALISTA_ARMAS("Especialista en Armas(Varios)"),
    ETIQUETA("Etiqueta"),
    EXPERTO_TRAMPAS("Experto en Trampas"),
    FRENESI("Frenesí"),
    GATO_CALLEJERO("Gato Callejero"),
    GENIO_ARITMETICO("Genio Aritmético"),
    GOLPE_CONMOCIONADOR("Golpe Conmocionador"),
    GOLPE_LETAL("Golpe Letal"),
    GOLPE_PODEROSO("Golpe Poderoso"),
    GUERRERO_NATO("Guerrero Nato"),
    HECHIZOS_ARMADURA("Hechizos con Armadura"),
    IMITADOR("Imitador"),
    IMPERTURBABLE("Imperturbable"),
    INQUIETANTE("Inquietante"),
    INTELECTUAL("Intelectual"),
    INTREPIDO("Intrépido"),
    INTRIGANTE("Intrigante"),
    LEVITACION("Levitación"),
    LINGUISTICA("Lingüística"),
    LUCHA("Lucha"),
    MAGIA_MENOR("Magia Menor"),
    MAGIA_OSCURA("Magia Oscura"),
    MAGIA_PUERIL("Magia Pueril"),
    MAGIA_VULGAR("Magia Vulgar"),
    MANOS_RAPIDAS("Manos Rápidas"),
    MEDITACION("Meditación"),
    MUY_FUERTE("Muy Fuerte"),
    MUY_RESISTENTE("Muy Resistente"),
    NEGOCIADOR("Negociador"),
    NO_MUERTO("No Muerto"),
    ODIO_VISCERAL("Odio Visceral"),
    OIDO_AGUZADO("Oído Agudizado"),
    ORADOR_EXPERTO("Orador Experto"),
    ORIENTACION("Orientación"),
    PARADA_VELOZ("Parada Veloz"),
    PELEA_CALLEJERA("Pelea Callejera"),
    PERICIA_SUBTERRANEA("Pericia Subterránea"),
    PIES_LIGEROS("Pies Ligeros"),
    PISTOLERO_EXPERTO("Pistolero Experto"),
    PROYECTIL_INFALIBLE("Proyectil Infalible"),
    PUNTERIA("Puntería"),
    RECARGA_RAPIDA("Recarga Rápida"),
    RECIO("Recio"),
    REFLEJOS_RAPIDOS("Reflejos Rápidos"),
    RESISTENCIA_CAOS("Resistencia al Caos"),
    RESISTENCIA_ENFERMEDADES("Resistencia a Enfermedades"),
    RESISTENCIA_MAGIA("Resistencia a la Magia"),
    RESISTENCIA_VENENOS("Resistencia a Venenos"),
    ROBUSTO("Robusto"),
    SABER_ARCANO("Saber Arcano"),
    SABER_DIVINO("Saber Divino"),
    SABER_OSCURO("Saber Oscuro"),
    SANGRE_FRIA("Sangre Fría"),
    SENTIDOS_DESARROLLADOS("Sentidos Desarrollados"),
    SEXTO_SENTIDO("Sexto Sentido"),
    SUERTE("Suerte"),
    TEMIBLE("Temible"),
    VIAJERO_CURTIDO("Viajero Curtido"),
    VISION_NOCTURNA("Visión Nocturna"),
    VISTA_EXCELENTE("Vista Excelente"),
    VOLADOR("Volador");

    private String nombreTalento;

    NomTal(String nom) {
        nombreTalento = nom;
    }

    @Override
    public String toString() {
        return nombreTalento;
    }

    public static NomTal getNombre(String texto) {
        NomTal valor = null;
        for (NomTal i : NomTal.values()) {
            if (i.toString().equals(texto)) {
                valor = i;
            }
        }
        return valor;
    }
}

