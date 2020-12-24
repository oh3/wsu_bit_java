package woosongbit.sample1;

/*
 * 회원(번호, 이름, 전화번호) 관리 프로그램
 *   - 번호는 등록할 때마다 1부터 +1씩 자동으로 할당 : 자동할당 (static 맴버변수) 
 *   - 이름, 전화번호는 사용자 입력 
 *  
 *  기능 : 등록, 검색(이름-key), 삭제(이름-key), 수정(이름-key, 전화번호를 수정), 전체출력
 *  ---------------------------------------------------------------------------
 *  
 *  Member 클래스 : 회원 데이터 클래스 
 *  ObjectDArray 클래스 : 회원 정보 저장 관리 저장소 클래스
 *  MemberManager 클래스 : 전체 관리 클래스 
 *  Start 클래스 : main 
 */
public class Start {
	private MemberManager mem = new MemberManager();

	// 입력 명령어를 파싱
	private String[] InputPaser() {
		String msg = Input.InputString(">> ");
		return msg.split(" "); // split : 문자열을 (" ")공백 쪼갠다.
	}

	public void Init() {
		System.out.println("-------------------------------------------------");
		System.out.println(" Java 언어로 만든 맴버 관리 프로그램");
		System.out.println("-------------------------------------------------");
		System.out.println(" 사용방법");
		System.out.println(" 입력 : insert 이름 전화번호");
		System.out.println(" 검색 : select 이름");
		System.out.println(" 삭제 : delete 이름");
		System.out.println(" 수정 : update 이름 전화번호");
		System.out.println(" 프로그램 종료 : exit");
		System.out.println("-------------------------------------------------\n");

		Input.InputString("엔터키를 누르세요");
	}

	public void Run() {
		// 실행부
		while (true) {
			String[] msg = InputPaser();
			if (msg[0].equals("insert")) { // insert 이름 전화번호
				String name = msg[1];
				String phone = msg[2];
				mem.Insert(name, phone);
			} else if (msg[0].equals("select")) { // select 이름
				String name = msg[1];
				mem.Select(name);
			} else if (msg[0].equals("delete")) { // delete 이름
				String name = msg[1];
				mem.Delete(name);
			} else if (msg[0].equals("update")) { // update 이름 수정할전화번호
				String name = msg[1];
				String newphone = msg[2];
				mem.Update(name, newphone);
			}

			else if (msg[0].equals("exit"))
				break;
		}
	}

	public static void main(String[] args) {
		Start s = new Start();
		s.Init();
		s.Run();
	}
}
