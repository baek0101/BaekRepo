import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int aa[] = new int[5];
		int a = 0;
		int b;
		
		//���� �Է�
		int i = 0;
		while(i < aa.length) {
			aa[i] = Integer.parseInt(br.readLine());
			i++;
		}
		//�ܹ��� 3���� �� ���� ������ ����
		if((aa[0] <= aa[1]) && (aa[0] <= aa[2])) {
			a = aa[0];
		} else if((aa[1] <= aa[0]) && (aa[1] <= aa[2])) {
			a = aa[1];
		} else if((aa[2] <= aa[0]) && (aa[2] <= aa[1])){
			a = aa[2];
		}
		
		//���� 2���� �� ���� ������ ����
		if(aa[3] <= aa[4]) {
			b = aa[3];
		} else 
			b = aa[4];
		
		//��Ʈ ���� ���
		System.out.println(a+b-50);
	}

}
