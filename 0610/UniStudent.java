/*
 * ����⺻���� Ŭ���� ���� ����� 
 * ó������ ������� ����� ��
 * �ڹ��� ��� Ű���� : final (const)
 * ���ڿ� Ÿ���� �ٷ� ���� : String
 * �ڹٴ� �Ҹ��� ����.
 */
public class UniStudent {
	
	//��� ����(�ʵ�)
	private int number; 		// �й�
	private String name;		// �̸�
	private String subject; 	// �а�
	private int grade;			//  �г�(1~4)
	
	//������(��� ����������� �ʱ�ȭ �������)
	public UniStudent(int _number, String _name, String _subject, int _grade){
		
		//�ڱ��ڽ��� ��������� �ʱ�ȭ ��Ŵ
		number = _number;
		setName(_name);
		setSubject(_subject);
		setGrade(_grade);
		
	}

	//get�޼ҵ�� set�޼ҵ�
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	//public -> private ���� ����
	//�̸������� �ܺο��� �Ұ�
	private void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	
	
	//�Լ��κ�
	public void Print() {
		System.out.println(number + ", " + name + ", " + subject +", " + grade);
	}
	
	public void Println() {
		System.out.println("�й� : " + number);
		System.out.println("�̸� : " + name);
		System.out.println("�а�" + subject);
		System.out.println("�г� : " + grade);
	}
	
	public void UpdateData(String subject, int grade) {
		this.subject = subject;
		this.grade = grade;
	}
	
}
