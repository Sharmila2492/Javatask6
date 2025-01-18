package task6;

public class Person {
	private String Name;// declaring name variable
	private int Age;//declaring age variable
	public Person() //create constructor method
	{
		 Name="Sharmila";
		 Age=32;
		 System.out.println(Name);
		 System.out.println(Age);
		
	}
	//create setter an getter method of name and age
	public void setName(String s)
	{
		Name=s;
		System.out.println("name is set");
	}
	public String getName()
	{
		System.out.println("get name");
		return Name;
	}
	public void setAge(int Age)
	{
		this.Age=Age;
		System.out.println("age is set");
	}
	public int getAge()
	{
		System.out.println("get age");
		return Age;
	}
	public static void main(String[] args) {
		Person Objper=new Person();
		Objper.setAge(25);
		System.out.println(Objper.getAge());
		Objper.setName("Vimal");
		System.out.println(Objper.getName());
	}

}
/*Output:
Sharmila
32
age is set
get age
25
name is set
get name
Vimal*/


	
	
	

