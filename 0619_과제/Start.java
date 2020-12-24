import woosongbit.sample.*;

public class Start {
	private AccountManager mem = new AccountManager();

	// 입력 명령어를 파싱
	private String[] InputPaser() {
		String msg = Input.InputString(">> ");
		return msg.split(" "); // split : 문자열을 (" ")공백 쪼갠다.
	}

	public void Init() {
		System.out.println("-------------------------------------------------");
		System.out.println(" Java 언어로 만든 계좌 관리 프로그램");
		System.out.println("-------------------------------------------------");
		System.out.println(" 사용방법");
		System.out.println(" 입력 : insert1 이름");
		System.out.println(" 입력 : insert2 이름 입금액 개설일자");
		System.out.println(" 검색 : select  계좌번호");
		System.out.println(" 삭제 : delete 계좌번호");
		System.out.println(" 수정 : updateinput 계좌번호 입금액");
		System.out.println(" 수정 : updateoutput 계좌번호 출금액");
		System.out.println(" 프로그램 종료 : exit");
		System.out.println("-------------------------------------------------\n");

		Input.InputString("엔터키를 누르세요");
	}

	public void Run() {
		// 실행부
		while (true) {
			String[] msg = InputPaser();
			if (msg[0].equals("insert1")) { // insert 이름
				String name = msg[1];
				mem.Insert(name);
			} else if (msg[0].equals("insert2")) { // insert 이름 입금액 개설일자
				String name = msg[1];
				int balance = Integer.parseInt(msg[2]);
				String date = msg[3];
			} else if (msg[0].equals("select")) { // select 계좌번호
				String accnumber = msg[1];
				mem.Select(accnumber);
			} else if (msg[0].equals("delete")) { // delete 이름
				String accnumber = msg[1];
				mem.Delete(accnumber);
			} else if (msg[0].equals("updateinput")) { // update 이름 / c / cpp
				String name = msg[1];
				int c = Integer.parseInt(msg[2]);
				int cpp = Integer.parseInt(msg[3]);
				// mem.Update(accnumber);
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
