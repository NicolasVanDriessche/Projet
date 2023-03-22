package mvp.model;

import Classes.Cours;

import java.util.ArrayList;
import java.util.List;

public class CoursModel implements DAOCours {
    private List<Cours> cours = new ArrayList<>();

    @Override
    public Cours addCours(Cours co){
        boolean present= cours.contains(co);
        if(!present){
            cours.add(co);
            return co;
        }
        else return null;
    }

    @Override
    public boolean removeCours(Cours co) {
        return cours.remove(co);
    }

    @Override
    public List<Cours> getCours() {
        return new ArrayList<>(cours);
    }
}
