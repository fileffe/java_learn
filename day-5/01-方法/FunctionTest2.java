/*
//
�ж��������Ƿ����
import java.util.Scanner;
class FunctionTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();

		boolean flag = compare(a,b);           //�ɺϲ����� FunctionTest6
		System.out.println(flag);
	}

	public static boolean compare(int x,int y){
		if (x==y)
		{return true;
		}else{return false;
		}
		}
}
*/
import java.util.Scanner;
class FunctionTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();

		boolean flag = compare(a,b);              //boolean����
		System.out.println(flag);
	}

	public static boolean compare(int x,int y){
		return ((x==y)?true:false);
		}
}

