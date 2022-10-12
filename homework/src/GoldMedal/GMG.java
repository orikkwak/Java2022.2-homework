package GoldMedal;

import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class GMG {

	   public static void main(String arg[]) {
	      Scanner sc = new Scanner(System.in);
	      
	      //�л� �� �Է�
	      int n = sc.nextInt();
	      sc.nextLine();
	      
	      //�迭 ���� : �л� / �޸� / ����ð� / �ڵ�뷮
	      int[] student = new int[n];
	      int[] mm = new int[n];
	      int[] rt = new int[n];
	      int[] cv = new int[n];
	      
	      //�迭 ����
	      for(int i=0; i < n; i++) {
	         student[i] = sc.nextInt();
	         String a = sc.next();
	         mm[i] = Integer.parseInt(a.substring(0, a.length()-2));
	         a = sc.next();
	         rt[i] = Integer.parseInt(a.substring(0, a.length()-2));
	         cv[i] = sc.nextInt();
	         sc.next();
	      }
	      
	      
	      
	      //�ּҰ� ���ϱ�
	      int mMin = minValue(mm);
	      int rMin = minValue(rt);
	      int cMin = minValue(cv);
	      
	      
	      //���
	      //�޸�
	      Set<Integer> ts = new TreeSet<>(); //�ߺ�X, �ڵ� �������� ���� ����
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
	      //����ð�
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
	      //�ڵ�뷮
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
	   
	   //���ڿ� �ڸ���
	   public static String cutString(String s) {
	      return s.substring(0, s.length()-2);
	   }
	   
	   //�ּҰ� ã��
	   public static int minValue (int[] arr) {
	      int min = arr[0];
	      for (int i : arr) {
	         if (min > i)
	            min = i;
	      }
	      return min;
	   }
	}