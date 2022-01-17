/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier.medicale;

/**
 *
 * @author geekl
 */
public class dossier {
    public String ref;
     public String nom;
     public String cinpp;
      public String prenom;                                //recuperation des données de l'interface Ajout
       public String tel;
         public String date;
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
         public String sexe;

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setCinpp(String CIN) {
        this.cinpp = CIN;
    }

    public String getCinpp() {
        return cinpp;
    }

    public String getSexe() {
        return sexe;
    }
 public String ann;
           public String historique;

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getRef() {
        return ref;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTel() {
        return tel;
    }
         
}
