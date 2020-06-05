import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> rList = new ArrayList<>();
		
		rList.add("1");
		rList.add("2");
		rList.add("3");
		rList.add("4");
		rList.add("5");
		
		
		int i = 0;
		Iterator<String> it = rList.iterator();
		while(i<rList.size()) {
				System.out.println("["+(rList.size()-1-i)+"] 번째 배열 : "+rList.get(rList.size()-1-i));
				i++;
			}
		
		int k = 0;
		while (it.hasNext()) {
			String name = (String) it.next();
				System.out.println("["+k+"] 번째 Iterator : "+name);
			k++;
		}
	}
}
