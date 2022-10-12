package GoldMedal;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GMain3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringTokenizer st;
		
		int[] K = null;
		int[] M = null;
		int[] B = null;

		int kk = 10000000;
		int mm = 10000000;
		int bb = 10000000;

		int n = s.nextInt();
		for (int j = 0; j < n; j++) {
			st = new StringTokenizer(s.nextLine());
			
			int i = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(cutString(st.nextToken().toString()));
			if (k < kk) {
				kk = k;
				K = null;
				K = new int[i];
			}
			if (k == kk)
				K = new int[i];
			int m = Integer.parseInt(cutString(st.nextToken().toString()));
			if (m < mm) {
				mm = m;
				M = null;
				M = new int[i];
			}
			if (m == mm)
				M = new int[i];

			int b = Integer.parseInt(st.nextToken());
			if (b < bb) {
				bb = b;
				B = null;
				B = new int[i];
			}
			if (b == bb)
				B = new int[i];
		}
		Arrays.sort(K);
		Arrays.sort(M);
		Arrays.sort(B);

		System.out.println(kk + "KB");
		for (int j = 0; j < K.length; j++) {
			System.out.print(K[j]);
		}
		System.out.println("\n" + mm + "ms");
		for (int j = 0; j < M.length; j++) {
			System.out.print(M[j]);
		}
		System.out.println("\n" + bb + " bytes");
		for (int j = 0; j < B.length; j++) {
			System.out.print(B[j]);
		}
	}

	private static String cutString(String s) {
		return s.substring(0, s.length()-2);
	}

}
