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
public class ajout_cons {
    public String CIN;
    public String resultat;
    public String prescription;
    public String Date;
    public String med;
    public String pose;

    public void setMed(String med) {
        this.med = med;
    }

    public void setPose(String pose) {
        this.pose = pose;
    }

    public String getMed() {
        return med;
    }

    public String getPose() {
        return pose;
    }

    public String getCIN() {
        return CIN;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getDate() {
        return Date;
    }

    public String getResultat() {
        return resultat;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
}
