import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhap vao n>0");
			n = sc.nextInt();
			
			if(n<=0) {
				System.out.println("N khong hop le! Vui long nhap lai!");
			}
		}while(n <=0);
		
		
		
		
	}
}
