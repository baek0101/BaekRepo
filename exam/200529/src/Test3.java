
public class Test3 {

	public static void main(String[] args) {
		
		int a=3;
		int b=1;
		
		while(a<=8) {
			if((a==3)||(a==5)) {
				System.out.println("<3´Ü>");
			}else {
				System.out.println("");
			}
			while(b<=9) {
				System.out.println(a+" * "+b+" = "+(a*b));
				b++;
			}			
			a++;
			b = 1;
		}

	}

}
