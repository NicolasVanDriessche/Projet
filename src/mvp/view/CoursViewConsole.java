package mvp.view;

import Classes.Cours;
import mvp.presenter.CoursPresenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import utilitaires.Utilitaire;

public class CoursViewConsole implements CoursViewInterface{

    private CoursPresenter presenter;
    private List<Cours> lcours;
    private Scanner sc = new Scanner(System.in);

    public CoursViewConsole(){

    }

    @Override
    public void setPresenter(CoursPresenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void setListDatas(List<Cours> cours){
        this.lcours = cours;
        Utilitaire.affListe(lcours);
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
        System.out.println("id: ");
        int id = sc.nextInt();
        System.out.println("matière: ");
        String matiere = sc.nextLine();
        System.out.println("heures: ");
        int heures = sc.nextInt();
        Cours c = new Cours(id, matiere, heures);
        presenter.addCours(c);
    }

    public void retirer(){
        int choix = Utilitaire.choixElt(lcours);
        Cours cours = lcours.get(choix-1);
        presenter.removeCours(cours);
    }

    public void modifier(){
        System.out.println("id: ");
        int id = sc.nextInt();
        System.out.println("matière: ");
        String matiere = sc.nextLine();
        System.out.println("heures: ");
        int heures = sc.nextInt();
        Cours c = new Cours(id, matiere, heures);
        presenter.update(c);
        lcours=presenter.getAll();
        Utilitaire.affListe(lcours);
    }
}
