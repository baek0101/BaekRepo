import java.util.*;
import java.io.*;

public class Ex7{
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(bf.readLine());
        
        for (int i = 1; i <= x; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	//parseInt�� StringŸ���� ���ڸ� intŸ������ ��ȯ
        	//���ڿ��� �ݵ�� ���ڷθ� �̷������ �Ѵ�.
        	//Byte.parseByte(); Short.parseShort(); Long.parseLong(); Float.parseFloat(); Double.parseDouble();
            
            bw.write("Case #"+i+": "+(a+b)+"\n");
        }
        bw.flush();
        bw.close();
    }
}