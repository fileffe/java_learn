//����¼���������ݣ���ϴ�ֵ
/*
import java.util.Scanner;
class FunctionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		int result = MaxGet(a,b);
		System.out.println(result);
	}
	public static int MaxGet(int x,int y){
		return x > y ? x:y;
	}
}
*/
import java.util.Scanner;
class FunctionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		int result = MaxGet(a,b);
		System.out.println(result);
	}
	public static int MaxGet(int x,int y){
		if (x>y)
		{return x;
		}else{return y;
		}
	}
}
