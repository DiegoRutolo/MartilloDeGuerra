package es.rutolo.martillodeguerra;

import android.os.Parcel;
import android.os.Parcelable;

public class Talento {
    private NomTal nombre;
    private String descripcion;

    public Talento(NomTal nombre){
        this.nombre = nombre;
        switch (this.nombre){
            case A_CORRER:
                descripcion="Cuando tu vida está en peligro puedes alcanzar velocidades de vértigo. Cada vez que huyas de un combate o de cualquier otra amenaza funesta, recibes un +1 a tu característica de Movimiento durante 1d10 asaltos.";
                break;
            case AFINIDAD_AETHYR:
                descripcion="Estas en armonía con el Aethyr y tienes más facilidad para manipular los vientos de la magia. Recibes un +10% a todas las tiradas de Canalización y Sentir Magia.";
                break;
            case AMBIDIESTRO:
                descripcion="Puedes usar ambas manos con la misma habilidad. No sufres la penalización habitual del -20% a la HA o la HP por usar un arma con la mano tonta.";
                break;
            case AMENAZADOR:
                descripcion="Tienes una presencia imponente debido a tu tamaño, tu comportamiento o tu aspecto. Recibes un +10% a todas las tiradas de Intimidar o Tortura.";
                break;
            case ARMAS_NATURALES:
                descripcion="Tienes garras o dientes enormes con los que puedes desgarrar a tus enemigos en combate. Cada vez que ataques sin armas se considerará que estas equipado con un arma de mano. No puedes parar ataques con tus armas naturales y, por razones obvias, tampoco pueden desarmarte";
                break;
            case ARTESANIA_ENANA:
                descripcion="Los miembros de tu raza son Artesanos Naturales. Recibes un +10% a todas las tiradas de los siguientes Oficios: Arcabucero, Armero, Cantero, Cervecero, Forjador de Armaduras, Herrero, Joyero y Minero";
                break;
            case ATERRADOR:
                descripcion="Un vistazo a tu monstruoso rostro basta para poner en fuga a tus enemigos. Causas Terror, tal y como se explica en el Capítulo 9: El Director de Juego.";
                break;
            case AUDAZ:
                descripcion="Eres extraordinariamente valiente. Recibes un +10% a todas las tiradas de Miedo y Terror, así como a las tiradas de Voluntad para resistir intentos de intimidación.";
                break;
            case BRIOSO:
                descripcion="Eres un ágil luchador. Puedes usar la acción de Salto como media acción, y la distancia de todos tus saltos horizontales aumenta un metro";
                break;
            case CALLEJEO:
                descripcion="";
                break;
            case CERTERO:
                descripcion="";
                break;
            case CIRUGIA:
                descripcion="";
                break;
            case CONTORSIONISTA:
                descripcion="";
                break;
            case CORTES:
                descripcion="";
                break;
            case DESARMAR:
                descripcion="";
                break;
            case DESENVAINADO_RAPIDO:
                descripcion="";
                break;
            case DISPARO_CERTERO:
                descripcion="";
                break;
            case DISPARO_INFALIBLE:
                descripcion="";
                break;
            case DON_GENTES:
                descripcion="";
                break;
            case DOTES_ARTISTICAS:
                descripcion="";
                break;
            case EQUITACION_ACROBATICA:
                descripcion="";
                break;
            case ERRANTE:
                descripcion="";
                break;
            case ESPECIALISTA_ARMAS:
                descripcion="";
                break;
            case ETIQUETA:
                descripcion="";
                break;
            case EXPERTO_TRAMPAS:
                descripcion="";
                break;
            case FRENESI:
                descripcion="";
                break;
            case GATO_CALLEJERO:
                descripcion="";
                break;
            case GENIO_ARITMETICO:
                descripcion="";
                break;
            case GOLPE_CONMOCIONADOR:
                descripcion="";
                break;
            case GOLPE_LETAL:
                descripcion="";
                break;
            case GOLPE_PODEROSO:
                descripcion="";
                break;
            case GUERRERO_NATO:
                descripcion="";
                break;
            case HECHIZOS_ARMADURA:
                descripcion="";
                break;
            case IMITADOR:
                descripcion="";
                break;
            case IMPERTURBABLE:
                descripcion="";
                break;
            case INQUIETANTE:
                descripcion="";
                break;
            case INTELECTUAL:
                descripcion="";
                break;
            case INTREPIDO:
                descripcion="";
                break;
            case INTRIGANTE:
                descripcion="";
                break;
            case LEVITACION:
                descripcion="";
                break;
            case LINGUISTICA:
                descripcion="";
                break;
            case LUCHA:
                descripcion="";
                break;
            case MAGIA_MENOR:
                descripcion="";
                break;
            case MAGIA_OSCURA:
                descripcion="";
                break;
            case MAGIA_PUERIL:
                descripcion="";
                break;
            case MAGIA_VULGAR:
                descripcion="";
                break;
            case MANOS_RAPIDAS:
                descripcion="";
                break;
            case MEDITACION:
                descripcion="";
                break;
            case MUY_FUERTE:
                descripcion="";
                break;
            case MUY_RESISTENTE:
                descripcion="";
                break;
            case NEGOCIADOR:
                descripcion="";
                break;
            case NO_MUERTO:
                descripcion="";
                break;
            case ODIO_VISCERAL:
                descripcion="";
                break;
            case OIDO_AGUZADO:
                descripcion="";
                break;
            case ORADOR_EXPERTO:
                descripcion="";
                break;
            case ORIENTACION:
                descripcion="";
                break;
            case PARADA_VELOZ:
                descripcion="";
                break;
            case PELEA_CALLEJERA:
                descripcion="";
                break;
            case PERICIA_SUBTERRANEA:
                descripcion="";
                break;
            case PIES_LIGEROS:
                descripcion="";
                break;
            case PISTOLERO_EXPERTO:
                descripcion="";
                break;
            case PROYECTIL_INFALIBLE:
                descripcion="";
                break;
            case PUNTERIA:
                descripcion="";
                break;
            case RECARGA_RAPIDA:
                descripcion="";
                break;
            case RECIO:
                descripcion="";
                break;
            case REFLEJOS_RAPIDOS:
                descripcion="";
                break;
            case RESISTENCIA_CAOS:
                descripcion="";
                break;
            case RESISTENCIA_ENFERMEDADES:
                descripcion="";
                break;
            case RESISTENCIA_MAGIA:
                descripcion="";
                break;
            case RESISTENCIA_VENENOS:
                descripcion="";
                break;
            case ROBUSTO:
                descripcion="";
                break;
            case SABER_ARCANO:
                descripcion="";
                break;
            case SABER_DIVINO:
                descripcion="";
                break;
            case SABER_OSCURO:
                descripcion="";
                break;
            case SANGRE_FRIA:
                descripcion="";
                break;
            case SENTIDOS_DESARROLLADOS:
                descripcion="";
                break;
            case SEXTO_SENTIDO:
                descripcion="";
                break;
            case SUERTE:
                descripcion="";
                break;
            case TEMIBLE:
                descripcion="";
                break;
            case VIAJERO_CURTIDO:
                descripcion="";
                break;
            case VISION_NOCTURNA:
                descripcion="";
                break;
            case VISTA_EXCELENTE:
                descripcion="";
                break;
            case VOLADOR:
                descripcion="";
                break;
        }
    }

    public NomTal getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
