import woosongbit.sample.*;

public class Start {
	private AccountManager mem = new AccountManager();

	// �Է� ��ɾ �Ľ�
	private String[] InputPaser() {
		String msg = Input.InputString(">> ");
		return msg.split(" "); // split : ���ڿ��� (" ")���� �ɰ���.
	}

	public void Init() {
		System.out.println("-------------------------------------------------");
		System.out.println(" Java ���� ���� ���� ���� ���α׷�");
		System.out.println("-------------------------------------------------");
		System.out.println(" �����");
		System.out.println(" �Է� : insert1 �̸�");
		System.out.println(" �Է� : insert2 �̸� �Աݾ� ��������");
		System.out.println(" �˻� : select  ���¹�ȣ");
		System.out.println(" ���� : delete ���¹�ȣ");
		System.out.println(" ���� : updateinput ���¹�ȣ �Աݾ�");
		System.out.println(" ���� : updateoutput ���¹�ȣ ��ݾ�");
		System.out.println(" ���α׷� ���� : exit");
		System.out.println("-------------------------------------------------\n");

		Input.InputString("����Ű�� ��������");
	}

	public void Run() {
		// �����
		while (true) {
			String[] msg = InputPaser();
			if (msg[0].equals("insert1")) { // insert �̸�
				String name = msg[1];
				mem.Insert(name);
			} else if (msg[0].equals("insert2")) { // insert �̸� �Աݾ� ��������
				String name = msg[1];
				int balance = Integer.parseInt(msg[2]);
				String date = msg[3];
			} else if (msg[0].equals("select")) { // select ���¹�ȣ
				String accnumber = msg[1];
				mem.Select(accnumber);
			} else if (msg[0].equals("delete")) { // delete �̸�
				String accnumber = msg[1];
				mem.Delete(accnumber);
			} else if (msg[0].equals("updateinput")) { // update �̸� / c / cpp
				String name = msg[1];
				int c = Integer.parseInt(msg[2]);
				int cpp = Integer.parseInt(msg[3]);
				// mem.Update(accnumber);
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
