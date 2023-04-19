package mvp.presenter;

import Classes.Local;
import mvp.model.DAOFormateur;
import mvp.model.DAOLocal;
import mvp.view.LocalViewInterface;

import java.util.List;

public class LocalPresenter {

    private DAOLocal model;
    private LocalViewInterface view;

    public LocalPresenter(DAOLocal model, LocalViewInterface view){
        this.model = model;
        this.view = view;
        this.view.setPresenter(this);
    }

    public void start(){
        List<Local> locs = model.getLocal();
        view.setListDatas(locs);
    }

    public void addLocal(Local local){
        Local loc = model.addLocal(local);
        if(loc!=null) view.affMsg("création de :"+loc);
        else view.affMsg("erreur de création");
        List<Local> locs = model.getLocal();
        view.setListDatas(locs);
    }

    public void removeLocal(Local local){
        boolean ok = model.removeLocal(local);
        if(ok) view.affMsg("lecteur effacé");
        else view.affMsg("lecteur non effacé");
        List<Local> locs = model.getLocal();
        view.setListDatas(locs);
    }

    public void update(Local local){
        Local l = model.updateLocal(local);
        if(l==null) view.affMsg("mise à jour infructueuse");
        else view.affMsg("mise à jour effectuée : "+l);
    }

    public List<Local> getAll(){
        return model.getLocal();
    }


}
