package polynomial;

import java.util.Scanner;

public class Main6 {
	static int num = 0;
	static int[] result = new int[100];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int j = 0; j < n; j++) {
			String f = s.next();
			int m = s.nextInt();
			int i = 0;
			while (i < m) {
				int c = s.nextInt();
				int e = s.nextInt();
				if (e > 100000 && e < 0)
					System.out.println("Error");
				result[e] += c;
				i++;
			}
		}
		int i = 0;
		while (i < result.length) {
			if (result[i] != 0)
				num++;
			i++;
		}
		System.out.println(num);
		for (i = result.length - 1; i >= 0; i--) {
			if (result[i] != 0) {
				System.out.println(result[i] + " " + i);
			}
		}

	}
}
