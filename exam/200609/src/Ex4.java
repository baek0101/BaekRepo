/* ���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
 * ��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.
 * �� (x, y)�� ��и� ��ȣ(1, 2, 3, 4 �� �ϳ�)�� ����Ѵ�.*/

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a>0) {
			if(b>0)
				System.out.println("1");
			else
				System.out.println("4");
		}else
			if(b>0)
				System.out.println("2");
			else
				System.out.println("3");
			
	}

}
