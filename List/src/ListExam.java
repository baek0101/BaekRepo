import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		List<String> rList = new ArrayList<>();
		
		rList.add("ȫ�浿1");
		rList.add("ȫ�浿2");
		rList.add("ȫ�浿3");
		rList.add("ȫ�浿4");
		rList.add("ȫ�浿5");
		
		System.out.println("�迭�� ũ��"+ rList.size());
		
		for (int i=0; i< rList.size(); i++) {
			System.out.println("["+ i +"] ��° �迭 ������ : " + rList.get(i));
		}
		
		Iterator <String> it = rList.iterator();
		while(it.hasNext()) {
			String name = (String) it.next();
			System.out.println("�̸� : "+ name);
		}

	}
}
