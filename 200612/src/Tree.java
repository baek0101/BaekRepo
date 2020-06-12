//11장 객체지향 프로그래밍의 기초
public class Tree {
	private String name;
	private String color;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void treeprint() {
		System.out.println("나는 부모입니다.");
	}
		
}
//AppleTree