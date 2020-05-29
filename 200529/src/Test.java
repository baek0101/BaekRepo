
public class Test {

	public static void main(String[] args) {
		//11부터 100까지의 합을 배열을 이용하여 출력
		int num[]=new int[90];
		int i;
		int hap = 0;
		
		for(i=0; i<90; i++) {
			num[i]=i+11;//배열 입력 값
			hap=hap+num[i];//11부터 100까지의 합
		}
		i=0;
		while(i<90) {
			System.out.println(num[i]);//배열 입력 값 출력
			i++;
		}
		System.out.println(hap);//11부터 100까지의 합 출력
	}

}
