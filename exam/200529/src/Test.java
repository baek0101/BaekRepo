
public class Test {

	public static void main(String[] args) {
		//11���� 100������ ���� �迭�� �̿��Ͽ� ���
		int num[]=new int[90];
		int i;
		int hap = 0;
		
		for(i=0; i<90; i++) {
			num[i]=i+11;//�迭 �Է� ��
			hap=hap+num[i];//11���� 100������ ��
		}
		i=0;
		while(i<90) {
			System.out.println(num[i]);//�迭 �Է� �� ���
			i++;
		}
		System.out.println(hap);//11���� 100������ �� ���
	}

}
