import java.util.Scanner;		//java.util : ��Ű���� Scanner : Ŭ������
								//java.util�̶�� ��Ű���ȿ� �����ϴ� Scanner��� Ŭ����
								//import �� ����ϱ� ���� �����ϰٴ�.

//Start.java

public class Start {

	//System.out : ��°�ü
	private static void PrintSample() {
		
		//1) print 
		
		System.out.print("Hello, World\n");
		System.out.print(10 + "\n");				//�ƹ���Ÿ�� + ���ڿ� =-> ���ڿ�
		System.out.print('a');
		System.out.print("\n");
		
		
		//2) println
		System.out.println("Hello World");
		System.out.println('a');				//�����ڵ�(2����Ʈ)  = �ƽ�Ű�ڵ�(1����Ʈ) + �����蹮�� ����
		System.out.println('��');				//�ѱ۵� ���� Ÿ���� ����Ѵ�. (�ƽ�Ű �ڵ尡 �ƴ� �����ڵ带 ���)
		
		
		//3) printf
		System.out.printf("���ڿ� : %s\n", "Hello World");
	}
	
	//System.in : �Է°�ü
	//Scanner  	: �Էº���Ŭ����(��������� �Է� ��ü�� ������ �ְ� �̸� �̿��ؼ� �Է� ����� ����)
	//���ڿ�  
	private static void InputSample() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = scan.nextLine();	//���ڿ� ���� Ŭ����
		
		
		//���� Ÿ�� ���ڵ��� �ڽ��� Ÿ������ �Ľ����ִ� ����� �޼��带 �������ش�.
		System.out.print("���� : ");
		int age;
		String temp = scan.nextLine();	//���ڿ��� �Է¹��� �Ŀ�
		age = Integer.parseInt(temp);	//���ڿ� ==> int�� ��ȯ
		
		System.out.print("������ �� ");
		float weight = Float.parseFloat(scan.nextLine());
		
		System.out.println("����(��, ��) : ");
		temp = scan.nextLine();
		char gender = temp.charAt(0);	//���ڿ��� 0��° �ε��� ���� ��ȯ
		
		//==================================================================
		System.out.println("�̸� >>  " + name);
		System.out.println("���� >> " + age);
		System.out.println("���� >> " + gender);
		System.out.println("������>> " + weight);
		
	}

	//Ÿ�Ժ� �����Լ�
	private static void InputSample1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = scan.nextLine();	//���ڿ� ���� Ŭ����
		
		System.out.print("���� : ");
		int age = scan.nextInt();		
		
		System.out.print("������ : ");
		float weight = scan.nextFloat(); 
		
		System.out.print("����(��, ��) : ");  
		char gender = scan.nextLine().charAt(0); //���ڿ��� 0��° �ε����� ���� ��ȯ 
		
		//=====================================================================
		
		System.out.println("�̸� >> " + name);
		System.out.println("���� >> " + age);
		System.out.println("���� >> " + gender);
		System.out.println("������ >> " + weight);
		
	}

	//1���� �迭 ��� + ����
	private static void Array1() {
		Scanner scan = new Scanner(System.in);
		
		//�迭�� ���� (���۷���Ÿ�� (�ּҰ� ����Ÿ��))
		
		//int�� �����ϴ� [](�迭) Ÿ���̴�. �� �̸��� arr�̴�.
		int[] arr;		//��ȣ�ϴ� ��� 
		int arr1[];
		
		//�迭�� ���۷��� Ÿ��
		System.out.println("������ ���� ���� : ");
		int max = scan.nextInt();
		arr = new int[max];
		
		//������
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10); 	// 10 : 0~9
		//	arr[i] = (int)(Math.random() * 10+1); 	// 10+1 : //1 ~ 10 

		}
		
		//���
		for(int i=0; i< arr.length; i++) {	//�迭�� �ڽ��� ũ�⸦ ���� �ִ�. 
				System.out.print(arr[i] + "  ");
		}
		System.out.println("");

	}

	//2���� �迭(�ึ�� ���� ������ ���� �迭) : 2 * 3 �迭
	private static void Array2() {
		int[][] arr = new int[2][3];
		
		int[][] arr1 = {{1,2,3},
						{4,5,6}};
		
		for(int i=0; i<arr.length; i++) {		//�� 2��
			for(int j=0; j<arr[i].length; j++) {		//�� 3��
				System.out.printf("arr[%d][%d] = %d\n",  i, j, arr[i][j]);
			}
		}
			
	}

	//2���� �迭(�ึ�� ���� ������ ���� �迭  ==> �����迭)
	private static void Array3() {
		int[][] arr = new int[2][];			//2���� �ุ �������
		
		
		arr[0] = new int[5];				//0��° ���� 5���� ��
		arr[1] = new int[3];				//1��° ���� 3���� ��
		
		for(int i=0; i<arr.length; i++) {		//�� 2��
			for(int j=0; j<arr[i].length; j++) {		//�� 3��
				System.out.printf("arr[%d][%d] = %d\n",  i, j, arr[i][j]);
			}
		}
			
	}
	
	//�迭����(����)
	private static void ArrayCopy1() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = new int[20];
		
		//�迭 ����
		for(int i=0; i<10; i++) {
			arr2[i+10] = arr1[i];
		}
		
		//��� ���
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();

		
		
	}
	
	//�迭����(�Լ���Ȱ��)
	private static void ArrayCopy2() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = new int[20];
				
		//�迭 ���� 
		//arr1�� 0��° �ε������� ���� �����ͼ�
		//arr2�� 0��° �ε�����ġ ���� �����ض�
		//arr1.length���� .....
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
				
		//��� ���
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();
	}

		
		
		
	public static void main(String[] args) {
		//static �޼��� �������� static �޼��常 ȣ�� ����!!!
		
		//PrintSample();
		//InputSample();
		//InputSample1();
		//Array1();
		//Array2();
		//Array3();
		//ArrayCopy1();
		ArrayCopy2();
		
	}
	
}
