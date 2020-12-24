package woosongbit.sample;

/*
 * Object : 최상위 클래스 : 자바의 모든 클래스는 Object의 자식 
 *  - Object의 자식들을 다 저장할 수 있다. (Upcasting)
 */
//----------------------------------------------------------------------
//저장 객체가 달라져도 수정하지 않도록 클래스를 업데이트 
//--------------------------------------------------------------
public class ObjectDArray {
	//1. 맴버 필드(변수)
	private Object[] base;	//배열의 주소를 가지는 참조형변수
	private int capacity;	//배열의 최대 크기 
	private int size;		//배열의 데이터 저장 개수, 배열의 데이터 저장 위치
		
	//2. 생성자 : 맴버 필드 초기화
	public ObjectDArray() {
		this(10);		//사용자가 크기를 지정하지 않으면 기본 10의 크기로 생성하겠다. 
	}
		
	public ObjectDArray(int capacity) {
		this.capacity = capacity;
		base = new Object[capacity];
		size = 0;
	}
		
	//3.get & set메서드
	public int getSize() { 
		return size;
	}
		
	//4.메서드
	private boolean isFull() {
		return capacity == size;
	}
		
	//저장 : 예외처리(오버플로우)
	public boolean add(Object value) {		
		if( isFull()) 
			return false;
			
		base[size] = value;
		size++;
		return true;
	}
		
	//삭제
	public boolean remove(Object value) {
		int idx = valueToIdx(value);
		if(idx == -1)
			return false;
			
		//삭제 알고리즘
		for(int i=idx; i<size-1; i++) {
			base[i] = base[i+1];
		}
		size--;
		return true;
	}
		
	//검색
	public int valueToIdx(Object value) {
		for(int i=0; i<size; i++) {	
			Student stu = (Student)base[i];
			String name = (String)value;
			
			if(stu.getName().equals(name))	//언박싱, 값 == 값
				return i;
		}
		return -1;
	}

	//특정인덱스에 있는 값 반환
	public Object getData(int idx) {
		return base[idx];
	}

	//수정 : update 20 25  : 20을 찾아서 25로 수정하라...
	public boolean update(Object value, Object upvalue) {
		int idx = valueToIdx(value);
		if(idx == -1)
			return false;
			
		//수정 알고리즘
		base[idx] = upvalue;
		
		return true;
	}
}
