package woosongbit.sample1;

/*
 * �迭 �ڷᱸ�� ��� (int�� �����ϴ� Ŭ����)
 * 
 */
public class IntDArray {

	// 1. ��� �ʵ� (����)
	// ��������� �ּ�
	// �迭�� �ּҸ� ������������ ����
	private int[] base;

	// �迭�� �ִ� ũ��
	private int capacity;

	// �迭�� ������ ���� ����,
	// �迭�� ������ ���� ��ġ
	private int size;

	// 2. ������ ��� �ʵ� �ʱ�ȭ
	public IntDArray() {
		// ����ڰ� ũ�⸦ �������� ������ �⺻������ 10�� ũ��� �����ϰٴ�.
		this(10);
	}

	// ������
	public IntDArray(int capacity) {

		// ����ڰ� ��û�� ũ�⸸ŭ�� �迭��ũ�Ⱑ �������
		this.capacity = capacity;
		base = new int[capacity];

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
	public boolean add(int value) {

		if (isFull()) {
			return false;
		}

		base[size] = value;
		size++;
		return true;
	}

	// ����
	public boolean remove(int value) {

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
	public int valueToIdx(int value) {
		for (int i = 0; i < size; i++) {
			if (base[i] == value)
				return i;
		}
		return -1;
	}

	// Ư�� �ε����� �ִ� �� ��ȯ
	public int getData(int idx) {
		return base[idx];
	}

	// ���� : update 20 25 : 20�� ã�Ƽ� 25�� �����ض�
	public boolean update(int value, int upvalue) {

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
