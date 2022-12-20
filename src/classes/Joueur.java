/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
/**
 *
 * @author mahmoud
 */
public class Joueur {
    String nom;
    String pays;
    int nbrCartes ;
    int nbrButs;
    int nbrMatchJoue;
    String etatJoueur;

    public Joueur(String nom, String pays, int nbrCartes, int nbrButs, int nbrMatchJoue, String etatJoueur) {
        this.nom = nom;
        this.pays = pays;
        this.nbrButs = nbrButs;
        this.nbrMatchJoue = nbrMatchJoue;
        this.etatJoueur = etatJoueur;
        this.nbrCartes=nbrCartes;
    }

    public Joueur() {}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getNbrButs() {
        return nbrButs;
    }

    public void setNbrButs(int nbrButs) {
        this.nbrButs = nbrButs;
    }

    public int getNbrMatchJoue() {
        return nbrMatchJoue;
    }

    public void setNbrMatchJoue(int nbrMatchJoue) {
        this.nbrMatchJoue = nbrMatchJoue;
    }

    public String getEtatJoueur() {
        return etatJoueur;
    }

    public void setEtatJoueur(String etatJoueur) {
        this.etatJoueur = etatJoueur;
    }

    public int getNbrCartes() {
        return nbrCartes;
    }

    public void setNbrCartes(int nbrCartes) {
        this.nbrCartes = nbrCartes;
    }

    @Override
    public String toString() {
        return "Joueur{" + "nom=" + nom + ", pays=" + pays + ", nbrCartes=" + nbrCartes + ", nbrButs=" + nbrButs + ", nbrMatchJoue=" + nbrMatchJoue + ", etatJoueur=" + etatJoueur + '}';
    }
    
    
}

