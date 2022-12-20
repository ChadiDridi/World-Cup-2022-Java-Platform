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
public class Spectateur {
    int id ;
    String nationalite;
    String genre;
    int age;
    HashMap<String, Double> methodPaiem = new HashMap<String, Double>();
    String nom;
    String prenom;
    public Spectateur(int id, String nationalite, String genre, int age,HashMap<String, Double> methodPaiem, String nom, String prenom) {
        this.id = id;
        this.nationalite = nationalite;
        this.genre = genre;
        this.age = age;
        this.methodPaiem=methodPaiem;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Spectateur() {} 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Override
    public String toString() {
        return "Spectateur{" + "id=" + id + ", nationalite=" + nationalite + ", genre=" + genre + ", age=" + age + ", methodPaiem=" + methodPaiem + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

     
     
    
}

