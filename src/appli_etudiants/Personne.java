/*
 * To change this template, choose Tools | Templates
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
 * @author nc
 */
public class Personne {

    private Integer id;
    private String nom;
    private String prenom;
    private String courriel;
    private String embauche;
    private String annee_naissance;
    private String adresse;
    private String position;
    private String role;

    public Personne(Integer id, String nom, String prenom, String courriel, String embauche, String adresse, String annee_naissance, String position, String role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.courriel = courriel;
        this.embauche = embauche;
        this.adresse = adresse;
        this.annee_naissance = annee_naissance;
        this.position = position;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    public String voirPos() {
        return getPosition();
    }

    public String modifPos(int i, String categorie) {
    return"";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRole() {
        return this.getClass().getName();
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNom() {
        return nom;
    }

    public String getAnnee_naissance() {
        return annee_naissance;
    }

    public void setAnnee_naissance(String annee_naissance) {
        this.annee_naissance = annee_naissance;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Chaine de connexion (prise dans l'onglet services)
            String connexionUrl = "jdbc:mysql://localhost:3333/gsbperso?user=applietudiants&password=sio";
            
            //etablissement de la connexion
            Connection maConnexion = (Connection) DriverManager.getConnection(connexionUrl);
            
            //requete
            Statement requete = maConnexion.createStatement();

            Integer id=this.getId();
            
          requete.executeUpdate("update utilisateurs set annee_naissance ='"+annee_naissance+"'where id_utilisateur="+id+";");

            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Responsable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getEmbauche() {
        return embauche;
    }

    public void setEmbauche(String embauche) {
        this.embauche = embauche;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
