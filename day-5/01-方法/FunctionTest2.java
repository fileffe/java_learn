/*
//
判断两数据是否相等
import java.util.Scanner;
class FunctionTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据");
		int b = sc.nextInt();

		boolean flag = compare(a,b);           //可合并，见 FunctionTest6
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
		System.out.println("请输入第一个数据");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据");
		int b = sc.nextInt();

		boolean flag = compare(a,b);              //boolean类型
		System.out.println(flag);
	}

	public static boolean compare(int x,int y){
		return ((x==y)?true:false);
		}
}

