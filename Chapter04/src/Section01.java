
public class Section01
{
	public static void main(String[] args)
	{
		int a;
		int b;
		
		a = 10;
		
		b = ++a; // �� ���� a�� 1 ������Ų��. �� b=a(���԰�:11)�� ����.
		System.out.printf("%d \n", a);// �� a=11
		System.out.printf("%d \n", b);// �� b=11
		
		a = 10;
		
		b = a++; // �� b=a(���԰�:10)�� ���� ����. �� ���� a�� 1 ������Ų��.
		System.out.printf("%d \n", b);// �� b=10
		System.out.printf("%d \n", a);// �� a=11
	}
}
