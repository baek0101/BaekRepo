//9�� ���ڿ��� �޼ҵ�
public class method {

	public static void main(String[] args) {
		//static�� �ڵ����� �޸𸮿� �ø���.
		//void�� return�� ����.
		System.out.println("main�Լ� ȣ�� ����!");
		
		int res = sum(1, 2);//��sum�Լ� ȣ��. ������ sum �޾ƿ´�. res�� ������ Ÿ���� ���ƾ� �Ѵ�.
		
		System.out.println("sum�Լ� ���� ��� : "+res);
		System.out.println("main�Լ� ȣ�� ��!");
	
	}
	
	//ȣ��Ǵ� sum�Լ�.
	public static int sum(int i1, int i2) {
		//int�� ��ȯ Ÿ��(����).
		//void�� ������ ������ return�� �ִ�.
		System.out.println("sum�Լ� ȣ�� ����!");
		int sum = 0;//����������
		for(int i = i1; i<=i2; i++) 
			sum+=1;
			
			System.out.println("sum�Լ� ȣ�� ��!");
			return sum;//����� sum�� �����ش�.
		}
	}
