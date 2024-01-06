import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int n=0;
		System.out.println("Nhap vao n: ");
		
		
		//Neu gia tri nhap vao la ky tu khac so thi se nem ra loi
		//n = sc.nextInt();	
		
		//try {
		//	n = sc.nextInt();	
		//}catch(Exception e) {
		//	System.out.println("Nhap du lieu khong dung");
		//}
		
		try {
			n = sc.nextInt();
		}catch(Exception e){
			System.out.println("Nhap du lieu khong dung!");
		}finally {
			System.out.println("Finally!");
		}
		
		System.out.println("Gia tri n la: " + n);
		System.out.println("Ket thuc chuong trinh!");
		
		
		
	}
}
