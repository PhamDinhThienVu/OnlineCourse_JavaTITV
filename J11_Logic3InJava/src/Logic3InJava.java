import java.util.Scanner;

public class Logic3InJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		
		//Kiem tra so chan le
		String ketQua = (a%2==0)?"A la so chan":"A la so le";
		System.out.println("Ket qua: " + ketQua);
		
	}
}
