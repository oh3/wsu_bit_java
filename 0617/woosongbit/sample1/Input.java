package woosongbit.sample1;

import java.util.Scanner;

public class Input {

	private static Scanner scan = new Scanner(System.in);

	//정수값 입력, 반환 
	public static int InputInteger(String msg) {
		System.out.print(msg + " : " );
		return Integer.parseInt(scan.nextLine());
	}
	
	//문자열 입력, 반환
	public static String InputString(String msg) {
		System.out.print(msg);
		return scan.nextLine();
	}
}
