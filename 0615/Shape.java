
public class Shape {
	
	//1. ��� �ʵ� (����)
	//������� ����� ���ÿ� ��ü�ʱ�ȭ
	//�����Ǵ� ��� Shape ��ü���� ��� blue�� �����ȴ�.
	private String color ="blue";
	
	//2. ������
	//���� ��ü ������ ��ü�� ���� ���ϴ� ������ �ʱ�ȭ �ϰ� �������� �����ڸ� Ȱ���Ѵ�
	public Shape(String color) {
		this.setColor(color);
	}

	//3. get set method
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//4. �޼ҵ�
	public void Draw() {
		System.out.println("���� : " + color);
	}

}
