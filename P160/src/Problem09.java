import java.util.Scanner;

public class Problem09 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int money;
		int c500;
		int c100;
		int c50;
		int c10;
		
		System.out.printf("##��ȯ�� ����? ");
		money = s.nextInt();
		
		c500 = money / 500;
		money = money % 500;
		
		c100 = money / 100;
		money = money % 100;
		
		c50 = money / 50;
		money = money % 50;
		
		c10 = money / 10;
		money = money % 10;
		
		System.out.printf("\n500�� %d�� \n", c500);
		System.out.printf("100�� %d�� \n", c100);
		System.out.printf("50�� %d�� \n", c50);
		System.out.printf("10�� %d�� \n", c10);
		System.out.printf("�ٲ��� ���� �ܵ� %d��", money);
		
	}

}