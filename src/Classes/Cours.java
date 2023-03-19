package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * classe Cours
 * @author Nicolas Van Driessche
 * @version 1.0
 */

public class Cours {

    /**
     * identifiant unique du cours
     */
    private int id;

    /**
     * nom de la matière
     */
    private String matiere;

    /**
     * nombre d'heures pour cette matière
     */
    private int heures;

    /**
     * liste de Session des cours
     */
    private List<SessionCours> session = new ArrayList<>();

    /**
     * constructeur paramétré
     * @param id identifiant du cours
     * @param matiere nom du cours
     * @param heures nombre d'heures du cours
     */
    public Cours(int id, String matiere, int heures){
        this.id=id;
        this.matiere=matiere;
        this.heures=heures;
    }

    /**
     * getter id
     * @return id du cours
     */
    public int getId() {
        return id;
    }

    /**
     * setter id
     * @param id nouveau identifiant pour la matière
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter matiere
     * @return le nom du cours
     */

    public String getMatiere() {
        return matiere;
    }

    /**
     * setter matiere
     * @param matiere nouveau nom pour le cours
     */

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    /**
     * getter heures
     * @return nombre d'heures du cours
     */
    public int getHeures() {
        return heures;
    }

    /**
     * setter heures
     * @param heures changement du nombre d'heures pour le cours
     */
    public void setHeures(int heures) {
        this.heures = heures;
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
     * égalité basée sur l'id et le nom de la matière
     * @param o autre cours
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cours cours = (Cours) o;
        return id == cours.id && Objects.equals(matiere, cours.matiere);
    }

    /**
     * calcul du hashcode basé sur l'id et la matière
     * @return hashcode du cours
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, matiere);
    }

    /**
     * to string de la classe
     * @return
     */
    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", matiere='" + matiere + '\'' +
                ", heures=" + heures +
                ", session=" + session +
                '}';
    }
}
