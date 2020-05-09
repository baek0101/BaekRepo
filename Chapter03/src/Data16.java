public class Data16
{
	public static void main(String[] args)
	{
		int a = 100;
		float b = 10.3f;
		float result;
				
		result = a + b;
		System.out.printf("%d + %4.1f = %5.1f\n", a, b, result);
		result = a / b;
		System.out.printf("%d / %4.1f = %d\n", a, b, (int)result);
	}
}
