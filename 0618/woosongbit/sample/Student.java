package woosongbit.sample;

public class Student {

	// 멤버변수
	private int number;
	String name;
	int c;
	int cpp;
	float average;
	// 등록할 때마다 1000 번부터 + 10씩 자동할당:static맴버추가
	private static int s_number = 1000;


	//생성자
	/*
	 * 생성자(이름)  
    : number 자동초기화, c, cpp, average 기본값(0) 초기화
	 */
	//number 자동초기화, c, cpp, average 기본값(0) 초기화
	public Student(String name) {
		this.number = s_number;
		this.name = name;
		this.c = 0;
		this.cpp = 0;
		this.average = 0.0f;	
		
		s_number  = s_number + 10;		
	}
	
	//get set
	public String getName() {
		return name;
	}
	
	//메서드
	/*
	 * void Println() 
     : 기존 예제 참조하여 유사하게 작성
	 */
	public void Println() {
		System.out.println("[학번] : " + number);
		System.out.println("[이름] : " + name);
		System.out.println("[C 점수] : " + c);
		System.out.println("[CPP 점수] : " + cpp);
		System.out.println("[평균] : " + average);

	}

	// 점수 세팅 머서드
	/*
	 * void SetJumsu( c언어점수, cpp언어점수) 
     : 2개의 점수를 받아 각각의 맴버 변수에 대입하고
      	평균값은 연산을 통해 저장
	 */
	public void SetJumsu(int c, int cpp) {
		this.c = c;
		this.cpp = cpp;
		this.average = (c + cpp) / 2.0f;

	}

}
