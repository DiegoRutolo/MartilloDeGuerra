package es.rutolo.martillodeguerra;

import java.util.HashMap;

public class Profesion {
    private boolean valida = true;
    private String nombre;
    private boolean avanzada = false;
    private HashMap<Stat,Integer> stats;
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

        switch (nombre) {
            case PORTADOR_RUNAS:
                notas = "Solo los enanos pueden acceder a esta profesion";
                stats.put(Stat.HA, 10);
                stats.put(Stat.F, 5);
                stats.put(Stat.R, 5);
                stats.put(Stat.Ag, 10);
                stats.put(Stat.I, 5);
                stats.put(Stat.V, 5);
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
                        "Armadura ligera (justillo de cuero)", "Poción curativa",
                        "Amuleto de buena suerte"
                };
                accesos = new NomProf[]{
                        NomProf.ROMPESCUDO
                };
                salidas = new NomProf[]{
                        NomProf.BATIDOR,
                        NomProf.CAZARRATAS,
                        NomProf.ROMPESCUDO,
                        NomProf.VETERANO
                };
                break;

            case ROMPESCUDO:
                notas = "Solo los enanos pueden tener Rompescudos como profesión inicial";
                stats.put(Stat.HA, 10);
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
                        "Armadura media (cota de malla, chaqueta de cuero y grebas de cuero",
                        "Escudo", "Gancho de escalada", "10m de cuerda", "Odre"
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
                        NomProf.ROMPESCUDO,
                        NomProf.SARGENTO,
                        NomProf.VETERANO
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
}

