/*
 * 가장기본적인 클래스 구조 만들기 
 * 처음부터 순서대로 만들면 됨
 * 자바의 상수 키워드 : final (const)
 * 문자열 타입을 다룰 때는 : String
 * 자바는 소멸자 없다.
 */
public class UniStudent {
	
	//멤버 변수(필드)
	private int number; 		// 학번
	private String name;		// 이름
	private String subject; 	// 학과
	private int grade;			//  학년(1~4)
	
	//생성자(모든 멤버변수들을 초기화 해줘야함)
	public UniStudent(int _number, String _name, String _subject, int _grade){
		
		//자기자신의 멤버변수를 초기화 시킴
		number = _number;
		setName(_name);
		setSubject(_subject);
		setGrade(_grade);
		
	}

	//get메소드와 set메소드
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	//public -> private 으로 변경
	//이름변경은 외부에서 불가
	private void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	
	
	//함수부분
	public void Print() {
		System.out.println(number + ", " + name + ", " + subject +", " + grade);
	}
	
	public void Println() {
		System.out.println("학번 : " + number);
		System.out.println("이름 : " + name);
		System.out.println("학과" + subject);
		System.out.println("학년 : " + grade);
	}
	
	public void UpdateData(String subject, int grade) {
		this.subject = subject;
		this.grade = grade;
	}
	
}
