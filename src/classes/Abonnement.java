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
public class Abonnement {
    String categorie;
    double prixAbonn;
    ArrayList<String> matchPermises = new ArrayList<String>();
    String dateDebut;
    String dateFin;

    public Abonnement(String categorie, ArrayList<String> arr ,String dateDebut, String dateFin) {
        this.categorie = categorie;
        this.matchPermises=arr;
        this.prixAbonn = 50.0;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getPrixAbonn() {
        return prixAbonn;
    }

    public void setPrixAbonn(double prixAbonn) {
        this.prixAbonn = prixAbonn;
    }

    public ArrayList<String> getMatchPermises() {
        return matchPermises;
    }

    public void setMatchPermises(ArrayList<String> matchPermises) {
        this.matchPermises = matchPermises;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Abonnement{");
        sb.append("categorie=").append(categorie);
        sb.append(", prixAbonn=").append(prixAbonn);
        sb.append(", matchPermises=").append(matchPermises);
        sb.append(", dateDebut=").append(dateDebut);
        sb.append(", dateFin=").append(dateFin);
        sb.append('}');
        return sb.toString();
    }

  
}