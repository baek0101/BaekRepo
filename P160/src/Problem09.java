import java.util.Scanner;

public class Problem09 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int money;
		int c500;
		int c100;
		int c50;
		int c10;
		
		System.out.printf("##교환할 돈은? ");
		money = s.nextInt();
		
		c500 = money / 500;
		money = money % 500;
		
		c100 = money / 100;
		money = money % 100;
		
		c50 = money / 50;
		money = money % 50;
		
		c10 = money / 10;
		money = money % 10;
		
		System.out.printf("\n500원 %d개 \n", c500);
		System.out.printf("100원 %d개 \n", c100);
		System.out.printf("50원 %d개 \n", c50);
		System.out.printf("10원 %d개 \n", c10);
		System.out.printf("바꾸지 못한 잔돈 %d원", money);
		
	}

}