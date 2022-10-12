package polynomial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;


public class Main{
	static int num = 0;
	static int[] result = new int[100];
	static StringBuilder sb = new StringBuilder();

	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner s = new Scanner(System.in);
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(s.readLine());
		for (int j = 0; j < n; j++) {
			String f = s.readLine();
			int m = Integer.parseInt(s.readLine());
			int i = 0;
			while (i < m) {
				int c = Integer.parseInt(s.readLine());
				int e = Integer.parseInt(s.readLine());
				if (e > 100000 && e < 0)
//					System.out.println("Error");
					sb.append("Error");
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
		sb.append(num);
//		System.out.println(num);
		for (i = result.length - 1; i >= 0; i--) {
			if (result[i] != 0) {
				sb.append(result[i]).append(i).append('\n');
//				System.out.println(result[i] + " " + i);
			}
		}

	}
}
