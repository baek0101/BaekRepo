import java.util.Scanner;

public class Ex7_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		
		while (true) {
			System.out.printf("���� ù ��° �� �Է� : ");
			a = s.nextInt();
			System.out.printf("���� �� ��° �� �Է� : ");
			b = s.nextInt();
			
			System.out.println("a = "+ a + "  b = " + b + "  a + b = " + (a+b));
		}

	}

}
