package GoldMedal;

import java.util.*;

public class GMain6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Set<Integer>K=new TreeSet<>();
		Set<Integer> M = new TreeSet<>();
		Set<Integer> B = new TreeSet<>();
		int kk = 10000000;
		int mm = 10000000;
		int bb = 10000000;
		int n = sc.nextInt();
		for (int j = 0; j < n; j++){
			int i = sc.nextInt();
			String a = sc.next();
			int k = Integer.parseInt(a.substring(0, a.length() - 2));
			if(kk > k){
				kk = k;
				K.clear();
				K.add(i);
			}
			else if (kk == k){
				K.add(i);
				}
			a = sc.next();
			int m = Integer.parseInt(a.substring(0, a.length() - 2));
			if (mm > m){
				mm = m;
				M.clear();
				M.add(i);
			}else if (mm == m){
				M.add(i);
				}
			int b = sc.nextInt();
			sc.next();if (bb > b) {
				bb = b;
			    B.clear();
				B.add(i);
			}else if (bb == b){
				B.add(i);
				}}
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