import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex1 {

	public static void main(String[] args) {
		//List인터페이스는 메모리에 올릴 수 없기 때문에 ArrayList 클래스를 통해 메모리를 올림
		//List string타입인 rList에 ArrayList타입을 입력받는다.
		List<String> rList = new ArrayList<>();
		
		//List 컬렉션 프레임워크에 데이터를 추가함
		rList.add("홍길동1");
		rList.add("홍길동2");
		rList.add("임꺽정");
		rList.add("고길동");
		
		//배열크기 출력(개수)
		System.out.println("배열의 크기"+rList.size());
		
		//rList.get(i)는 rList[i] 값 의미
		for (int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "] 번째 배열 기억공간 : " + rList.get(i));
		}
		
	}

}
