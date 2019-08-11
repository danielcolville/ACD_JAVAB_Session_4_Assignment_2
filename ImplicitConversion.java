package session4;

public class ImplicitConversion {
	public static void main(String[] args) {
		double a;
		int b=5;
		double c=3.5;
		System.out.println("Adding int "+b+" and double " + c);
		a=b+c;
		System.out.println("Yields "+a+" which is a double");
		
		System.out.println("Dividing b by c also gives a double:");
		double d=b/c;
		System.out.println(d);
	}
}
