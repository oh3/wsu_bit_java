
public class Start {
	
	private static void exam1() {
		
								//�й�    �̸�	   C  Cpp Java avg
		Student stu = new Student(0, "�����", 0, 0, 0, 0);
		
		//test ���
		stu.Print();//����Լ���  �������

		//�� ����			//C   Cpp  java
		stu.SettingJumsu(60, 70, 80);
		
		stu.Println();//����Լ���  �������
	}
	
	private static void exam2() {
		
		//��ü �ΰ��� ������ �� �ִ� �迭 ����
		Student[] base = new Student[2];
		
		//��ü �� ���� �����ؼ� ������ �迭�� ����
		base[0] = new Student(11, "�����", 60, 70, 80, 0);
		base[1] = new Student(12, "����", 0, 0, 0, 0);
		
		//ù��° �迭�� ����� ��ü ���
		base[0].Print();
		
		//�ι�° �迭�� ����� ��ü�� ������ �Է�
		base[1].SettingJumsu(60, 70, 80);
		
		//�ι�° �迭�� ����� ��ü ���
		base[1].Print();
			
	}
		
	public static void main(String[] args) {
		
		
		//exam1();
		exam2();
	}

}
