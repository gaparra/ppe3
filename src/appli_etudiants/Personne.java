/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

/**
 *
 * @author nc
 */
public class Personne {

    private String nom;
    private String prenom;
    private String courriel;
    private String embauche;
    private String annee_naissance;
    private String adresse;
    private String position;
    private String role;

    public Personne(String nom, String prenom, String courriel, String embauche, String adresse, String annee_naissance, String position, String role) {
        this.nom = nom;
        this.prenom = prenom;
        this.courriel = courriel;
        this.embauche = embauche;
        this.adresse = adresse;
        this.annee_naissance = annee_naissance;
        this.position = position;
        this.role = role;
    }

    public String voirPos() {
        return getPosition();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRole() {
        return role;
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
