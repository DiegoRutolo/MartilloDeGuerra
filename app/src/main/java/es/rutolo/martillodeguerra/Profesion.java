package es.rutolo.martillodeguerra;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

public class Profesion implements Parcelable {
    private boolean valida = true;
    private String nombre;
    private boolean avanzada = false;
    private HashMap<Stat, Integer> stats;
    private String descripcion;
    private String notas;
    private HashMap<NomHab, String> habilidades;
    private HashMap<NomTal, String> talentos;
    private String[] enseres;
    private NomProf[] accesos;
    private NomProf[] salidas;

    public Profesion(NomProf nombre) {
        this.nombre = nombre.toString();
        this.stats = new HashMap<>();
        this.habilidades = new HashMap<>();
        this.talentos = new HashMap<>();
        this.notas="";
        this.descripcion="";

        // Inicializar stats a 0
        for (Stat st : Stat.values()) {
            stats.put(st, 0);
        }


        switch (nombre) {   // TODO Completar profesiones
            case ALBOROTADOR:
                notas = "";
                stats.put(Stat.HA, 5);
                stats.put(Stat.HP, 5);
                stats.put(Stat.Ag, 5);
                stats.put(Stat.I, 10);
                stats.put(Stat.Em, 10);
                stats.put(Stat.H, 2);
                habilidades.put(NomHab.CARISMA, "");
                habilidades.put(NomHab.ESCONDERSE, "");
                habilidades.put(NomHab.HABLAR_IDIOMA, "Bretón o Tileano");
                habilidades.put(NomHab.HABLAR_IDIOMA, "Reikspiel");
                habilidades.put(NomHab.LEER_ESCRIBIR, "");
                habilidades.put(NomHab.PERCEPCION, "");
                habilidades.put(NomHab.SABIDURIA_ACADEMICA, "Historia");
                habilidades.put(NomHab.COTILLEO, "");
                habilidades.put(NomHab.SABIDURIA_ACADEMICA, "Leyes");
                habilidades.put(NomHab.SABIDURIA_POPULAR, "Imperio");
                talentos.put(NomTal.A_CORRER, "");
                talentos.put(NomTal.DON_GENTES, "");
                talentos.put(NomTal.SANGRE_FRIA, "");
                talentos.put(NomTal.PELEA_CALLEJERA, "");
                enseres = new String[]{
                        "Armadura ligera (chaqueta de cuero)",
                        "Una muda de ropa de buena artesanía",
                        "2d10 octavillas para causas diversas"
                };
                accesos = new NomProf[]{
                        NomProf.BURGUES,
                        NomProf.CAPITAN,
                        NomProf.ESCRIBA,
                        NomProf.ESTUDIANTE,
                        NomProf.FANATICO,
                        NomProf.HERALDO,
                        NomProf.SALTEADOR_CAMINOS,
                        NomProf.SIRVIENTE
                };
                salidas = new NomProf[]{
                        NomProf.BRIBON,
                        NomProf.CHARLATAN,
                        NomProf.DEMAGOGO,
                        NomProf.FANATICO,
                        NomProf.FORAJIDO,
                        NomProf.POLITICO
                };
                descripcion = "En su mayoría, la gente del Imperio no pincha ni corta en temas de política. El Emperador y los Condes Electores promulgan y aplican las leyes, apoyados por diversas iglesias (las de Sigmar y Ulric son las más destacadas). Aun así, los activistas políticos llenos de entusiasmo son habituales en las ciudades del Imperio. Estos alborotadores se organizan en pro de diversas causas, pronuncian apasionados discursos y provocan al populacho. Los lunáticos sencillamente se ignoran, pero los alborotadores más eficaces (aquellos que logran llegar hasta el manantial del resentimiento de campesinos y burgueses) suelen considerarse una amenaza para el estado. Son perseguidos por los vigilantes locales, acusados de herejía por los eclesiásticos u obligados a rendirse a la tierna compasión de los cazadores de brujas. Pero a pesar de los riesgos, los alborotadores continúan su labor. Algunos creen firmemente en su causa, pero otros no son más que cínicos ávidos de poder tan corruptos como aquellos contra los que despotrican.";
                break;
            case APRENDIZ_HECHICERO:
                notas = "Si quieres ser capaz de lanzar hechizos, debes aumentar tu característica de Magia con la mejora gratis disponible durante la creación del personaje. Los halflings y enanos no pueden acceder a esta profesión. Los hechiceros son temidos y a veces odiados. Piénsatelo bien antes de escoget esta profesión.";
                stats.put(Stat.Ag, 5);
                stats.put(Stat.I, 10);
                stats.put(Stat.V, 15);
                stats.put(Stat.Em, 5);
                stats.put(Stat.H, 2);
                stats.put(Stat.Mag, 1);
                habilidades.put(NomHab.BUSCAR, "");
                habilidades.put(NomHab.HABLAR_IDIOMA, "Clasico");
                habilidades.put(NomHab.LEER_ESCRIBIR, "");
                habilidades.put(NomHab.LENGUA_ARCANA, "Magia");
                habilidades.put(NomHab.PERCEPCION, "");
                habilidades.put(NomHab.SABIDURIA_ACADEMICA, "Magia");
                habilidades.put(NomHab.SENTIR_MAGIA, "");
                talentos.put(NomTal.AFINIDAD_AETHYR, "");
                talentos.put(NomTal.MANOS_RAPIDAS, "");
                talentos.put(NomTal.INTELECTUAL, "");
                talentos.put(NomTal.MUY_RESISTENTE, "");
                talentos.put(NomTal.MAGIA_PUERIL, "Arcana");
                enseres = new String[]{
                        "Báculo",
                        "Mochila",
                        "Libro impreso"
                };
                accesos = new NomProf[]{
                        NomProf.ERUDITO,
                        NomProf.ESCRIBA,
                        NomProf.ESTUDIANTE,
                        NomProf.HECHICERO_VULGAR
                };
                salidas = new NomProf[]{
                        NomProf.ERUDITO,
                        NomProf.ESCRIBA,
                        NomProf.HECHICERO_ADEPTO
                };
                break;
            case ALGUACIL:
                notas = "";
                stats.put(Stat.HA, 5);
                stats.put(Stat.HP, 5);
                stats.put(Stat.F, 5);;
                stats.put(Stat.I, 10);
                stats.put(Stat.V, 5);
                stats.put(Stat.Em, 10);
                stats.put(Stat.H, 2);
                habilidades.put(NomHab.CARISMA, "");
                habilidades.put(NomHab.CRIAR_ANIMALES, "");
                habilidades.put(NomHab.COTILLEO, "");
                habilidades.put(NomHab.INTIMIDAR, "");
                habilidades.put(NomHab.SABIDURIA_POPULAR, "Imperio");
                habilidades.put(NomHab.LEER_ESCRIBIR, "");
                habilidades.put(NomHab.MANDO, "");
                habilidades.put(NomHab.ORIENTACION, "");
                habilidades.put(NomHab.MONTAR, "");
                habilidades.put(NomHab.PERCEPCION, "");
                habilidades.put(NomHab.SABIDURIA_ACADEMICA, "Leyes");
                talentos.put(NomTal.DON_GENTES, "");
                talentos.put(NomTal.ETIQUETA, "");
                talentos.put(NomTal.GENIO_ARITMETICO, "");
                enseres = new String[]{
                        "Armadura ligera (chaqueta de cuero y gorro de cuero)",
                        "Caballo de monta con silla y arreos",
                        "Una muda de ropa de buena artesanía"
                };
                accesos = new NomProf[]{
                        NomProf.CARCELERO,
                        NomProf.GUARDAESPALDAS
                };
                salidas = new NomProf[]{
                        NomProf.CONTRABANDISTA,
                        NomProf.EXTORSIONADOR,
                        NomProf.MILICIANO,
                        NomProf.PEAJERO,
                        NomProf.POLITICO,
                        NomProf.SICARIO
                };
                descripcion = "Los alguaciles son oficiales feudales al servicio de los señores nobles. Aunque muchas de sus responsabilidades incluyen el mantenimiento de la región y los recursos del feudo, son famosos entre los campesinos por algo totalmente distinto. Los alguaciles son los recaudadores de impuestos de las aldeas del feudo, y se aseguran de que los campesinos cumplen con sus obligaciones para con sus señores. Estas responsabilidades les granjean las antipatías de los aldeanos, sobre todo en épocas de vacas flacas. Los alguaciles, al ser la cara odiada del régimen señorial, son los primeros en morir cuando los campesinos se enfurecen y se rebelan.";
                break;
            case ARTISTA:
                notas = "";
                stats.put(Stat.HA, 5);
                stats.put(Stat.HP, 10);
                stats.put(Stat.Ag, 10);
                stats.put(Stat.V, 5);
                stats.put(Stat.Em, 10);
                stats.put(Stat.H, 2);
                habilidades.put(NomHab.ACTUAR, "Dos cualesquiera");
                habilidades.put(NomHab.CARISMA, "");
                habilidades.put(NomHab.CRIAR_ANIMALES, "");
                habilidades.put(NomHab.NADAR, "");
                habilidades.put(NomHab.HABLAR_IDIOMA, "Reikspiel");
                habilidades.put(NomHab.PERCEPCION, "");
                habilidades.put(NomHab.SABIDURIA_POPULAR, "Imperio");
                habilidades.put(NomHab.TASAR, "");
                habilidades.put(NomHab.COTILLEO, "");
                habilidades.put(NomHab.ADIESTRAR_ANIMALES, "");
                habilidades.put(NomHab.CARISMA_ANIMAL, "");
                habilidades.put(NomHab.CHARLATANERIA, "");
                habilidades.put(NomHab.ESCALAR, "");
                habilidades.put(NomHab.HIPNOTISMO, "");
                habilidades.put(NomHab.MONTAR, "");
                habilidades.put(NomHab.PRESTIDIGITACION, "");
                habilidades.put(NomHab.VENTRILOQUIA, "");
                talentos.put(NomTal.CERTERO, "");
                talentos.put(NomTal.DESENVAINADO_RAPIDO, "");
                talentos.put(NomTal.DON_GENTES, "");
                talentos.put(NomTal.EQUITACION_ACROBATICA, "");
                talentos.put(NomTal.ESPECIALISTA_ARMAS, "Arrojadizas");
                talentos.put(NomTal.IMITADOR, "");
                talentos.put(NomTal.LUCHA, "");
                talentos.put(NomTal.MUY_FUERTE, "");
                talentos.put(NomTal.REFLEJOS_RAPIDOS, "");
                enseres = new String[]{
                        "Armadura ligera (justillo de cuero)",
                        "Uno de los siguientes: instrumento musical (cualquiera), herramientas de oficio (actor), 3 cuchillos arojadizos, 2 hachas arrojadizas",
                        "Uno de los siguientes: disfraz, una muda de ropa de buena artesanía"
                };
                accesos = new NomProf[]{
                        NomProf.BRIBON,
                        NomProf.HERALDO,
                        NomProf.LADRON,
                        NomProf.VAGABUNDO
                };
                salidas = new NomProf[]{
                        NomProf.BRIBON,
                        NomProf.CHARLATAN,
                        NomProf.JUGLAR,
                        NomProf.LADRON,
                        NomProf.VAGABUNDO
                };
                descripcion = "Desde acróbatas a forzudos, desde lanzadores de cuchillos hasta hipnotizadores, desde bailarines hasta ventrílocuos, el Imperio está lleno de artistas. Algunos lo hacen por el clampr de la multitud, y otros por el dinero. Muchos se hacen artistas para huir de la dificil vida del aldeano imperial. Los artistas viajan a menudo, a veces solos pero más frecuentemente en compañías que actúan en aldeas, pueblos y ciudades. Las compañías más afortunadas son contratadas continuamente, y a veces pasan meses en una misma ciudad. Las menos afortunadas se ganan la vida como pueden, siempre en busca de un público más agradecido (o de menos vigilancia) en su siguiente parada. Los mejores artistas reciben el apoyo de los nobles y ganan inimaginables sumas de dinero actuando para los estamentos más altos.";
                break;
            case AYUDA_CAMARA:
                notas = "";
                stats.put(Stat.Ag, 10);
                stats.put(Stat.I, 10);
                stats.put(Stat.V, 5);
                stats.put(Stat.Em, 10);
                stats.put(Stat.H, 2);
                habilidades.put(NomHab.BUSCAR, "");
                habilidades.put(NomHab.CHARLATANERIA, "");
                habilidades.put(NomHab.COTILLEO, "");
                habilidades.put(NomHab.HABLAR_IDIOMA, "Bretón o Reikspiel");
                habilidades.put(NomHab.LEER_ESCRIBIR, "");
                habilidades.put(NomHab.PERCEPCION, "");
                habilidades.put(NomHab.REGATEAR, "");
                habilidades.put(NomHab.SABIDURIA_ACADEMICA, "Genealogía/Heráldica");
                habilidades.put(NomHab.TASAR, "");
                talentos.put(NomTal.ETIQUETA, "");
                talentos.put(NomTal.NEGOCIADOR, "");
                talentos.put(NomTal.VIAJERO_CURTIDO, "");
                talentos.put(NomTal.SANGRE_FRIA, "");
                talentos.put(NomTal.CORTES, "");
                enseres = new String[]{
                        "Colonia",
                        "Monedero",
                        "Dos mudas de ropa de la mejor artesanía",
                        "Uniforme"
                };
                accesos = new NomProf[]{
                        NomProf.BURGUES,
                        NomProf.SIRVIENTE
                };
                salidas = new NomProf[]{
                        NomProf.ADMINISTRADOR,
                        NomProf.BRIBON,
                        NomProf.ESCUDERO,
                        NomProf.ESTUDIANTE,
                        NomProf.HERALDO
                };
                descripcion = "El ayuda de cámara es el sirviente personal de un noble, un alto cargo militar o un adinerado burgués. Es el responsable del bienestar y el aspecto de su señor, incluyendo su aseo, su vestimenta y su presentación. Un ayuda de cámara se apaña con un sombrero y un sayo para cuando llueve, un bastón para las caminatas y un abrigo de gala para ocasiones formales. Un ayuda de cámara bien entrenado resulta indispensable para cualquier noble que valore su estilo. Aunque disfrutan de una vida por la que la mayoría de los sirvientes matarían, a menudo aborrecen a los frívolos nobles a quienes se ven obligados a servir. Las mujeres que realizan estos servicios para los nobles reciben de nombre de doncellas.";
                break;
            case BARQUERO:
                notas = "";
                stats.put(Stat.HA, 5);
                stats.put(Stat.HP, 5);
                stats.put(Stat.F, 10);
                stats.put(Stat.R, 5);
                stats.put(Stat.Ag, 5);
                stats.put(Stat.I, 5);
                stats.put(Stat.H, 2);
                habilidades.put(NomHab.CARISMA, "");
                habilidades.put(NomHab.COTILLEO, "");
                habilidades.put(NomHab.INTIMIDAR, "");
                habilidades.put(NomHab.NADAR, "");
                habilidades.put(NomHab.PERCEPCION, "");
                habilidades.put(NomHab.REGATEAR, "");
                habilidades.put(NomHab.REMAR, "");
                habilidades.put(NomHab.SABIDURIA_POPULAR, "Imperio");
                habilidades.put(NomHab.TASAR, "");
                habilidades.put(NomHab.LENGUA_SECRETA, "Jerga montaraz");
                talentos.put(NomTal.ESPECIALISTA_ARMAS, "Pólvora");
                talentos.put(NomTal.PELEA_CALLEJERA, "");
                talentos.put(NomTal.PUNTERIA, "");
                talentos.put(NomTal.CORTES, "");
                enseres = new String[]{
                        "Ballesta con 10 virotes o trabuco con 10 disparos",
                        "Armadura ligeta (chaqueta de cuero)"
                };
                accesos = new NomProf[]{
                        NomProf.COCHERO,
                        NomProf.CONTRABANDISTA,
                        NomProf.PEAJERO
                };
                salidas = new NomProf[]{
                        NomProf.BATELERO,
                        NomProf.CONTRABANDISTA,
                        NomProf.MARINERO,
                        NomProf.PATRULLA_CAMINOS,
                        NomProf.SALTEADOR_CAMINOS
                };
                descripcion = "El Imperio está surcado por ríos grandes y pequeños. Aunque algunos son lo suficientemente poco profundos como para vadearlos fácilmente, para cruzar la mayoría de ellos sin problemas es necesario un transporte. Los barqueros se ganan la vida llevando gente y mercancías por los ríos del Imperio (por un precio, desde luego). Prefieren las barcazas de fondo plano, pues tienen menos calado y mucho espacio en cubierta. Los barqueros de zonas más lejanas también gustan de llevar trabucos. Los bandidos son un peligro constante, y el trabuco les \"motiva\" para que sigan su camino. Muchos barqueros son también extorsionistas de la peor calaña, y cambian aleatoriamente sus precios basándose en la riqueza aparente y la desesperación de sus pasajeros.";
                break;  /*
            case BARBERO_CIRUJANO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case BATELERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case BERSERKER:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case BURGUES:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case BRIBON:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CAMPESINO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CARBONERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CAZADOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CARCELERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;*/
            case CAZARRATAS:
                notas = "";
                stats.put(Stat.HA, 5);
                stats.put(Stat.HP, 10);
                stats.put(Stat.R, 5);
                stats.put(Stat.Ag, 10);
                stats.put(Stat.V, 10);
                stats.put(Stat.H, 2);
                habilidades.put(NomHab.ADIESTRAR_ANIMALES, "");
                habilidades.put(NomHab.BUSCAR, "");
                habilidades.put(NomHab.CRIAR_ANIMALES, "");
                habilidades.put(NomHab.ESCONDERSE, "");
                habilidades.put(NomHab.MOVIMIENTO_SILENCIOSO, "");
                habilidades.put(NomHab.PERCEPCION, "");
                habilidades.put(NomHab.PONER_TRAMPAS, "");
                talentos.put(NomTal.ESPECIALISTA_ARMAS, "Honda");
                talentos.put(NomTal.PERICIA_SUBTERRANEA, "");
                talentos.put(NomTal.RESISTENCIA_ENFERMEDADES, "");
                talentos.put(NomTal.RESISTENCIA_VENENOS, "");
                enseres = new String[]{
                        "Honda con munición",
                        "4 trampas para animales",
                        "Vara larga con 1d10 ratas muertas",
                        "Perro pequeño pero fiero"
                };
                accesos = new NomProf[]{
                        NomProf.CARCELERO,
                        NomProf.LADRON_TUMBAS,
                        NomProf.PORTADOR_RUNAS,
                        NomProf.SAQUEADOR_TUMBAS
                };
                salidas = new NomProf[]{
                        NomProf.CARCELERO,
                        NomProf.LADRON,
                        NomProf.LADRON_GUANTE_BLANCO,
                        NomProf.LADRON_TUMBAS,
                        NomProf.OSAMENTERO,
                        NomProf.ROMPESCUDOS
                };
                descripcion = "Los cazarratas son una estampa habitual en todo el Imperio. Pueden encontrarse en aldeas, pueblos y ciudades, y se ganan la vida deshaciéndose de las alimañas que infestan todas las viviendas en esta era malsana. Los cazarratas suelen ser gente peregrina, aunque los pueblos y ciudades más grandes tienen contingentes fijos de \"soldados antialimañas\". Las ratas son sus principales enemigos, pero también exterminan topos, ratones e incluso plagas peores. Los cazarratas urbanos pasan gran parte de su tiempo en las doacas, vadeando ríos de basura en busca de sus presas. Es un trabajo sucio, pero ayuda a contener las plagas.";
                break; /*
            case CAZARRECOMPENSAS:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CONTRABANDISTA:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case COCHERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case EMBAJADOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case ESCOLTA:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case ESCUDERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case ESCRIBA:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case ESPADACHIN:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case ESTUDIANTE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case FORAJIDO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case FANATICO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case GLADIADOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case GUERRERO_CAMARILLA:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case GUARDIA_MARINA:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case GUARDAESPALDAS:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case HECHICERO_VULGAR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case INICIADO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case LADRON:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case KOSSAR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case LADRON_TUMBAS:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case LENADOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MATATROLLS:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MARINERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MATON:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MENESTRAL:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MERCENARIO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MENSAJERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MIEMBRO_SEQUITO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MILICIANO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case NOBLE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MINERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case OSAMENTERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case PATRULLA_CAMINOS:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case PEAJERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case PATRULLA_FRONTERIZA:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case PESCADOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break; */
            case PORTADOR_RUNAS:
                notas = "";
                stats.put(Stat.HA, 10);
                stats.put(Stat.F, 5);
                stats.put(Stat.R, 5);
                stats.put(Stat.Ag, 10);
                stats.put(Stat.I, 5);
                stats.put(Stat.V, 7);
                stats.put(Stat.H, 2);
                stats.put(Stat.M, 1);
                habilidades.put(NomHab.CODIGO_SECRETO, "Batidor");
                habilidades.put(NomHab.ESQUIVAR, "");
                habilidades.put(NomHab.NADAR, "");
                habilidades.put(NomHab.ORIENTACION, "");
                habilidades.put(NomHab.PERCEPCION, "");
                habilidades.put(NomHab.SUPERVIVENCIA, "");
                talentos.put(NomTal.A_CORRER, "");
                talentos.put(NomTal.MUY_RESISTENTE, "");
                talentos.put(NomTal.MUY_FUERTE, "");
                talentos.put(NomTal.ORIENTACION, "");
                talentos.put(NomTal.PIES_LIGEROS, "");
                talentos.put(NomTal.SEXTO_SENTIDO, "");
                talentos.put(NomTal.RECARGA_RAPIDA, "");
                enseres = new String[]{
                        "Ballesta con 10 virotes",
                        "Armadura ligera (justillo de cuero)",
                        "Poción curativa",
                        "Amuleto de buena suerte"
                };
                accesos = new NomProf[]{
                        NomProf.ROMPESCUDOS
                };
                salidas = new NomProf[]{
                        NomProf.BATIDOR,
                        NomProf.CAZARRATAS,
                        NomProf.SAQUEADOR_TUMBAS,
                        NomProf.VETERANO
                };
                descripcion = "Undgrin Ankor, una red de elaborados túneles que antaño recorría las Montañas del Fin del Mundo en toda su longitud, conecta las fortalezas enanas al este del entre fortalezas se lleva a cabo a través de portadora que se juegan el cuello para transportar mensajes (escritos en el alfabeto rúnico de los enanos). Con el paso de los siglos y la caída de cada vez más fortalezas enanas bajo los ataques goblins (con la consecuente destrucción de sus túneles), el oficio de los portarunas se ha complicado cada vez más. Se han visto obligados a tomar rutas más tortuosas, e induso en éstas abundan los peligros cuando el enemigo las descubre. Con frecuencia los portadores de runas han de abandonar los túneles y atravesar montañas y valles por la superficie. Los portadores de runas especializados en distancias largas llevan a veces mensajes entre las comunidades enanas del Imperio y las de las montañas.";
                break;
            case SAQUEADOR_TUMBAS:
                notas = "";
                stats.put(Stat.HA, 10);
                stats.put(Stat.Ag, 10);
                stats.put(Stat.I, 10);
                stats.put(Stat.V, 10);
                stats.put(Stat.Em, 5);
                stats.put(Stat.H, 2);
                habilidades.put(NomHab.BUSCAR, "");
                habilidades.put(NomHab.ESCALAR, "");
                habilidades.put(NomHab.ESCONDERSE, "");
                habilidades.put(NomHab.SUPERVIVENCIA, "");
                habilidades.put(NomHab.FORZAR_CERRADURAS, "");
                habilidades.put(NomHab.MOVIMIENTO_SILENCIOSO, "");
                habilidades.put(NomHab.HABLAR_IDIOMA, "Clásico, Khazalid o Eltharin");
                habilidades.put(NomHab.PERCEPCION, "");
                habilidades.put(NomHab.LEER_ESCRIBIR, "");
                habilidades.put(NomHab.SABIDURIA_POPULAR, "Imperio");
                habilidades.put(NomHab.CODIGO_SECRETO, "Ladrón");
                habilidades.put(NomHab.TASAR, "");
                talentos.put(NomTal.EXPERTO_TRAMPAS, "");
                talentos.put(NomTal.PERICIA_SUBTERRANEA, "");
                talentos.put(NomTal.SUERTE, "");
                talentos.put(NomTal.SEXTO_SENTIDO, "");
                enseres = new String[]{
                        "Armadura ligera (chaqueta de cuero)",
                        "Palanca",
                        "Lámpara",
                        "Aceite de lámpara",
                        "10 metros de cuerda",
                        "2 sacas"
                };
                accesos = new NomProf[]{
                        NomProf.LADRON,
                        NomProf.PORTADOR_RUNAS,
                        NomProf.ROMPESCUDOS,
                };
                salidas = new NomProf[]{
                        NomProf.CAZARRATAS,
                        NomProf.CAZAVAMPIROS,
                        NomProf.LADRON,
                        NomProf.PERISTA,
                        NomProf.ROMPESCUDOS
                };
                descripcion = "Los saqueadores de tumbas se diferencian de los ladrones de tumbas en que su interés se centra en los objetos valiosos de los panteones y no en los cuerpos en sí. Aunque hoy día muy pocas tumbas en el Viejo Mundo contienen objetos valiosos, existen muchas criptas antiguas que encierran incontables tesoros. Los saqueadores de tumbas son unos expertos en localizar tales lugares desvalijarlos. Las tumbas secretas suelen estar en zonas peligrosas e inaccesibles. Las que están dentro de las fronteras del Imperio son respetadas y defendidas por los lugareños, por lo que acceder a ellas puede resultar casi igual de peligroso. Las tumbas de los más ricos están protegidas por ingeniosas trampas y artimañas, y los saqueadores hábiles deben aprender a desarmadas o evitarlas. Muy pocos sobreviven lo bastante para saquear más de una tumba.";
                break;
            case ROMPESCUDOS:
                notas = "Solo los enanos pueden tener rompescudos como profesión inicial";
                stats.put(Stat.HA, 10);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 5);
                stats.put(Stat.R, 5);
                stats.put(Stat.Ag, 10);
                stats.put(Stat.V, 5);
                stats.put(Stat.A, 1);
                stats.put(Stat.H, 2);
                habilidades.put(NomHab.ESCALAR, "");
                habilidades.put(NomHab.ESQUIVAR, "");
                habilidades.put(NomHab.ORIENTACION, "");
                habilidades.put(NomHab.PERCEPCION, "");
                habilidades.put(NomHab.SEGUIMIENTO, "");
                talentos.put(NomTal.GOLPE_CONMOCIONADOR, "");
                talentos.put(NomTal.GOLPE_LETAL, "");
                talentos.put(NomTal.GOLPE_PODEROSO, "");
                talentos.put(NomTal.OIDO_AGUZADO, "");
                talentos.put(NomTal.SANGRE_FRIA, "");
                talentos.put(NomTal.ORIENTACION, "");
                enseres = new String[]{
                        "Ballesta con 10 virotes",
                        "Armadura media (cota de malla, chaqueta de cuero y grebas de cuero)",
                        "Escudo",
                        "Gancho de escalada",
                        "10 metros de cuerda",
                        "Odre"
                };
                accesos = new NomProf[]{
                        NomProf.CAZARRATAS,
                        NomProf.CONTRABANDISTA,
                        NomProf.KOSSAR,
                        NomProf.MERCENARIO,
                        NomProf.MINERO,
                        NomProf.PORTADOR_RUNAS,
                        NomProf.SAQUEADOR_TUMBAS
                };
                salidas = new NomProf[]{
                        NomProf.CONTRABANDISTA,
                        NomProf.GLADIADOR,
                        NomProf.PORTADOR_RUNAS,
                        NomProf.SAQUEADOR_TUMBAS,
                        NomProf.SARGENTO,
                        NomProf.VETERANO
                };
                descripcion = "El Caos y las incursiones de los pieles verdes han invadido muchas fortalezas enanas en las Montañas del Fin del Mundo con el paso de los siglos. Para proteger las ciudades-fortaleza que quedan, los enanos han Son los rompescudos, dispuestos a detener el flujo del mal y entrenado a soldados de élite especializados en combate bajo tierra. valerosos guerreros proteger a su pueblo. Aunque la mayoría de los rompescudos son enanos, de vez en cuando algún miembro de otra raza engrosa sus filas a cambio de oro enano. Los jóvenes enanos del Imperio se convierten a menudo en rompescudos para probar su temple y solidarizarse con sus parientes de las montañas.";
                break; /*
            case SICARIO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case SIRVIENTE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case VAGABUNDO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case SOLDADO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case VIGILANTE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case ARTESANO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case ADMINISTRADOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case ASESINO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case BATIDOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CABALLERO_INTERIOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CABALLERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CAMPEON_JUDICIAL:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CAPITAN:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CAZADOR_BRUJAS:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CAPITAN_BARCO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CAZADOR_INVISIBLE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CAZAVAMPIROS:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CORTESANO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case CHARLATAN:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case DEMAGOGO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case DUELISTA:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case ESPIA:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case ERUDITO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case EXPLORADOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case EXTORSIONADOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case FRAILE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case FLAGELANTE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case GALENO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case GRAN_HECHICERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case HECHICERO_MAESTRO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case HECHICERO_ADEPTO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case HERALDO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case HEROE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case INGENIERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case HERRERUELO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case INTERROGADOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case JEFE_FORAJIDOS:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case LADRON_GUANTE_BLANCO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case JUGLAR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case LADRON_EXPERTO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MAESTRO_GREMIO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MATAGIGANTES:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MATADEMONIOS:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case MERCADER:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case NAVEGANTE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case POLITICO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case PERISTA:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case POSADERO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case SACERDOTE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case SALTEADOR_CAMINOS:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case SACERDOTE_UNGIDO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case SARGENTO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case SEGUNDO_BORDO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case SENOR_NOBLE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case SENOR_CRIMEN:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case SUMO_SACERDOTE:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case TIRADOR:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;
            case VETERANO:
                notas = "";
                stats.put(Stat.HA, 0);
                stats.put(Stat.HP, 0);
                stats.put(Stat.F, 0);
                stats.put(Stat.R, 0);
                stats.put(Stat.Ag, 0);
                stats.put(Stat.I, 0);
                stats.put(Stat.V, 0);
                stats.put(Stat.H, 0);
                stats.put(Stat.M, 0);
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                habilidades.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                talentos.put(, "");
                enseres = new String[]{

                };
                accesos = new NomProf[]{

                };
                salidas = new NomProf[]{

                };
                break;



            */

            default:
                valida = false;
        }
    }

    public boolean isValida() {
        return valida;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAvanzada() {
        return avanzada;
    }

    public HashMap<Stat, Integer> getStats() {
        return stats;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNotas() {
        return notas;
    }

    public HashMap<NomHab, String> getHabilidades() {
        return habilidades;
    }

    public HashMap<NomTal, String> getTalentos() {
        return talentos;
    }

    public String[] getEnseres() {
        return enseres;
    }

    public NomProf[] getAccesos() {
        return accesos;
    }

    public NomProf[] getSalidas() {
        return salidas;
    }


    /* Parcelable */

    private int mData;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(mData);
    }

    public static final Parcelable.Creator<Profesion> CREATOR = new Parcelable.Creator<Profesion>() {
        public Profesion createFromParcel(Parcel in) {
            return new Profesion(in);
        }

        public Profesion[] newArray(int size) {
            return new Profesion[size];
        }
    };

    private Profesion(Parcel in) {
        mData = in.readInt();
    }
}

