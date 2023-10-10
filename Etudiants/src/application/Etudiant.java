/*
* Author : jzagabe
* Date : Feb 25, 2020 
* Description :
*/
package application;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Etudiant
{
    private IntegerProperty idProperty;
    private StringProperty SandwhichNameProperty;
    private StringProperty lastNameProperty;
    private StringProperty departmentProperty;
    private StringProperty proteinProperty;
    private StringProperty toppingsProperty;
    private StringProperty ageProperty;
  
    
    public Etudiant()
    {
    	this.idProperty = new SimpleIntegerProperty();
        this.SandwhichNameProperty = new SimpleStringProperty();
        this.lastNameProperty = new SimpleStringProperty();
        this.departmentProperty = new SimpleStringProperty();
        this.ageProperty= new SimpleStringProperty();	
    }
    
   public int getId()
   {
	   return idProperty.get();
   }
   public void setId(int id)
   {
	   this.idProperty.set(id);
   }
    public IntegerProperty getPersonId() {
		return idProperty;
	}
	public void setIdProperty(IntegerProperty idProperty) {
		this.idProperty = idProperty;
	}
	public String getSandwhichName()
	{
		return SandwhichNameProperty.get();
	}
	public void setSandwhichName(String sandwhichName)
	{
		this.SandwhichNameProperty.set(sandwhichName);
	}
	public StringProperty getSandwhichNameProperty() {
		return SandwhichNameProperty;
	}
	public void setSandwhichNameProperty(StringProperty SandwhichNameProperty) {
		this.SandwhichNameProperty = SandwhichNameProperty;
	}

	public StringProperty getLastNameProperty() {
		return lastNameProperty;
	}

	public void setLastNameProperty(StringProperty lastNameProperty) {
		this.lastNameProperty = lastNameProperty;
	}

	public String getLastName()
	{
		return lastNameProperty.get();
	}
	public void setLastName(String lastName)
	{
		this.lastNameProperty.set(lastName);
	}
	
	public StringProperty getDepartmentProperty() {
		return departmentProperty;
	}

	public void setDepartmentProperty(StringProperty departmentProperty) {
		this.departmentProperty = departmentProperty;
	}
	public String getDepartment()
	{
		return departmentProperty.get();
	}
	public void setDepartment(String address)
	{
		this.departmentProperty.set(address);
	}
	
	//JAIFIAFNMAFNAFKNAFFNF
	public StringProperty getProteinProperty() {
		return proteinProperty;
	}

	public void setProteinProperty(StringProperty proteinProperty) {
		this.proteinProperty = proteinProperty;
	}
	public String getProtein()
	{
		return proteinProperty.get();
	}
	public void setProtein(String address)
	{
		this.proteinProperty.set(address);
	}
	
	public StringProperty getToppingsProperty() {
		return toppingsProperty;
	}

	public void setToppingsProperty(StringProperty toppingsProperty) {
		this.toppingsProperty = toppingsProperty;
	}
	public String getToppings()
	{
		return toppingsProperty.get();
	}
	public void setToppings(String address)
	{
		this.toppingsProperty.set(address);
	}
	
	public StringProperty getAgeProperty() {
		return ageProperty;
		
	}
	public void setAgeProperty(StringProperty ageProperty) {
		this.ageProperty = ageProperty;
	}
	public String getAge()
	{
		return ageProperty.get();
	}
	public void setAge(String age)
	{
		this.ageProperty.set(age);
	}
	  @Override public String toString() { String nom=this.getSandwhichName() + " "
	  +this.getLastName(); return nom; }	

}
