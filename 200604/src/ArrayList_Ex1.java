import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex1 {

	public static void main(String[] args) {
		//List�������̽��� �޸𸮿� �ø� �� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø�
		//List stringŸ���� rList�� ArrayListŸ���� �Է¹޴´�.
		List<String> rList = new ArrayList<>();
		
		//List �÷��� �����ӿ�ũ�� �����͸� �߰���
		rList.add("ȫ�浿1");
		rList.add("ȫ�浿2");
		rList.add("�Ӳ���");
		rList.add("��浿");
		
		//�迭ũ�� ���(����)
		System.out.println("�迭�� ũ��"+rList.size());
		
		//rList.get(i)�� rList[i] �� �ǹ�
		for (int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "] ��° �迭 ������ : " + rList.get(i));
		}
		
	}

}
