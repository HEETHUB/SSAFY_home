package ssafy_start_camp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SWEA_1974_스도쿠검증 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t=1;t<T+1;t++) {
			String num = "#"+Integer.toString(t);
			int ans = 1;
			
			int[][] arr;
			arr = new int[9][9];
			for (int i=0; i<9; i++) {
				for (int j=0; j<9; j++)
					arr[i][j] = sc.nextInt();
			}
			
			for (int i = 0; i < 9; i++) {
				Set<Integer> ver = new HashSet<Integer>();
				Set<Integer> hor = new HashSet<Integer>();
				for (int j = 0; j < 9; j++) {
					if (hor.contains(arr[i][j]) == false && ver.contains(arr[j][i]) == false) {
						hor.add(arr[i][j]);
						ver.add(arr[j][i]);
					}
					else { 
						ans = 0;
						break;
					}
				}
			}
			
			for (int i=0; i<7; i+=3) {
				for (int j=0; j<7; j+=3) {
					Set<Integer> c = new HashSet<Integer>();
					int a = 0;
					int b = 0;
					while(true) {
						if (c.contains(arr[i+a][j+b]) == false) {
							c.add(arr[i+a][j+b]);
						} else {
							ans = 0;
							break;
						}
						a += 1;
						b += 1;
						if (a == 3 && b == 3) {
							break;
						}	
					}
				}
			}
			System.out.println(num + " " + Integer.toString(ans));
		}
	sc.close();
	}
}
