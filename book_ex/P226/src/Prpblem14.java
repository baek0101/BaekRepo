
public class Prpblem14 {

	public static void main(String[] args) {
		
		int i;
		int k;
		
		for (i = 2; i <= 9; i++)
			System.out.printf("   *Á¦%d´Ü*   ", i);
		
		System.out.printf("\n\n");
		
		for (i = 1; i <= 9; i++) {
			for(k = 2; k <= 9; k++) {
				System.out.printf("%2d X%2d = %2d  ", k, i, i*k);
			}
			System.out.println("");
		}
	}
}