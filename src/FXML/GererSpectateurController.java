/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXML;
import classes.Joueur;
import classes.Spectateur;
import java.util.Map;
import java.util.ArrayList;
import gestioncoupmonde.GestionCoupMonde;
import java.io.IOException;
import static java.lang.Double.parseDouble;
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
public class GererSpectateurController implements Initializable {

    @FXML
    private TextField methodPaiem;
    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private TextField age;
    @FXML
    private TextField nationalite;
    @FXML
    private TextField genre;
    @FXML
    private TextField id;
    @FXML
    private ImageView homeImg;
    @FXML
    private TextArea ta1;
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
         ArrayList<Spectateur> tabS;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tabS =new ArrayList();
    }    

    @FXML
    private void afficherSp(ActionEvent event) {
        String ch="";
        for( Spectateur s : tabS ){
        ch+=s.toString()+"\n";
        }
        ta1.setText(ch);
    }

    @FXML
    private void ajouterSp(ActionEvent event) {
        try{
        String genree=genre.getText();
        String nationnal=nationalite.getText();
        int idd=Integer.parseInt(id.getText());
        int agee=Integer.parseInt(age.getText());
        String nomm=nom.getText();
        String prenomm=prenom.getText();
        HashMap<String, Double> methodPaiemm = new HashMap();
        
        
       String[] localvar =methodPaiem.getText().split(" ");
       String[] ch1=localvar[0].split(":");
       String[] ch2=localvar[1].split(":");
       methodPaiemm.put(ch1[0],parseDouble(ch1[1]));
       methodPaiemm.put(ch2[0],parseDouble(ch2[1]));
        
        
        Spectateur s= new Spectateur(idd,nationnal,genree,agee,methodPaiemm,nomm,prenomm);
        tabS.add(s);
        nom.setText("");
        genre.setText("");
        nationalite.setText("");
        id.setText("");
        age.setText("");
        prenom.setText("");
        methodPaiem.setText("");}
        catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("verifier les coordonees du spectateur a insérer!");
                alert.showAndWait();
        }
    }

    @FXML
    private void modifierSp(ActionEvent event) {
        int compteur=0;
         String genree=genre.getText();
        String nationnal=nationalite.getText();
        int idd=Integer.parseInt(id.getText());
        int agee=Integer.parseInt(age.getText());
        String nomm=nom.getText();
        String prenomm=prenom.getText();
        HashMap<String, Double> methodPaiemm = new HashMap();
        
        
       String[] localvar =methodPaiem.getText().split(" ");
       String[] ch1=localvar[0].split(":");
       String[] ch2=localvar[1].split(":");
       methodPaiemm.put(ch1[0],parseDouble(ch1[1]));
       methodPaiemm.put(ch2[0],parseDouble(ch2[1]));
       
        for( Spectateur s : tabS ){
            if (s.getId()==idd ){
                s.setNationalite(nationnal);
                s.setGenre(genree);
                s.setAge(agee);
                s.setNom(nomm);
                s.setPrenom(prenomm);
                compteur=1;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Felicitations");
                alert.setContentText("Spectateur modifié avec succées!");
                alert.showAndWait();
            }
            
        }
         if(compteur==0){
            System.out.println("ce Spectateur n existe pas il faut l inserer d'abord !!!");    
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("ce Spectateur n existe pas il faut l inserer d'abord !");
                alert.showAndWait();
         }

        nom.setText("");
        genre.setText("");
        nationalite.setText("");
        id.setText("");
        age.setText("");
        prenom.setText("");
        methodPaiem.setText("");
    }

    @FXML
    private void supprimerSpect(ActionEvent event) {
        int compteur=0;
        int idd=Integer.parseInt(id.getText());
        
        for( int i=0;i<tabS.size();i++ ){
            if (tabS.get(i).getId()==idd  ){
                tabS.remove(i);
                compteur=1;
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Félicitations");
                alert.setContentText("Spectateur a été supprimé avec succées!");
                alert.showAndWait();
            }
        }
         if(compteur==0){
            System.out.println("verifier les coordonees du Spectateur a supprimer!");
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Alert");
                alert.setContentText("verifier les coordonees du Spectateur a supprimer!");
                alert.showAndWait();
        }
         nom.setText("");
        genre.setText("");
        nationalite.setText("");
        id.setText("");
        age.setText("");
        prenom.setText("");
        methodPaiem.setText("");
        

        
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
