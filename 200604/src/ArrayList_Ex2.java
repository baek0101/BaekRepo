import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Ex2 {

	public static void main(String[] args) {
		//List�������̽��� �޸𸮿� �ø� �� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø�
		//List stringŸ���� rList��, ArrayListŸ���� �޸𸮿� �Է¹޴´�.
		List<String> rList = new ArrayList<>();
		
		//List �÷��� �����ӿ�ũ�� �����͸� �߰���
		rList.add("ȫ�浿1");
		rList.add("ȫ�浿2");
		rList.add("�Ӳ���");
		rList.add("��浿");
		
		//�迭ũ�� ���(����)
		System.out.println("�迭�� ũ��"+rList.size());
		
		//List�÷����� ���� ����� �����͸� �����ö� for���� ���� �ʰ�, while���� ���� ������
		/*for���� ���� while���� �ӵ��� �� ������, List �������̽��� �޷θ��� �÷��ִ� 
		�÷��� Ŭ������ �����ؾ� �� ���, ���� ������ ������*/
		Iterator<String> it = rList.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			
			System.out.println("�̸� : "+name);
		}
		
	}
	

}