/*45분 일찍 알람 설정하기
 *첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 이것은 설정한 놓은 알람 시간 H시 M분을 의미한다.
 *입력 시간은 24시간 표현을 사용한다.
 *24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다. */

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int h = s.nextInt();
		int m = s.nextInt();
		
		if((m - 45) >= 0) {
			System.out.println(h+" "+(m-45));
		} else
			if(h-1 > 0)
				System.out.println((h-1)+" "+((m+60)-45));
			else
				System.out.println(((h-1)+24)+" "+((m+60)-45));
	}

}
