import java.util.Scanner;

public class Ex8_3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int aa[]=new int[4];
		int i;
		int hap = 0;
		
		
		System.out.printf("1��° ���ڸ� �Է��ϼ��� : ");
		aa[0] = s.nextInt();
		System.out.printf("2��° ���ڸ� �Է��ϼ��� : ");
		aa[1] = s.nextInt();
		System.out.printf("3��° ���ڸ� �Է��ϼ��� : ");
		aa[2] = s.nextInt();
		System.out.printf("4��° ���ڸ� �Է��ϼ��� : ");
		aa[3] = s.nextInt();
		
		for(i=0;i<=3;i++){
			hap = hap + aa[i];
		}
		
		System.out.println("�հ� : "+hap);
	}

}
