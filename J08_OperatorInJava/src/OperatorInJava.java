
public class OperatorInJava {
	public static void main(String[] args) {
		int a = 5;
		boolean b = false;
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("- => gia tri: "+ (-a));
		System.out.println("+ => gia tri: " + (+a));
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("b = " + b);
		System.out.println("!b => gia tri: "+ (!b));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("a = " + a);
		System.out.println("++a = " + (++a));
		System.out.println("a++ = " + (a++));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("a = " + a);
		System.out.println("--a = " + (--a));
		System.out.println("a-- = " + (a--));
	}
}
