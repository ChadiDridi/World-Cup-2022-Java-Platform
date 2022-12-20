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
public class Pool extends Tournoi {
    String equipes[];
    Map<String,Integer> score = new HashMap<String, Integer>();
    String equipesGagnants[];
    String equipesVaincu[];

    public Pool(String[] Vpool, String dateTournoi, String[] equipesSortant, String[] equipesRestant, String localisation) {
        super( dateTournoi, equipesSortant, equipesRestant, localisation);
    }

    
}
