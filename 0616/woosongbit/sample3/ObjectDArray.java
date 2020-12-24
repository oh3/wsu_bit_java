package woosongbit.sample3;

/*
 * Object : �ֻ��� Ŭ���� : �ڹ��� ��� Ŭ������ Object�� �ڽ�
 *  - Object�� �ڽĵ��� �� ������ �� �ִ�. (Upcasting)
 */

public class ObjectDArray {
	// 1. ��� �ʵ� (����)
	// ��������� �ּ�
	// �迭�� �ּҸ� ������������ ����
	private Object[] base;

	// �迭�� �ִ� ũ��
	private int capacity;

	// �迭�� ������ ���� ����,
	// �迭�� ������ ���� ��ġ
	private int size;

	// 2. ������ charDArray �ʵ� �ʱ�ȭ
	public ObjectDArray() {
		// ����ڰ� ũ�⸦ �������� ������ �⺻������ 10�� ũ��� �����ϰٴ�.
		this(10);
	}

	// ������
	public ObjectDArray(int capacity) {

		// ����ڰ� ��û�� ũ�⸸ŭ�� �迭��ũ�Ⱑ �������
		this.capacity = capacity;
		base = new Object[capacity];

		size = 0;
	}

	// 3. get & set �޼���
	public int getSize() {
		return size;
	}

	// 4. �޼���
	// ��������� ���� á��?
	private boolean isFull() {
		return capacity == size;
	}

	// ���� : ����ó��(�����÷ο�)
	public boolean add(Object value) {

		if (isFull()) {
			return false;
		}

		base[size] = value;
		size++;
		return true;
	}

	// ����
	public boolean remove(Object value) {

		// ã�Ƽ� ��ġ���� ����
		int idx = valueToIdx(value);

		// ��ã���� -1
		if (idx == -1)
			return false;

		// ���� �˰���
		for (int i = idx; i < size - 1; i++) {
			base[i] = base[i + 1];
		}
		size--;
		return true;

	}

	// �˻�
	public int valueToIdx(Object value) {
		for (int i = 0; i < size; i++) {
			if ((char)base[i] == (char)value)
				return i;
		}
		return -1;
	}

	// Ư�� �ε����� �ִ� �� ��ȯ
	public Object getData(int idx) {
		return base[idx];
	}

	// ���� : update 20 25 : 20�� ã�Ƽ� 25�� �����ض�
	public boolean update(Object value, Object upvalue) {

		// ã�Ƽ� ��ġ���� ����
		int idx = valueToIdx(value);

		// ��ã���� -1
		if (idx == -1)
			return false;

		// ���� �˰���
		base[idx] = upvalue;

		return true;
	}

}