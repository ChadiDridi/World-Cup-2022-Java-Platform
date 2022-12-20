/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author mahmoud
 */
public class Ticket extends Paiement {
    String pays ;
    double prixTic;
    String matchTic;

    public Ticket(String pays, String matchTic) {
        this.pays=pays;
        this.matchTic = matchTic;
        this.prixTic=10.0;
    }

    public double getPrixTic() {
        return prixTic;
    }

    public void setPrixTic(double prixTic) {
        this.prixTic = prixTic;
    }

    public String getMatchTic() {
        return matchTic;
    }

    public void setMatchTic(String matchTic) {
        this.matchTic = matchTic;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    
    @Override
    public String toString() {
        return "Ticket{" + "pays=" + pays + ", prixTic=" + prixTic + ", matchTic=" + matchTic + '}';
    }
    
}

