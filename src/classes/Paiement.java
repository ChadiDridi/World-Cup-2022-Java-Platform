/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
/**
 *
 * @author mahmoud
 */
public class Paiement {
    protected Pool pools ;
    protected Match matchs;

    public Pool getPools() {
        return pools;
    }

    public void setPools(Pool pools) {
        this.pools = pools;
    }

    public Match getMatchs() {
        return matchs;
    }

    public void setMatchs(Match matchs) {
        this.matchs = matchs;
    }

    @Override
    public String toString() {
        return "Paiement{" + "pools=" + pools + ", matchs=" + matchs + '}';
    }
    
    
}
