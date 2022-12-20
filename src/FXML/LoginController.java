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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author mahmoud
 */
public class LoginController implements Initializable {


    @FXML
    private ImageView logo;
    @FXML
    private Button spectateur;
    @FXML
    private Button joueur;
    @FXML
    private Button res;
    @FXML
    private Button admin;
     @FXML
    private AnchorPane AP;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void connectSpect(ActionEvent event) {
        try {
            
            Stage st =new Stage();
           AP.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("loginSpectateur.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Gestion Coupe De Monde ");
            st.setScene(scene);
            st.show();
            st.setResizable(true);
        } catch (IOException ex) {
            Logger.getLogger(GestionCoupMonde.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void connectJoueur(ActionEvent event) {
                try {
            Stage st =new Stage();
            AP.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("loginJoueur.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Gestion Coupe De Monde ");
            st.setScene(scene);
            st.show();
            st.setResizable(true);
        } catch (IOException ex) {
            Logger.getLogger(GestionCoupMonde.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void connectRes(ActionEvent event) {
                try {
            Stage st =new Stage();
            AP.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("loginResponsableEquipe.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Gestion Coupe De Monde ");
            st.setScene(scene);
            st.show();
            st.setResizable(true);
        } catch (IOException ex) {
            Logger.getLogger(GestionCoupMonde.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void connectAdmin(ActionEvent event) {
                try {
            Stage st =new Stage();
            AP.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("loginAdmin.fxml"));
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
