import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i;
		int hap = 0;
		
		for(i=1; i<=n; i++) {
			hap = hap + i;
		}
		
		System.out.println(hap);
	}

}
