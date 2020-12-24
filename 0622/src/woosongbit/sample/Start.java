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
		// 부모클래스 생성자 초기화
		super(price, bonusPoint);
	}

}

class Computer extends Product {
	public Computer(int price, int bonusPoint) {
		// 부모클래스 생성자 초기화
		super(price, bonusPoint);
	}

}

class Audio extends Product {
	public Audio(int price, int bonusPoint) {
		// 부모클래스 생성자 초기화
		super(price, bonusPoint);
	}

}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	int buycom = 0;		//구매한 com 개수
	int buytv = 0;		//구매한 tv 개수

	/*
	public void buy(Tv t) {
		money = money - t.getPrice();
		bonusPoint = bonusPoint + t.getBonusPoint();
		
	}
	*/
	
	// 다형성의 한 예시
	// 업캐스팅으로 Product의 자식클래스의 모든걸 구매할수있게해줌
	// 티비 컴퓨터 오디오 등등
	public void buy(Product t) {
		money = money - t.getPrice();
		bonusPoint = bonusPoint + t.getBonusPoint();
		
		//t에 전달된 제품이 무엇일까?
		if(t instanceof Tv) {
			buytv++;
		}
		else if(t instanceof Computer) {
			buycom++;
		}
	}

}

//메인
public class Start {

	public static void main(String[] args) {

		Buyer b = new Buyer();

		Tv tv = new Tv(50, 2);
		Computer com = new Computer(20, 1);

		// Buyer가 컴퓨터를 구매한다.
		b.buy(com);
		
		// Buyer가 TV를 구매한다.
		b.buy(tv);
	}

}
