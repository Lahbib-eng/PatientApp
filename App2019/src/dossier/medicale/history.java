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
public class history {
    public String cinh;
    public String historique;

    public void setCinh(String cinh) {
        this.cinh = cinh;
    }

    public void setHistorique(String historique) {                          //recuperation des données de l'interface historique
        this.historique = historique;
    }

    public String getCinh() {
        return cinh;
    }

    public String getHistorique() {
        return historique;
    }
}
