package GoldMedal;

import java.util.*;

public class GMain7 {
	static Set<Integer> K = new HashSet<>();
	static Set<Integer> M = new HashSet<>();
	static Set<Integer> B = new HashSet<>();
	
	//이거 왜 저장이 안되는거지? 왜 따로 돌리면 저장이 되고 이렇게하면 저장이 안되는거지? 도대체 왜!! 그러는거야ㅠ

	static void z(int p, int pp, Set<Integer> L, int i) {
		if (pp > p) {
			System.out.println(pp);
			pp = p;
			if(L == K) {
				K.clear();
				K.add(i);
			}
			if(L == M) {
				M.clear();
				M.add(i);
			}
			if(L == B) {
				B.clear();
				B.add(i);
			}
			System.out.print(L.hashCode() + " ");
//			System.out.println(p);
			System.out.println(pp);
		}
		if(pp == p) {
			L.add(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	    Set<Integer>K=new TreeSet<>();
//		Set<Integer> M = new TreeSet<>();
//		Set<Integer> B = new TreeSet<>();
		int kk = 10000000;
		int mm = 20000000;
		int bb = 3000000;
		int n = sc.nextInt();
		for (int j = 0; j < n; j++) {
//			kk = 10000000;
//			mm = 10000000;
//			bb = 10000000;
			int i = sc.nextInt();
			String a = sc.next();
			int k = Integer.parseInt(a.substring(0, a.length() - 2));
			z(k, kk, K, i);
			
			a = sc.next();
			int m = Integer.parseInt(a.substring(0, a.length() - 2));
			z(m, mm, M, i);
			
			int b = sc.nextInt();
			sc.next();
			z(b, bb, B, i);
			
//			z(k, kk, K, i);
//			z(m, mm, M, i);
//			z(b, bb, B, i);
		}
//		int n = sc.nextInt();
//		for (int j = 0; j < n; j++){
//			int i = sc.nextInt();
//			String a = sc.next();
//			int k = Integer.parseInt(a.substring(0, a.length() - 2));
//			if(kk > k){
//				kk = k;
//				K.clear();
//				K.add(i);
//			}
//			else if (kk == k){
//				K.add(i);
//				}
//			a = sc.next();
//			int m = Integer.parseInt(a.substring(0, a.length() - 2));
//			if (mm > m){
//				mm = m;
//				M.clear();
//				M.add(i);
//			}else if (mm == m){
//				M.add(i);
//				}
//			int b = sc.nextInt();
//			sc.next();if (bb > b) {
//				bb = b;
//			    B.clear();
//				B.add(i);
//			}else if (bb == b){
//				B.add(i);
//				}}
		sc.close();
		System.out.println(kk + "KB");
		for (int x : K)
			System.out.print(x + " ");
		System.out.println();
		System.out.println(mm + "ms");
		for (int x : M)
			System.out.print(x + " ");
		System.out.println();
		System.out.println(bb + " bytes");
		for (int x : B)
			System.out.print(x + " ");
		System.out.println();
		}}
	