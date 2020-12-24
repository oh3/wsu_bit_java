package woosongbit.sample1;

//ȸ��(��ȣ, �̸�, ��ȭ��ȣ)
//- ��ȣ�� ����� ������ 1���� +1�� �ڵ����� �Ҵ� : �ڵ��Ҵ� (static �ɹ�����) 
//- �̸�, ��ȭ��ȣ�� ����� �Է� 
public class Member {

	//�ɹ� ����
	private int number;
	private String name;
	private String phone;
	private static int s_number  = 1;  //Ŭ���� �ɹ�, ���� �ϳ��� ���� 
	
	//������ 
	public Member(String name, String phone) {
		this.number = s_number++;		//��ġ 
		this.name = name;
		this.phone = phone;
	}
		
	//get & set(�ʿ信 ���ؼ� ���߿� �߰�)
	public String getName() {
		return name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//�޼���
	public void Println() {
		System.out.println("[��ȣ]" + number);
		System.out.println("[�̸�]" + name);
		System.out.println("[����]" + phone);		
	}
}




