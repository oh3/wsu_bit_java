package woosongbit.sample1;

import java.util.Scanner;

public class Input {

	private static Scanner scan = new Scanner(System.in);

	//������ �Է�, ��ȯ 
	public static int InputInteger(String msg) {
		System.out.print(msg + " : " );
		return Integer.parseInt(scan.nextLine());
	}
	
	//���ڿ� �Է�, ��ȯ
	public static String InputString(String msg) {
		System.out.print(msg);
		return scan.nextLine();
	}
}
