import java.util.Scanner;

public class MathLibraryStaticClass {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = sc.nextDouble();
		
		//Ham lay ra gi tuyet doi
		System.out.print("|a| = " + Math.abs(a));
		
		//Tim min
		System.out.print("\nmin(a,b) = " + Math.min(a, b));
		
		//Tim max
		System.out.print("\nmax(a,b) = " + Math.max(a, b));
		
		//Ceil
		System.out.print("\nceil(a) = " + Math.ceil(a));
		
		//Floor
		System.out.print("\nfloor(a) = " + Math.floor(a));
		
		//Sqrt
		System.out.println("\nsqrt(a) = " + Math.sqrt(a));
		
		//pow
		System.out.println("\npow(a,2) = " + Math.pow(a, 2));
		
		
		double r, dienTich, chuVi;
		System.out.println("Nhap r: ");
		r = sc.nextDouble();
		
		chuVi = r*2*Math.PI;
		dienTich = Math.PI*Math.pow(r, 2);
		
		System.out.println("Chu vi: " + chuVi);
		System.out.println("Chu vi(round): " + Math.round(chuVi));
		System.out.println("Chu vi(round*100.0/100): " + Math.round(chuVi*100.0)/100.0);
		
		System.out.println("Dien tich: " + dienTich);
		System.out.println("Dien tich(round): " + Math.round(dienTich));
		System.out.println("Dien tich(round*100.0/100): " + Math.round(dienTich*100.0)/100.0);
	}
}
