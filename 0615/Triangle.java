
public class Triangle  extends Shape{

	//�������
	private Point[] p;
	
	//������
	public Triangle(String color, Point[] p) {
		
		//�θ�ü ������ ���� �����ڷ� ����
		super(color);
		
		this.p = p;
	}
	
	public Triangle(String color, Point p1, Point p2, Point p3) {
		super(color);
		
		//�Ϲ������� /�Ϲ������� Point�� ������ �迭 3���� �����ϰ�
		//���޵� Point��ü�� �迭�� ���ʷ�(0��° �ε�������) ����
		p = new Point[] {p1,p2,p3};
	}
}
