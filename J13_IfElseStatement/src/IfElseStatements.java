import java.util.Scanner;

public class IfElseStatements {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		
		//Kiem tra tinh chan le
		if(n%2==0) {
			System.out.println(n + " la so chan");
		}else {
			System.out.println(n + " la so le");
		}
		
		
		
		System.out.println("~~~~~~~~~Giai phuong trinh bac nhat~~~~~~~~~");
		double a,b,x;
		System.out.println("Nhap a");
		a = sc.nextDouble();
		System.out.println("Nhap b");
		b = sc.nextDouble();
		
		
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			}else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}else {
			x = (-b)/a*1.0;
			System.out.println("Phuong trinh co nghiem bang: " + x);
		}
		
		
		System.out.println("~~~~~~~~~Giai phuong trinh bac hai~~~~~~~~~");
		double a1,b1,c1, x1, x2;
		System.out.println("Nhap a");
		a1 = sc.nextDouble();
		System.out.println("Nhap b");
		b1 = sc.nextDouble();
		System.out.println("Nhap c");
		c1 = sc.nextDouble();
	
		double delta = Math.pow(b1, 2) - (4*a1*c1);
		
		if(a1 == 0) {
			System.out.println("A khong duoc bang 0!");
		}else if(delta < 0) {
			System.out.println("Phuong trinh vo nghiem!");
		}else if(delta == 0) {
			x1 = x2 = 1.0*(-b1/(2*a1));
			System.out.println("Phuong co hai nghiem x1 = x2 = " + x1);
		}else {
			x1 = (-b1-Math.sqrt(delta)) / (2*a1);
			x2 = (-b1+Math.sqrt(delta)) / (2*a1);
			System.out.println("Phuong co nghiem x1 = " + x1);
			System.out.println("Phuong co nghiem x2 = " + x2);
		}
		
	}
}
