package task6;

public class Account {
	private String Name;
	private double acc;
	private double balance;
	public Account()
	{
		Name="Sharmila";
		acc=5218;
		balance=100;
	}
	public Account(String Nm, double Balance)
	{
		Name=Nm;
		balance=Balance;
	}
	//deposit
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println(balance);
	}
	//withdraw
	public void withdraw(double amount)
	{
		balance=balance-amount;
		System.out.println(balance);
	}
	//get name
	public String getName()
	{
		return Name;}
	//get account number
	public double getacc()
	{ 
		return acc; }
	//get balance
	public double getbalance()
	{
		return balance; }

	public static void main(String[] args) {
		Account ac1=new Account();
		System.out.println("Name:" +ac1.Name);
		System.out.println("Account number:" +ac1.acc);
		System.out.println("balance: " +ac1.balance);
		//print after deposit the amount
		ac1.deposit(500);
		//print after withdraw the amount
		ac1.withdraw(100);
		Account Ac1=new Account("Michael", 200 );
		System.out.println("Name:" +Ac1.Name);
		System.out.println("balance: " +Ac1.balance);
		//print after deposit the amount
		Ac1.deposit(500);
		//print after withdraw the amount
		Ac1.withdraw(100);

	}

}
/*Output:
 * Name:Sharmila
Account number:5218.0
balance: 100.0
600.0
500.0
Name:Michael
balance: 200.0
700.0
600.0

*/