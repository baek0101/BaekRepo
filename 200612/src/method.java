//9장 문자열과 메소드
public class method {

	public static void main(String[] args) {
		//static은 자동으로 메모리에 올린다.
		//void는 return이 없다.
		System.out.println("main함수 호출 시작!");
		
		int res = sum(1, 2);//①sum함수 호출. ②결과값 sum 받아온다. res와 데이터 타입이 같아야 한다.
		
		System.out.println("sum함수 실행 결과 : "+res);
		System.out.println("main함수 호출 끝!");
	
	}
	
	//호출되는 sum함수.
	public static int sum(int i1, int i2) {
		//int는 반환 타입(정수).
		//void가 없으면 무조건 return이 있다.
		System.out.println("sum함수 호출 시작!");
		int sum = 0;//←지역변수
		for(int i = i1; i<=i2; i++) 
			sum+=1;
			
			System.out.println("sum함수 호출 끝!");
			return sum;//결과값 sum을 보내준다.
		}
	}
