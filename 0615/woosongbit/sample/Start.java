//Start Ŭ������ woosongbit.sample ��Ű�� �ȿ� �����Ѵ�.
package woosongbit.sample; 		//<= ��Ű��


//woosongbite.sample1�� ��Ű���� �ִ� Test1 Ŭ������ ����ϰٴ�.
import woosongbit.sample1.Test1;

public class Start {
	
	//static ���θ޼���� �����ϴ� �Լ�
	public static void main(String[] args) {
		
		//������Ű�� ���� �ִ� ��ü�� �����. (Start, Test)
		Test.Foo();
		
		Test t1 = new Test();
		t1.Foo();	//static�޼���� �̷��� ������� ���� �ǰ����
		
		woosongbit.sample1.Test1 t11 = new woosongbit.sample1.Test1();
		
		Test1 t12 = new Test1();
	}

}
