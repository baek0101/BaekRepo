import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		
		Map<String, String> pMap = new HashMap<>();
		
		pMap.put("name", "홍길동");
		pMap.put("email", "aaa0000@kopo.ac.kr");
		pMap.put("dept", "데이터분석과");
		
		System.out.println("-----------------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("오타"));
		System.out.println("-----------------------------");
		

	}

}