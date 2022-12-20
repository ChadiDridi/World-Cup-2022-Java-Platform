/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author mahmoud
 */
public class Match {
    String nomStade ;
    Map<String,Integer> resultat = new HashMap<String, Integer>();
    String equipesExistant;
    String typeSelection;
    int nbSpectateur;
    String dateMatch; 

    public Match(String nomStade,Map<String,Integer> resultat,String equipesExistant,  String typeSelection, int nbSpectateur,String dateMatch) {
        this.nomStade = nomStade;
        this.typeSelection = typeSelection;
        this.nbSpectateur = nbSpectateur;
        this.resultat=resultat;
        this.dateMatch=dateMatch;
        this.equipesExistant=equipesExistant;
    }

    public String getNomStade() {
        return nomStade;
    }

    public void setNomStade(String nomStade) {
        this.nomStade = nomStade;
    }

    public String getTypeSelection() {
        return typeSelection;
    }

    public void setTypeSelection(String typeSelection) {
        this.typeSelection = typeSelection;
    }

    public int getNbSpectateur() {
        return nbSpectateur;
    }

    public void setNbSpectateur(int nbSpectateur) {
        this.nbSpectateur = nbSpectateur;
    }

    public String getEquipesExistant() {
        return equipesExistant;
    }

    public void setEquipesExistant(String equipesExistant) {
        this.equipesExistant = equipesExistant;
    }

    public String getDateMatch() {
        return dateMatch;
    }
    
    public void setDateMatch(String dateMatch) {
        this.dateMatch = dateMatch;
    }

    public Map<String, Integer> getResultat() {
        return resultat;
    }

    public void setResultat(Map<String, Integer> resultat) {
        this.resultat = resultat;
    }

    @Override
    public String toString() {
        return "Match{" + "nomStade=" + nomStade + ", resultat=" + resultat + ", equipesExistant=" + equipesExistant + ", typeSelection=" + typeSelection + ", nbSpectateur=" + nbSpectateur + ", dateMatch=" + dateMatch + '}';
    }
    
    
    
}

