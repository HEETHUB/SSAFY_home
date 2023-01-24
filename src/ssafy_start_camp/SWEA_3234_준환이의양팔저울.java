package ssafy_start_camp;

import java.util.Scanner;

public class SWEA_3234_준환이의양팔저울 {
	static int T;
	static int ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			// arr에 무게추 입력
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			ans = 0;
//			boolean[] used = new boolean[N];
			// 시작
			balance(arr, 0, 0, 0,new boolean[N], N);
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void balance(int[] arr, int idx,  int sumL, int sumR, boolean[] used, int N) {
		if (idx == N) {
			ans++;
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (used[i]) continue;
			used[i] = true;
			
			balance(arr, idx+1, sumL+arr[i], sumR, used, N);
			if (sumR + arr[i] <= sumL) {
				balance(arr, idx+1, sumL, sumR+arr[i], used, N);
			}
			used[i] = false;
		}
    }
}
