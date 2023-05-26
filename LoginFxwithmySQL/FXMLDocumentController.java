package javafxapplication21;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


 public class FXMLDocumentController implements Initializable {
     
    private Label say;
    @FXML
    private Button u_login;
    @FXML
    private TextField u_email;
    @FXML
    private TextField u_password;
    @FXML
    private Button u_createNew;
    @FXML
    private Button su_login;
    @FXML
    private TextField su_email;
    @FXML
    private TextField su_password;
    @FXML
    private Button su_already;
    @FXML
    private TextField su_program;
    @FXML
    private AnchorPane logform;
    @FXML
    private AnchorPane su_form;
    
     
    @FXML
    private Button rony_b;
    @FXML
    private AnchorPane welcome_page;
     
    // this code for login 
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    public void loginAccount(){
    
        String sql = "SELECT email, password FROM admin WHERE email = ? and password = ?";
        connect = Database.connect();
    
        try{
        
            Alert alert;
            if (u_email.getText().isEmpty() || u_password.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle(" Error Massage");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all");
                alert.showAndWait();

            } else {

                prepare = connect.prepareStatement(sql);
                prepare.setString(1, u_email.getText());
                prepare.setString(2, u_password.getText());

                result = prepare.executeQuery();

                if (result.next()) {
                        // if correct username and password
                     alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Massage");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully ");
                    alert.showAndWait();
                    
                    welcome_page.setVisible(true);
                    su_form.setVisible(false);
                    logform.setVisible(false);
                
                
                }else{
                    // if incorrect username and password
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle(" Error Massage");
                    alert.setHeaderText(null);
                    alert.setContentText("incorrect email or password");
                    alert.showAndWait();
                }
            
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
    
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    @FXML
    private void goSignUp_page(ActionEvent event) {
        
        su_form.setVisible(true);
        logform.setVisible(false);
    }

    @FXML
    private void goLogin_page(ActionEvent event) {
        
        su_form.setVisible(false);
        logform.setVisible(true);
    }
    
    @FXML
        private void goRony(ActionEvent event) {
        
        welcome_page.setVisible(true);
        su_form.setVisible(false);
        logform.setVisible(false);
    }

    @FXML
    private void login_now(ActionEvent event) {
        

    }
    

 }