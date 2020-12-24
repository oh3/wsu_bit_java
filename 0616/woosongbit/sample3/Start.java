package woosongbit.sample3;

import java.util.Scanner;

//Object(레퍼런스) <=== char(값)
public class Start {
	private Scanner scan = new Scanner(System.in);
	private ObjectDArray array;

	// 메서드

	// 사용자에게 저장갯수 질의 하는 메서드
	private int Init() {
		System.out.print("저장 개수 : ");
		return Integer.parseInt(scan.nextLine());
	}

	// 입력 명령어를 파싱
	private String[] InputPaser() {
		System.out.print(">> ");

		String msg = scan.nextLine(); // add 10 20 30

		// split: 쪼개다
		// 문자열을(" ")공백으로 쪼갠다;
		return msg.split(" ");
	}

	// 배열에 저장된 정보를 전체 출력
	private void PrintAll() {
		System.out.print("[저장개수 : " + array.getSize() + "] ");
		for (int i = 0; i < array.getSize(); i++) {
			System.out.print(array.getData(i) + " ");
		}
		System.out.println();
	}

	public void examrun() {
		// 초기화
		int capacity = Init();
		array = new ObjectDArray(capacity);

		// 실행부
		while (true) {
			String[] msg = InputPaser();
			if (msg[0].equals("add")) { // add a
				char ch = msg[1].charAt(0);
				boolean b = array.add(ch); // 값형식 => 레퍼런스 저장형식에 저장 : 박싱
				if (b)
					// 성공
					PrintAll();
				else
					// 실패
					System.out.println("실패");
			}
			// 삭제
			else if (msg[0].equals("remove")) { // delete a
				boolean b = array.remove(msg[1].charAt(0));
				if (b)
					PrintAll();
				else
					System.out.println("실패");
			}
			// 업데이트
			else if (msg[0].equals("update")) { // update 10 20
				char value = msg[1].charAt(0);
				char upvalue = msg[2].charAt(0);
				boolean b = array.update(value, upvalue);
				if (b)
					PrintAll();
				else
					System.out.println("실패");
			} else if (msg[0].equals("exit"))
				break;
		}
		
	}
	// =============== 사용자 =================
	public static void main(String[] args) {
		new Start().examrun();
		// Start s = new Start();
		// s.examrun();
	}
}