/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/**
 *
 * @author mahmoud and chadi
 */
public class Pays {
    String nomPays;
    int score;
    Map<String,Integer> nbrCartes = new HashMap<String, Integer>();
    ArrayList<String> tabJoueur = new ArrayList<String>();

    public Pays(String nomPays, int score,Map<String,Integer> nbrCartes,ArrayList<String> tabJoueur) {
        this.nomPays = nomPays;
        this.score = score;
        this.nbrCartes=nbrCartes;
        this.tabJoueur=tabJoueur;
    }

    public Map<String, Integer> getNbrCartes() {
        return nbrCartes;
    }

    public void setNbrCartes(Map<String, Integer> nbrCartes) {
        this.nbrCartes = nbrCartes;
    }

    public ArrayList<String> getTabJoueur() {
        return tabJoueur;
    }

    public void setTabJoueur(ArrayList<String> tabJoueur) {
        this.tabJoueur = tabJoueur;
    }
    public Pays() {}

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pays{");
        sb.append("nomPays=").append(nomPays);
        sb.append(", score=").append(score);
        sb.append(", nbrCartes=").append(nbrCartes);
        sb.append(", tabJoueur=").append(tabJoueur);
        sb.append('}');
        return sb.toString();
    }
    
  
}



    
