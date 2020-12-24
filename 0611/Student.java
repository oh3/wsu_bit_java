/*
 * 객체 초기화
 * 1) 객체 초기화 흐름
 * 1) ===> 2)
 */
public class Student {

	//1) 명시적 초기화 
	//생성되는 모든 객체(인스턴스의) number의 값이 10이 된다.
	
	//선언과 동시에 초기화가 일반적임 간단하지 않을때는 아래 방법처럼 사용
	static int sample = 10;
	
	//초기화 하면서 연산 할 수 있음.
	//static int sample = 10 * 20 - 10 * 200;
	
	//static 초기화 블럭(자주사용안함)
	//클래스변수의 복잡한초기화때 사용함
	static {
		//static 멤버를 초기화하는데 복합한 연산을 사용해서 초기화해야할경우 사용함
		sample = 10 * 20 - 10 * 200;
		
	}
	//인스턴스 초기화블럭 (잘안씀)
	{
	
	}
	
	private int number = 10;		
	
	//2) 생성자를 이용한 객체 초기화
	public Student() {
		this(0);
	}
	
	public Student(int number) {
		this.number = number;
	}
	
}
