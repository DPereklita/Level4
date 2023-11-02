package application;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EtudiantController implements Initializable{

	@FXML
	private ComboBox<Etudiant> cboID;
	@FXML
	private Label LabelID;
	@FXML
	private Label lblResults;
	@FXML
	private TextField txtSandwhichName;
	@FXML
	private Button btnClear;
	@FXML
	private Button btnEffacer;
	@FXML
	private ComboBox<String> cboBread;
	@FXML
	private Button btnModifier;
	@FXML
	private Button btnAjouter;
	@FXML
	private ComboBox<String> cboProtein;
	@FXML
	private ComboBox<String> cboToppings;
	

	// liste pour les départements - cette liste permettra de donner les valeurs du comboBox 

	private ObservableList<String> list=(ObservableList<String>) FXCollections.observableArrayList
			("White Bread","Whole Wheat","Multi Grain", "Gluten Free"); 
	private	ObservableList<Etudiant> EtudiantList;
	
	private ObservableList<String> list2=(ObservableList<String>) FXCollections.observableArrayList
			("Ham","Turkey","Chicken", "Beef"); 
	private	ObservableList<Etudiant> EtudiantList2;
	
	private ObservableList<String> list3=(ObservableList<String>) FXCollections.observableArrayList
			("Lettuce","Tomato","Cheese", "Olives"); 
	private	ObservableList<Etudiant> EtudiantList3;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		public void updateEtudiant() throws ClassNotFoundException, SQLException
		{
			EtudiantDAO.updateEtudiant(Integer.parseInt(LabelID.getText()), 
					txtSandwhichName.getText(), cboBread.getValue(), cboProtein.getValue(), cboToppings.getValue());
			lblResults.setText("Les données de " + txtSandwhichName.getText() + " ont été mises à jour");
			reinitialiser();
		}
		
		
		cboBread.setItems(list);
	try {
		EtudiantList=EtudiantDAO.getAllRecords();
		cboID.setItems(EtudiantList);
		cboID.valueProperty().addListener((obs, oldVal, newVal) ->
        showEtudiant(newVal));
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}

	{
		cboProtein.setItems(list2);
	try {
		EtudiantList=EtudiantDAO.getAllRecords();
		cboID.setItems(EtudiantList2);
		cboID.valueProperty().addListener((obs, oldVal, newVal) ->
        showEtudiant(newVal));
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}}
	{
		cboToppings.setItems(list3);
	try {
		EtudiantList=EtudiantDAO.getAllRecords();
		cboID.setItems(EtudiantList3);
		cboID.valueProperty().addListener((obs, oldVal, newVal) ->
        showEtudiant(newVal));
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}}
	}
	// Réinitialiser les champs
	@FXML
	public void reinitialiser()throws ClassNotFoundException, SQLException
	{
		EtudiantList=EtudiantDAO.getAllRecords();
		cboID.setItems(EtudiantList);
		
	}
	
	// Ajouter un étudiant 
	@FXML
	void ajouter()throws ClassNotFoundException, SQLException
	{
		EtudiantDAO.insertEtudiant(txtSandwhichName.getText(),
				cboBread.getValue(), cboProtein.getValue(), cboToppings.getValue());
		lblResults.setText("Les données de " + txtSandwhichName.getText() + " ont été ajoutées");
		reinitialiser();

	}
	// Afficher les détails
	
	public void showEtudiant(Etudiant etudiant)
	{
		if(etudiant!=null)
		{
			btnAjouter.setDisable(true);
			LabelID.setText(String.valueOf(etudiant.getId()));
			txtSandwhichName.setText(etudiant.getSandwhichName());
			cboBread.setValue(etudiant.getBread());
			cboProtein.setValue(etudiant.getProtein());
			cboToppings.setValue(etudiant.getToppings());
			lblResults.setText("");
		}
		else
		{
			btnAjouter.setDisable(false);
			LabelID.setText("");
			txtSandwhichName.setText("");
			cboBread.setValue("");
			cboToppings.setValue("");
			cboProtein.setValue("");
		}
	}

	// Mise à jour 
		public void updateEtudiant() throws ClassNotFoundException, SQLException
		{
			EtudiantDAO.updateEtudiant(Integer.parseInt(LabelID.getText()), 
					txtSandwhichName.getText(), cboBread.getValue(), cboProtein.getValue(), cboToppings.getValue());
			lblResults.setText("Les données de " + txtSandwhichName.getText() + " ont été mises à jour");
			reinitialiser();
		
		}  

	    // Effacer un étudiant
		@FXML
		public void deleteEtudiant()throws ClassNotFoundException, SQLException
		{
			EtudiantDAO.deleteEtudiantById(Integer.parseInt(LabelID.getText()));
			lblResults.setText("Les données ont été effacées");
			reinitialiser();
		}	
}

