import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int aa[] = new int[5];
		int a = 0;
		int b;
		
		//가격 입력
		int i = 0;
		while(i < aa.length) {
			aa[i] = Integer.parseInt(br.readLine());
			i++;
		}
		//햄버거 3종류 중 가장 저렴한 가격
		if((aa[0] <= aa[1]) && (aa[0] <= aa[2])) {
			a = aa[0];
		} else if((aa[1] <= aa[0]) && (aa[1] <= aa[2])) {
			a = aa[1];
		} else if((aa[2] <= aa[0]) && (aa[2] <= aa[1])){
			a = aa[2];
		}
		
		//음료 2종류 중 가장 저렴한 가격
		if(aa[3] <= aa[4]) {
			b = aa[3];
		} else 
			b = aa[4];
		
		//세트 가격 출력
		System.out.println(a+b-50);
	}

}
