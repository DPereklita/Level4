package application;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EtudiantDAO {
	
	public static void insertEtudiant(String SandwhichName, String Bread, String Protein, String Toppings) throws ClassNotFoundException, SQLException
	{
		String sql="insert into etudiant(SandwhichName,Bread,Protein,Toppings) values('"+SandwhichName+"','"+Bread+"','"+Protein+"','"+Toppings+"')";
		try
		{ 
			DBUtilitaires.dbExecuteQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println("Erreur à l'insertion de données " + e);
			e.printStackTrace();
			throw e;
		}
	}
	public static void updateEtudiant(int ID, String SandwhichName, String Bread, String Protein, String Toppings) throws ClassNotFoundException, SQLException {
	    String sql = "update etudiant set SandwhichName='" + SandwhichName + "', Bread='" + Bread + "', Protein='" + Protein + "', Toppings='" + Toppings + "' where ID= " + ID;

	    try {
	        DBUtilitaires.dbExecuteQuery(sql);
	    } catch (SQLException e) {
	        System.out.println("Erreur lors de la mise à jour");
	        e.printStackTrace();
	        throw e;
	    }
	}

	public static void deleteEtudiantById(int id) throws ClassNotFoundException, SQLException
	{
		String sql="delete from etudiant where ID= "+ id;
		try
		{
			DBUtilitaires.dbExecuteQuery(sql);
		}
		catch(SQLException e)
		{
			System.out.println("Erreur lors de la suppression de données");
			e.printStackTrace();
			throw e;
		}
	}
	public static ObservableList<Etudiant> getAllRecords() throws ClassNotFoundException, SQLException
	{
		String sql="select * from etudiant";
		try
		{
			ResultSet rsSet=DBUtilitaires.dbExecute(sql);
			
			
			ObservableList<Etudiant> EtudiantList=getEtudiantObjects(rsSet);
			return EtudiantList;
		}
		catch(SQLException e)
		{
			System.out.println("Erreur lors de la recupération de données à afficher"+e);
			e.printStackTrace();
			throw e;
		}
		
	}
	private static ObservableList<Etudiant> getEtudiantObjects(ResultSet rsSet) throws ClassNotFoundException, SQLException
	{
		try
		{
			
			ObservableList<Etudiant> EtudiantList=FXCollections.observableArrayList();
			while(rsSet.next())
			{
				Etudiant etudiant=new Etudiant();
				etudiant.setId(rsSet.getInt("ID"));
				etudiant.setSandwhichName(rsSet.getString("SandwhichName"));
				etudiant.setBread(rsSet.getString("Bread"));
				etudiant.setProtein(rsSet.getString("Protein"));
				etudiant.setToppings(rsSet.getString("Toppings"));
				EtudiantList.add(etudiant);
			}
			return EtudiantList;
		}
		catch(SQLException e)
		{
			System.out.println("Erreur au moment de l'affichage de données "+ e);
			e.printStackTrace();
			throw e;
		}
	}
	public static ObservableList<Etudiant> searchEtudiant(String etudiantId) throws ClassNotFoundException, SQLException
	{
		String sql="select * from etudiant where id="+etudiantId;
		try
		{
		 ResultSet rsSet=DBUtilitaires.dbExecute(sql)	;
		 ObservableList<Etudiant> list=getEtudiantObjects(rsSet);
		 return list;
		}
		catch(SQLException e)
		{
			System.out.println("Erreur pendant la recherche de données " +e);
			e.printStackTrace();
			throw e;
		}
	}	
	
	
	
	
	
	
	

}