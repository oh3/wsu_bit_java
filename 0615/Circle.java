
//Circle 은 Shpae 이다. (is a 관계 == 상속 관계)
//자식 객체의 생성자에서는 부모객체의 생성을 처리한다.
//만약, 자식이 객체의 생성자에서 아무런 처리를 하지않으면 부모의 디폴트 생성자(인자없는 생성자)가 호출된다.
public class Circle extends Shape{

	//포함 
		private Point center;
		
		//멤버변수 확장
		private int r; 					//반지름
		
		//생성자 
		public Circle(String color) {
			//상속 객체 초기화 
			super(color);		//부모 객체 생성시 사용될 생성자를 지정.
			
			//포함 객체 초기화 
			center = new Point(0,0);
			
			//자신의 맴버 변수 초기화 
			r = 100;
		}
		
		//생성자
		public Circle(String color, Point center, int r) {
			super(color);
			
			this.center = center;
			this.r = r;
		}

	
}
