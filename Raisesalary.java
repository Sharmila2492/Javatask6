package task6;

public class Raisesalary {
	//EMPLOYEE CALLING
	
	public static void main(String[] args) {
		Employee emp= new Employee(52, "John", "Michael", "JohnMichael", 20000);
		System.out.println(emp);//monthly salary printed
		emp.setSalary(20000*12);//to set the annual salary
		System.out.println("After set the Annual salary: " +emp);//CTC printed 
		System.out.println("Raise Salary:" +emp.raisesalary(10));
		emp.setSalary(emp.raisesalary(10));
		System.out.println(emp);
		
		
}
}
/*output:
	Employee [ID: 52, FirstName: John, LastName:Michael, Name:JohnMichael, salary:20000]
			After set the Annual salary: Employee [ID: 52, FirstName: John, LastName:Michael, Name:JohnMichael, salary:240000]
			Raise Salary:264000
			Employee [ID: 52, FirstName: John, LastName:Michael, Name:JohnMichael, salary:264000]*/