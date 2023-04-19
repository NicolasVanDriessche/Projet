package mvp.model;

import Classes.Formateur;

import java.util.List;

public interface DAOFormateur {

    Formateur addFormateur(Formateur fo);

    boolean removeFormateur(Formateur fo);

    List<Formateur> getFormateur();

    Formateur updateFormateur(Formateur formateur);

    Formateur readFormateur(int idFormateur);
}
