package application;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Window;

public class AddBookControlor implements Initializable {
	 @FXML
	 private TextField tfLastName;
	 @FXML
	 private TextField tfFirstName;
	 @FXML
	 private TextField tfEmail;
	 @FXML
	 private Button addBtn;
	 @FXML
	 private Button exportBtn;
	 @FXML
	 private Button importBtn;
	 @FXML
	 private Button removeBtn;
	 @FXML
	 private Button quitBtn;
	 @FXML
	 private TableView<Person> table;
	 @FXML
	 private TableColumn<Person, String> emailCol;
	 @FXML
	 private TableColumn<Person, String> firstNameCol;
	 @FXML
	 private TableColumn<Person, String> lastNameCol;
	 private DataClass data=new DataClass();
	//A Completer
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lastNameCol.setCellValueFactory(new PropertyValueFactory("prenom"));
		firstNameCol.setCellValueFactory(new PropertyValueFactory("nom"));
		emailCol.setCellValueFactory(new PropertyValueFactory("adremail"));
	

	}
	@FXML
	public void add(ActionEvent event) {
		table.getItems().add(new Person(tfLastName.getText(),tfFirstName.getText(),tfEmail.getText()));	
	}
	@FXML
	public void importer(ActionEvent event) {
		for(Person p : data.getImportList()) {
			table.getItems().add(p);
		}
	}
	@FXML
	public void remove(ActionEvent event) {
	    Person p = table.getSelectionModel().getSelectedItem();
	      table.getItems().remove(p);
	
	}
	@FXML
	protected void quiter(ActionEvent event) {
		Window owner = table.getScene().getWindow();
		Platform.exit();
		
	}
    @FXML
    void export(ActionEvent event) {
    	DataClass d = new DataClass();
    	List<Person> s = table.getItems();
    	d.setExportList(s);
    	System.out.println(d.getExportList());

    }

	}