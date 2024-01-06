import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int x= 1;
		
		Scanner sc = new Scanner(System.in);
		
		while(x!=0) {
			System.out.println("Nhap x = 0 de thoat; Nhap ky tu bat ky");
			x = sc.nextInt();
			if(x == 0) {
				System.out.println("Da thoat!");
			}else {
				System.out.println(x);
			}			
		}
		
		
		System.out.println("~~~~~~~~~10 to 2~~~~~~~~");
		int n;
		String binaryString = "";
		
		
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		
		while(n!=0) {
			binaryString = (n%2) + binaryString;
			n=n/2;
		}
		System.out.println("So nhi phan: " + binaryString);
		
	}
}
