/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.ArrayList;
/**
 *
 * @author mahmoud
 */
public class Stade {
    int nbrPlaces;
    String localisation;
    ArrayList<String> matchsStade = new ArrayList<String>();

    public Stade(int nbrPlaces, String localisation,ArrayList<String> matchsStade) {
        this.nbrPlaces = nbrPlaces;
        this.localisation = localisation;
        this.matchsStade=matchsStade;
    }

    public Stade() {}
    
    public int getNbrPlaces() {
        return nbrPlaces;
    }

    public void setNbrPlaces(int nbrPlaces) {
        this.nbrPlaces = nbrPlaces;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public ArrayList<String> getMatchsStade() {
        return matchsStade;
    }

    public void setMatchsStade(ArrayList<String> matchsStade) {
        this.matchsStade = matchsStade;
    }

    @Override
    public String toString() {
        return "Stade{" + "nbrPlaces=" + nbrPlaces + ", localisation=" + localisation + ", matchsStade=" + matchsStade + '}';
    }
    
   
}

