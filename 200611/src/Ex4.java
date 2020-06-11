import java.io.*;
import java.util.*;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));//BufferedReader는 입력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//BufferedWrite는 출력
		int t = Integer.parseInt(bf.readLine());
		//readLine은 한줄을 읽어 String으로만 받으므로 int로 형변환

		int i;
		for(i=1; i<=t; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			//StringTokenizer를 이용해서 token으로 입력받는 경우
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
					
			bw.write((a+b)+"\n");//출력
		}
		bw.flush();//스트림 비움
		bw.close();//스트림 닫음
		//BufferedWrite는 마지막에 flush(), close() 반드시 입력
	}
}
