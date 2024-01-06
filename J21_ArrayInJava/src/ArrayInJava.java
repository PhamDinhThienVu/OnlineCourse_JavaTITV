import java.util.Scanner;

public class ArrayInJava {
	public static void main(String[] args) {
		double[] array1;
		double array2[];
		
		array1 = new double[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i< array1.length; i++) {
			System.out.println("Nhap phan tu " + i + ":");
			array1[i]=sc.nextDouble();
		}
		
		double tong = 0;
		for(int i=0; i<array1.length; i++) {
			tong+=array1[i];
		}
		
		System.out.println("Tong = "+tong);
		
		
		array2 = new double[]{1,2,3,4,5};
		for(int i=0; i<array2.length;i++) {
			System.out.print(array2[i] + " ");
		}
	}
}
