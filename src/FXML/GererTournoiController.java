/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXML;
import classes.Stade;
import classes.Tournoi;
import java.util.Map;
import java.util.ArrayList;
import gestioncoupmonde.GestionCoupMonde;
import java.io.IOException;
import java.net.URL;
import static java.util.Arrays.deepEquals;
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
public class GererTournoiController implements Initializable {

    @FXML
    private TextField localisation;
    @FXML
    private TextField paysSortant;
    @FXML
    private TextField paysEntrant;
    @FXML
    private TextField date;
    @FXML
    private Button afficher;
    @FXML
    private TextArea ta4;
    @FXML
    private Button ajouter;
    @FXML
    private Button modifier;
    @FXML
    private Button supprimer;
    @FXML
    private Button homeBtn;
    @FXML
    private ImageView homeImg;
    @FXML
    private AnchorPane AP;
    /**
     * Initializes the controller class.
     */
    ArrayList<Tournoi> tabTr;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tabTr =new ArrayList();
    }    

    @FXML
    private void afficherTr(ActionEvent event) {
         String ch="";
        for( Tournoi Tr : tabTr ){
        ch+=Tr.toString()+"\n";
        }
        ta4.setText(ch);
    }

    @FXML
    private void ajouterTr(ActionEvent event) {
        try{
        String datee=date.getText();
        String[] paySort=paysSortant.getText().split(" ");
        String[] payRest=paysEntrant.getText().split(" "); 
        String loc=localisation.getText();
        
        Tournoi tr= new Tournoi(datee,paySort,payRest,loc);
        tabTr.add(tr);
        date.setText("");
        paysSortant.setText("");
        paysEntrant.setText("");
        localisation.setText("");
        }catch(Exception e){
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("verifier les coordonees du Tournoi a ajouter!");
                alert.showAndWait();}
        
        
    }

    @FXML
    private void modifierTr(ActionEvent event) {
        int compteur=0;
         String datee=date.getText();
        String[] paySort=paysSortant.getText().split(" ");
        String[] payRest=paysEntrant.getText().split(" "); 
        String loc=localisation.getText();
         for( Tournoi tr : tabTr ){
            if (tr.getDateTournoi().equals(datee) ){
                tr.setEquipesSortant(paySort);
                tr.setEquipesRestant(payRest);
                tr.setLocalisation(loc);
                compteur=1;
                   Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("Tournoi modifié avec succées!");
                alert.showAndWait();
            }
            
        }
         if(compteur==0){
            System.out.println("ce Tournoi n existe pas il faut l inserer d'abord !!!");
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("ce Tournoi n existe pas il faut l inserer d'abord !");
                alert.showAndWait();
        }
         date.setText("");
        paysSortant.setText("");
        paysEntrant.setText("");
        localisation.setText("");
    }

    @FXML
    private void supprimerTr(ActionEvent event) {
         int compteur=0;
         String datee=date.getText();
        for( int i=0;i<tabTr.size();i++ ){
           if (tabTr.get(i).getDateTournoi().equals(datee)  ){
                tabTr.remove(i);
                compteur=1;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("Le Tournoi est supprimé avec succées !");
                alert.showAndWait();
            }
        }
        if(compteur==0){
            System.out.println("verifier les coordonees du Tournoi !");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("coordonnées du tournoi erronées, veuillez les vérifier !");
                alert.showAndWait();
        }
        date.setText("");
        paysSortant.setText("");
        paysEntrant.setText("");
        localisation.setText("");
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
