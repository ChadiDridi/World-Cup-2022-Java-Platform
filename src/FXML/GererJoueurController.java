/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXML;
import classes.Joueur;
import java.util.Map;
import java.util.ArrayList;
import gestioncoupmonde.GestionCoupMonde;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.scene.control.Alert;
/**
 * FXML Controller class
 *
 * @author mahmoud
 */
public class GererJoueurController implements Initializable {

    @FXML
    private TextField nbrMatchJoue;
    @FXML
    private TextField etatJoueur;
    @FXML
    private TextField nbrButes;
    @FXML
    private TextField pays;
    @FXML
    private TextField nbrCartes;
    @FXML
    private TextField nom;
    @FXML
    private ImageView homeImg;
    @FXML
    private Button afficher;
    @FXML
    private TextArea ta2;
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

    /**
     * Initializes the controller class.
     */
        ArrayList<Joueur> tabJ;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tabJ =new ArrayList();
        
    }    

    @FXML
    private void afficherJr(ActionEvent event) {
        String ch="";
        for( Joueur j : tabJ ){
        ch+=j.toString()+"\n";
        }
        ta2.setText(ch);
    }

    @FXML
    private void ajouterJr(ActionEvent event) {
        try{
        String nomm=nom.getText();
        String payss=pays.getText();
        int nombreCartes=Integer.parseInt(nbrCartes.getText());
        int nbrButs=Integer.parseInt(nbrButes.getText());
        int nbrMatchs=Integer.parseInt(nbrMatchJoue.getText());
        String etatJ=etatJoueur.getText();
        Joueur j= new Joueur(nomm,payss,nombreCartes,nbrButs,nbrMatchs,etatJ);
        tabJ.add(j);
        nom.setText("");
        nbrCartes.setText("");
        nbrMatchJoue.setText("");
        pays.setText("");
        etatJoueur.setText("");
        nbrButes.setText("");}
        catch(Exception e){
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("veuillez verifier les coordonnées du joueur à ajouter!");
                alert.showAndWait();
            }
        
    }

    @FXML
    private void modifierJr(ActionEvent event) {
        int compteur=0;
        String nomm=nom.getText();
        String payss=pays.getText();
        int nombreCartes=Integer.parseInt(nbrCartes.getText());
        int nbrButs=Integer.parseInt(nbrButes.getText());
        int nbrMatchs=Integer.parseInt(nbrMatchJoue.getText());
        String etatJ=etatJoueur.getText();
        for( Joueur j : tabJ ){
            if (j.getNom().equals(nomm) && j.getPays().equals(payss)){
                j.setNbrMatchJoue(nbrMatchs);
                j.setNbrCartes(nombreCartes);
                j.setNbrButs(nbrButs);
                j.setEtatJoueur(etatJ);
                compteur=1;
                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("Le Joueur a été modifié avec succées!");
                alert.showAndWait();
            
            }
            
        }
         if(compteur==0){
            System.out.println("ce joueur n existe pas il faut l inserer d'abord !!!");
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("ce joueur n existe pas il faut l inserer d'abord !");
                alert.showAndWait();
            
        }
        
        nom.setText("");
        nbrCartes.setText("");
        nbrMatchJoue.setText("");
        pays.setText("");
        etatJoueur.setText("");
        nbrButes.setText("");
    }

    @FXML
    private void supprimerJr(ActionEvent event) {
        int compteur=0;
         String nomm=nom.getText();
        String payss=pays.getText();
      /*  int nombreCartes=Integer.parseInt(nbrCartes.getText());
        int nbrButs=Integer.parseInt(nbrButes.getText());
        int nbrMatchs=Integer.parseInt(nbrMatchJoue.getText());
        String etatJ=etatJoueur.getText();*/
        for( int i=0;i<tabJ.size();i++ ){
            if (tabJ.get(i).getNom().equals(nomm) && tabJ.get(i).getPays().equals(payss)){
            tabJ.remove(i);
                compteur=1;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("Le Joueur a été supprimé avec succées!");
                alert.showAndWait();
            }
        }
        if(compteur==0){
            System.out.println("verifier les coordonees du joueur a supprimer!");
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("verifier les coordonees du joueur a supprimer!");
                alert.showAndWait();
        }
        
        nom.setText("");
        nbrCartes.setText("");
        nbrMatchJoue.setText("");
        pays.setText("");
        etatJoueur.setText("");
        nbrButes.setText("");
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
