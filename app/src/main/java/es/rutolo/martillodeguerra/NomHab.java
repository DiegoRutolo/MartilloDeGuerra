package es.rutolo.martillodeguerra;

public enum NomHab {
    ACTUAR("Actuar (Varios)"),
    ADIESTRAR_ANIMALES("Adiestrar Animales"),
    BUSCAR("Buscar"),
    CARISMA("Carisma"),
    CARISMA_ANIMAL("Carisma Animal"),
    CANALIZACION("Canalización"),
    CHARLATANERIA("Charlatanería"),
    CODIGO_SECRETO("Codigo Secreto(Varios)"),
    CONDUCIR("Conducir"),
    CONSUMIR_ALCOHOL("Consumir Alcohol"),
    COTILLEO("Cotilleo"),
    CRIAR_ANIMALES("Criar Animales"),
    DISFRAZ("Disfraz"),
    ESCALAR("Escalar"),
    ESCONDERSE("Esconderse"),
    ESQUIVAR("Esquivar"),
    FORZAR_CERRADURAS("Forzar Cerraduras"),
    HABLAR_IDIOMA("Hablar Idioma(Varios)"),
    HIPNOTISMO("Hipnotismo"),
    INTIMIDAR("Intimidar"),
    JUGAR("Jugar"),
    LEER_ESCRIBIR("Leer/Escribir"),
    LEER_LABIOS("Leer Labios"),
    LENGUA_ARCANA("Lengua Arcana(Varios)"),
    LENGUA_SECRETA("Lengua Secreta(Varios)"),
    MANDO("Mando"),
    MONTAR("Montar"),
    MOVIMIENTO_SILENCIOSO("Movimiento Silencioso"),
    NADAR("Nadar"),
    NAVEGAR("Navegar"),
    OFICIO("Oficio"),
    ORIENTACION("Orientación"),
    PERCEPCION("Percepción"),
    PONER_TRAMPAS("Poner Trampas"),
    PREPARAR_VENENOS("Preparar Venenos"),
    PRESTIDIGITACION("Prestidigitación"),
    RASTREAR("Rastrear"),
    REGATEAR("Regatear"),
    REMAR("Remar"),
    SABIDURIA_ACADEMICA("Sabiduría Académica(Varios)"),
    SABIDURIA_POPULAR("Sabiduría Popular(Varios)"),
    SANAR("Sanar"),
    SEGUIMIENTO("Seguimiento"),
    SENTIR_MAGIA("Sentir Magia"),
    SUPERVIVENCIA("Supervivencia"),
    TASAR("Tasar"),
    TORTURA("Tortura"),
    VENTRILOQUIA("Ventriloquia");

    private String nombreHabilidad;

    NomHab(String nombre) {
        nombreHabilidad = nombre;
    }

    @Override
    public String toString() {
        return nombreHabilidad;
    }

    public static NomHab getNombre(String texto) {
        NomHab valor = null;
        for (NomHab i : NomHab.values()) {
            if (i.toString().equals(texto)) {
                valor = i;
            }
        }
        return valor;
    }
}

