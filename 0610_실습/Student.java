
public class Student {
	
	//������� 
	private int num;
	private String name;
	private int c;
	private int cpp;
	private int java;
	private float average;
	
	//������ �����
	public Student(int _num, String _name, int _c, int _cpp, int _java, float _average) {
		
		num = _num;
		setName(_name);
		setC(_c);
		setCpp(_cpp);
		setJava(_java);
		setAverage(_average);
		
	}
	
	

	//get set �޼ҵ� �����
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public int getC() {
		return c;
	}
	
	public void setC(int c) {
		//0~100 ����
		//Ư����������� Ư�� ���� ���͸��Ϸ��� set�޼ҵ忡�� ó����
		if (c <0 || c> 100) {
			return;
		}
		this.c = c;
	}
	
	public int getCpp() {
		return cpp;
	}
	
	public void setCpp(int cpp) {
		this.cpp = cpp;
	}
	
	public float getAverage() {
		return average;
	}
	
	private void setAverage(float average) {
		this.average = average;
	}
	
	public int getJava() {
		return java;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	//�޼ҵ�κ�
	
	//�������
	public void Print() {
		System.out.println(num + ", " + name + ", " + c +", " + cpp + ", " + java + ", " + average);
	}
	
	//�������
	public void Println() {
		System.out.println("�й� : " + num);
		System.out.println("�̸� : " + name);
		System.out.println("C�������" + c);
		System.out.println("CPP������� : " + cpp);
		System.out.println("java������� : " + java);
		System.out.println("��� : " + average);
	}

	public void SettingJumsu(int c, int cpp, int java) {
		this.c  = c;
		this.cpp = cpp;
		this.java = java;
		//this.average = (float)c+cpp+java/3;
		this.average = (c+cpp+java)/3;
		
		//0611 ������ ����������� ���� ������ ���� �����ϸ� set �޼��带 �������(�ǰ����)
		//����ó�� ��������
		/*
		setC(c);
		setCpp(cpp);
		setJava(java);
		
		setAverage((this.c + this.cpp + this.java)/3.0f);
		*/
				
	}
}	

