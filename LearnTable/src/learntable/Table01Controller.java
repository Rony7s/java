
package learntable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class Table01Controller implements Initializable {
    
    private Label label;
    @FXML
    private Label myTitle;
    
    @FXML
    private TableView<User> myTable;
    @FXML
    private TableColumn<User, String> muName;
    @FXML
    private TableColumn<User, Integer> myAge;
    @FXML
    private TableColumn<User, String> myProgram;

    ObservableList<User> list = FXCollections.observableArrayList(
    
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch"),
            new User("Rony", 22, "EdTEch")
    );
    
    
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        muName.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
        myAge.setCellValueFactory(new PropertyValueFactory<User, Integer>("age"));
        myProgram.setCellValueFactory(new PropertyValueFactory<User, String>("program")); 
        
        myTable.setItems(list);
    }    
    
}
