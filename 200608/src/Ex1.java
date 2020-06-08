
public class Ex1 {

	public static void main(String[] args) {
		
		int a = 250;
		int aa[] =new int[a];

		
		int i;
		for(i = 0; i < a; i++) {
			aa[i] = i+1;
		}
		
		int k = 0;
		int hap = 0;
		while(k < a) {
			System.out.println(aa[(a-1)-k]);
			hap = hap + aa[(a-1)-k];
			k++;
		}
		
		System.out.println(hap);
	
	}

}
