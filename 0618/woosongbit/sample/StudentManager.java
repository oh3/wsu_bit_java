package woosongbit.sample;

public class StudentManager {
	// 저장 객체
	private ObjectDArray array;

	// 생성자
	public StudentManager() {
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
			Student stu = (Student) array.getData(i); // 자식 <= 부모 : 다운캐스팅
			System.out.print(stu.getName() + ", ");
		}
		System.out.println("\n");
	}

	// 메서드 - 등록
	public void Insert(String number) {
		Student stu = new Student(number);
		if (array.add(stu))
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

		Student stu = (Student) array.getData(idx);
		stu.Println();
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
	public void Update(String name, int c, int cpp) {
		int idx = array.valueToIdx(name);
		if (idx == -1) {
			System.out.println("없다");
			return;
		}

		Student stu = (Student) array.getData(idx);
		stu.SetJumsu(c, cpp);
		PrintAll();
	}

}
