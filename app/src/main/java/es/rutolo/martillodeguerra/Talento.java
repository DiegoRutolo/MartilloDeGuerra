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
                descripcion="Recibes un +5% permanente a tu Habilidad de Armas. Modifica tu perfil inicial para que refleje esta bonificación";
                break;
            case HECHIZOS_ARMADURA:
                descripcion="Tus oraciones te permiten lanzar hechizos aunque lleves puesta una armadura. La penalización a tu tirada de magia por llevar armadura se reduce en -3. Por ejemplo, normalmente sufrirías una penalización de -3 por vestir una camisa de malla, pero con este talento la penalización queda anulada.";
                break;
            case IMITADOR:
                descripcion="Tienes muy buen oído para las voces y los acentos y puedes reproducirlos con precisión. Recibes un +10% a las tiradas de Actuar (Actor, Bufón, Cómico, Narrador y Payaso), a las tiradas de Disfraz si éste tiene un componente verbal, y a las tiradas de Hablar Idioma si intentas hacerte pasar por nativo.";
                break;
            case IMPERTURBABLE:
                descripcion="Tu inquebrantable mente es menos susceptible a sucesos enajenantes. No tienes que tirar para ver si desarrollas un transtorno hasta que no acumules 8 Puntos de Locura, y no obtienes una de forma automática hasta que no tengas 14 PL.";
                break;
            case INQUIETANTE:
                descripcion="Tu abrumadora presencia perturba a tus oponentes. Tus enemigos deben conseguir una tirada de Voluntad o sufrirán una penalización de -10% a su Habilidad de Armas y con proyectiles. Pueden intentar esta tirada de resistencia cada asalto hasta que lo consigan o te pierdan de vista.";
                break;
            case INTELECTUAL:
                descripcion="Recibes un +5% permanente a tu Inteligencia. Modifica tu perfil inicial para que refleje esta bonificación.";
                break;
            case INTREPIDO:
                descripcion="O eres un valiente o estás loco, el caso es que no le tienes miedo a nada. Eres inmune al Miedo, y el Terror te afecta como si fuera Miedo. También eres inmune a los efectos de la habilidad Intimidar y del talento Inquietante. Consulta el Capítulo 9: El director de Juego para más información sobre el Miedo y el Terror.";
                break;
            case INTRIGANTE:
                descripcion="Eres un maestro de las políticas personales. Recibes un +10% a todas las tiradas de Carisma relacionadas con Intrigas y Conspiraciones, y a las tiradas de Voluntad para resistirte al Carisma de otros.";
                break;
            case LEVITACION:
                descripcion="Puedes flotar a poca distancia del suelo. Consulta el Capítulo 6: Combate, Daño y Movimiento para más información sobre el vuelo.";
                break;
            case LINGUISTICA:
                descripcion="Tienes un don natural para los idiomas. Recibes un +10% a todas las tiradas de Leer/Escribir y Hablar Idioma.";
                break;
            case LUCHA:
                descripcion="Eres un luchador experto. Puedes efectuar ataques sin armas con un +10% a tu Habilidad de Armas si intentas una presa. Además, recibes un +10% en todas tus tiradas de Fuerza relacionadas con presas.";
                break;
            case MAGIA_MENOR:
                descripcion="Conoces un hechizo común a todas las formas de magia. La Magia menor no es un talento normal pues no es un único talento, sino varios, y cada uno debe adquirirse por separado. Cada talento de Magia Menor es un hechizo independiente, cuyo nombre se especifica entre paréntesis. Por ejemplo, Magia Menos(Disipar) es un talento distinto a Magia Menor(Caminar por el cielo). Los hechizos de Magia Menor más habituales son Alarma Mágica, Arma Bendita, Armadura de Aethyr, Caminar por el cielo, Cierre Mágico, Disipar, Mover y Silencio. Consulta el Capitulo 7: Magia para más información sobre la Magia Menor y las descripciones de los distintos hechizos. Debes tener un talento de Magia Pueril antes de poder adquirir un talento de Magia Menor.";
                break;
            case MAGIA_OSCURA:
                descripcion="Sabes cómo manipular el Dhar (La Magia Negra) para que alimente tus hechizos. La Magia oscura te concede más poder, pero es mucho más peligrosa. Cuando lances un hechizo, puedes optar por usar las energías del Dhar para nutrirlo: En la tirada de lanzamiento de un hechizo de magia oscura puedes tirar 1d10 adicional y desechar el resultado más bajo. Sin embargo, todos los dados usados cuentan a la hora de determinar la Maldición de Tzcentch. Por ejemplo, un hechicero con Magia 2 que lance un hechizo de magia oscura tirará 3d10 y tomará los dos valores más altos para su lanzamiento; pero se contaran los tres dados para determinar la Maldición de Tzeentch. Si sacara 6, 6 y 6, la tirada de lanzamiento del hechizo sería 12(6+6), pero el hechizo activaría una Manifestación mayor del Caos. Debes usar Magia oscura para lanzar un hechizo del Saber oscuro. Consulta el Capitulo 7: Magia para más información sobre el lanzamiento de hechizos.";
                break;
            case MAGIA_PUERIL:
                descripcion="Conoces las técnicas más básicas de la magia. La magia pueril no es un único talento sino varios. Cada uno de ellos es una competencia mágica independiente, cuya especialidad se indica entre paréntesis. Por ejemplo, la Magia Pueril (Arcana) es un talento distinto a la Magia Pueril (Divina). Los talentos más comunes de Magia Pueril son Arcana, Divina y Vulgar. Si posees un talento de Magia Pueril y tienes una característica de Magia de al menos 1, puedes intentar lanzar cualquier hechizo de la especialidad del talento. Consulta el Capítulo 7: Magia para más detalles (incluida una lista de hechizos).";
                break;
            case MAGIA_VULGAR:
                descripcion="Eres un hechizero autodidacta que ha aprendido a usar magia mediante ensayo y error. Puedes lanzar hechizos de Magia Pueril (Vulgar) aunque no poseas la habilidad Lengua Arcana; eso sí, necesitas el talento de Magia Pueril (Vulgar). Debes tirar 1d10 adicional cada vez que lances un hechizo. El resultado no se añade a tu tirada de lanzamiento del hechizo, pero se tiene en cuenta para determinar si se produce la Maldición de Tzeentch. Cuando aprendas la Lengua Arcana ya no tendrás que tirar ese dado extra.";
                break;
            case MANOS_RAPIDAS:
                descripcion="Eres muy diestro a la hora de tocar a tus oponentes en combate cuerpo a cuerpo mientras lanzas hechizos. Recibes un +20% a la HA para los hechizos de contacto";
                break;
            case MEDITACION:
                descripcion="Puedes concentrar tu mente e ignorar el mundo que te rodea. Recibes una bonificación equivalente a tu Magia para las tiradas de lanzamiento de hechizos de magia ritual.";
                break;
            case MUY_FUERTE:
                descripcion="Recibes un +5% permanente a tu Fuerza. Modifica tu perfil inicial para que refleje esta bonificación.";
                break;
            case MUY_RESISTENTE:
                descripcion="Recibes un +5% permanente a tu Resistencia. Modifica tu perfil inicial para que refleje esta bonificación.";
                break;
            case NEGOCIADOR:
                descripcion="Eres un hombre de negocios con un pico de oro y sabes cómo cerrar un trato. Recibes un +10% a todas tus tiradas de Tasar y Regatear.";
                break;
            case NO_MUERTO:
                descripcion="Eres una criatura de la no vida, horriblemente reanimada mediante la nigromancia (ver Capitulo 7: Magia). Eres inmune al Miedo, el Terror, el aturdimiento, venenos, enfermedades y todos los hechizos, habilidades y efectos relacionados con la manipulación de las emociones y la mente.";
                break;
            case ODIO_VISCERAL:
                descripcion="Tu pueblo guarda un longevo rencor a las diversas razas goblinoides. Sus rapiñas te llenan de tal ira que recibes un +5% a tu HA cada vez que atacas a orcos, goblins y hobgoblins.";
                break;
            case OIDO_AGUZADO:
                descripcion="Tu sentido del oído es extraordinariamente bueno. Recibes un +20% a todas las tiradas de Percepción relacionadas con la audición.";
                break;
            case ORADOR_EXPERTO:
                descripcion="Eres un comunicador tan consumado que enciendes a multitudes inmensas. Puedes afectar a cien veces la cantidad de gente normal para la habilidad de Carisma. Debes poseer el talento Don de Gentes para poder adquirir éste.";
                break;
            case ORIENTACION:
                descripcion="Tienes un sentido instintivo de la dirección. Raras veces te pierdes, y siempre sabes por dónde queda el norte. Recibes un +10% a todas las tiradas de Orientación.";
                break;
            case PARADA_VELOZ:
                descripcion="Al realizar un Ataque Rápido (véase Capítulo 6: Combate, Daño y Movimiento) puedes renunciar a uno de tus ataques y aprovecharlo para hacer una parada gratuita. Así si tuvieras Ataques 3, podrías lanzar dos ataques y hacer una parada con tu acción de ataque rápido. El límite de una parada por asalto se sigue aplicando.";
                break;
            case PELEA_CALLEJERA:
                descripcion="Has aprendido a pelear en las calles. Puedes atacar sin armas con un +10% a tu Habilidad de Armas. Además, puedes aplicar un +1 a las tiradas de daño con ataques desarmado.";
                break;
            case PERICIA_SUBTERRANEA:
                descripcion="Bajo tierra te sientes como en casa. Recibes un +10% a todas tus tiradas de Esconderse y Movimiento Silencioso en entornos subterráneos.";
                break;
            case PIES_LIGEROS:
                descripcion="Recibes un +1 permanente a tu característica de Movimiento. Modifica tu perfil inicial para reflejar esta bonificación.";
                break;
            case PISTOLERO_EXPERTO:
                descripcion="Puedes reducir en media acción el tiempo de recarga de todas las armas de pólvora negra. Si también posees el talento de Recarga Rápida, te beneficias de ambos (reduciendo así el tiempo de recarga de armas de pólvora negra una acción completa).";
                break;
            case PROYECTIL_INFALIBLE:
                descripcion="Sabes hacia dónde apuntar los proyectiles mágicos para que hagan el máximo daño. Puedes aplicar un +1 a las tiradas de daño de los proyectiles mágicos de tus hechizos.";
                break;
            case PUNTERIA:
                descripcion="Recibes un +5% permanente a tu Habilidad de Proyectiles. Modifica tu perfil inicial para que refleje esta bonificación.";
                break;
            case RECARGA_RAPIDA:
                descripcion="Puedes recargar armas de proyectil con una facilidad derivada de la práctica. Se reduce el tiempo de recarga de todas las armas de proyectil en media acción. Por ejemplo, podrías recargar una ballesta con media acción, cuando lo normal es dedicarle una acción completa. Si el arma ya tiene un tiempo de recarga de media acción, esta se convierte en una acción libre. Prácticamente no tardas nada en recargar este tipo de armas, con lo cual puedes realizar ataques rápidos con ellas. Consulta el Capítulo 6: Combate, Daño y Movimiento para más información sobre los Ataques Rápidos.";
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
