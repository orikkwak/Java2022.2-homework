package GoldMedal;

import java.util.Scanner;

public class asd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str;
		String[] strarr = new String[5];
		str = sc.nextLine();
        strarr = str.split(" ", 5);
        for (String p : strarr)
        	System.out.println(p);
	}
}
