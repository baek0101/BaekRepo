/*45�� ���� �˶� �����ϱ�
 *ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) �̰��� ������ ���� �˶� �ð� H�� M���� �ǹ��Ѵ�.
 *�Է� �ð��� 24�ð� ǥ���� ����Ѵ�.
 *24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�. */

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
