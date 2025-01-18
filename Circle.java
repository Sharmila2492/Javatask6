package task6;

public class Circle {
	public int r;
	public double pi=3.14;
	public Circle()
	{
	int radius =3;
	Object r=2*pi*radius;
	System.out.println("Circumference of the circle: " +r);
	}
	public Circle(int radius,double pi)
	{
	Object r=2*pi*radius;
	System.out.println("Circumference of the circle: " +r);
	
	}

	public static void main(String[] args) {
	Circle rad=new Circle();	
	System.out.println(rad.r);
	Circle rad1=new Circle(5,3.14);
	System.out.println(rad1.r);
	
	}

}
/*Output:
	Circumference of the circle: 18.84	
	Circumference of the circle: 31.400000000000002*/
