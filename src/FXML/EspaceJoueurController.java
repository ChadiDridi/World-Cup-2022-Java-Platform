/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXML;
import classes.Carriere;
import classes.Tournoi;
import java.util.Map;
import java.util.ArrayList;
import gestioncoupmonde.GestionCoupMonde;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
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
import static java.util.Arrays.deepEquals;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author mahmoud
 */
public class EspaceJoueurController implements Initializable {

    @FXML
    private TextField anneeExper;
    @FXML
    private TextField nbreButs;
    @FXML
    private TextField ancienEquipe;
    @FXML
    private TextField titreRequis;
    @FXML
    private TextField age;
    @FXML
    private Button afficher;
    @FXML
    private ImageView homeImg;
    @FXML
    private TextArea ta7;
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
ArrayList<Carriere> tabC;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tabC=new ArrayList();
       
    }    

    @FXML
    private void afficherCr(ActionEvent event) {
        
         String ch="";
        for( Carriere Cr : tabC ){
        ch+=Cr.toString()+"\n";
        }
        ta7.setText(ch); 
    }

    @FXML
    private void ajouterCr(ActionEvent event) {
        try{
         int agee=Integer.parseInt(age.getText());
        String[] ancienEquipee=ancienEquipe.getText().split(" ");
        String[] titreRequiss=titreRequis.getText().split(" "); 
        int nbreButss=Integer.parseInt(nbreButs.getText());
        int anneeExperiencee=Integer.parseInt(anneeExper.getText());

        
        Carriere C= new Carriere(agee,ancienEquipee,titreRequiss,nbreButss,anneeExperiencee);
        tabC.add(C);
        age.setText("");
        ancienEquipe.setText("");
        titreRequis.setText("");
        nbreButs.setText("");
        anneeExper.setText("");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("felicitation les coordonnées sont insérées !");
                alert.showAndWait();
    }
    catch(Exception e){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("Vueillez vérifier les coordonnées !");
                alert.showAndWait();
    }}

  
    @FXML
    private void supprimerCr(ActionEvent event) {
        int compteur=0;
    
         int agee=Integer.parseInt(age.getText());
        String[] ancienEquipee=ancienEquipe.getText().split(" ");
        String[] titreRequiss=titreRequis.getText().split(" "); 
        int nbreButss=Integer.parseInt(nbreButs.getText());
        int anneeExperiencee=Integer.parseInt(anneeExper.getText());
              for( int i=0;i<tabC.size();i++ ){
           if (tabC.get(i).getAgeJoueur()==agee && deepEquals(tabC.get(i).getAncienEquipes(), ancienEquipee) && tabC.get(i).getAnneeExperience()==anneeExperiencee && tabC.get(i).getNbrButTotal()==nbreButss && deepEquals(titreRequiss,tabC.get(i).getTitres()) ){
                tabC.remove(i);
                compteur=1;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("felicitation les coordonnées ont été supprimées!");
                alert.showAndWait();
            }}
      if(compteur==0){
          System.out.println("les donnees du carriere  a supprimer sont érronés ");
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("les donnees du carriere  a supprimer sont érronés !");
                alert.showAndWait();
      }
            
  
         age.setText("");
        ancienEquipe.setText("");
        titreRequis.setText("");
        nbreButs.setText("");
        anneeExper.setText("");
        
    
    }

        @FXML
    private void home(ActionEvent event) {
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
    
}
