/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXML;
import classes.Joueur;
import classes.Match;
import classes.Pays;
import java.util.Map;
import java.util.ArrayList;
import gestioncoupmonde.GestionCoupMonde;
import java.io.IOException;
import static java.lang.Integer.parseInt;
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
public class GererPaysController implements Initializable {

    @FXML
    private TextField tabJoueurs;
    @FXML
    private TextField score;
    @FXML
    private TextField nbrCartes;
    @FXML
    private TextField nomPays;
    @FXML
    private ImageView homeImg;
    @FXML
    private TextArea ta3;
    @FXML
    private Button afficher;
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
         ArrayList<Pays> tabP;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tabP =new ArrayList();
        // TODO
    }    

    @FXML
    private void afficherPy(ActionEvent event) {
         String ch="";
        for( Pays p : tabP ){
        ch+=p.toString()+"\n";
        }
        ta3.setText(ch);
    }

    @FXML
    private void ajouterPy(ActionEvent event) {
        try{
        String nomm=nomPays.getText();
        int Score=Integer.parseInt(score.getText());
        Map<String,Integer>nbrc=new HashMap(); 
        ArrayList<String> tabJoueur=new ArrayList();
        
        
       String[] localvar =nbrCartes.getText().split(" ");
       String[] ch1=localvar[0].split(":");
       String[] ch2=localvar[1].split(":");
       nbrc.put(ch1[0],parseInt(ch1[1]));
       nbrc.put(ch2[0],parseInt(ch2[1]));
       
       String[] tabch=tabJoueurs.getText().split(" ");
       for (String ch :tabch){
           tabJoueur.add(ch);
       }
      
        Pays p= new Pays(nomm,Score,nbrc,tabJoueur);
        tabP.add(p);
        nomPays.setText("");
        score.setText("");
        nbrCartes.setText("");
        tabJoueurs.setText("");}
        catch(Exception e){
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("verifier les coordonees du Pays à ajouter!");
                alert.showAndWait();
        }
    }

    @FXML
    private void modifierPy(ActionEvent event) {
        int compteur=0;
        String nomm=nomPays.getText();
        int Score=Integer.parseInt(score.getText());
        Map<String,Integer>nbrc=new HashMap(); 
        ArrayList<String> tabJoueur=new ArrayList();
        
        
       String[] localvar =nbrCartes.getText().split(" ");
       String[] ch1=localvar[0].split(":");
       String[] ch2=localvar[1].split(":");
       nbrc.put(ch1[0],parseInt(ch1[1]));
       nbrc.put(ch2[0],parseInt(ch2[1]));
       
       String[] tabch=tabJoueurs.getText().split(" ");
       for (String ch :tabch){
           tabJoueur.add(ch);
           }
        for( Pays p : tabP ){
            if (p.getNomPays().equals(nomm) ){
                p.setNbrCartes(nbrc);
                p.setTabJoueur(tabJoueur);
                p.setScore(Score);
                compteur=1;
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("Pays modifié avec succées!");
                alert.showAndWait();
            }
            
        }
         if(compteur==0){
            System.out.println("cete pays n existe pas il faut l inserer d'abord !!!");
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("Le pays à modifier n exsiste pas , veuillez l'insérer d'abord!");
                alert.showAndWait();
        }
        
        nomPays.setText("");
        score.setText("");
        nbrCartes.setText("");
        tabJoueurs.setText("");
    }

    @FXML
    private void supprimerPy(ActionEvent event) {
        int compteur = 0;
        String nomm=nomPays.getText();
      
        for( int i=0;i<tabP.size();i++ ){
            if (tabP.get(i).getNomPays().equals(nomm)   ){
                tabP.remove(i);
                compteur=1;
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("Pays a été supprimé avec succées!");
                alert.showAndWait();
            }
           
        }
         if(compteur==0){
            System.out.println("verifier les coordonees du pays a supprimer!");
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("verifier les coordonees du Pays à supprimer!");
                alert.showAndWait();
        }
        nomPays.setText("");
        score.setText("");
        nbrCartes.setText("");
        tabJoueurs.setText("");
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
