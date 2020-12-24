package woosongbit.sample2;

/*
 * char���� ����
 */
public class charDArray {

	// 1. ��� �ʵ� (����)
	// ��������� �ּ�
	// �迭�� �ּҸ� ������������ ����
	private char[] base;

	// �迭�� �ִ� ũ��
	private int capacity;

	// �迭�� ������ ���� ����,
	// �迭�� ������ ���� ��ġ
	private int size;

	// 2. ������ charDArray �ʵ� �ʱ�ȭ
	public charDArray() {
			//����ڰ� ũ�⸦ �������� ������ �⺻������ 10�� ũ��� �����ϰٴ�.
			this(10);
		}

	// ������
	public charDArray(int capacity) {
			
			//����ڰ� ��û�� ũ�⸸ŭ�� �迭��ũ�Ⱑ �������
			this.capacity = capacity;
			base = new char[capacity];
			
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
	public boolean add(char value) {

		if (isFull()) {
			return false;
		}

		base[size] = value;
		size++;
		return true;
	}

	// ����
	public boolean remove(char value) {

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
	public int valueToIdx(char value) {
		for (int i = 0; i < size; i++) {
			if (base[i] == value)
				return i;
		}
		return -1;
	}

	// Ư�� �ε����� �ִ� �� ��ȯ
	public char getData(int idx) {
		return base[idx];
	}

	// ���� : update 20 25 : 20�� ã�Ƽ� 25�� �����ض�
	public boolean update(char value, char upvalue) {

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
