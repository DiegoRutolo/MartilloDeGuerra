package es.rutolo.martillodeguerra;

import java.util.HashMap;

public class Profesion {
    private boolean valida = true;
    private String nombre;
    private boolean avanzada = false;
    private HashMap<Stat,Integer> stats;
    private String descripcion;
    private String notas;
    private String[] habilidades;
    private String[] talentos;
    private String[] enseres;
    private Profesion[] accesos;
    private Profesion[] salidas;

    public Profesion(NomProf nombre) {
        this.stats = new HashMap<>();
        this.nombre = nombre.toString();

        switch (nombre) {
            case ALBOROTADOR:
                stats.put(Stat.HA, 5);
                stats.put(Stat.HP, 5);
                stats.put(Stat.Ag, 5);
                stats.put(Stat.I, 10);
                stats.put(Stat.Em, 10);
                stats.put(Stat.H, 2);
                habilidades = new String[]{
                        "Carisma", "Esconderse", "Hablar idioma (Bretón o Tileano)",
                        "Hablar idioma (Reikspiel)", "Leer/escribir", "Percepción",
                        "Sabiduría académica (Historia) o Cotilleo",
                        "Sabiduría académica (Leyes) o Sabiduría popular (Imperio)"
                };
                talentos = new String[]{
                        "¡A correr!", "Don de gentes", "Sangre fría o Pelea calejera"
                };
                enseres = new String[]{
                        "Armadura ligera (chaqueta de cuero)",
                        "Muda de ropa de buena artesanía",
                        "2d10 octavillas para causas diversas"
                };
                accesos = new Profesion[]{
                        new Profesion(NomProf.BURGUES),
                        new Profesion(NomProf.CAPITAN),
                        new Profesion(NomProf.ESCRIBA),
                        new Profesion(NomProf.ESTUDIANTE),
                        new Profesion(NomProf.FANATICO),
                        new Profesion(NomProf.HERALDO),
                        new Profesion(NomProf.SALTEADOR_CAMINOS),
                        new Profesion(NomProf.SIRVIENTE)
                };
                salidas = new Profesion[]{
                        new Profesion(NomProf.BRIBON),
                        new Profesion(NomProf.CHARLATAN),
                        new Profesion(NomProf.DEMAGOGO),
                        new Profesion(NomProf.FANATICO),
                        new Profesion(NomProf.FORAJIDO),
                        new Profesion(NomProf.POLITICO)
                };
                break;

            /*case "Cazarratas":
                stats_primarios[0] = 5;
                stats_primarios[1] = 10;
                stats_primarios[3] = 5;
                stats_primarios[4] = 10;
                stats_primarios[6] = 10;
                stats_secundarios[1] = 2;
                habilidades = new String[]*/

            case PORTADOR_RUNAS:
                stats.put(Stat.HA, 10);
                stats.put(Stat.F, 5);
                stats.put(Stat.R, 5);
                stats.put(Stat.Ag, 10);
                stats.put(Stat.I, 5);
                stats.put(Stat.V, 5);
                stats.put(Stat.H, 2);
                stats.put(Stat.M, 1);
                habilidades = new String[]{
                        "Código secreto (Batidor)", "Esquivar", "Nadar", "Orientación",
                        "Percepción", "Supervivencia"
                };
                talentos = new String[]{
                        "¡A correr!", "Muy resistente o Muy fuerte", "Orientación",
                        "Pies ligeros o Sexto sentido", "Recarga rápida"
                };
                enseres = new String[]{
                        "Ballesta con 10 virotes",
                        "Armadura ligera (justillo de cuero)", "Poción curativa",
                        "Amuleto de buena suerte"
                };
                accesos = new Profesion[]{
                        new Profesion(NomProf.ROMPESCUDO)
                };
                salidas = new Profesion[]{
                        new Profesion(NomProf.BATIDOR),
                        new Profesion(NomProf.CAZARRATAS),
                        new Profesion(NomProf.ROMPESCUDO),
                        new Profesion(NomProf.VETERANO)
                };
                break;

            case ROMPESCUDO:
                stats.put(Stat.HA, 10);
                stats.put(Stat.F, 5);
                stats.put(Stat.R, 5);
                stats.put(Stat.Ag, 10);
                stats.put(Stat.V, 5);
                stats.put(Stat.A, 1);
                stats.put(Stat.H, 2);
                habilidades = new String[]{
                        "Escalar", "Esquivar", "Orientación", "Percepción", "Seguimiento"
                };
                talentos = new String[]{
                        "Golpe conmocionador", "Golpe letal", "Golpe poderoso",
                        "Oido agudo o Sangre fría", "Orientación"
                };
                enseres = new String[]{
                        "Ballesta con 10 virotes",
                        "Armadura media (cota de malla, chaqueta de cuero y grebas de cuero",
                        "Escudo", "Gancho de escalada", "10m de cuerda", "Odre"
                };
                accesos = new Profesion[]{
                        new Profesion(NomProf.CAZARRATAS),
                        new Profesion(NomProf.CONTRABANDISTA),
                        new Profesion(NomProf.KOSSAR),
                        new Profesion(NomProf.MERCENARIO),
                        new Profesion(NomProf.MINERO),
                        new Profesion(NomProf.PORTADOR_RUNAS),
                        new Profesion(NomProf.SAQUEADOR_TUMBAS)
                };
                salidas = new Profesion[]{
                        new Profesion(NomProf.CONTRABANDISTA),
                        new Profesion(NomProf.GLADIADOR),
                        new Profesion(NomProf.PORTADOR_RUNAS),
                        new Profesion(NomProf.ROMPESCUDO),
                        new Profesion(NomProf.SARGENTO),
                        new Profesion(NomProf.VETERANO)
                };
                break;

            /*------------------------------------------------------------------------------------*/

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

    public String[] getHabilidades() {
        return habilidades;
    }

    public String[] getTalentos() {
        return talentos;
    }

    public String[] getEnseres() {
        return enseres;
    }

    public Profesion[] getAccesos() {
        return accesos;
    }

    public Profesion[] getSalidas() {
        return salidas;
    }
}

