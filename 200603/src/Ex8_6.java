
public class Ex8_6 {

	public static void main(String[] args) {
		int aa[]= {10, 20, 30, 40, 50};
		int count;
		int size;
		
		count=aa.length;
		size=count*Integer.BYTES;
		
		System.out.println("배열 aa[]의 요소의 개수는 "+count+"개 입니다.");
		System.out.println("배열 aa[]의 요소의 전체 크기는 "+size+"바이트 입니다.");
	}

}
