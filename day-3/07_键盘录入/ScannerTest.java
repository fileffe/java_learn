/*
//*********����¼����Ҫ����import java.util.Scanner;Scanner sc = new Scanner(System.in);System.out.println("�������һ�����ݣ�");int x = sc.nextInt();

import java.util.Scanner;

class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();

		int sum = (x+y);
		System.out.println("sum:"+sum);
	}
}
*/

/*

import java.util.Scanner;

class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();

		int max = ((x>y)?x:y);
		System.out.println("max:"+max);
	}
}
*/
/*

import java.util.Scanner;
class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();

		System.out.println("��������������ݣ�");
		int z = sc.nextInt();

		int temp = ((x>y)?x:y);        //������
		int max  = ((temp>z)?temp:z);
		System.out.println("max:"+max);
	}
}
*/
import java.util.Scanner;

class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();

		boolean flag =((x==y)?true:false);
		System.out.println(flag);

		boolean flag1 =(x==y);             //Boolean���ͣ�true��false��ʡ��
		System.out.println(flag1);

	}
}