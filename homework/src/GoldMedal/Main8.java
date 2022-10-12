package GoldMedal;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// �ؽø� <����, ���> �ش� ������ ��� ������
		TreeMap<Integer, Integer> tm = new TreeMap<>();

		// ���׽��� ���� �Է�
		int n = sc.nextInt();

		// n���� ���׽� ó��
		for (int i = 0; i < n; i++) {
			sc.next();
			int count = sc.nextInt();
			
			//ù��°�� �ؽøʿ� �߰�
			//d���� ������ ����� Error ��� and ����
			if (i == 0) {
				for (int j = 0; j < count; j++) {
					int v = sc.nextInt();
					int d = sc.nextInt();
					if (d < 0 || d > 100000) {
						System.out.println("Error");
						return;
					}
					
					tm.put(d, v);
				}
			}
			//�ش� ������ ������ �߰�
			//�ش� ������ ������ �������� ���ؼ� ����
			else {
				for (int j = 0; j < count; j++) {
					int v = sc.nextInt();
					int d = sc.nextInt();
					if (d < 0 || d > 100000) {
						System.out.println("Error");
						return;
					}
					
					if (tm.containsKey(d)) {
						if (tm.get(d) + v == 0)
							tm.remove(d);
						else
							tm.put(d, tm.get(d) + v);
					}
					else {
						tm.put(d, v);
					}
				}
			}
			
		}
		
		//���
		System.out.println(tm.size());
		tm.entrySet().stream()
			.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
			.forEach(entry -> System.out.println(entry.getValue() + " " + entry.getKey()));
	}
}
