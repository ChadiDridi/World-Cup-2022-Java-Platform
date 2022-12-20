/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Arrays;

/**
 *
 * @author mahmoud
 */
public class Tournoi {
    String Vpool[] ;
    String dateTournoi;
    protected String equipesSortant[];
    protected String equipesRestant[];
    String localisation;

    public Tournoi( String dateTournoi, String[] equipesSortant, String[] equipesRestant, String localisation) {
        this.dateTournoi = dateTournoi;
        this.equipesSortant = equipesSortant;
        this.equipesRestant = equipesRestant;
        this.localisation = localisation;
    }

    public String[] getVpool() {
        return Vpool;
    }

    public void setVpool(String[] Vpool) {
        this.Vpool = Vpool;
    }

    public String getDateTournoi() {
        return dateTournoi;
    }

    public void setDateTournoi(String dateTournoi) {
        this.dateTournoi = dateTournoi;
    }

    public String[] getEquipesSortant() {
        return equipesSortant;
    }

    public void setEquipesSortant(String[] equipesSortant) {
        this.equipesSortant = equipesSortant;
    }

    public String[] getEquipesRestant() {
        return equipesRestant;
    }

    public void setEquipesRestant(String[] equipesRestant) {
        this.equipesRestant = equipesRestant;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    @Override
    public String toString() {
        return "Tournoi{" +  " dateTournoi=" + dateTournoi + ", equipesSortant=" + Arrays.toString(equipesSortant) + ", equipesRestant=" + Arrays.toString(equipesRestant) + ", localisation=" + localisation + '}';
    }
    
    
    
}

