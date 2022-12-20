/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXML;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mahmoud
 */
public class LoginJoueurController implements Initializable {

    @FXML
    private ImageView homeImg;
    @FXML
    private TextField identifiant;
    @FXML
    private PasswordField mdp;
    @FXML
    private Button btnJoueur;
    @FXML
    private Button btnRetour;
    @FXML
    private AnchorPane AP;
    @FXML
    private Button creation;
    /**
     * Initializes the controller class.
     */
    
    Map<String,String> tabJoueurs;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    tabJoueurs =new HashMap();
     tabJoueurs.put("mohamed@gmail.com","123");
    tabJoueurs.put("chadi@gmail.com","123");
    tabJoueurs.put("iyed@gmail.com","123");
    tabJoueurs.put("nouira@gmail.com","123");
    }    

    @FXML
    private void connecterJr(ActionEvent event) {
        int compteur=0;
        String log ; 
        String pw;
        log=identifiant.getText();
        pw=mdp.getText();

        if((tabJoueurs.containsKey(log)) && (tabJoueurs.get(log).equals(pw))){
                 compteur=1;
                 System.out.println("Connexion Joueur correcte"); 
                 try {
                 Stage st =new Stage();
            AP.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("espaceJoueur.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Gestion Coupe De Monde ");
            st.setScene(scene);
            st.show();
            st.setResizable(true);
            } catch (IOException ex) {
            Logger.getLogger(GestionCoupMonde.class.getName()).log(Level.SEVERE, null, ex);
            }}
            
        if(compteur==0){
        System.out.println("Connexion Joueur incorrecte veuillez verifier les coordonnées");  
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(" Alert");
                alert.setContentText("connexion Joueur erronée,veuillez verifier les coordonnées !");
                alert.showAndWait();
    }}
    @FXML
    private void creerJr(ActionEvent event) {
        String log ; 
        String pw;
        log=identifiant.getText();
        pw=mdp.getText();
        tabJoueurs.put(log, pw);
        identifiant.setText("");
        mdp.setText("");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(" Felicitation");
                alert.setContentText("Creation du compte Joueur avec succées !");
                alert.showAndWait();
    }
    @FXML
    private void home(ActionEvent event) {
                try {
            Stage st =new Stage();
            AP.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
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
