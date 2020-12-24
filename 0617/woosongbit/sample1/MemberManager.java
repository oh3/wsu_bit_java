package woosongbit.sample1;

//학생들 관리 클래스 : 핵심 클래스
//기능 : 등록, 검색(이름-key), 삭제(이름-key), 수정(이름-key, 전화번호를 수정), 전체출력
public class MemberManager {
	// 저장 객체
	private ObjectDArray array;

	// 생성자
	public MemberManager() {
		int max = InputSize();
		array = new ObjectDArray(max); // 갯수 전달
	}

	// 메서드-초기화
	private int InputSize() {
		return Input.InputInteger("저장개수");
	}

	// 메서드 - 전체 출력
	// 이름만 .....
	private void PrintAll() {
		for (int i = 0; i < array.getSize(); i++) {
			Member mem = (Member) array.getData(i); // 자식 <= 부모 : 다운캐스팅
			System.out.print(mem.getName() + ", ");
		}
		System.out.println("\n");
	}

	// 메서드 - 등록
	public void Insert(String name, String phone) {
		Member mem = new Member(name, phone);
		if (array.add(mem))
			PrintAll();
		else
			System.out.println("실패");
	}

	// 메서드 - 검색
	public void Select(String name) {
		int idx = array.valueToIdx(name);
		if (idx == -1) {
			System.out.println("없다");
			return;
		}

		Member mem = (Member) array.getData(idx);
		mem.Println();
	}

	// 메서드 - 삭제
	public void Delete(String name) {
		if (array.remove(name)) {
			PrintAll();
		} else {
			System.err.println("실패");
		}
	}

	// 메서드 - 수정
	public void Update(String name, String newphone) {
		int idx = array.valueToIdx(name);
		if (idx == -1) {
			System.out.println("없다");
			return;
		}

		Member mem = (Member) array.getData(idx);
		mem.setPhone(newphone);
		PrintAll();
	}

}
