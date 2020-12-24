package woosongbit.sample;

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

}

class Tv extends Product {

	public Tv(int price, int bonusPoint) {
		// �θ�Ŭ���� ������ �ʱ�ȭ
		super(price, bonusPoint);
	}

}

class Computer extends Product {
	public Computer(int price, int bonusPoint) {
		// �θ�Ŭ���� ������ �ʱ�ȭ
		super(price, bonusPoint);
	}

}

class Audio extends Product {
	public Audio(int price, int bonusPoint) {
		// �θ�Ŭ���� ������ �ʱ�ȭ
		super(price, bonusPoint);
	}

}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	int buycom = 0;		//������ com ����
	int buytv = 0;		//������ tv ����

	/*
	public void buy(Tv t) {
		money = money - t.getPrice();
		bonusPoint = bonusPoint + t.getBonusPoint();
		
	}
	*/
	
	// �������� �� ����
	// ��ĳ�������� Product�� �ڽ�Ŭ������ ���� �����Ҽ��ְ�����
	// Ƽ�� ��ǻ�� ����� ���
	public void buy(Product t) {
		money = money - t.getPrice();
		bonusPoint = bonusPoint + t.getBonusPoint();
		
		//t�� ���޵� ��ǰ�� �����ϱ�?
		if(t instanceof Tv) {
			buytv++;
		}
		else if(t instanceof Computer) {
			buycom++;
		}
	}

}

//����
public class Start {

	public static void main(String[] args) {

		Buyer b = new Buyer();

		Tv tv = new Tv(50, 2);
		Computer com = new Computer(20, 1);

		// Buyer�� ��ǻ�͸� �����Ѵ�.
		b.buy(com);
		
		// Buyer�� TV�� �����Ѵ�.
		b.buy(tv);
	}

}
