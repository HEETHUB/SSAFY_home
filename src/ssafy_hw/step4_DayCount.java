package ssafy_hw;

import java.util.Scanner;

public class step4_DayCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월과 일을 입력하세요.");
		int mon = sc.nextInt();
		int day = sc.nextInt();
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		int ans = 0;
		
		for (int i = 0; i < mon-1; i++) {
			ans += months[i];
		}
		System.out.println(mon+"월 "+day+"일은 "+(ans+day)+"번째 날입니다.");
		
		
	}
}
