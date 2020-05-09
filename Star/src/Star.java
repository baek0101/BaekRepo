import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a;
		int b;
		int num;
		
		//별찍기 1~4번 설명
		System.out.println("별찍기 모양은 1번부터 4번까지 있습니다.");
		System.out.printf("1부터 4까지의 숫자 하나만 입력하세요.==>");
		
		while(true) {
			
			num = s.nextInt();
			
			//1번
			if (num==1) {
				for (a=1; a<7; a++) {
					for (b=0; b<a; b++)	{
						System.out.printf("*");
					}
					System.out.println("");
				}
			}
			
			//2번
			if (num==2) {
				for (a=1; a<7; a++) {
					for (b=0; b<a; b++) {
						System.out.printf("*");
					}
				System.out.println("");
				}
				for (a=1; a<6; a++) {
					for (b=6; b>a; b--) {
						System.out.printf("*");
					}
					System.out.println("");
				}
			}
			
			//3번
			if(num==3) {
				for (a=1; a<7; a++) {
					for (b=6; b>0; b--) {
						if(b>a) {
							System.out.printf(" ");
						} else
							System.out.printf("*");
					}
					System.out.println("");
				}
					
			}
			
			//4번
			if(num==4) {
				for (a=1; a<7; a++) {
					for (b=6; b>0; b--) {
						if(b>a) {
							System.out.printf(" ");
						} else
							System.out.printf("*");
					}
					System.out.println("");
				}
				for (a=1; a<7; a++) {
					for (b=0; b<6; b++) {
						if(b<a) {
							System.out.printf(" ");
						} else
							System.out.printf("*");
					}
					System.out.println("");
				}
			}
			
			System.out.printf("1부터 4까지의 숫자 하나만 입력하세요.==>");
			
		}
	}
}