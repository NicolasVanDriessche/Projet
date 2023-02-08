package Classes;

import java.util.Objects;

public class Local {
    private int id;
    private String sigle;
    private int places;
    private String description;
    public Local(int id, String sigle, int places, String description) {
        this.id = id;
        this.sigle = sigle;
        this.places = places;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Local local = (Local) o;
        return id == local.id && places == local.places && sigle.equals(local.sigle) && description.equals(local.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sigle, places, description);
    }
}
