package polynomial;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		String f = s.next();
//		int m = s.nextInt();
//		int c = s.nextInt();
//		int e = s.nextInt();
//		int[][]poly = new int[][]{};
        int n = 2;
        int[][] poly = new int[][]{{3, -7, 0, 4, 0, 5}, {0, 0, -1, -4, 1}};
        int num = 0;
        int[] result = new int[100];

        for (int i = 0; i < poly[0].length; i++) {  // �迭 �ϳ��� ����
            result[i] = 0;
            for (int j = 0; j < poly.length; j++) {     //���׽� ����
                result[i] += poly[j][i];        // �ش� ������ ���� ���� ����
            }
            if (result[i] != 0) num++;  // �� ���� ����� 0�� �ƴϸ� ���׽� ��� ������ ���ԵǴ� �Ŵϱ�
        }

        System.out.println(num);
        
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] != 0) {
                System.out.println(result[i] + " " + i);        // ���� ���� �׺��� ���, ������ ���
            }
        }
	}

}
