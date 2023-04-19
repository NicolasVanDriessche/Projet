package mvp.view;

import Classes.Formateur;
import mvp.presenter.FormateurPresenter;
import utilitaires.Utilitaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static utilitaires.Utilitaire.*;

public class FormateurViewConsole implements FormateurViewInterface {

    private FormateurPresenter presenter;
    private List<Formateur> lform;
    private Scanner sc = new Scanner(System.in);

    public FormateurViewConsole(){

    }

    @Override
    public void setPresenter(FormateurPresenter presenter){
        this.presenter=presenter;
    }

    @Override
    public void setListDatas(List<Formateur> formateurs){
        this.lform=formateurs;
        affListe(lform);
        menu();
    }

    @Override
    public void affMsg(String msg){
        System.out.println("information"+msg);
    }

    public void menu() {
        List options = new ArrayList<>(Arrays.asList("ajouter", "retirer", "rechercher","modifier","special","fin"));
        do {
            int ch = choixListe(options);

            switch (ch) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    retirer();
                    break;
                case 3:
                    rechercher();
                    break;
                case 4:
                    modifier();
                    break;
                case 5:
                    special();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }

    public void ajouter(){
        System.out.println("id ");
        int id = sc.nextInt();
        System.out.println("mail ");
        String mail = sc.nextLine();
        System.out.println("nom ");
        String nom = sc.nextLine();
        System.out.println("prénom ");
        String prenom = sc.nextLine();
        Formateur form = new Formateur(id, mail, nom, prenom);
        presenter.addFormateur(form);
        lform=presenter.getAll();
        affListe(lform);
    }

    public void retirer(){
        int choix = choixElt(lform);
        Formateur formateur = lform.get(choix-1);
        presenter.removeFormateur(formateur);
        lform=presenter.getAll();
        affListe(lform);
    }

    public void modifier(){
        int choix = choixElt(lform);
        Formateur f = lform.get(choix-1);
        System.out.println("id ");
        int id = sc.nextInt();
        System.out.println("mail ");
        String mail = sc.nextLine();
        System.out.println("nom ");
        String nom = sc.nextLine();
        System.out.println("prénom ");
        String prenom = sc.nextLine();
        Formateur form = new Formateur(id, mail, nom, prenom);
        presenter.update(form);
        lform=presenter.getAll();
        affListe(lform);

    }

    public void rechercher(){
        System.out.println("numFormateur : ");
        int idFormateur = sc.nextInt();
        presenter.search(idFormateur);
    }

    public void special(){

    }
}
