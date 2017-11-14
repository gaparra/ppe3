/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author g.parra
 */
public class Responsable extends Employe {

    private String poste;

    public Responsable(Integer id, String nom, String prenom, String courriel, String embauche, String adresse, String annee_naissance, String position, String role) {
        super(id, nom, prenom, courriel, embauche, adresse, annee_naissance, position, role);
        this.poste = "Responsable";

    }

    @Override
    public void modifPos(int i) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Chaine de connexion (prise dans l'onglet services)
            String connexionUrl = "jdbc:mysql://localhost:3333/gsbperso?user=applietudiants&password=sio";
            
            //etablissement de la connexion
            Connection maConnexion = (Connection) DriverManager.getConnection(connexionUrl);
            
            //requete
            Statement requete = maConnexion.createStatement();

            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Responsable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

}
