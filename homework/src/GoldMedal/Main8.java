package GoldMedal;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// 해시맵 <차수, 계수> 해당 차수에 계속 더해줌
		TreeMap<Integer, Integer> tm = new TreeMap<>();

		// 다항식의 개수 입력
		int n = sc.nextInt();

		// n개의 다항식 처리
		for (int i = 0; i < n; i++) {
			sc.next();
			int count = sc.nextInt();
			
			//첫번째항 해시맵에 추가
			//d값이 범위에 벗어날시 Error 출력 and 종료
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
			//해당 차수가 없을시 추가
			//해당 차수가 있을시 기존값과 더해서 수정
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
		
		//출력
		System.out.println(tm.size());
		tm.entrySet().stream()
			.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
			.forEach(entry -> System.out.println(entry.getValue() + " " + entry.getKey()));
	}
}
