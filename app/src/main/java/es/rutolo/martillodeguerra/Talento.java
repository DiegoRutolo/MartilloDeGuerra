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
                descripcion="Eres un ágil luchador. Puedes usar la acción de Salto como media acción, y la distancia de todos tus saltos horizontales aumenta un metro.";
                break;
            case CALLEJEO:
                descripcion="Sabes desenvolverte en las calles. Recibes un +10% a las tiradas de Carisma y Cotilleo cuando te relacionas con gente de los bajos fondos criminales.";
                break;
            case CERTERO:
                descripcion="Puedes realizar ataques apuntados con una precisión excepcional. Cuando uses la acción de apuntar, recibirás en tu siguiente ataque a distancia un +20% a la HP (en vez del +10% normal).";
                break;
            case CIRUGIA:
                descripcion="Conoces las más avanzadas técnicas científicas de curación. Recibes un +10% en tus tiradas de Sanar. Si tratas a un paciente con heridas graves, un éxito en tu tirada le cura 2 Heridas en lugar de 1, que es lo normal. Si el personaje corre riesgo de perder un miembro debido a un golpe crítico(ver Capítulo 6: Combate, Daño y Movimiento), puedes aportarle al paciente un +20% a su tirada de Resistencia para no perder la extremidad.";
                break;
            case CONTORSIONISTA:
                descripcion="Puedes doblar y manipular tu cuerpo en un millar de formas antinaturales. Recibes un +10% a todas las tiradas aplicables de Actuar, y un +20% a todas las tiradas de Agilidad para escapar de ataduras, deslizarte por aberturas estrechas y cosas así.";
                break;
            case CORTES:
                descripcion="Recibes un +5% permanente a tu Empatía. Modifica tu perfil inicial para que refleje esta bonificación.";
                break;
            case DESARMAR:
                descripcion="Si consiges impactar en combate cuerpo a cuerpo, puedes intentar desarmar a tu oponente en vez de inflingirle daño. Haz una tirada enfrentada de Agilidad. Si vences, tu oponente pierde el arma, que cae al suelo (podrá ser recogida con una acción de equipamiento). Si vence tu oponente, conservará el arma. Las armas naturales (dientes, garras y demás) no pueden desarmarse.";
                break;
            case DESENVAINADO_RAPIDO:
                descripcion="Tus reflejos felinos te permiten desenvainar rápidamente armas y otros objetos. Puedes usar la acción de equipar como acción libre una vez por asalto.";
                break;
            case DISPARO_CERTERO:
                descripcion="Sabes cómo encontrar los puntos débiles en las armaduras de tus enemigos. Cuando consigas impactar con un ataque a distancia, puedes ignorar 1 punto de armadura. Si el blanco no lleva armadura, este talento no tiene efecto alguno sobre él.";
                break;
            case DISPARO_INFALIBLE:
                descripcion="Sabes hacia a donde apuntar los ataques a distancia para que hagan daño extra. Puedes aplicar un +1 a las tiradas de daño de las armas de proyectil que uses.";
                break;
            case DON_GENTES:
                descripcion="Sabes como trabajarte a una multitud. Puedes afectar a 10 veces la cantidad normal de gente para la habilidad Carisma.";
                break;
            case DOTES_ARTISTICAS:
                descripcion="Tienes un auténtico talento creativo. Recibes un +20% a las tiradas de Oficio (Artista) y un +10% a todas las tiradas para Tasar obras de arte.";
                break;
            case EQUITACION_ACROBATICA:
                descripcion="Eres capaz de realizar proezas asombrosas a lomos de un caballo. Puedes hacer el pino sobre una montura al galope, saltar de un caballo a otro, cosas así. Tan solo tienes que realizar tiradas de Montar en las circunstancias más extremas, e incluso entonces recibes una bonificación de +10% a tu tirada.";
                break;
            case ERRANTE:
                descripcion="Te sientes como en casa en plena naturaleza. Recibes un +10% a todas las tiradas de Esconderse y Movimiento Silencioso en entornos rurales.";
                break;
            case ESPECIALISTA_ARMAS:
                descripcion="Sabes como usar un grupo de armas que requiere un entrenamiento especial. Este no es un talento corriente pues no es un único talento sino varios, que deben adquirirse por separado. Cada uno de ellos es una competencia independiente, cuya especialidad se indica entre paréntesis. Por ejemplo, ser Especialista en armas (A dos Manos) es distinto de ser Especialista en armas (Arrojadizas). Los subtipos más habituales de este talento son: A dos manos, Arco Largo, Arrojadizas, Ballesta, Caballería, Esgrima, Honda, Ingeniería, Mangual, Parada, Pólvora y Presa. Consulta el Capítulo 5: Equipo para más información sobre las armas incluidas en cada grupo.";
                break;
            case ETIQUETA:
                descripcion="Estás versado en los modales sociales de la clase alta. Recibes un +10% a las tiradas de Carisma y Cotilleo cuando te relaciones con la nobleza. La bonificación también se aplica en aquellas situaciones en las que sea conveniente conocer el protocolo adecuado (Por ejemplo, para hacerse pasar por un noble con la habilidad Disfraz).";
                break;
            case EXPERTO_TRAMPAS:
                descripcion="Eres un especialista en la derección y manipulación de trampas. Recibes un +10% a todas las tiradas de Percepción y Forzar Cerraduras relacionadas con la localización y desactivación de trampas.";
                break;
            case FRENESI:
                descripcion="Eres capaz de inducirte en una furia rabiosa. Debes pasar 1 asalto entero mentalizándote (aullando, mordiendo tu escudo, cosas así). El asalto siguiente pierdes el control y te vuelves berserk, con lo que recibes un +10% a tu Fuerza y Voluntad, pero pierdes un -10% a tu HA y tu Inteligencia. Debes atacar al enemigo más cercano en combate Cuerpo a Cuerpo, todos tus ataques deben ser ataques totales o cargas, y no podrás huir o retirarte. Permanecerás en este estado de frenesí hasta que acabe el combate.";
                break;
            case GATO_CALLEJERO:
                descripcion="Te sientes como en casa en la calle. Recibes un +10% a las tiradas de Esconderse y Movimiento Silencioso en entornos urbanos.";
                break;
            case GENIO_ARITMETICO:
                descripcion="Tienes un don para el cálculo y, con tiempo, puedes resolver casi cualquier problema matemático. Recibes un +10% a todas las tiradas de Jugar y Orientación, y un +20% a todas las tiradas de Percepción relacionadas con el cálculo.";
                break;
            case GOLPE_CONMOCIONADOR:
                descripcion="Si atacas cuerpo a cuerpo y golpeas, puedes intentar aturdir a tu enemigo en lugar de hacerle daño. Para ello has de realizar primero una tirada de Fuerza. Si la consigues, tu oponente deberá hacer una tirada de Resistencia con un +10% por cada PA que cubra su cabeza. Si falla, quedará aturdido durante 1d10 asaltos. Los personajes aturdidos no pueden llevar a cabo ninguna acción y no pueden esquivar.";
                break;
            case GOLPE_LETAL:
                descripcion="Eres un experto apuntando a las zonas más vulnerables de tus enemigos. El valor crítico de cualquier crítico que inflinjas aumenta en 1.";
                break;
            case GOLPE_PODEROSO:
                descripcion="Sabes dónde pegar en combate cuerpo a cuerpo para hacer más daño. Puedes aplicar un +1 a las tiradas de daño con armas cuerpo a cuerpo.";
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
