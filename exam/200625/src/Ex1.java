import java.io.*;
import java.util.*;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int aa[] = new int[5];
		
		int i = 0;
		int hap = 0;
		while(i < aa.length) {
			aa[i] = Integer.parseInt(br.readLine());
			if(aa[i] < 40) {
				aa[i] = 40;
			}
			//40점 미만은 40점으로.
			hap = hap + aa[i];
			i++;
		}

		int result = hap / aa.length;
		
		System.out.println(result);
	}

}