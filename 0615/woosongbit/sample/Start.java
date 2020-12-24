//Start 클래스는 woosongbit.sample 패키지 안에 존재한다.
package woosongbit.sample; 		//<= 패키지


//woosongbite.sample1의 패키지에 있는 Test1 클래스를 사용하겟다.
import woosongbit.sample1.Test1;

public class Start {
	
	//static 메인메서드로 접근하는 함수
	public static void main(String[] args) {
		
		//동일패키지 내에 있는 객체를 사용함. (Start, Test)
		Test.Foo();
		
		Test t1 = new Test();
		t1.Foo();	//static메서드는 이렇게 사용하지 마라 권고사항
		
		woosongbit.sample1.Test1 t11 = new woosongbit.sample1.Test1();
		
		Test1 t12 = new Test1();
	}

}
