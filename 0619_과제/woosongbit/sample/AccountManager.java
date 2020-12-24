package woosongbit.sample;

public class AccountManager {
	// ���� ��ü
	private ObjectDArray array;

	// ������
	public AccountManager() {
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
			Account acc = (Account) array.getData(i); // �ڽ� <= �θ� : �ٿ�ĳ����
			System.out.print(acc.getAccnumber() + ", ");
		}
		System.out.println("\n");
	}

	// �޼��� - ���
	public void Insert(String number) {
		Account acc = new Account(number);
		if (array.add(acc))
			PrintAll();
		else
			System.out.println("����");
	}
	
	//insert2
	
	

	// �޼��� - �˻�
	public void Select(String name) {
		int idx = array.valueToIdx(name);
		if (idx == -1) {
			System.out.println("����");
			return;
		}

		Account acc = (Account) array.getData(idx);
		acc.Println();
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
	public void Update(int accnumber) {
		int idx = array.valueToIdx(accnumber);
		if (idx == -1) {
			System.out.println("����");
			return;
		}

		Account acc = (Account) array.getData(idx);
		acc.setAccnumber(accnumber);
		PrintAll();
	}

}
