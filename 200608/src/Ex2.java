
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num1;
		int num2;
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		int a = 250;//변수 개수
		int aa[] =new int[a];
		
		System.out.println("");
		
		int i = 0;
		while (i < a) {
			aa[i] = i+1;
			System.out.println(aa[i]);
			i++;
		}
		
		System.out.println("");
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	
	}

}