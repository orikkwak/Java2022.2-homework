package GoldMedal;

import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class GMG {

	   public static void main(String arg[]) {
	      Scanner sc = new Scanner(System.in);
	      
	      //학생 수 입력
	      int n = sc.nextInt();
	      sc.nextLine();
	      
	      //배열 선언 : 학생 / 메모리 / 실행시간 / 코드용량
	      int[] student = new int[n];
	      int[] mm = new int[n];
	      int[] rt = new int[n];
	      int[] cv = new int[n];
	      
	      //배열 저장
	      for(int i=0; i < n; i++) {
	         student[i] = sc.nextInt();
	         String a = sc.next();
	         mm[i] = Integer.parseInt(a.substring(0, a.length()-2));
	         a = sc.next();
	         rt[i] = Integer.parseInt(a.substring(0, a.length()-2));
	         cv[i] = sc.nextInt();
	         sc.next();
	      }
	      
	      
	      
	      //최소값 구하기
	      int mMin = minValue(mm);
	      int rMin = minValue(rt);
	      int cMin = minValue(cv);
	      
	      
	      //출력
	      //메모리
	      Set<Integer> ts = new TreeSet<>(); //중복X, 자동 오름차순 정렬 집합
	      System.out.println(mMin + "KB");
	      for (int i=0; i<n; i++) {
	         if (mm[i] == mMin)
	            ts.add(student[i]);
	      }
	      for (int i : ts) {
	         System.out.print(i + " ");
	      }
	      System.out.println();
	      ts.clear();
	      //실행시간
	      System.out.println(rMin + "ms");
	      for (int i=0; i<n; i++) {
	         if (rt[i] == rMin)
	            ts.add(student[i]);
	      }
	      for (int i : ts) {
	         System.out.print(i + " ");
	      }
	      System.out.println();
	      ts.clear();
	      //코드용량
	      System.out.println(cMin + " bytes");
	      for (int i=0; i<n; i++) {
	         if (cv[i] == cMin)
	            ts.add(student[i]);
	      }
	      for (int i : ts) {
	         System.out.print(i + " ");
	      }
	      System.out.println();
	      ts.clear();
	   }
	   
	   //문자열 자르기
	   public static String cutString(String s) {
	      return s.substring(0, s.length()-2);
	   }
	   
	   //최소값 찾기
	   public static int minValue (int[] arr) {
	      int min = arr[0];
	      for (int i : arr) {
	         if (min > i)
	            min = i;
	      }
	      return min;
	   }
	}