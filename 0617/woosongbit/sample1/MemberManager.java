package woosongbit.sample1;

//�л��� ���� Ŭ���� : �ٽ� Ŭ����
//��� : ���, �˻�(�̸�-key), ����(�̸�-key), ����(�̸�-key, ��ȭ��ȣ�� ����), ��ü���
public class MemberManager {
	// ���� ��ü
	private ObjectDArray array;

	// ������
	public MemberManager() {
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
			Member mem = (Member) array.getData(i); // �ڽ� <= �θ� : �ٿ�ĳ����
			System.out.print(mem.getName() + ", ");
		}
		System.out.println("\n");
	}

	// �޼��� - ���
	public void Insert(String name, String phone) {
		Member mem = new Member(name, phone);
		if (array.add(mem))
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

		Member mem = (Member) array.getData(idx);
		mem.Println();
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
	public void Update(String name, String newphone) {
		int idx = array.valueToIdx(name);
		if (idx == -1) {
			System.out.println("����");
			return;
		}

		Member mem = (Member) array.getData(idx);
		mem.setPhone(newphone);
		PrintAll();
	}

}
