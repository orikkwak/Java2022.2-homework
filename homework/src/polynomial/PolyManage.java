//package polynomial;
//
//import java.util.*;
//
//import polynomial.Main2.Poly;
//
//public class PolyManage {
//	
//	class Poly {
//		int c;
//		int e;
//
//		public Poly() {
//			this.c = 0;
//			this.e = 0;
//		}
//
//		public Poly(int c, int e) {
//			this.c = c;
//			this.e = e;
//		}
//	}
//
//	public static Poly[] add(Poly[] f, Poly[] g) {
//		final int NEW_PLOY_SIZE = f.length + g.length;
//		Poly[] np = new Poly[NEW_PLOY_SIZE];
//
//		int fs = 0, fe = f.length - 1;
//		int gs = 0, ge = g.length - 1;
//		int o = 0;
//
//		while (fs <= fe && gs <= ge) {
//			if(f[fs].exp < g[gs].exp)
//		}
//		for (; fs <= fe; fs++) {
//			np[o] = new Poly(f[fs].c, f[fs].e);
//		}
//		for (; gs <= ge; gs++) {
//			np[o] = new Poly(f[fs].c, g[gs].e);
//
//		}
//		return np;
//	}
//
//	public static void main(String[] args) {
//		Poly[] f = { new Poly(2, 5), new Poly(4, 3), new Poly(-7, 1), new Poly(3, 0) };
//		Poly[] g = { new Poly(1, 5), new Poly(-4, 3), new Poly(-1, 2) };
////		Scanner s = new Scanner(System.in);
////		int n = s.nextInt();
////		String f = String.format(s.next());
////		int m = Integer.parseInt(s.nextLine());
////		int co = Integer.parseInt(s.nextLine());
////		int ex = Integer.parseInt(s.nextLine());
////
////		for(int j = 0; j < m ; j++) {
////			H[] f1 = {new H(co, ex)};
////			}
//	}
//
//}
