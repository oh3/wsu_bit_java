package woosongbit.sample;

public class AccountManager {
	// 저장 객체
	private ObjectDArray array;

	// 생성자
	public AccountManager() {
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
			Account acc = (Account) array.getData(i); // 자식 <= 부모 : 다운캐스팅
			System.out.print(acc.getAccnumber() + ", ");
		}
		System.out.println("\n");
	}

	// 메서드 - 등록
	public void Insert(String number) {
		Account acc = new Account(number);
		if (array.add(acc))
			PrintAll();
		else
			System.out.println("실패");
	}
	
	//insert2
	
	

	// 메서드 - 검색
	public void Select(String name) {
		int idx = array.valueToIdx(name);
		if (idx == -1) {
			System.out.println("없다");
			return;
		}

		Account acc = (Account) array.getData(idx);
		acc.Println();
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
	public void Update(int accnumber) {
		int idx = array.valueToIdx(accnumber);
		if (idx == -1) {
			System.out.println("없다");
			return;
		}

		Account acc = (Account) array.getData(idx);
		acc.setAccnumber(accnumber);
		PrintAll();
	}

}
