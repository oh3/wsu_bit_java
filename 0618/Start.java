import woosongbit.sample.*;

public class Start {
	private StudentManager mem = new StudentManager();

	// 입력 명령어를 파싱
	private String[] InputPaser() {
		String msg = Input.InputString(">> ");
		return msg.split(" "); // split : 문자열을 (" ")공백 쪼갠다.
	}

	public void Init() {
		System.out.println("-------------------------------------------------");
		System.out.println(" Java 언어로 만든 학생 점수 관리 프로그램");
		System.out.println("-------------------------------------------------");
		System.out.println(" 사용방법");
		System.out.println(" 입력 : insert 이름");
		System.out.println(" 검색 : select 이름");
		System.out.println(" 삭제 : delete 이름");
		System.out.println(" 수정 : update 이름 c언어점수 cpp언어점수");
		System.out.println(" 프로그램 종료 : exit");
		System.out.println("-------------------------------------------------\n");

		Input.InputString("엔터키를 누르세요");
	}

	public void Run() {
		// 실행부
		while (true) {
			String[] msg = InputPaser();
			if (msg[0].equals("insert")) { 			// insert 이름
				String name = msg[1];
				mem.Insert(name);
			} else if (msg[0].equals("select")) { // select 이름
				String name = msg[1];
				mem.Select(name);
			} else if (msg[0].equals("delete")) { // delete 이름
				String name = msg[1];
				mem.Delete(name);
			} else if (msg[0].equals("update")) { // update 이름 / c / cpp
				String name = msg[1];
				int c = Integer.parseInt(msg[2]);
				int cpp = Integer.parseInt(msg[3]);
				mem.Update(name, c, cpp);
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
