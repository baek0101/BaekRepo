import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int a = n;

		int count = 0;
		while(true) {
			if(n < 10) {
				n = n * 10 + n;
			} else {
				n = (n % 10) * 10 + (((n / 10) + (n % 10)) % 10);
			}
			count++;
			if(a == n) break;
		}
		System.out.println(count);
	}

}