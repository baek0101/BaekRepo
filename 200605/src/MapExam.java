import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		
		Map<String, String> pMap = new HashMap<>();
		
		pMap.put("name", "ȫ�浿");
		pMap.put("email", "aaa0000@kopo.ac.kr");
		pMap.put("dept", "�����ͺм���");
		
		System.out.println("-----------------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("��Ÿ"));
		System.out.println("-----------------------------");
		

	}

}