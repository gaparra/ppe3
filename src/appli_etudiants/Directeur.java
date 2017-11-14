/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

/**
 *
 * @author g.parra
 */
public class Directeur extends Employe {

    private String poste;

    public Directeur(String nom, String prenom, String courriel, String embauche, String adresse, String annee_naissance, String position, String role) {
        super(nom, prenom, courriel, embauche, adresse, annee_naissance, position, role);
        this.poste = "Directeur";

    }

    public void creer(String nom, String prenom, String courriel, String embauche, String adresse, String annee_naissance, String position, String role) {
        Employe nouveau = new Employe(nom, prenom, courriel, embauche, adresse, annee_naissance, position, role);

    }

    public void promouvoir(int i) {

    }

    public void retrograder(int i) {

    }

}
