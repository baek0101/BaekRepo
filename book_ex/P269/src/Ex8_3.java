import java.util.Scanner;

public class Ex8_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int i;
		int hap = 0;
		
		for(i=0; i<=3; i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ", i+1);
			aa[i]=s.nextInt();
		}
		hap = aa[0]+aa[1]+aa[2]+aa[3];
		
		System.out.println("�հ� ==> "+hap);
		
	}

}
