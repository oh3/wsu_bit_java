package woosongbit.sample;

public class Student {

	// �������
	private int number;
	String name;
	int c;
	int cpp;
	float average;
	// ����� ������ 1000 ������ + 10�� �ڵ��Ҵ�:static�ɹ��߰�
	private static int s_number = 1000;


	//������
	/*
	 * ������(�̸�)  
    : number �ڵ��ʱ�ȭ, c, cpp, average �⺻��(0) �ʱ�ȭ
	 */
	//number �ڵ��ʱ�ȭ, c, cpp, average �⺻��(0) �ʱ�ȭ
	public Student(String name) {
		this.number = s_number;
		this.name = name;
		this.c = 0;
		this.cpp = 0;
		this.average = 0.0f;	
		
		s_number  = s_number + 10;		
	}
	
	//get set
	public String getName() {
		return name;
	}
	
	//�޼���
	/*
	 * void Println() 
     : ���� ���� �����Ͽ� �����ϰ� �ۼ�
	 */
	public void Println() {
		System.out.println("[�й�] : " + number);
		System.out.println("[�̸�] : " + name);
		System.out.println("[C ����] : " + c);
		System.out.println("[CPP ����] : " + cpp);
		System.out.println("[���] : " + average);

	}

	// ���� ���� �Ӽ���
	/*
	 * void SetJumsu( c�������, cpp�������) 
     : 2���� ������ �޾� ������ �ɹ� ������ �����ϰ�
      	��հ��� ������ ���� ����
	 */
	public void SetJumsu(int c, int cpp) {
		this.c = c;
		this.cpp = cpp;
		this.average = (c + cpp) / 2.0f;

	}

}
