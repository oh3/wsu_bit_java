
//Circle �� Shpae �̴�. (is a ���� == ��� ����)
//�ڽ� ��ü�� �����ڿ����� �θ�ü�� ������ ó���Ѵ�.
//����, �ڽ��� ��ü�� �����ڿ��� �ƹ��� ó���� ���������� �θ��� ����Ʈ ������(���ھ��� ������)�� ȣ��ȴ�.
public class Circle extends Shape{

	//���� 
		private Point center;
		
		//������� Ȯ��
		private int r; 					//������
		
		//������ 
		public Circle(String color) {
			//��� ��ü �ʱ�ȭ 
			super(color);		//�θ� ��ü ������ ���� �����ڸ� ����.
			
			//���� ��ü �ʱ�ȭ 
			center = new Point(0,0);
			
			//�ڽ��� �ɹ� ���� �ʱ�ȭ 
			r = 100;
		}
		
		//������
		public Circle(String color, Point center, int r) {
			super(color);
			
			this.center = center;
			this.r = r;
		}

	
}
