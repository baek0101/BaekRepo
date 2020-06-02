
public class Ex8_5 {

	public static void main(String[] args) {
		int[] aa = new int[100];
		int[] bb = new int[100];
		int i;
		
		for(i=0; i<100; i++) {
			aa[i] = i*2;
		}
		
		for(i=0; i<100; i++) {
			bb[i] = aa[99-i];
		}
		
		System.out.println("bb[0]ดย "+bb[0]+", bb[99]ดย "+bb[99]+" ภิทยตส");		

	}

}
