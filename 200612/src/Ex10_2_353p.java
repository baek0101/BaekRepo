//10�� ���� ó���� ���� �����
public class Ex10_2_353p {

	public static void main(String[] args) {
		int[] aa = new int[3];
		
		try {
			aa[2] = 100/0;
			aa[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� ŭ�ϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ���� �����Դϴ�.");
		} finally {
			System.out.println("�� �κ��� ������ ���ɴϴ�.");
		}

	}

}
