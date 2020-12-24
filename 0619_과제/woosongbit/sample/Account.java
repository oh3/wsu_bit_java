package woosongbit.sample;

public class Account {
	
	//1.멤버변수
	private int accnumber;	//계좌번호
	String name;			//이름
	int balance;			//잔액
	String date;

	//10000 번부터 + 15씩 자동할당: 이를 위한 static맴버
	private static int s_number = 10000;

	// 생성자(이름) : this(이름, 0, "2020-06-19")
	public Account(String name) {
		this.name = name;
		this.balance = 0;
		this.s_number = 0;
		this.date = "2020-06-19";
	}

	//2.생성자
	public Account(String name, int balance, String date) {
		this.setAccnumber(s_number);
		this.name = name;
		this.balance = balance;
		this.date = date;
		
		s_number = s_number + 15;
	}

	//3. get set
	public int getAccnumber() {
		return accnumber;
	}
	
	//4. 메서드
	
	//출력
	public void Println() {
		System.out.println("[계좌번호] : " + accnumber);
		System.out.println("[이름] : " + name);
		System.out.println("[잔액] : " + balance);
		System.out.println("[개설일시(저장형식 2020-06-19)] : " + date);
	}
	
	//입금
	public boolean InputMoney(int balance) {
		
		if(balance <= 0) {
			System.out.println("잔액이 부족합니다");
			return false;
		}else{
			balance = balance + balance;
		}
		return false;
		
	}
	
	//출금
	public boolean OutputMoney(int balance) {
		if(balance <= 0) {
			System.out.println("잔액이 부족합니다");
			return false;
		}else{
			balance = balance - balance;
		}
		return false;
		
	}

}
