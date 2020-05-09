
public class Section01
{
	public static void main(String[] args)
	{
		int a;
		int b;
		
		a = 10;
		
		b = ++a; // ① 먼저 a를 1 증가시킨다. ② b=a(대입값:11)를 수행.
		System.out.printf("%d \n", a);// ① a=11
		System.out.printf("%d \n", b);// ② b=11
		
		a = 10;
		
		b = a++; // ① b=a(대입값:10)를 먼저 수행. ② 다음 a를 1 증가시킨다.
		System.out.printf("%d \n", b);// ① b=10
		System.out.printf("%d \n", a);// ② a=11
	}
}
