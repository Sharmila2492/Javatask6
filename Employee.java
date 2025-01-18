package task6;

import java.util.Scanner;

public class Employee {
	public int ID;
	public String FirstName;
	public String LastName;
	public String Name;
	public int salary;
	public int percent;
	   
	public Employee(int iD, String firstName, String lastName, String name, int salary) {
		ID = iD;
		FirstName = firstName;
		LastName = lastName;
		Name = name;
		this.salary = salary;
	}
	
	public int raisesalary(int percent)
	{
		
		return salary+(salary*percent)/100;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	public int getID() 
	{
		return ID;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	    public String getFirstName()
	 {
		return FirstName;
	}
	    public void setLastName(String lastName) {
			LastName = lastName;
		}
	
	public String getLastName() {
		return LastName;
	}
	public void setName(String name) {
		Name = name;
	}
	

	public String getName() {
		return Name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
		return "Employee [ID: " +ID + ", FirstName: " +FirstName + ", LastName:" +LastName + ", Name:" +Name
				+ ", salary:" + salary + "]";
	}
	
	

}
