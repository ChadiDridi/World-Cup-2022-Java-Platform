/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXML;
import classes.Spectateur;
import java.util.Map;
import gestioncoupmonde.GestionCoupMonde;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
public class LoginSpectateurController implements Initializable {

    @FXML
    private ImageView homeImg;
    @FXML
    private TextField identifiant;
    @FXML
    private PasswordField mdp;
    @FXML
    private Button btnSpect;
    @FXML
    private Button btnRetour;
    @FXML
    private AnchorPane AP;
    @FXML
    private Button creation;

    /**
     * Initializes the controller class.
     */
    Map<String,String> tabSpect;
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    tabSpect =new HashMap();
    tabSpect.put("mohamed@gmail.com","123");
    tabSpect.put("chadi@gmail.com","123");
    tabSpect.put("iyed@gmail.com","123");
    tabSpect.put("nouira@gmail.com","123");
        
    }    

    @FXML
    private void connecterSp(ActionEvent event) {
        int compteur=0;
        String log ; 
        String pw;
        log=identifiant.getText();
        pw=mdp.getText();

        if((tabSpect.containsKey(log)) && (tabSpect.get(log).equals(pw))){
                 compteur=1;
                 System.out.println("Connexion Spectateur correcte"); 
                 try {
                 Stage st =new Stage();
            AP.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("espaceSpectateur.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Gestion Coupe De Monde ");
            st.setScene(scene);
            st.show();
            st.setResizable(true);
            } catch (IOException ex) {
            Logger.getLogger(GestionCoupMonde.class.getName()).log(Level.SEVERE, null, ex);
            }}
            
        if(compteur==0){
        System.out.println("Connexion Spectateur incorrecte veuillez verifier les coordonnées");  
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("connexion Spectateur erronée,veuillez verifier les coordonnées !");
                alert.showAndWait();
    }
        
    }
    
    @FXML
    private void creerSp(ActionEvent event) {
        String log ; 
        String pw;
        log=identifiant.getText();
        pw=mdp.getText();
        tabSpect.put(log, pw);
        identifiant.setText("");
        mdp.setText("");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(" Felicitation");
                alert.setContentText("La creation du Spectateur est effectuée avec succées !");
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
