package Classes;

import java.util.Objects;

/**
 * classe Formateur
 * @author Nicolas Van Driessche
 * @version 1.0
 */

public class Formateur {

    /**
     * id unique du formateur
     */
    private int id;

    /**
     * mail unique du formateur
     */
    private String mail;
    /**
     * nom du formateur
     */
    private String nom;
    /**
     * prénom du formateur
     */
    private String prenom;

    /**
     * constructeur paramétré
     * @param id id unique du formateur
     * @param )ail mail unique du formateur
     * @param nom nom du formateur
     * @param prenom prénom du formateur
     */
    public Formateur(int id, String mail, String nom, String prenom) {
        this.id = id;
        this.mail = mail;
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * getter id
     * @return id du formateur
     */
    public int getId() {
        return id;
    }

    /**
     * setter id
     * @param id nouveau id du formateur
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter mail
     * @return adresse mail du formateur
     */

    public String getMail() {
        return mail;
    }

    /**
     * setter mail
     * @param mail nouveau mail du formateur
     */

    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * getter nom
     * @return nom du formateur
     */

    public String getNom() {
        return nom;
    }

    /**
     * setter nom
     * @param nom nouveau nom pour le formateur
     */

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * getter prénom
     * @return prénom du formateur
     */

    public String getPrenom() {
        return prenom;
    }

    /**
     * setter prénom
     * @param prenom nouveau prénom pour le formateur
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * égalité de deux formateurs basée sur l'id et le mail du formateur
     * @param o autre formateur
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formateur formateur = (Formateur) o;
        return id == formateur.id && Objects.equals(mail, formateur.mail);
    }

    /**
     * calcul du hashcode du formateur basé sur son mail, nom et prénom
     * @return valeur du hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(mail, nom, prenom);
    }

    /**
     * to string de la classe
     * @return
     */
    @Override
    public String toString() {
        return "Formateur{" +
                "id=" + id +
                ", mail='" + mail + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
