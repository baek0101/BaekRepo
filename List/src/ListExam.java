import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		List<String> rList = new ArrayList<>();
		
		rList.add("홍길동1");
		rList.add("홍길동2");
		rList.add("홍길동3");
		rList.add("홍길동4");
		rList.add("홍길동5");
		
		System.out.println("배열의 크기"+ rList.size());
		
		for (int i=0; i< rList.size(); i++) {
			System.out.println("["+ i +"] 번째 배열 기억공간 : " + rList.get(i));
		}
		
		Iterator <String> it = rList.iterator();
		while(it.hasNext()) {
			String name = (String) it.next();
			System.out.println("이름 : "+ name);
		}

	}
}
