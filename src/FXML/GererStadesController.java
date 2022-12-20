/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXML;
import classes.Joueur;
import classes.Stade;
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
public class GererStadesController implements Initializable {

    @FXML
    private TextField localisation;
    @FXML
    private TextField matchsStade;
    @FXML
    private TextField nbrPlaces;
    @FXML
    private Button afficher;
    @FXML
    private TextArea ta6;
    @FXML
    private Button ajouter;
    @FXML
    private Button modifier;
    @FXML
    private Button supprimer;
    @FXML
    private ImageView homeImg;
    @FXML
    private Button homeBtn;
        @FXML
    private AnchorPane AP;

    /**
     * Initializes the controller class.
     */
        ArrayList<Stade> tabSt;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tabSt =new ArrayList();
       
    }    

    @FXML
    private void afficherSt(ActionEvent event) {
         String ch="";
        for( Stade st : tabSt ){
        ch+=st.toString()+"\n";
        }
        ta6.setText(ch);
    }

    @FXML
    private void ajouterSt(ActionEvent event) {
        try{
        String loc=localisation.getText();
        int nbrPlace=Integer.parseInt(nbrPlaces.getText());
        ArrayList<String> matchStades=new ArrayList();
      
        String[] tabch=matchsStade.getText().split(" ");
        for (String ch :tabch){
           matchStades.add(ch);
        }
        Stade st= new Stade(nbrPlace,loc,matchStades);
        
        tabSt.add(st);
        localisation.setText("");
        nbrPlaces.setText("");
        matchsStade.setText("");}
        catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("Vueillez vérifier les coordonnées du stade à ajouter!");
                alert.showAndWait();
        }
    }

    @FXML
    private void modifierSt(ActionEvent event) {
        int compteur=0;
         String loc=localisation.getText();
        int nbrPlace=Integer.parseInt(nbrPlaces.getText());
        ArrayList<String> matchStades=new ArrayList();
      
        String[] tabch=matchsStade.getText().split(" ");
        for (String ch :tabch){
           matchStades.add(ch);
        }
        for( Stade st : tabSt ){
            if (st.getNbrPlaces()==nbrPlace && st.getLocalisation().equals(loc)){
                st.setMatchsStade(matchStades);
                compteur=1;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("Le stade est modifié avec succées !");
                alert.showAndWait();
            }
            
        }
         if(compteur==0){
            System.out.println("ce Stade n existe pas il faut l inserer d'abord !!!");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("Ce stade n existe pas il faut l inserer d'abord !");
                alert.showAndWait();
        }
        localisation.setText("");
        nbrPlaces.setText("");
        matchsStade.setText("");
    }

    @FXML
    private void supprimerSt(ActionEvent event) {
        int compteur=0;
         String loc=localisation.getText();
        int nbrPlace=Integer.parseInt(nbrPlaces.getText());
        for( int i=0;i<tabSt.size();i++ ){
           if (tabSt.get(i).getNbrPlaces()==nbrPlace && tabSt.get(i).getLocalisation().equals(loc)){
                tabSt.remove(i);
                compteur=1;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("Le stade a été supprimé avec succées!");
                alert.showAndWait();
            }
        }
        if(compteur==0){
            System.out.println("verifier les coordonees du Stade a supprimer!");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("verifier les coordonees du Stade a supprimer!");
                alert.showAndWait();
        }
        localisation.setText("");
        nbrPlaces.setText("");
        matchsStade.setText("");
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
