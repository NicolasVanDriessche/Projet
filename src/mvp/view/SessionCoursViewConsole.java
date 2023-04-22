package mvp.view;

import Classes.Cours;
import Classes.SessionCours;
import mvp.presenter.CoursPresenter;
import mvp.presenter.SessionCoursPresenter;
import utilitaires.Utilitaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static utilitaires.Utilitaire.choixElt;

public class SessionCoursViewConsole implements SessionCoursViewInterface{

    private SessionCoursPresenter presenter;
    private List<SessionCours> lscs;
    private Scanner sc = new Scanner(System.in);

    public SessionCoursViewConsole(){

    }

    @Override
    public void setPresenter(SessionCoursPresenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void setListDatas(List<SessionCours> sessions){
        this.lscs = sessions;
        Utilitaire.affListe(lscs);
        menu();
    }

    @Override
    public void affMsg(String msg){
        System.out.println("information: "+msg);
    }

    public void menu() {
        List options = new ArrayList<>(Arrays.asList("ajouter", "retirer", "modifier", "fin"));
        do {
            int ch = Utilitaire.choixListe(options);

            switch (ch) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    retirer();
                    break;
                case 3:
                    modifier();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }

    public void ajouter(){
        System.out.println("id ");
        int id = sc.nextInt();
        System.out.println("date de début ");
        String[] jma = sc.nextLine().split(" ");
        int j = Integer.parseInt(jma[0]);
        int m = Integer.parseInt(jma[1]);
        int a = Integer.parseInt(jma[2]);
        LocalDate db= LocalDate.of(a, m, j);
        System.out.println("date de fin ");
        String[] jma2 = sc.nextLine().split(" ");
        int j2 = Integer.parseInt(jma[0]);
        int m2 = Integer.parseInt(jma[1]);
        int a2 = Integer.parseInt(jma[2]);
        LocalDate df = LocalDate.of(a2, m2, j2);
        System.out.println("nbr inscrits ");
        int nbr = sc.nextInt();
        SessionCours s = new SessionCours(id, db, df, nbr);
        presenter.addSessionCours(s);


    }

    public void retirer(){
        int choix = choixElt(lscs);
        SessionCours sessions = lscs.get(choix-1);
        presenter.removeSessionCours(sessions);
    }

    public void modifier(){
        int choix = choixElt(lscs);
        SessionCours ses = lscs.get(choix-1);
        System.out.println("id ");
        int id = sc.nextInt();
        System.out.println("date de début ");
        String[] jma = sc.nextLine().split(" ");
        int j = Integer.parseInt(jma[0]);
        int m = Integer.parseInt(jma[1]);
        int a = Integer.parseInt(jma[2]);
        LocalDate db= LocalDate.of(a, m, j);
        System.out.println("date de fin ");
        String[] jma2 = sc.nextLine().split(" ");
        int j2 = Integer.parseInt(jma[0]);
        int m2 = Integer.parseInt(jma[1]);
        int a2 = Integer.parseInt(jma[2]);
        LocalDate df = LocalDate.of(a2, m2, j2);
        System.out.println("nbr inscrits ");
        int nbr = sc.nextInt();
        SessionCours s = new SessionCours(id, db, df, nbr);
        presenter.update(s);
        lscs=presenter.getAll();
        Utilitaire.affListe(lscs);

    }
}
