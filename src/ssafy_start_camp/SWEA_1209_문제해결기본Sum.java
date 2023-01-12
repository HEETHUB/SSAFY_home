package ssafy_start_camp;

import java.util.Scanner;

public class SWEA_1209_문제해결기본Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int t=0; t<10; t++) {
			int n = sc.nextInt();
			int[][] arr = new int[100][100];
			
			for (int i=0; i<100; i++) {
				for (int j=0; j<100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			for (int i=0; i<100; i++) {
				int ver = 0;
				int hor = 0;
				for (int j=0; j<100; j++) {
					hor += arr[i][j];
					ver += arr[j][i];
				}
				if (ver > max) max = ver;
				if (hor > max) max = hor;
			}
			int diag1 = 0;
			int diag2 = 0;
			for (int i=0; i<100; i++) {
				diag1 += arr[i][i];
				diag2 += arr[i][99-i];
			}
			if (diag1 > max) max = diag1;
			if (diag2 > max) max = diag2;
			
			System.out.println("#"+Integer.toString(n)+" "+Integer.toString(max));
		}
	}
}
