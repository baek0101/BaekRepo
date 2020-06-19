import java.io.*;
import java.util.*;

public class Ex10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		int i;
		int k;
		
		for(i = 1; i <= n; i++ ) {
			for(k = 1; k <= n-i; k++ ) {
				bw.write(" ");
			}
			for(k = n-i+1; k <= n; k++ ) {
			bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

}
