
public class Triangle  extends Shape{

	//멤버변수
	private Point[] p;
	
	//생성자
	public Triangle(String color, Point[] p) {
		
		//부모객체 생성시 사용될 생성자로 지정
		super(color);
		
		this.p = p;
	}
	
	public Triangle(String color, Point p1, Point p2, Point p3) {
		super(color);
		
		//암묵적으로 /암묵적으로 Point를 저장할 배열 3개를 생성하고
		//전달된 Point객체를 배열에 차례로(0번째 인덱스부터) 저장
		p = new Point[] {p1,p2,p3};
	}
}
