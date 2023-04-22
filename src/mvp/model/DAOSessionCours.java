package mvp.model;

import Classes.SessionCours;

import java.util.List;

public interface DAOSessionCours {

    SessionCours addSessionCours(SessionCours scs);

    boolean removeSessionCours(SessionCours scs);

    List<SessionCours> getSessionCours();

    SessionCours updateSessionCours(SessionCours sessions);
}
