import java.util.*;
import java.io.*;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) {
				break;
			} else
				bw.write((a+b)+"\n");

		}
		bw.flush();
		bw.close();
	}

}
