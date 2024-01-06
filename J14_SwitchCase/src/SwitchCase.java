import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~Print the name of day equal the number~~~~~~~~~~~~~~~~~~");
		switch(n) {
		case 2:{
			System.out.println("Thu hai!");
			break;
		}
		case 3:{
			System.out.println("Thu ba!");
			break;
		}
		case 4:{
			System.out.println("Thu tu!");
			break;
		}
		case 5:{
			System.out.println("Thu nam!");
			break;
		}
		case 6:{
			System.out.println("Thu sau!");
			break;
		}
		case 7:{
			System.out.println("Thu bay!");
			break;
		}
		case 8:{
			System.out.println("Thu tam!");
			break;
		}
		default: System.out.println("Khong nhan dien duoc ngay!");
			
		}
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~Count the days of month~~~~~~~~~~~~~~~~~~");
		int month, year;
		System.out.println("Nhap thang: ");
		month = sc.nextInt();
		System.out.println("Nhap nam: ");
		year = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
			System.out.println("31 days");
			break;
		}
			
			
		case 4:
		case 6:
		case 9:
		case 11:{
			System.out.println("30 days");
			break;
		}
					
		case 2:{
			if(year % 4 == 0 && year % 100 != 0 || (year%400==0)) {
				System.out.print("29 days");
			}else {
				System.out.print("28 days");
			}
			break;
		}
		default: {
			System.out.print("Unknows!!!");
		}
		}
	}
}
