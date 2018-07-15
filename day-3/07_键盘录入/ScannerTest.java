/*
//*********键盘录入需要加入import java.util.Scanner;Scanner sc = new Scanner(System.in);System.out.println("请输入第一个数据：");int x = sc.nextInt();

import java.util.Scanner;

class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();

		System.out.println("请输入第二个数据：");
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
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();

		System.out.println("请输入第二个数据：");
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
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int y = sc.nextInt();

		System.out.println("请输入第三个数据：");
		int z = sc.nextInt();

		int temp = ((x>y)?x:y);        //两步走
		int max  = ((temp>z)?temp:z);
		System.out.println("max:"+max);
	}
}
*/
import java.util.Scanner;

class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int y = sc.nextInt();

		boolean flag =((x==y)?true:false);
		System.out.println(flag);

		boolean flag1 =(x==y);             //Boolean类型，true与false可省略
		System.out.println(flag1);

	}
}