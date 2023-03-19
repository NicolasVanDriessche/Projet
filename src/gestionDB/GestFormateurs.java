package gestionDB;

import Classes.Formateur;
import myconnections.DBConnection;

import java.sql.*;
import java.util.Scanner;

public class GestFormateurs {
    private Scanner sc = new Scanner(System.in);
    private Connection dbConnect;

    public void gestion(){
        dbConnect = DBConnection.getConnection();
        if(dbConnect == null){
            System.exit(1);
        }
        System.out.println("Connexion établie");
        do{
            System.out.println("1.ajout\n2.recherche\n3.modification\n4.suppression\n5.tous\n6.fin");
            System.out.println("choix : ");
            int ch = sc.nextInt();
            sc.skip("\n");
            switch (ch){
                case 1:
                    ajout();
                    break;
                case 2:
                    recherche();
                    break;
                case 3:
                    modification();
                    break;
                case 4:
                    suppression();
                    break;
                case 5:
                    tous();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("choix invalie recommencez ");
            }
        }while (true);
    }

    public void ajout(){
        System.out.println("mail :");
        String mail = sc.nextLine();
        System.out.println("nom :");
        String nom = sc.nextLine();
        System.out.println("prénom :");
        String prenom = sc.nextLine();
        String query1 = "insert into APIFORMATEUR(mail, nom, prenom) values(?,?,?)";
        try(PreparedStatement pstm1= dbConnect.prepareStatement(query1)){
            pstm1.setString(1, mail);
            pstm1.setString(2, nom);
            pstm1.setString(3, prenom);
            System.out.println("ligne insérée");
        }catch (SQLException e){
            System.out.println("erreur sql :"+e);
        }

    }

    public void recherche(){
        System.out.println("id du formateur ");
        int idrech = sc.nextInt();
        String query = "select * from APIFORMATEUR where id = ?";
        try(PreparedStatement pstm = dbConnect.prepareStatement(query)){
            pstm.setInt(1, idrech);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                String mail = rs.getString(2);
                String nom = rs.getString(3);
                String prenom = rs.getString(4);
                Formateur form = new Formateur(idrech, mail, nom, prenom);
                System.out.println(form);
            }
            else {
                System.out.println("introuvable");
            }
        }catch (SQLException e){
            System.out.println("erreur sql :"+e);
        }
    }

    public void modification(){
        System.out.println("id du formateur recherché ");
        int idrech = sc.nextInt();
        sc.skip("\n");
        System.out.println("nouveau mail ");
        String nmail = sc.nextLine();
        String query = "update APIFORMATEUR set mail = ? where id = ?";
        try(PreparedStatement pstm = dbConnect.prepareStatement(query)){
            pstm.setString(1, nmail);
            pstm.setInt(2, idrech);
            int n = pstm.executeUpdate();
            if(n!=0) System.out.println(n+ "ligne màj");
            else System.out.println("introuvable");
        }catch (SQLException e){
            System.out.println("erreur sql : "+e);
        }
    }

    public void suppression(){
        System.out.println("id du client recherché ");
        int idrech = sc.nextInt();
        String query = "delete from APIFORMATEUR where id = ?";
        try(PreparedStatement pstm = dbConnect.prepareStatement(query)) {
            pstm.setInt(1,idrech);
            int n = pstm.executeUpdate();
            if(n!=0) System.out.println(n+ "ligne supprimée");
            else System.out.println("introuvable");

        } catch (SQLException e) {
            System.out.println("erreur sql :"+e);
        }
    }

    public void tous(){
        String query = "select * from APIFORMATEUR";
        try(Statement stm = dbConnect.createStatement()){
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt(1);
                String mail = rs.getString(2);
                String nom = rs.getString(3);
                String prenom = rs.getString(4);
                Formateur form = new Formateur(id, mail, nom, prenom);
                System.out.println(form);
            }
        }catch (SQLException e){
            System.out.println("erreur sql :"+e);
        }
    }
}
