package mvp.presenter;

import Classes.Cours;
import Classes.SessionCours;
import mvp.model.DAOSessionCours;
import mvp.view.SessionCoursViewInterface;

import java.util.List;

public class SessionCoursPresenter {
    private DAOSessionCours model;

    private SessionCoursViewInterface view;

    public SessionCoursPresenter(DAOSessionCours model, SessionCoursViewInterface view){
        this.model=model;
        this.view=view;
        this.view.setPresenter(this);
    }

    public void start(){
        List<SessionCours> sessions = model.getSessionCours();
        view.setListDatas(sessions);
    }

    public void addSessionCours(SessionCours session){
        SessionCours s = model.addSessionCours(session);
        if(s!=null) view.affMsg("Création de :"+s);
        else view.affMsg("erreur de création");
        List<SessionCours> sessions = model.getSessionCours();
        view.setListDatas(sessions);
    }

    public void removeSessionCours(SessionCours session){
        boolean ok = model.removeSessionCours(session);
        if(ok) view.affMsg("cours effacé");
        else view.affMsg("cours non effacé");
        List<SessionCours> sessions = model.getSessionCours();
        view.setListDatas(sessions);
    }

    public void update(SessionCours session){
        SessionCours s = model.updateSessionCours(session);
        if(s==null) view.affMsg("mise à jour infructueuse");
        else view.affMsg("mise à jouer effectuée :"+s);
    }

    public List<SessionCours> getAll(){
        return model.getSessionCours();
    }
}
