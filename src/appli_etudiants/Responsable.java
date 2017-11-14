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
public class Responsable extends Employe {

    private String poste;

    public Responsable(String nom, String prenom, String courriel, String embauche, String adresse, String annee_naissance, String position, String role) {
        super(nom, prenom, courriel, embauche, adresse, annee_naissance, position, role);
        this.poste = "Responsable";

    }

    public void modifPos() {

    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

}
