/*컬레션 프레임워크의 ArrayList 기반의 List객체를 생성하고,
그 List객체에 "객체지향프로그래밍", "하둡", "mongoDB"의 문자열을 저장하고,
 while을 통해 저장된 데이터들을 출력하시오.
첫 번째 출력되는 객체지향프로그래밍은 문자열의 앞과 뒤에 "<",">"를 붙여서 출력하시오.
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> rList = new ArrayList<String>();
		
		rList.add("객체지향프로그래밍");
		rList.add("하둡");
		rList.add("mongoDB");
		
		int a = 1;
		
		Iterator<String> it = rList.iterator();
		
		while(it.hasNext()) {
			String st = it.next();
			
			if(a==1) {
				System.out.println("<"+st+">");
			}else {
				System.out.println(st);
			}
			
			a++;
		}
	}

}