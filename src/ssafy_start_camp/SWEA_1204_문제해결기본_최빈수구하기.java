package ssafy_start_camp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SWEA_1204_문제해결기본_최빈수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t=0; t < T; t++) {
			int n = sc.nextInt();
			Map<Integer, Integer> score = new HashMap<Integer, Integer>();
			
			for (int i=0; i<1000;i++) {
				int number = sc.nextInt();
				if (score.containsKey(number) == false)
					score.put(number, 1);
				else score.put(number, score.get(number)+1);
			}
			
			int ans = 1;
			for (int i=1; i<101; i++) {
				if (score.containsKey(i)) {
					if (score.get(i) >= score.get(ans)) ans = i;
				}
			}
			System.out.println("#"+Integer.toString(n)+" "+Integer.toString(ans));
			
		}
	}
}
