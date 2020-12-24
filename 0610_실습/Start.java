
public class Start {
	
	private static void exam1() {
		
								//학번    이름	   C  Cpp Java avg
		Student stu = new Student(0, "오상민", 0, 0, 0, 0);
		
		//test 출력
		stu.Print();//출력함수로  한줄출력

		//값 세팅			//C   Cpp  java
		stu.SettingJumsu(60, 70, 80);
		
		stu.Println();//출력함수로  한줄출력
	}
	
	private static void exam2() {
		
		//객체 두개를 저장할 수 있는 배열 생성
		Student[] base = new Student[2];
		
		//객체 두 개를 생성해서 각각의 배열에 저장
		base[0] = new Student(11, "오상민", 60, 70, 80, 0);
		base[1] = new Student(12, "김상민", 0, 0, 0, 0);
		
		//첫번째 배열에 저장된 객체 출력
		base[0].Print();
		
		//두번째 배열에 저장된 객체의 점수를 입력
		base[1].SettingJumsu(60, 70, 80);
		
		//두번째 배열에 저장된 객체 출력
		base[1].Print();
			
	}
		
	public static void main(String[] args) {
		
		
		//exam1();
		exam2();
	}

}
