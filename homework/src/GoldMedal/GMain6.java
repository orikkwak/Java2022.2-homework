package GoldMedal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GMain6 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
	    Set<Integer>K=new TreeSet<>();
		Set<Integer> M = new TreeSet<>();
		Set<Integer> B = new TreeSet<>();
		int kk = 10000000;
		int mm = 10000000;
		int bb = 10000000;
		StringTokenizer n = new StringTokenizer(sc.readLine());
		int c = Integer.parseInt(n.nextToken());
		for (int j = 0; j < c ; j++){
			int i = Integer.parseInt(n.nextToken());
			StringTokenizer a = new StringTokenizer(sc.readLine());
			int k = Integer.parseInt(null, a.countTokens() - 2);
			if(kk > k){
				kk = k;
				K.clear();
				K.add(i);
			}
			else if (kk == k){
				K.add(i);
				}
			a = new StringTokenizer(sc.readLine());
			int m = Integer.parseInt(null, a.countTokens() - 2);
			if (mm > m){
				mm = m;
				M.clear();
				M.add(i);
			}else if (mm == m){
				M.add(i);
				}
			int b = Integer.parseInt(n.nextToken());
			n.nextToken();
			if (bb > b) {bb = b;
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