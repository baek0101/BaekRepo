import java.io.*;
import java.util.*;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));//BufferedReader�� �Է�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//BufferedWrite�� ���
		int t = Integer.parseInt(bf.readLine());
		//readLine�� ������ �о� String���θ� �����Ƿ� int�� ����ȯ

		int i;
		for(i=1; i<=t; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			//StringTokenizer�� �̿��ؼ� token���� �Է¹޴� ���
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
					
			bw.write((a+b)+"\n");//���
		}
		bw.flush();//��Ʈ�� ���
		bw.close();//��Ʈ�� ����
		//BufferedWrite�� �������� flush(), close() �ݵ�� �Է�
	}
}
