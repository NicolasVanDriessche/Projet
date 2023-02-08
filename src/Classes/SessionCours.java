package Classes;

import java.util.Date;
import java.util.Objects;

public class SessionCours {
    private int id;
    private Date dateDebut;
    private Date dateFin;
    private int nbreInscrits;

    public SessionCours(int id, Date dateDebut, Date dateFin, int nbreInscrits) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbreInscrits = nbreInscrits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getNbreInscrits() {
        return nbreInscrits;
    }

    public void setNbreInscrits(int nbreInscrits) {
        this.nbreInscrits = nbreInscrits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SessionCours that = (SessionCours) o;
        return id == that.id && nbreInscrits == that.nbreInscrits && dateDebut.equals(that.dateDebut) && dateFin.equals(that.dateFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateDebut, dateFin, nbreInscrits);
    }
}
