/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author mahmoud
 */
public class Carriere {
    int ageJoueur;
    String ancienEquipes[];
    String titres[];
    int nbrButTotal;
    int anneeExperience;

    public Carriere(int ageJoueur, String[] ancienEquipes, String[] titres, int nbrButTotal, int anneeExperience) {
        this.ageJoueur = ageJoueur;
        this.ancienEquipes = ancienEquipes;
        this.titres = titres;
        this.nbrButTotal = nbrButTotal;
        this.anneeExperience = anneeExperience;
    }

    public int getAgeJoueur() {
        return ageJoueur;
    }

    public void setAgeJoueur(int ageJoueur) {
        this.ageJoueur = ageJoueur;
    }

    public String[] getAncienEquipes() {
        return ancienEquipes;
    }

    public void setAncienEquipes(String[] ancienEquipes) {
        this.ancienEquipes = ancienEquipes;
    }

    public String[] getTitres() {
        return titres;
    }

    public void setTitres(String[] titres) {
        this.titres = titres;
    }

    public int getNbrButTotal() {
        return nbrButTotal;
    }

    public void setNbrButTotal(int nbrButTotal) {
        this.nbrButTotal = nbrButTotal;
    }

    public int getAnneeExperience() {
        return anneeExperience;
    }

    public void setAnneeExperience(int anneeExperience) {
        this.anneeExperience = anneeExperience;
    }

    @Override
    public String toString() {
        return "Carriere{" + "ageJoueur=" + ageJoueur + ", ancienEquipes=" + Arrays.toString(ancienEquipes) + ", titres=" + Arrays.toString(titres) + ", nbrButTotal=" + nbrButTotal + ", anneeExperience=" + anneeExperience + '}';
    }

    
    
}
