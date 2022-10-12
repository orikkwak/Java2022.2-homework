package GoldMedal;

import java.util.Arrays;
import java.util.Scanner;

public class GMain2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] K = null;
		int[] M = null;
		int[] B = null;

		int kk = 10000000;
		int mm = 10000000;
		int bb = 10000000;

		int n = s.nextInt();
		for (int j = 0; j < n; j++) {
			int i = s.nextInt();
			int k = Integer.parseInt(s.next().substring(0, s.next().length()-3));
			if (k < kk) {
				kk = k;
				K = null;
				K = new int[i];
			}
			if (k == kk)
				K = new int[i];
			int m = Integer.parseInt(s.next().substring(0, s.next().length()-3));
			if (m < mm) {
				mm = m;
				M = null;
				M = new int[i];
			}
			if (m == mm)
				M = new int[i];

			int b = Integer.parseInt(s.next().substring(0, s.next().length()-6));
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
		System.out.println("\n" + bb + "bytes");
		for (int j = 0; j < B.length; j++) {
			System.out.print(B[j]);
		}
	}

}
