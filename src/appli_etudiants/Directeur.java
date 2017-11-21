/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author g.parra
 */
public class Directeur extends Employe {

    private String poste;

    public Directeur(Integer id, String nom, String prenom, String courriel, String embauche, String adresse, String annee_naissance, String position, String role) {
        super(id, nom, prenom, courriel, embauche, adresse, annee_naissance, position, role);
        this.poste = "Directeur";

    }

    public void creer(Integer id, String nom, String prenom, String courriel, String embauche, String adresse, String annee_naissance, String position, String role) {
        Employe nouveau = new Employe(id, nom, prenom, courriel, embauche, adresse, annee_naissance, position, role);

    }

    public void promouvoir(int i) {
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requete
            Statement requete = maConnexion.createStatement();

            requete.executeUpdate("update utilisateurs set role ='responsable'where id_utilisateur=" + i);

        } catch (SQLException ex) {
            Logger.getLogger(Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
//         return("select nom,prenom,categorie from Utilisateurs where id_utilisateur="+i);
    }

    public void retrograder(int i) {

    }

}
