/*�÷��� �����ӿ�ũ�� ArrayList ����� List��ü�� �����ϰ�,
�� List��ü�� "��ü�������α׷���", "�ϵ�", "mongoDB"�� ���ڿ��� �����ϰ�,
 while�� ���� ����� �����͵��� ����Ͻÿ�.
ù ��° ��µǴ� ��ü�������α׷����� ���ڿ��� �հ� �ڿ� "<",">"�� �ٿ��� ����Ͻÿ�.
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> rList = new ArrayList<String>();
		
		rList.add("��ü�������α׷���");
		rList.add("�ϵ�");
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