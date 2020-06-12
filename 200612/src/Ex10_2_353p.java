//10장 예외 처리와 파일 입출력
public class Ex10_2_353p {

	public static void main(String[] args) {
		int[] aa = new int[3];
		
		try {
			aa[2] = 100/0;
			aa[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자가 배열 크기보다 큼니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누는 등의 오류입니다.");
		} finally {
			System.out.println("이 부분은 무조건 나옵니다.");
		}

	}

}
