import java.util.Scanner;

public class Ex7_8 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		
		while (true) {
			System.out.printf("���� ù ��° �� �Է� : ");
			a = s.nextInt();
			System.out.printf("���� �� ��° �� �Է� : ");
			b = s.nextInt();
			
			if (a==0)
				break;
			
			System.out.println(a + " + " + b + " = " + (a+b));
		}
		
		System.out.printf("0�� �Է��ؼ� �ݺ����� Ż���߽��ϴ�.\n");
		
	}

}
