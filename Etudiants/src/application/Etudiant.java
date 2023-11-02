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
    private StringProperty breadProperty;
    private StringProperty proteinProperty;
    private StringProperty toppingsProperty;
  
    
    public Etudiant()
    {
    	this.idProperty = new SimpleIntegerProperty();
        this.SandwhichNameProperty = new SimpleStringProperty();
        this.breadProperty = new SimpleStringProperty();
        this.proteinProperty = new SimpleStringProperty();
        this.toppingsProperty = new SimpleStringProperty();
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

	
	public StringProperty getbreadProperty() {
		return breadProperty;
	}
	public void setBreadProperty(StringProperty breadProperty) {
		this.breadProperty = breadProperty;
	}
	public String getBread()
	{
		return breadProperty.get();
	}
	public void setBread(String address)
	{
		this.breadProperty.set(address);
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
	
	
	  @Override public String toString() { String nom=this.getSandwhichName(); return nom; }	

}
