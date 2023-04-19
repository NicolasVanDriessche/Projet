package mvp.presenter;

import Classes.Formateur;
import mvp.model.DAOFormateur;
import mvp.view.FormateurViewInterface;

import java.util.List;

public class FormateurPresenter {
    private DAOFormateur model;
    private FormateurViewInterface view;

    public FormateurPresenter(DAOFormateur model, FormateurViewInterface view){
        this.model = model;
        this.view = view;
        this.view.setPresenter(this);
    }

    public void start(){
        List<Formateur> formateurs = model.getFormateur();
        view.setListDatas(formateurs);
    }

    public void addFormateur(Formateur formateur){
        Formateur form = model.addFormateur(formateur);
        if(form!=null) view.affMsg("création de "+form);
        else view.affMsg("erreur de création");
        List<Formateur> formateurs = model.getFormateur();
        view.setListDatas(formateurs);
    }

    public void update(Formateur formateur){
        Formateur f = model.updateFormateur(formateur);
        if(f==null) view.affMsg("mise à jour infructueuse");
        else view.affMsg("mise à joue effectuée : "+f);
    }

    public List<Formateur> getAll(){
        return model.getFormateur();
    }

    public void search(int idFormateur){
        Formateur f = model.readFormateur(idFormateur);
        if(f==null) view.affMsg("recherce infructueuse");
        else view.affMsg((model.toString()));
    }

    public void removeFormateur(Formateur formateur){
        boolean ok = model.removeFormateur(formateur);
        if(ok) view.affMsg("formateur effacé");
        else view.affMsg("lecteur non effacé");
        List<Formateur> formateurs = model.getFormateur();
        view.setListDatas(formateurs);
    }
}
