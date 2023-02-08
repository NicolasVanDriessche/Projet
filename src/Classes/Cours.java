package Classes;

import java.util.Objects;

public class Cours {
    private int id;
    private String matiere;
    private int heures;
    public Cours(int id, String matiere, int heures){
        this.id=id;
        this.matiere=matiere;
        this.heures=heures;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cours cours = (Cours) o;
        return id == cours.id && heures == cours.heures && Objects.equals(matiere, cours.matiere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, matiere, heures);
    }
}
