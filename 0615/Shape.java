
public class Shape {
	
	//1. 멤버 필드 (변수)
	//멤버변수 선언과 동시에 객체초기화
	//생성되는 모든 Shape 객체들은 모두 blue로 생성된다.
	private String color ="blue";
	
	//2. 생성자
	//만약 객체 생성시 객체들 마다 원하는 값으로 초기화 하고 싶을때는 생성자를 활용한다
	public Shape(String color) {
		this.setColor(color);
	}

	//3. get set method
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//4. 메소드
	public void Draw() {
		System.out.println("색상 : " + color);
	}

}
