package es.rutolo.martillodeguerra;

public enum NomProf{
    ALBOROTADOR("Alborotador"),
    APRENDIZ_HECHICERO("Aprendiz de hechicero"),
    ALGUACIL("Alguacil"),
    ARTISTA("Artista"),
    AYUDA_CAMARA("Ayudante de cámara"),
    BARQUERO("Barquero"),
    BARBERO_CIRUJANO("Barbero cirujano"),
    BATELERO("Batelero"),
    BERSERKER("Berserker nórdico"),
    BURGUES("Burgués"),
    BRIBON("Bribón"),
    CAMPESINO("Campesino"),
    CARBONERO("Carbonero"),
    CAZADOR("Cazador"),
    CARCELERO("Carcelero"),
    CAZARRATAS("Cazarratas"),
    CAZARRECOMPENSAS("Cazarrecompensas"),
    CONTRABANDISTA("Contrabandista"),
    COCHERO("Cochero"),
    EMBAJADOR("Embajador"),
    ESCOLTA("Escolta"),
    ESCUDERO("Escudero"),
    ESCRIBA("Escriba"),
    ESPADACHIN("Espadachín estaliano"),
    ESTUDIANTE("Estudiante"),
    FORAJIDO("Forajido"),
    FANATICO("Fanático"),
    GLADIADOR("Gladiador"),
    GUERRERO_CAMARILLA("Guerrero de camarilla"),
    GUARDIA_MARINA("Guardia marina"),
    GUARDAESPALDAS("Guardaespaldas"),
    HECHICERO_VULGAR("Hechicero vulgar"),
    INICIADO("Iniciado"),
    LADRON("Ladrón"),
    KOSSAR("Kossar kislevita"),
    LADRON_TUMBAS("Ladrón de tumbas"),
    LENADOR("Leñador"),
    MATATROLLS("Matatrolls"),
    MARINERO("Marinero"),
    MATON("Matón"),
    MENESTRAL("Menestral"),
    MERCENARIO("Mercenario"),
    MENSAJERO("Mensajero"),
    MIEMBRO_SEQUITO("Miembro de séquito"),
    MILICIANO("Miliciano"),
    NOBLE("Noble"),
    MINERO("Minero"),
    OSAMENTERO("Osamentero"),
    PATRULLA_CAMINOS("Patrulla de caminos"),
    PEAJERO("Peajero"),
    PATRULLA_FRONTERIZA("Patrulla fronteriza"),
    PESCADOR("Pescador"),
    PORTADOR_RUNAS("Portador de runas"),
    SAQUEADOR_TUMBAS("Saqueador de tumbas"),
    ROMPESCUDOS("Rompescudos"),
    SICARIO("Sicario"),
    SIRVIENTE("Sirviente"),
    VAGABUNDO("Vagabundo"),
    SOLDADO("Soldado"),
    VIGILANTE("Vigilante"),
    ARTESANO("Artesano"),
    ADMINISTRADOR("Administrador"),
    ASESINO("Asesino"),
    BATIDOR("Batidor"),
    CABALLERO_INTERIOR("Caballero del Círculo interior"),
    CABALLERO("Caballero"),
    CAMPEON_JUDICIAL("Campeón judicial"),
    CAPITAN("Capitán"),
    CAZADOR_BRUJAS("Cazador de brujas"),
    CAPITAN_BARCO("Capitán de barco"),
    CAZADOR_INVISIBLE("Cazador invisible"),
    CAZAVAMPIROS("Cazavampiros"),
    CORTESANO("Cortesano"),
    CHARLATAN("Charlatán"),
    DEMAGOGO("Demagogo"),
    DUELISTA("Duelista"),
    ESPIA("Espía"),
    ERUDITO("Erudito"),
    EXPLORADOR("Explorador"),
    EXTORSIONADOR("Extorsionador"),
    FRAILE("Fraile"),
    FLAGELANTE("Flagelante"),
    GALENO("Galeno"),
    GRAN_HECHICERO("Gran hechicero"),
    HECHICERO_MAESTRO("Hechicero maestro"),
    HECHICERO_ADEPTO("Hechicero adepto"),
    HERALDO("Heraldo"),
    HEROE("Héroe"),
    INGENIERO("Ingeniero"),
    HERRERUELO("Herreruelo"),
    INTERROGADOR("Interrogador"),
    JEFE_FORAJIDOS("Jefe de forajidos"),
    LADRON_GUANTE_BLANCO("Ladrón de guante blanco"),
    JUGLAR("Juglar"),
    LADRON_EXPERTO("Ladrón experto"),
    MAESTRO_GREMIO("Maestro de gremio"),
    MATAGIGANTES("Matagigantes"),
    MATADEMONIOS("Matademonios"),
    MERCADER("Mercader"),
    NAVEGANTE("Navegante"),
    POLITICO("Político"),
    PERISTA("Perista"),
    POSADERO("Posadero"),
    SACERDOTE("Sacerdote"),
    SALTEADOR_CAMINOS("Salteador de caminos"),
    SACERDOTE_UNGIDO("Sacerdote ungido"),
    SARGENTO("Sargento"),
    SEGUNDO_BORDO("Segundo de a bordo"),
    SENOR_NOBLE("Señor noble"),
    SENOR_CRIMEN("Señor del crimen"),
    SUMO_SACERDOTE("Sumo sacerdote"),
    TIRADOR("Tirador"),
    VETERANO("Veterano");

    private String nombreProfesion;

    NomProf(String nom) {
        nombreProfesion = nom;
    }

    @Override
    public final String toString() {
        return nombreProfesion;
    }
    
    public static NomProf getNombre(String texto) {
        NomProf valor = null;
        for (NomProf i : NomProf.values()) {
            if (i.toString().equals(texto)) {
                valor = i;
            }
        }
        return valor;
    }

    public static boolean isHere(NomProf nomProf) {
        for (NomProf n : NomProf.values()) {
            if (n == nomProf) {
                return true;
            }
        }
        return false;
    }
}

