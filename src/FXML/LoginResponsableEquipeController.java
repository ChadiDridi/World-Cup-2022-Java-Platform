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
public class LoginResponsableEquipeController implements Initializable {

    @FXML
    private ImageView homeImg;
    @FXML
    private TextField identifiant;
    @FXML
    private PasswordField mdp;
    @FXML
    private Button btnRes;
    @FXML
    private Button btnRetour;
    @FXML
    private AnchorPane AP;
    @FXML
    private Button creation;

    /**
     * Initializes the controller class.
     */
    
    Map<String,String> tabRes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           tabRes =new HashMap();
     tabRes.put("mohamed@gmail.com","123");
    tabRes.put("chadi@gmail.com","123");
    tabRes.put("iyed@gmail.com","123");
    tabRes.put("nouira@gmail.com","123");
    }    

    @FXML
    private void connecterRs(ActionEvent event) {
        int compteur=0;
        String log ; 
        String pw;
        log=identifiant.getText();
        pw=mdp.getText();

        if((tabRes.containsKey(log)) && (tabRes.get(log).equals(pw))){
                 compteur=1;
                 System.out.println("Connexion Responsable Equipe correcte"); 
                 try {
                 Stage st =new Stage();
            AP.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("gestionPays.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Gestion Coupe De Monde ");
            st.setScene(scene);
            st.show();
            st.setResizable(true);
            } catch (IOException ex) {
            Logger.getLogger(GestionCoupMonde.class.getName()).log(Level.SEVERE, null, ex);
            }}
            
        if(compteur==0){
        System.out.println("Connexion Responsable Equipe  incorrecte veuillez verifier les coordonnées");  
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("connexion Responsable Equipe erronée,veuillez verifier vos coordonnées !");
                alert.showAndWait();
    }
    }
     @FXML
     private void creerRes(ActionEvent event) {
        String log ; 
        String pw;
        log=identifiant.getText();
        pw=mdp.getText();
        tabRes.put(log, pw);
        identifiant.setText("");
        mdp.setText("");
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitation");
                alert.setContentText("Responsable Equipe  ajouté avec succés !");
                alert.showAndWait();
        
     }
     
    @FXML
    private void home(ActionEvent event) {
                try {
            Stage st =new Stage();
            AP.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Felicitation ");
            st.setScene(scene);
            st.show();
            st.setResizable(true);
        } catch (IOException ex) {
            Logger.getLogger(GestionCoupMonde.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
