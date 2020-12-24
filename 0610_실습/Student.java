
public class Student {
	
	//멤버변수 
	private int num;
	private String name;
	private int c;
	private int cpp;
	private int java;
	private float average;
	
	//생성자 만들기
	public Student(int _num, String _name, int _c, int _cpp, int _java, float _average) {
		
		num = _num;
		setName(_name);
		setC(_c);
		setCpp(_cpp);
		setJava(_java);
		setAverage(_average);
		
	}
	
	

	//get set 메소드 만들기
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public int getC() {
		return c;
	}
	
	public void setC(int c) {
		//0~100 조건
		//특정멤버변수에 특정 값을 필터링하려면 set메소드에서 처리함
		if (c <0 || c> 100) {
			return;
		}
		this.c = c;
	}
	
	public int getCpp() {
		return cpp;
	}
	
	public void setCpp(int cpp) {
		this.cpp = cpp;
	}
	
	public float getAverage() {
		return average;
	}
	
	private void setAverage(float average) {
		this.average = average;
	}
	
	public int getJava() {
		return java;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	//메소드부분
	
	//단일출력
	public void Print() {
		System.out.println(num + ", " + name + ", " + c +", " + cpp + ", " + java + ", " + average);
	}
	
	//다중출력
	public void Println() {
		System.out.println("학번 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("C언어점수" + c);
		System.out.println("CPP언어점수 : " + cpp);
		System.out.println("java언어점수 : " + java);
		System.out.println("평균 : " + average);
	}

	public void SettingJumsu(int c, int cpp, int java) {
		this.c  = c;
		this.cpp = cpp;
		this.java = java;
		//this.average = (float)c+cpp+java/3;
		this.average = (c+cpp+java)/3;
		
		//0611 가능한 멤버변수들의 값을 변경할 때는 가능하면 set 메서드를 사용하자(권고사항)
		//위에처럼 하지말고
		/*
		setC(c);
		setCpp(cpp);
		setJava(java);
		
		setAverage((this.c + this.cpp + this.java)/3.0f);
		*/
				
	}
}	

