import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Ex2 {

	public static void main(String[] args) {
		//List인터페이스는 메모리에 올릴 수 없기 때문에 ArrayList 클래스를 통해 메모리를 올림
		//List string타입인 rList에, ArrayList타입을 메모리에 입력받는다.
		List<String> rList = new ArrayList<>();
		
		//List 컬렉션 프레임워크에 데이터를 추가함
		rList.add("홍길동1");
		rList.add("홍길동2");
		rList.add("임꺽정");
		rList.add("고길동");
		
		//배열크기 출력(개수)
		System.out.println("배열의 크기"+rList.size());
		
		//List컬렉션을 통해 저장된 데이터를 가져올때 for문을 쓰지 않고, while문을 쓰길 권장함
		/*for문의 비해 while문의 속도가 더 빠르고, List 인터페이스를 메로리에 올려주는 
		컬렉션 클래스를 변경해야 할 경우, 쉽게 변경이 가능함*/
		Iterator<String> it = rList.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			
			System.out.println("이름 : "+name);
		}
		
	}
	

}