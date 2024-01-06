
public class ForLoop {
	public static void main(String[] args) {
		//Loop 20 times a text
		for(int i = 0; i<10;i++) {
			int j = i+1;
			System.out.println("Loop!!!" + j);
		}
		for(int i = 9; i>=0;i--) {
			int j = i+1;
			System.out.println("Loop!!!" + j);
		}
		
		
		System.out.println("~~~~~~~~Multiplication Table~~~~~~~~~~~~");
		
		for(int i=2; i<=9;i++) {
			for(int j=1; j<=10;j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println("~~~~~~~");
		}
		
	}
}
