package Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * classe SessionCours
 * @author Nicolas Van Driessche
 * @version 1.0
 */

public class SessionCours {

    /**
     * id unique de sessioncours
     */
    private int id;

    /**
     * Date de début de la session
     */
    private Date dateDebut;

    /**
     * date de fin de la session
     */
    private Date dateFin;
    /**
     * nbre d'inscrits pour la session
     */
    private int nbreInscrits;

    /**
     * liste d'infos
     */
    private List<Infos> infos = new ArrayList<>();

    /**
     * constructeur paramétré
     * @param id identifiant de sessionCours
     * @param dateDebut date de début des sessions
     * @param dateFin date de fin des sessions
     * @param nbreInscrits nbre d'inscrits pour les sessions
     */

    public SessionCours(int id, Date dateDebut, Date dateFin, int nbreInscrits) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbreInscrits = nbreInscrits;
    }

    /**
     * getter liste d'infos
     * @return liste d'infos
     */

    public List<Infos> getInfos() {
        return infos;
    }

    /**
     * setter liste d'infos
     * @param infos nouvelle liste d'infos
     */
    public void setInfos(List<Infos> infos) {
        this.infos = infos;
    }

    /**
     * getter id
     * @return id de SessionCours
     */
    public int getId() {
        return id;
    }

    /**
     * setter id
     * @param id changement d'id pour SessionCours
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter dateDebut
     * @return la date de début des sessions de cours
     */

    public Date getDateDebut() {
        return dateDebut;
    }

    /**
     * setter dateDebut
     * @param dateDebut changement de la date de début des sessions de cours
     */

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * getter dateFin
     * @return date de fin des sessions de cours
     */
    public Date getDateFin() {
        return dateFin;
    }

    /**
     * setter dateFin
     * @param dateFin changement de la date de fin des sessions de cours
     */

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * getter inscrits
     * @return nbre d'inscrits pour les sessions
     */
    public int getNbreInscrits() {
        return nbreInscrits;
    }

    /**
     * setter nbre d'inscrits
     * @param nbreInscrits changement du nombre d'inscrits pour les sessions de cours
     */

    public void setNbreInscrits(int nbreInscrits) {
        this.nbreInscrits = nbreInscrits;
    }

    /**
     * test d'égalité basé sur l'id, dateDebut et dateFin
     * @param o autre SessionCours
     * @return égalité ou pas
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SessionCours that = (SessionCours) o;
        return id == that.id && Objects.equals(dateDebut, that.dateDebut) && Objects.equals(dateFin, that.dateFin);
    }

    /**
     * calcul du hash code basé sur l'id, dateDebut et dateFin
     * @return hashcode de SessionCours
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, dateDebut, dateFin);
    }
}
