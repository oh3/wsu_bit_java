
/*
 * 객체를 만든다.
 * new 객체(...);
 * 
 * 배열을 만든다 (객체를 N개 저장할 수 있는 배열을 생성)
 * new 객체[N];
 * 
 */
public class Start {
	
	//객체 하나 생성 
	//객체 하나로 불러오고 값을 바꾸고 값이 있는지 확인한 기능
	private static void exam1() {
		//객체 생성할땐 멤버변수 전부다 불러와야함)
		UniStudent stu = new UniStudent(10, "홍길동", "컴퓨터", 1);
		
		stu.Print();//출력함수로  한줄출력
		//stu.Println();//출력함수로 한칸씩 출력
		
		stu.UpdateData("IT", 100); //업데이트 함수로 값 바꾸기
			
	}
	
	//객체 다수생성
	private static void exam2() {
							//UniStudent를 저장할 수 있는 2개를 생성
		UniStudent[] base = new UniStudent[2];
		
		//객체생성
		base[0] = new UniStudent(10, "홍길동", "컴퓨터", 1);
		base[1] = new UniStudent(11, "이길동", "IT", 3);
		
		//객체사용  1
		base[0].Print();
		
		//객체사용 2 
		UniStudent stu = base[1];
		stu.Print();
		
		//둘중에 아무방법이나 사용.

	}
	
	public static void main(String[] args) {
		exam2();
	}


}
