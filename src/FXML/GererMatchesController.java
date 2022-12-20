/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXML;
import classes.Joueur;
import java.util.HashMap;

import java.util.Map;
import java.util.ArrayList;
import gestioncoupmonde.GestionCoupMonde;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import classes.Match;
import static java.lang.Integer.parseInt;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mahmoud
 */
public class GererMatchesController implements Initializable {

    @FXML
    private TextField nbSpectateur;
    @FXML
    private TextField dateMatch;
    @FXML
    private TextField typeSelection;
    @FXML
    private TextField resultat;
    @FXML
    private TextField equipesExistant;
    @FXML
    private TextField nomStade;
    @FXML
    private ImageView homeImg;
    @FXML
    private Button afficher;
    @FXML
    private TextArea ta5;
    @FXML
    private Button ajouter;
    @FXML
    private Button modifier;
    @FXML
    private Button supprimer;
    @FXML
    private Button homeBtn;
        @FXML
    private AnchorPane AP;
        
        HashMap tabMatches = new HashMap();

    /**
     * Initializes the controller class.
     */
   ArrayList<Match> tabM;
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      tabM =new ArrayList();
    }    

        

    @FXML
    private void afficherMt(ActionEvent event) {
         String ch="";
        for( Match j : tabM ){
        ch+=j.toString()+"\n";
        }
        ta5.setText(ch);
    }

    @FXML
    private void ajouterMt(ActionEvent event) {
        try{
      String nomm=nomStade.getText();
     Map<String,Integer> res=new HashMap(); 
       String[] localvar =resultat.getText().split(":");
       String[] ch1=localvar[0].split(" ");
       String[] ch2=localvar[1].split(" ");
       res.put(ch1[0],parseInt(ch1[1]));
       res.put(ch2[1],parseInt(ch2[0]));
       
        String equipeExist=equipesExistant.getText();
        String typeSelect=typeSelection.getText();
        int nbSpect=Integer.parseInt(nbSpectateur.getText());
        String date=dateMatch.getText();
        Match m= new Match(nomm,res,equipeExist,typeSelect,nbSpect,date);
        tabM.add(m);
        nomStade.setText("");
        resultat.setText("");
        equipesExistant.setText("");
        typeSelection.setText("");
        nbSpectateur.setText("");
        dateMatch.setText("");}
        catch(Exception e){
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("verifier les coordonees du Match à ajouter!");
                alert.showAndWait();
        }
    }

    @FXML
    private void modifierMt(ActionEvent event) {
        int compteur=0;
        String nomm=nomStade.getText();
        Map<String,Integer> res=new HashMap(); 
      
       String[] localvar =resultat.getText().split(":");
       String[] ch1=localvar[0].split(" ");
       String[] ch2=localvar[1].split(" ");
       res.put(ch1[0],parseInt(ch1[1]));
       res.put(ch2[1],parseInt(ch2[0]));
       
        String equipeExist=equipesExistant.getText();
        String typeSelect=typeSelection.getText();
        int nbSpect=Integer.parseInt(nbSpectateur.getText());
        String date=dateMatch.getText();
        
        for( Match m : tabM ){
            if (m.getNomStade().equals(nomm) && m.getDateMatch().equals(date)){
                m.setResultat(res);
                m.setEquipesExistant(equipeExist);
                m.setTypeSelection(typeSelect);
                m.setNbSpectateur(nbSpect);
                compteur=1;
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("Le match a été modifié avec succées");
                alert.showAndWait();
            }
            
        }
         if(compteur==0){
            System.out.println("ce Match n existe pas il faut l inserer d'abord !!!");
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("ce Match n existe pas il faut l inserer d'abord");
                alert.showAndWait();
        }
        
        nomStade.setText("");
        resultat.setText("");
        equipesExistant.setText("");
        typeSelection.setText("");
        nbSpectateur.setText("");
        dateMatch.setText("");
    }

    @FXML
    private void supprimerMt(ActionEvent event) {
          int compteur=0;
        String nomm=nomStade.getText();
        String date=dateMatch.getText();
         for( int i=0;i<tabM.size();i++ ){
            if (tabM.get(i).getNomStade().equals(nomm) && tabM.get(i).getDateMatch().equals(date)){
                tabM.remove(i);
                compteur=1;
                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("Le match a été supprimé avec succées!");
                alert.showAndWait();
            }
           
        }
         if(compteur==0){
            System.out.println("verifier les coordonees du match a supprimer!");
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("verifier les coordonees du match a supprimer!");
                alert.showAndWait();
        }
        nomStade.setText("");
        resultat.setText("");
        equipesExistant.setText("");
        typeSelection.setText("");
        nbSpectateur.setText("");
        dateMatch.setText(""); 
    }

       @FXML
    private void home(ActionEvent event) {
            try {
            Stage st =new Stage();
            AP.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("espaceAdmin.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Gestion Coupe De Monde ");
            st.setScene(scene);
            st.show();
            st.setResizable(true);
        } catch (IOException ex) {
            Logger.getLogger(GestionCoupMonde.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
