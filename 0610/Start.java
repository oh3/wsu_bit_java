
/*
 * ��ü�� �����.
 * new ��ü(...);
 * 
 * �迭�� ����� (��ü�� N�� ������ �� �ִ� �迭�� ����)
 * new ��ü[N];
 * 
 */
public class Start {
	
	//��ü �ϳ� ���� 
	//��ü �ϳ��� �ҷ����� ���� �ٲٰ� ���� �ִ��� Ȯ���� ���
	private static void exam1() {
		//��ü �����Ҷ� ������� ���δ� �ҷ��;���)
		UniStudent stu = new UniStudent(10, "ȫ�浿", "��ǻ��", 1);
		
		stu.Print();//����Լ���  �������
		//stu.Println();//����Լ��� ��ĭ�� ���
		
		stu.UpdateData("IT", 100); //������Ʈ �Լ��� �� �ٲٱ�
			
	}
	
	//��ü �ټ�����
	private static void exam2() {
							//UniStudent�� ������ �� �ִ� 2���� ����
		UniStudent[] base = new UniStudent[2];
		
		//��ü����
		base[0] = new UniStudent(10, "ȫ�浿", "��ǻ��", 1);
		base[1] = new UniStudent(11, "�̱浿", "IT", 3);
		
		//��ü���  1
		base[0].Print();
		
		//��ü��� 2 
		UniStudent stu = base[1];
		stu.Print();
		
		//���߿� �ƹ�����̳� ���.

	}
	
	public static void main(String[] args) {
		exam2();
	}


}
