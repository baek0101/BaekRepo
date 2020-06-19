
public class Test2 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		for(a=3;a<=8;a++) {
			if((a==3)||(a==5)) {
				System.out.println("<3´Ü>");
			}else {
				System.out.println("");
			}
			for(b=1;b<=9;b++) {
				System.out.println(a+" * "+b+" = "+(a*b));
			}
		}

	}

}
