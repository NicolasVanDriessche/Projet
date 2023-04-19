package mvp.view;

import Classes.Local;
import mvp.presenter.LocalPresenter;
import utilitaires.Utilitaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LocalViewConsole implements LocalViewInterface{

    private LocalPresenter presenter;
    private List<Local> lloc;
    private Scanner sc = new Scanner(System.in);

    public LocalViewConsole(){

    }

    @Override
    public void setPresenter(LocalPresenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void setListDatas(List<Local> locs){
        this.lloc = locs;
        Utilitaire.affListe(lloc);
        menu();
    }

    @Override
    public void affMsg(String msg){
        System.out.println("information:"+msg);
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
        System.out.println("Sigle ");
        String sigle = sc.nextLine();
        System.out.println("places ");
        int places = sc.nextInt();
        System.out.println("Description ");
        String description = sc.nextLine();
        Local loc = new Local(id, sigle, places, description);
        presenter.addLocal(loc);

    }

    public void retirer(){
        int choix = Utilitaire.choixElt(lloc);
        Local local = lloc.get(choix-1);
        presenter.removeLocal(local);
    }

    public void modifier(){
        System.out.println("id ");
        int id = sc.nextInt();
        System.out.println("Sigle ");
        String sigle = sc.nextLine();
        System.out.println("places ");
        int places = sc.nextInt();
        System.out.println("Description ");
        String description = sc.nextLine();
        Local loc = new Local(id, sigle, places, description);
        lloc=presenter.getAll();
        Utilitaire.affListe(lloc);
    }
}
