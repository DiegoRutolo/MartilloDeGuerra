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

        /*
        switch (nombre) {   // TODO Completar profesiones
            case ALBOROTADOR:
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
            case APRENDIZ_HECHICERO:
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
            case ALGUACIL:
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
            case ARTISTA:
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
            case AYUDANTE_CAMARA:
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
            case BARQUERO:
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
                break;
            case CAZARRATAS:
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
                break;
            case PORTADOR_RUNAS:
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
            case SAQUEADOR_TUMBAS:
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
            case ROMPESCUDO:
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

            /*------------------------------------------------------------------------------------*/

            /**

            default:
                valida = false;
        }
             **/
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

