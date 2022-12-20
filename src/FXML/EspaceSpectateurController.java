/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXML;
import classes.Abonnement;
import classes.Carriere;
import classes.Stade;
import classes.Ticket;
import java.util.Map;
import java.util.ArrayList;
import gestioncoupmonde.GestionCoupMonde;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mahmoud
 */
public class EspaceSpectateurController implements Initializable {

    @FXML
    private TextField matchRejoindre;
    @FXML
    private TextField equipe;
    @FXML
    private Button modifier;
    @FXML
    private TextField dateFin;
    @FXML
    private TextField matchs;
    @FXML
    private TextField dateDebut;
    @FXML
    private TextField categorie;
    @FXML
    private Button ajouter;
    @FXML
    private ImageView homeImg1;
    @FXML
    private ImageView homeImg;
    @FXML
    private Button homeBtn;
        @FXML
    private AnchorPane AP;
        @FXML
    private Label lab;

    /**
     * Initializes the controller class.
     */
        ArrayList<Ticket> tabT;
        ArrayList<Abonnement> tabA;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       tabT=new ArrayList();
       tabA=new ArrayList();
    }    

    @FXML
    private void modifierTr(ActionEvent event) {
        try{
        String equipee =equipe.getText();
        String matchRejoindree=matchRejoindre.getText(); 
 
        
        Ticket T= new Ticket(equipee,matchRejoindree);
        tabT.add(T);
        equipe.setText("");
        matchRejoindre.setText("");
        
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("felicitation votre paiement a été effectué  !");
                alert.showAndWait();}
        catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("les coordonnées sont erronées !");
                alert.showAndWait();
        }
    }

    @FXML
    private void ajouterTr(ActionEvent event) {
        try{
         String cat=categorie.getText();
         String dateD=dateDebut.getText();
         String dateF=dateFin.getText();
        ArrayList<String> matchss=new ArrayList();
        String[] tabch=matchs.getText().split(" ");
        for (String ch :tabch){
           matchss.add(ch);
        }
         Abonnement ab= new Abonnement(cat,matchss,dateD,dateF);
         tabA.add(ab);
         categorie.setText("");
        dateDebut.setText("");
        dateFin.setText("");
        matchs.setText("");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("felicitation votre paiement a été effectué  !");
                alert.showAndWait();
    }
    catch(Exception e){
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText(" veuillez vérifier les coordonnées insérées!");
                alert.showAndWait();
}}

        @FXML
    private void home(ActionEvent event) {
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
    
}
