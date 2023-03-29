package mvp.presenter;

import Classes.Cours;
import mvp.model.DAOCours;
import mvp.view.CoursViewInterface;

import java.util.List;

public class CoursPresenter {

    private DAOCours model;

    private CoursViewInterface view;

    public CoursPresenter(DAOCours model, CoursViewInterface view){
        this.model = model;
        this.view = view;
        this.view.setPresenter(this);
    }

    public void start(){
        List<Cours> cours = model.getCours();
        view.setListDatas(cours);
    }

    public void addCours(Cours cour){
        Cours c = model.addCours(cour);
        if(c!=null) view.affMsg("Création de :"+c);
        else view.affMsg("erreur de création");
        List<Cours> cours = model.getCours();
        view.setListDatas(cours);
    }

    public void removeCours(Cours cour){
        boolean ok = model.removeCours(cour);
        if(ok) view.affMsg("cours effacé");
        else view.affMsg("cours non effacé");
        List<Cours> cours = model.getCours();
        view.setListDatas(cours);
    }

    public void update(Cours cour){
        Cours c = model.updateCours(cour);
        if(c==null) view.affMsg("mise à jour infructueuse");
        else view.affMsg("mise à jouer effectuée :"+c);
    }

    public List<Cours> getAll(){
        return model.getCours();
    }

}
