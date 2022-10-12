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

        for (int i = 0; i < poly[0].length; i++) {  // 배열 하나의 길이
            result[i] = 0;
            for (int j = 0; j < poly.length; j++) {     //다항식 개수
                result[i] += poly[j][i];        // 해당 차수의 항을 전부 더함
            }
            if (result[i] != 0) num++;  // 그 항의 계수가 0이 아니면 다항식 결과 개수에 포함되는 거니까
        }

        System.out.println(num);
        
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] != 0) {
                System.out.println(result[i] + " " + i);        // 가장 높은 항부터 계수, 차수로 출력
            }
        }
	}

}
