
public class Continue {
	public static void main(String[] args) {
		System.out.println("Xuat ra cac so le tu 1 -> 100(Unlabeled)");
		int max = 100;
		for(int i=0; i<max;i++) {
			if(i%2==0)
				continue;
			System.out.println(i);
		}
		
		
		System.out.println("Xuat ra bang cuu chuong nhung chi lay tu 1-5(Labeled)");
		outer: for(int i=2; i<=9;i++) {
			for(int j=1; j<=10;j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
				if(j>5)
					continue outer;
			}
			System.out.println("~~~~~~~");
		}
		System.out.println("~~~~~~~");
	}
}
