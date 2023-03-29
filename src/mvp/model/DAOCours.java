package mvp.model;

import Classes.Cours;

import java.util.List;

public interface DAOCours {
    Cours addCours(Cours co);

    boolean removeCours(Cours co);

    List<Cours> getCours();

    Cours updateCours(Cours cours);
}
