import java.util.*;
import java.io.*;

public class Ex11 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st1 = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st1.nextToken());
		int x = Integer.parseInt(st1.nextToken());

		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		
		int aa[] = new int[n];
		
		for(int i = 0; i < n; i++) {			
			aa[i] = Integer.parseInt(st2.nextToken());			
		}
		
		for(int i = 0; i < n; i++) {			
			if(aa[i] < x) {
				bw.write(aa[i]+" ");
			}
		}
		
		bw.flush();
		bw.close();
	}

}