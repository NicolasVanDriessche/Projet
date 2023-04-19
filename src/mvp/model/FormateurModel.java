package mvp.model;

import Classes.Formateur;

import java.util.ArrayList;
import java.util.List;

public class FormateurModel implements DAOFormateur{

    private List<Formateur> formateurs = new ArrayList<>();

    @Override
    public Formateur addFormateur(Formateur fo){
        boolean present= formateurs.contains(fo);
        if(!present){
            formateurs.add(fo);
            return fo;
        }
        else return null;
    }

    @Override
    public boolean removeFormateur(Formateur fo) {
        return formateurs.remove(fo);
    }

    @Override
    public List<Formateur> getFormateur() {
        return new ArrayList<>(formateurs);
    }

    @Override
    public Formateur updateFormateur(Formateur formateur){
        int p = formateurs.indexOf(formateur);
        if(p<0) return null;
        formateurs.set(p, formateur);
        return formateur;
    }

    @Override
    public Formateur readFormateur(int idformateur){
        for(Formateur f : formateurs){
            if(f.getId() == idformateur) return f;
        }

        return null;
    }
}
