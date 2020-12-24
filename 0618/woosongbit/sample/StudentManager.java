package woosongbit.sample;

public class StudentManager {
	// ���� ��ü
	private ObjectDArray array;

	// ������
	public StudentManager() {
		int max = InputSize();
		array = new ObjectDArray(max); // ���� ����
	}

	// �޼���-�ʱ�ȭ
	private int InputSize() {
		return Input.InputInteger("���尳��");
	}

	// �޼��� - ��ü ���
	// �̸��� .....
	private void PrintAll() {
		for (int i = 0; i < array.getSize(); i++) {
			Student stu = (Student) array.getData(i); // �ڽ� <= �θ� : �ٿ�ĳ����
			System.out.print(stu.getName() + ", ");
		}
		System.out.println("\n");
	}

	// �޼��� - ���
	public void Insert(String number) {
		Student stu = new Student(number);
		if (array.add(stu))
			PrintAll();
		else
			System.out.println("����");
	}

	// �޼��� - �˻�
	public void Select(String name) {
		int idx = array.valueToIdx(name);
		if (idx == -1) {
			System.out.println("����");
			return;
		}

		Student stu = (Student) array.getData(idx);
		stu.Println();
	}

	// �޼��� - ����
	public void Delete(String name) {
		if (array.remove(name)) {
			PrintAll();
		} else {
			System.err.println("����");
		}
	}

	// �޼��� - ����
	public void Update(String name, int c, int cpp) {
		int idx = array.valueToIdx(name);
		if (idx == -1) {
			System.out.println("����");
			return;
		}

		Student stu = (Student) array.getData(idx);
		stu.SetJumsu(c, cpp);
		PrintAll();
	}

}
