/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier.medicale;

import java.util.ArrayList;

/**
 *
 * @author geekl
 */
public class data {
    public static ArrayList<dossier> tab=null;
 public static ArrayList<ajout_cons> liste=null;
 private data(){
   
 }
 public static   ArrayList<dossier> getTab(){
     if(tab==null)
         tab=new ArrayList<dossier>();
     return tab;
}
  public static   ArrayList<ajout_cons> getListe(){
        if(liste==null)
         liste=new ArrayList<ajout_cons>();
        return liste;
}
}
