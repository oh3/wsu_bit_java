package woosongbit.sample;

public class Account {
	
	//1.�������
	private int accnumber;	//���¹�ȣ
	String name;			//�̸�
	int balance;			//�ܾ�
	String date;

	//10000 ������ + 15�� �ڵ��Ҵ�: �̸� ���� static�ɹ�
	private static int s_number = 10000;

	// ������(�̸�) : this(�̸�, 0, "2020-06-19")
	public Account(String name) {
		this.name = name;
		this.balance = 0;
		this.s_number = 0;
		this.date = "2020-06-19";
	}

	//2.������
	public Account(String name, int balance, String date) {
		this.setAccnumber(s_number);
		this.name = name;
		this.balance = balance;
		this.date = date;
		
		s_number = s_number + 15;
	}

	//3. get set
	public int getAccnumber() {
		return accnumber;
	}
	
	//4. �޼���
	
	//���
	public void Println() {
		System.out.println("[���¹�ȣ] : " + accnumber);
		System.out.println("[�̸�] : " + name);
		System.out.println("[�ܾ�] : " + balance);
		System.out.println("[�����Ͻ�(�������� 2020-06-19)] : " + date);
	}
	
	//�Ա�
	public boolean InputMoney(int balance) {
		
		if(balance <= 0) {
			System.out.println("�ܾ��� �����մϴ�");
			return false;
		}else{
			balance = balance + balance;
		}
		return false;
		
	}
	
	//���
	public boolean OutputMoney(int balance) {
		if(balance <= 0) {
			System.out.println("�ܾ��� �����մϴ�");
			return false;
		}else{
			balance = balance - balance;
		}
		return false;
		
	}

}
