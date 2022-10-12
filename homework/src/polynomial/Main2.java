package polynomial;

public class Main2 {
	class Poly {
		double coef; // ���
		int exp; // ����

		public Poly() {
			this.coef = 0;
			this.exp = 0;
		}

		public Poly(double coef, int exp) {
			this.coef = coef;
			this.exp = exp;
		}
	}

	public static Poly[] add(Poly[] poly1, Poly[] poly2) {
		final int NEW_POLY_SIZE = poly1.length + poly2.length;
		Poly[] newPoly = new Poly[NEW_POLY_SIZE];

		int poly1_start = 0, poly1_end = poly1.length - 1;
		int poly2_start = 0, poly2_end = poly2.length - 1;
		int position = 0;

		while (poly1_start <= poly1_end && poly2_start <= poly2_end) {
			// ���� ���� ���� �ִ� ���� �ݺ�
			if (poly1[poly1_start].exp < poly2[poly2_start].exp) {
				// poly2�� ����� �� Ŭ ��� poly2�� ���� ���� ���;���
//				newPoly[position++] = new Poly(poly2[poly2_start].coef, poly2[poly2_start].exp);
				poly2_start++;
			}
			if (poly1[poly1_start].exp > poly2[poly2_start].exp) {
//				newPoly[position++] = new Poly(poly1[poly1_start].coef, poly1[poly1_start].exp);
				poly1_start++;
			}
			if (poly1[poly1_start].exp == poly2[poly2_start].exp) {
				// �� ���� ������ ���� ���
				double coef = poly1[poly1_start].coef + poly2[poly2_start].coef;
				if (coef != 0)
					// ����� ���� 0�� ��� ���Խ�Ű�� ����
//					newPoly[position++] = new Poly(coef, poly1[poly1_start].exp);
				poly1_start++;
				poly2_start++;
			}
		}
		// �����ִ� �� �߰�
		for (; poly1_start <= poly1_end; poly1_start++) {
//			newPoly[position++] = new Poly(poly1[poly1_start].coef, poly1[poly1_start].exp);
		}
		for (; poly2_start <= poly2_end; poly2_start++) {
//			newPoly[position++] = new Poly(poly1[poly2_start].coef, poly1[poly2_start].exp);
		}

		return newPoly;
	}

	public static void main(String[] args) {
		// poly = 2x^10 + 3.4x^8 + 3x^2 + 1
//		Poly[] poly1 = { new Poly(2, 10), new Poly(3.4, 8), new Poly(3, 2), new Poly(1, 0) };
		// poly = 3x^8 + 5x^5 - 3x^2 + 12.5
//		Poly[] poly2 = { new Poly(3, 8), new Poly(5, 5), new Poly(-3, 2), new Poly(12.5, 0) };

//		Poly[] poly3 = add(poly1, poly2);
//   System.out.println(ploy3);
//		printPoly(poly3);
	}
}