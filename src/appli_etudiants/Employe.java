/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

/**
 *
 * @author nc
 */
public class Employe extends Personne {

    private String login;
    private String mot_de_passe;

    public Employe(String nom, String prenom, String courriel, String embauche, String adresse, String annee_naissance, String position, String role) {
        super(nom, prenom, courriel, embauche, adresse, annee_naissance, position, role);
    }

    //accesseurs
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

  

}
