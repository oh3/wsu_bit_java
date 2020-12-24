import java.util.Scanner;		//java.util : 패키지명 Scanner : 클래스명
								//java.util이라는 패키지안에 존재하는 Scanner라는 클래스
								//import 를 사용하기 위해 포함하겟다.

//Start.java

public class Start {

	//System.out : 출력객체
	private static void PrintSample() {
		
		//1) print 
		
		System.out.print("Hello, World\n");
		System.out.print(10 + "\n");				//아무런타입 + 문자열 =-> 문자열
		System.out.print('a');
		System.out.print("\n");
		
		
		//2) println
		System.out.println("Hello World");
		System.out.println('a');				//유니코드(2바이트)  = 아스키코드(1바이트) + 전세계문자 포함
		System.out.println('남');				//한글도 문자 타입을 사용한다. (아스키 코드가 아닌 유니코드를 사용)
		
		
		//3) printf
		System.out.printf("문자열 : %s\n", "Hello World");
	}
	
	//System.in : 입력객체
	//Scanner  	: 입력보조클래스(멤버변수로 입력 객체를 가지고 있고 이를 이용해서 입력 기능을 수행)
	//문자열  
	private static void InputSample() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.nextLine();	//문자열 저장 클래스
		
		
		//슛자 타입 문자뎔을 자신의 타입으로 파싱해주는 기능의 메서드를 지원해준다.
		System.out.print("나이 : ");
		int age;
		String temp = scan.nextLine();	//문자열로 입력받은 후에
		age = Integer.parseInt(temp);	//문자열 ==> int로 변환
		
		System.out.print("몸무게 ㅣ ");
		float weight = Float.parseFloat(scan.nextLine());
		
		System.out.println("성별(남, 여) : ");
		temp = scan.nextLine();
		char gender = temp.charAt(0);	//문자열의 0번째 인덱스 문자 반환
		
		//==================================================================
		System.out.println("이름 >>  " + name);
		System.out.println("나이 >> " + age);
		System.out.println("성별 >> " + gender);
		System.out.println("몸무게>> " + weight);
		
	}

	//타입별 전용함수
	private static void InputSample1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.nextLine();	//문자열 저장 클래스
		
		System.out.print("나이 : ");
		int age = scan.nextInt();		
		
		System.out.print("몸무게 : ");
		float weight = scan.nextFloat(); 
		
		System.out.print("성별(남, 여) : ");  
		char gender = scan.nextLine().charAt(0); //문자열의 0번째 인덱스의 문자 반환 
		
		//=====================================================================
		
		System.out.println("이름 >> " + name);
		System.out.println("나이 >> " + age);
		System.out.println("성별 >> " + gender);
		System.out.println("몸무게 >> " + weight);
		
	}

	//1차원 배열 사용 + 랜덤
	private static void Array1() {
		Scanner scan = new Scanner(System.in);
		
		//배열의 사용법 (래퍼런스타입 (주소값 저장타입))
		
		//int를 저장하는 [](배열) 타입이다. 그 이름은 arr이다.
		int[] arr;		//선호하는 방식 
		int arr1[];
		
		//배열은 래퍼런스 타입
		System.out.println("정수값 저장 개수 : ");
		int max = scan.nextInt();
		arr = new int[max];
		
		//랜덤값
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10); 	// 10 : 0~9
		//	arr[i] = (int)(Math.random() * 10+1); 	// 10+1 : //1 ~ 10 

		}
		
		//출력
		for(int i=0; i< arr.length; i++) {	//배열의 자신의 크기를 갖고 있다. 
				System.out.print(arr[i] + "  ");
		}
		System.out.println("");

	}

	//2차원 배열(행마다 열의 갯수가 같은 배열) : 2 * 3 배열
	private static void Array2() {
		int[][] arr = new int[2][3];
		
		int[][] arr1 = {{1,2,3},
						{4,5,6}};
		
		for(int i=0; i<arr.length; i++) {		//행 2번
			for(int j=0; j<arr[i].length; j++) {		//열 3번
				System.out.printf("arr[%d][%d] = %d\n",  i, j, arr[i][j]);
			}
		}
			
	}

	//2차원 배열(행마다 열의 갯수가 같은 배열  ==> 가변배열)
	private static void Array3() {
		int[][] arr = new int[2][];			//2개의 행만 만들어짐
		
		
		arr[0] = new int[5];				//0번째 행은 5개의 열
		arr[1] = new int[3];				//1번째 행은 3개의 열
		
		for(int i=0; i<arr.length; i++) {		//행 2번
			for(int j=0; j<arr[i].length; j++) {		//열 3번
				System.out.printf("arr[%d][%d] = %d\n",  i, j, arr[i][j]);
			}
		}
			
	}
	
	//배열복사(직접)
	private static void ArrayCopy1() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = new int[20];
		
		//배열 복사
		for(int i=0; i<10; i++) {
			arr2[i+10] = arr1[i];
		}
		
		//결과 출력
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();

		
		
	}
	
	//배열복사(함수를활용)
	private static void ArrayCopy2() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = new int[20];
				
		//배열 복사 
		//arr1의 0번째 인덱스부터 값을 가져와서
		//arr2의 0번째 인덱스위치 부터 저장해라
		//arr1.length개를 .....
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
				
		//결과 출력
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();
	}

		
		
		
	public static void main(String[] args) {
		//static 메서드 내에서는 static 메서드만 호출 가능!!!
		
		//PrintSample();
		//InputSample();
		//InputSample1();
		//Array1();
		//Array2();
		//Array3();
		//ArrayCopy1();
		ArrayCopy2();
		
	}
	
}
