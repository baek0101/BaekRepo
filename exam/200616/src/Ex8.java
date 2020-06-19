import java.io.*;
import java.util.*;

public class Ex8 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i<=t; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
		}
		bw.flush();
		bw.close();
	}

}