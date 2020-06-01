import java.util.Scanner;

public class Ex8_3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int aa[]=new int[4];
		int i;
		int hap = 0;
		
		
		System.out.printf("1번째 숫자를 입력하세요 : ");
		aa[0] = s.nextInt();
		System.out.printf("2번째 숫자를 입력하세요 : ");
		aa[1] = s.nextInt();
		System.out.printf("3번째 숫자를 입력하세요 : ");
		aa[2] = s.nextInt();
		System.out.printf("4번째 숫자를 입력하세요 : ");
		aa[3] = s.nextInt();
		
		for(i=0;i<=3;i++){
			hap = hap + aa[i];
		}
		
		System.out.println("합계 : "+hap);
	}

}
