import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a;
		int b;
		int num;
		
		//����� 1~4�� ����
		System.out.println("����� ����� 1������ 4������ �ֽ��ϴ�.");
		System.out.printf("1���� 4������ ���� �ϳ��� �Է��ϼ���.==>");
		
		while(true) {
			
			num = s.nextInt();
			
			//1��
			if (num==1) {
				for (a=1; a<7; a++) {
					for (b=0; b<a; b++)	{
						System.out.printf("*");
					}
					System.out.println("");
				}
			}
			
			//2��
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
			
			//3��
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
			
			//4��
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
			
			System.out.printf("1���� 4������ ���� �ϳ��� �Է��ϼ���.==>");
			
		}
	}
}