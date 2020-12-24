package woosongbit.sample3;

import java.util.Scanner;

//Object(���۷���) <=== char(��)
public class Start {
	private Scanner scan = new Scanner(System.in);
	private ObjectDArray array;

	// �޼���

	// ����ڿ��� ���尹�� ���� �ϴ� �޼���
	private int Init() {
		System.out.print("���� ���� : ");
		return Integer.parseInt(scan.nextLine());
	}

	// �Է� ��ɾ �Ľ�
	private String[] InputPaser() {
		System.out.print(">> ");

		String msg = scan.nextLine(); // add 10 20 30

		// split: �ɰ���
		// ���ڿ���(" ")�������� �ɰ���;
		return msg.split(" ");
	}

	// �迭�� ����� ������ ��ü ���
	private void PrintAll() {
		System.out.print("[���尳�� : " + array.getSize() + "] ");
		for (int i = 0; i < array.getSize(); i++) {
			System.out.print(array.getData(i) + " ");
		}
		System.out.println();
	}

	public void examrun() {
		// �ʱ�ȭ
		int capacity = Init();
		array = new ObjectDArray(capacity);

		// �����
		while (true) {
			String[] msg = InputPaser();
			if (msg[0].equals("add")) { // add a
				char ch = msg[1].charAt(0);
				boolean b = array.add(ch); // ������ => ���۷��� �������Ŀ� ���� : �ڽ�
				if (b)
					// ����
					PrintAll();
				else
					// ����
					System.out.println("����");
			}
			// ����
			else if (msg[0].equals("remove")) { // delete a
				boolean b = array.remove(msg[1].charAt(0));
				if (b)
					PrintAll();
				else
					System.out.println("����");
			}
			// ������Ʈ
			else if (msg[0].equals("update")) { // update 10 20
				char value = msg[1].charAt(0);
				char upvalue = msg[2].charAt(0);
				boolean b = array.update(value, upvalue);
				if (b)
					PrintAll();
				else
					System.out.println("����");
			} else if (msg[0].equals("exit"))
				break;
		}
		
	}
	// =============== ����� =================
	public static void main(String[] args) {
		new Start().examrun();
		// Start s = new Start();
		// s.examrun();
	}
}