package GoldMedal;

import java.util.Arrays;
import java.util.Scanner;

public class GMain5 {

	static int[] K = null;
	static int[] M = null;
	static int[] B = null;

	static int kk = 10000000;
	static int mm = 10000000;
	static int bb = 10000000;
	
abstract class c{
	static void z(int g, int d ,int f[], int i) {
		if(g < d) {
			d = g;
			f = null;
			K = new int[i];
		}
		if(g == d) {
			g = d;
			int[] fw = Arrays.copyOf(f, f.length + 1);
			fw[f.length + 0] = i;
			f = fw;	
		}
		Arrays.sort(f);
	}
	
	static void o(int d ,int f[], String q) {
		System.out.println("\n" +d + q );
		for (int j = 0; j < K.length; j++) {
			System.out.print(f[j]);
		}
	}
	
}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for (int j = 0; j < n; j++) {
			int i = s.nextInt();
			int k = s.nextInt();
			int m = s.nextInt();
			int b = s.nextInt();
			c.z(k, kk, K, i);
			c.z(m, mm, M, i);
			c.z(b, bb, B, i);
		}
		
		c.o(kk, K, "KB");
		c.o(mm, M, "ms");
		c.o(bb, B, "	bytes");
		
	}

}
