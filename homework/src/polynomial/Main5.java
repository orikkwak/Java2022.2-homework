package polynomial;

import java.util.Scanner;

public class Main5 {
	static int num = 0;
	static int[] result = new int[100];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int j = 0;
		int i = 0;
		int n = s.nextInt();
		do {
			String f = s.next();
			int m = s.nextInt();
			while(i<m) {
				int c = s.nextInt();
				int e = s.nextInt();
				result[e] += c;
				i++;
			}
			j++;
		}while(j<n);
		if(result[i++] != 0)
			num++;
		System.out.println(num);

		for ( i = result.length - 1; i >= 0; i--) {
			if (result[i] != 0) {
				System.out.println(result[i] + " " + i); // 가장 높은 항부터 계수, 차수로 출력
			}
		}

	}
}
