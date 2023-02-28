package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * classe Local
 * @author Nicolas Van Driessche
 * @version 1.0
 */

public class Local {

    /**
     * Identifiant unique du local
     */
    private int id;

    /**
     * Sigle unique du local
     */
    private String sigle;
    /**
     * nombre de places disponibles du local
     */
    private int places;
    /**
     * description du local
     */
    private String description;

    /**
     * liste de Session des cours
     */
    private List<SessionCours> session = new ArrayList<>();

    /**
     * constructeur paramétré
     * @param id identifiant unique du local
     * @param sigle sigle unique du local
     * @param places nombre de places disponibles du local
     * @param description description du local
     */
    public Local(int id, String sigle, int places, String description) {
        this.id = id;
        this.sigle = sigle;
        this.places = places;
        this.description = description;
    }

    /**
     * getter id
     * @return l'identifiant du local
     */

    public int getId() {
        return id;
    }

    /**
     * setter id
     * @param id nouveau identifiant du local
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * sigle
     * @return sigle du local
     */
    public String getSigle() {
        return sigle;
    }

    /**
     * setter sigle
     * @param sigle nouveau sigle pour le local
     */

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    /**
     * getter places
     * @return nombre places dispo du local
     */

    public int getPlaces() {
        return places;
    }

    /**
     * setter places
     * @param places changement nombre de places dispo du local
     */

    public void setPlaces(int places) {
        this.places = places;
    }

    /**
     * getter description
     * @return la description du local
     */

    public String getDescription() {
        return description;
    }

    /**
     * setter description
     * @param description changement de la description du local
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getter liste de session du cours
     * @return la liste de session des cours
     */

    public List<SessionCours> getSession() {
        return session;
    }

    /**
     * setter liste de session des cours
     * @param session nouvelle liste de session des cours
     */

    public void setSession(List<SessionCours> session) {
        this.session = session;
    }

    /**
     * test d'égalité basé sur le sigle du local
     * @param o autre local
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Local local = (Local) o;
        return Objects.equals(sigle, local.sigle);
    }

    /**
     * calcul du hashcode basé sur le sigle
     * @return hashcode du local
     */
    @Override
    public int hashCode() {
        return Objects.hash(sigle);
    }
}
