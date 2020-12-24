package woosongbit.sample2;

class Product {
	private int price;
	private int bonusPoint;

	public Product(int price, int bonusPoint) {
		this.price = price;
		this.bonusPoint = bonusPoint;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public int getPrice() {
		return price;
	}
	
	public void Print() {
		System.out.printf("[����] %d��, [������] %d", price, bonusPoint);
	}

}

class Tv extends Product {

	public Tv(int price, int bonusPoint) {
		// �θ�Ŭ���� ������ �ʱ�ȭ
		super(price, bonusPoint);
	}
	
	//�������̵�(������) : ��Ŭ�������� �����Ǹ��ϸ� ��� �ﰢ���� ����.
	@Override //��Ʈ����Ʈ " �θ��� �޼��带 �������ϰٴ�" �����Ϸ����� �˸�...
	public void Print() {
		System.out.println("** Tv **");
		super.Print();
		System.out.println();
	}

}

class Computer extends Product {
	public Computer(int price, int bonusPoint) {
		// �θ�Ŭ���� ������ �ʱ�ȭ
		super(price, bonusPoint);
	}
	public void Print() {
		System.out.println("** Computer **");
		super.Print();
		System.out.println();
	}

}

class Audio extends Product {
	public Audio(int price, int bonusPoint) {
		// �θ�Ŭ���� ������ �ʱ�ȭ
		super(price, bonusPoint);
	}
	public void Print() {
		System.out.println("** Audio **");
		super.Print();
		System.out.println();
	}

}

class Buyer{
	int money = 1000;
	int bounsPoint = 0;		
	
	Product[] cart = new Product[10];  //Product�� 10�� ���� �� �ִ� �迭
	int i=0;
	
	
	public void buy(Product t) {		//TV, Computer, Audio
		if(money < t.getPrice())		//����ó�� 
			return;
		
		money = money - t.getPrice();
		bounsPoint += t.getBonusPoint();		
		cart[i++] = t;					//������ TV, Computer, Audio�� ��ٱ��Ͽ� ��´�.
	}
	
	//��ü���
	public void PrintAll() {
		for(int j=0; j <i; j++) {
			Product p = cart[j];
			p.Print();
		}
	}
		
	//�� ��ǻ�� ��͸� ����ϰ� �ʹ�.
		public void PrintComputer() {
			for(int j=0; j <i; j++) {
				Product p = cart[j];
				//====================
				if(p instanceof Computer) {
					Computer c = (Computer)p;		//�ٿ�ĳ����
					c.Print();
				}
				
			}
		}

	
	
}



//����
//================= ��� Ŭ���� =================================
public class Start {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Computer(50, 2));
		b.buy(new Tv(50, 2));
		b.buy(new Computer(50, 2));
		b.buy(new Tv(50, 2));
		b.buy(new Computer(50, 2));
		b.buy(new Computer(50, 2));
		b.buy(new Audio(50, 2));
		b.buy(new Computer(50, 2));
		
		b.PrintAll();
		System.out.println("-------------------------------");
		b.PrintComputer();
	}
}

