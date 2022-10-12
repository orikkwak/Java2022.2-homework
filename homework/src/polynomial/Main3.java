package polynomial;

import java.util.Scanner;

public class Main3 {
	static int a = 0;
	static String x; 
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		int n = s.nextInt();
		while(i<n) {
			String f = s.next();
			int m = s.nextInt();
			for(int j = 0; j<m; m++) {
				int c = s.nextInt();
				int e = s.nextInt();
				a += c(x)^e;
				System.out.println(a);
			}
			i++;
		}
	
		
	}


	private static int c(String x2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
