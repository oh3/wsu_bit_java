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
		System.out.printf("[가격] %d원, [적립금] %d", price, bonusPoint);
	}

}

class Tv extends Product {

	public Tv(int price, int bonusPoint) {
		// 부모클래스 생성자 초기화
		super(price, bonusPoint);
	}
	
	//오버라이드(재정의) : 이클립스에서 재정의를하면 녹색 삼각형이 생김.
	@Override //어트리부트 " 부모의 메서드를 재정의하겟다" 컴파일러에게 알림...
	public void Print() {
		System.out.println("** Tv **");
		super.Print();
		System.out.println();
	}

}

class Computer extends Product {
	public Computer(int price, int bonusPoint) {
		// 부모클래스 생성자 초기화
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
		// 부모클래스 생성자 초기화
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
	
	Product[] cart = new Product[10];  //Product를 10개 담을 수 있는 배열
	int i=0;
	
	
	public void buy(Product t) {		//TV, Computer, Audio
		if(money < t.getPrice())		//예외처리 
			return;
		
		money = money - t.getPrice();
		bounsPoint += t.getBonusPoint();		
		cart[i++] = t;					//구매한 TV, Computer, Audio를 장바구니에 담는다.
	}
	
	//전체출력
	public void PrintAll() {
		for(int j=0; j <i; j++) {
			Product p = cart[j];
			p.Print();
		}
	}
		
	//나 컴퓨터 산것만 출력하고 싶다.
		public void PrintComputer() {
			for(int j=0; j <i; j++) {
				Product p = cart[j];
				//====================
				if(p instanceof Computer) {
					Computer c = (Computer)p;		//다운캐스팅
					c.Print();
				}
				
			}
		}

	
	
}



//메인
//================= 사용 클래스 =================================
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

