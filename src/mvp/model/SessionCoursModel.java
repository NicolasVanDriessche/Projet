package mvp.model;

import Classes.SessionCours;

import java.util.ArrayList;
import java.util.List;

public class SessionCoursModel implements DAOSessionCours {
    private List<SessionCours> sessions = new ArrayList<>();

    @Override
    public SessionCours addSessionCours(SessionCours scs){
        boolean present = sessions.contains(scs);
        if(!present){
            sessions.add(scs);
            return scs;
        }
        else return null;
    }

    @Override
    public boolean removeSessionCours(SessionCours scs){
        return sessions.remove(scs);
    }

    @Override
    public List<SessionCours> getSessionCours() {
        return new ArrayList<>(sessions);
    }

    @Override
    public SessionCours updateSessionCours(SessionCours session){
        int p =  sessions.indexOf(session);
        if(p<0) return null;
        sessions.set(p, session);
        return session;
    }

}
