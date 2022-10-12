package GoldMedal;

import java.util.*;

public class GMain4 {
	static Set<Integer> K = new HashSet<>();
	static Set<Integer> M = new HashSet<>();
	static Set<Integer> B = new HashSet<>();

	static void zk(int input, int d, Set<Integer> list, int i) {
		if (d > input) {
			kk = input;
			list.clear();
			list.add(i);
		} else if (d == input) {
			list.add(i);
		}
	}

	static void zm(int input, int d, Set<Integer> list, int i) {
		if (d > input) {
			mm = input;
			list.clear();
			list.add(i);
		} else if (d == input) {
			list.add(i);
		}
	}

	static void zb(int input, int d, Set<Integer> list, int i) {
		if (d > input) {
			bb = input;
			list.clear();
			list.add(i);
		} else if (d == input) {
			list.add(i);
		}
	}

	static int kk = 10000000;
	static int mm = 10000000;
	static int bb = 10000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int j = 0; j < n; j++) {
			int id = sc.nextInt();
			String a = sc.next();
			int kb = Integer.parseInt(a.substring(0, a.length() - 2));
			a = sc.next();
			int ms = Integer.parseInt(a.substring(0, a.length() - 2));
			int by = sc.nextInt();
			sc.next();
			zk(kb, kk, K, id);
			zm(ms, mm, M, id);
			zb(by, bb, B, id);

			System.out.println(kk + "KB");
			for (int x : K)
				System.out.print(x + " ");
			System.out.println("\n" + mm + "ms");
			for (int x : M)
				System.out.print(x + " ");
			System.out.println("\n" + bb + " bytes");
			for (int x : B)
				System.out.println(x + " ");
//		System.out.println(kk + " "+mm + " "+bb);
//		for (int x : K)
//			System.out.println(x + " k");
//		for (int x : M)
//			System.out.println(x + " m");
//		for (int x : B)
//			System.out.println(x + " b");
//		Arrays.sort(K);
//		Arrays.sort(M);
//		Arrays.sort(B);
//		c.o(kk, K, "KB");
//		c.o(mm, M, "ms");
//		c.o(bb, B, " bytes");
		}

	}
}