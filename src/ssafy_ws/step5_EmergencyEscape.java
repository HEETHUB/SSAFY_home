package ssafy_ws;

import java.util.Arrays;
import java.util.Scanner;



public class step5_EmergencyEscape { 
	public static int delAlti(int[] arr, int i, int min) {
		if (i+min < arr.length) {
			return arr[i+min]-arr[i];
		}else return -1;
	}
	
	public static int avgVeloc(int[] arr, int i, int min) {
		int ans = 0;
		if (i+min < arr.length) {
			for (int j=i; j<i+min;j++) {
				ans += arr[j];
			}
			return ans/min;
		} else return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] veloc = new int[N];
		int[] alti = new int[N];
		
		for (int i = 0; i < N; i++) {
			veloc[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			alti[i] = sc.nextInt();
		}
		
		int i = 0;
		outer : while (i < N) {
			for (int j = 2; j<=4; j++) {
				if (delAlti(alti, i, j) <= -1000*j && avgVeloc(veloc, i, j) >= 1300-j*100) {
					System.out.println(i+1+j);
					break outer;
				}
			}
			i++;
			if (i==N) System.out.println(-1);
		}
	}
}
