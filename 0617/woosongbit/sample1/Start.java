package woosongbit.sample1;

/*
 * ȸ��(��ȣ, �̸�, ��ȭ��ȣ) ���� ���α׷�
 *   - ��ȣ�� ����� ������ 1���� +1�� �ڵ����� �Ҵ� : �ڵ��Ҵ� (static �ɹ�����) 
 *   - �̸�, ��ȭ��ȣ�� ����� �Է� 
 *  
 *  ��� : ���, �˻�(�̸�-key), ����(�̸�-key), ����(�̸�-key, ��ȭ��ȣ�� ����), ��ü���
 *  ---------------------------------------------------------------------------
 *  
 *  Member Ŭ���� : ȸ�� ������ Ŭ���� 
 *  ObjectDArray Ŭ���� : ȸ�� ���� ���� ���� ����� Ŭ����
 *  MemberManager Ŭ���� : ��ü ���� Ŭ���� 
 *  Start Ŭ���� : main 
 */
public class Start {
	private MemberManager mem = new MemberManager();

	// �Է� ��ɾ �Ľ�
	private String[] InputPaser() {
		String msg = Input.InputString(">> ");
		return msg.split(" "); // split : ���ڿ��� (" ")���� �ɰ���.
	}

	public void Init() {
		System.out.println("-------------------------------------------------");
		System.out.println(" Java ���� ���� �ɹ� ���� ���α׷�");
		System.out.println("-------------------------------------------------");
		System.out.println(" �����");
		System.out.println(" �Է� : insert �̸� ��ȭ��ȣ");
		System.out.println(" �˻� : select �̸�");
		System.out.println(" ���� : delete �̸�");
		System.out.println(" ���� : update �̸� ��ȭ��ȣ");
		System.out.println(" ���α׷� ���� : exit");
		System.out.println("-------------------------------------------------\n");

		Input.InputString("����Ű�� ��������");
	}

	public void Run() {
		// �����
		while (true) {
			String[] msg = InputPaser();
			if (msg[0].equals("insert")) { // insert �̸� ��ȭ��ȣ
				String name = msg[1];
				String phone = msg[2];
				mem.Insert(name, phone);
			} else if (msg[0].equals("select")) { // select �̸�
				String name = msg[1];
				mem.Select(name);
			} else if (msg[0].equals("delete")) { // delete �̸�
				String name = msg[1];
				mem.Delete(name);
			} else if (msg[0].equals("update")) { // update �̸� ��������ȭ��ȣ
				String name = msg[1];
				String newphone = msg[2];
				mem.Update(name, newphone);
			}

			else if (msg[0].equals("exit"))
				break;
		}
	}

	public static void main(String[] args) {
		Start s = new Start();
		s.Init();
		s.Run();
	}
}
