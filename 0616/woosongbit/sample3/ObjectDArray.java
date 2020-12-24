package woosongbit.sample3;

/*
 * Object : 최상위 클래스 : 자바의 모든 클래스는 Object의 자식
 *  - Object의 자식들을 다 저장할 수 있다. (Upcasting)
 */

public class ObjectDArray {
	// 1. 멤버 필드 (변수)
	// 저장공간의 주소
	// 배열의 주소를 가지는참조형 변수
	private Object[] base;

	// 배열의 최대 크기
	private int capacity;

	// 배열의 데이터 저장 개수,
	// 배열의 데이터 저장 위치
	private int size;

	// 2. 생성자 charDArray 필드 초기화
	public ObjectDArray() {
		// 사용자가 크기를 지정하지 않으면 기본값으로 10의 크기로 생성하겟다.
		this(10);
	}

	// 생성자
	public ObjectDArray(int capacity) {

		// 사용자가 요청한 크기만큼의 배열의크기가 만들어짐
		this.capacity = capacity;
		base = new Object[capacity];

		size = 0;
	}

	// 3. get & set 메서드
	public int getSize() {
		return size;
	}

	// 4. 메서드
	// 저장공간이 가득 찼냐?
	private boolean isFull() {
		return capacity == size;
	}

	// 저장 : 예외처리(오버플로우)
	public boolean add(Object value) {

		if (isFull()) {
			return false;
		}

		base[size] = value;
		size++;
		return true;
	}

	// 삭제
	public boolean remove(Object value) {

		// 찾아서 위치값을 얻음
		int idx = valueToIdx(value);

		// 못찾으면 -1
		if (idx == -1)
			return false;

		// 삭제 알고리즘
		for (int i = idx; i < size - 1; i++) {
			base[i] = base[i + 1];
		}
		size--;
		return true;

	}

	// 검색
	public int valueToIdx(Object value) {
		for (int i = 0; i < size; i++) {
			if ((char)base[i] == (char)value)
				return i;
		}
		return -1;
	}

	// 특정 인덱스에 있는 값 반환
	public Object getData(int idx) {
		return base[idx];
	}

	// 수정 : update 20 25 : 20을 찾아서 25로 수정해라
	public boolean update(Object value, Object upvalue) {

		// 찾아서 위치값을 얻음
		int idx = valueToIdx(value);

		// 못찾으면 -1
		if (idx == -1)
			return false;

		// 수정 알고리즘
		base[idx] = upvalue;

		return true;
	}

}