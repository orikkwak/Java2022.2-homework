package GoldMedal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main7 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> hm = new HashMap<>();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			int count = Integer.parseInt(st.nextToken());
			
			for (int j=0; j < count; j++) {
				st = new StringTokenizer(br.readLine());
				int de = Integer.parseInt(st.nextToken());
				int co = Integer.parseInt(st.nextToken());
				
				if(hm.containsKey(co)) {
					if ((hm.get(co) + de) == 0) {
						hm.remove(co);
					}
					else
						hm.put(co, hm.get(co) + de);
				}
				else
					hm.put(co, de);
			}
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(hm.size() + "\n");
		hm.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.forEach(entry -> {
					try {
						bw.write(entry.getValue() + " " + entry.getKey() + "\n");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
		bw.close();
	}
}