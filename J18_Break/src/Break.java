
public class Break {
	
	public static void main(String[] args) {
		//Break with default
		
		System.out.println("~~~~~~Break default~~~~~~~");
		
		int out, in = 0;
		for(out = 1; out<=10; out++) {
			for(in = 0; in < 20; in++) {
				if(in > 10)
					break;
			}
			System.out.println("The loop in side: out = " + out + " in = " + in);			
		}
		System.out.println("The loop out side: out = " + out + " in = " + in);
		
		
		
		
		System.out.println("~~~~~~Break with label~~~~~~~");
		outer: for(out = 1; out<=10; out++) {
			for(in = 0; in < 20; in++) {
				if(in > 10)
					break outer;
			}
			System.out.println("The loop in side: out = " + out + " in = " + in);			
		}
		System.out.println("The loop out side: out = " + out + " in = " + in);
	}
	
	
}
