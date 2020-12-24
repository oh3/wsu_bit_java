
//박싱 : 값형식을 주소값 형식에 대입할 때 벌어지는 일
//      - 힙메모리에 값을 저장할 수 있는 공간을 생성
//      - 생성된 공간에 값을 저장
//      - 저장된 주소값을 반환 

//언박싱 : 주소값 형식을 값 형식에 대입할 때 벌어지는 일
//      - 힙 메모리에 있는 값을 반환 

public class Start {
	
	public static void exam1() {
		
	}
	
	public static void exam2() {
		
		char ch = '월';
		Object obj1;
		obj1 = ch; 		//박싱
		
		char ch1 = '월';
		Object obj2;
		obj2 = ch1;		//박싱
		
		if(obj1 == obj2)			//obj1, obj2는 레퍼런스타입이기때문에 자신이저장하고있는 주소값 비교
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		
		//====================================
		if((char)obj1 ==(char)obj2)
			System.err.println("같다");
		else
			System.out.println("다르다");
	}
	
	public static void main(String[] args) {
		exam2();
	}
	

	/*
	public static void main(String[] args) {
		
		Object obj;
		
		int num = 10;
		
		obj = num;	//박싱(이 때 사용된 객체 : Integer 클래스 : 멤버변수로 정수값을 갖고 있다)
		//obj = new Integer(num)
		
		int num1 = (int)obj; 	//언박싱
		System.out.println(num1);	//10
		
	}
	*/
}
