package Classes;

import java.util.Objects;

/**
 * classe Infos
 * @author Nicolas Van Driessche
 * @version 1.0
 */

public class Infos {

    /**
     * nombre d'heures pour un cours
     */
    private int nh;

    /**
     * Objet formateur
     */
    private Formateur formateur;

    /**
     * constructeur paramétré
     * @param nh nombre d'heures pour un cours
     * @param formateur objet formateur
     */

    public Infos(int nh, Formateur formateur) {
        this.nh = nh;
        this.formateur = formateur;
    }

    /**
     * getter nombre d'heures
     * @return le nombre d'heures
     */
    public int getNh() {
        return nh;
    }

    /**
     * setter nombre d'heures
     * @param nh changement du nombre d'heures
     */
    public void setNh(int nh) {
        this.nh = nh;
    }

    /**
     * getter de l'objet formateur
     * @return
     */

    public Formateur getFormateur() {
        return formateur;
    }

    /**
     * setter de l'objet formateur
     * @param formateur changement de formateur
     */

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    /**
     * égalité basée sur le nh et le formateur
     * @param o autre infos
     * @return égalité ou pas
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Infos infos = (Infos) o;
        return nh == infos.nh && Objects.equals(formateur, infos.formateur);
    }

    /**
     * calcul du hashcode basé sur le nh et le formateur
     * @return resultat du hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(nh, formateur);
    }
}
