//键盘录入三个数据，返回三个数据最大值
/*
import java.util.Scanner;
class FunctionTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据");
		int b = sc.nextInt();
		System.out.println("请输入第二个数据");
		int c = sc.nextInt();

		int max = MaxGet(a,b,c);
		System.out.println(max);
	}

	public static int MaxGet(int a,int b,int c){          //可以有多个参数
		if (a>b)
		{return a>c?a:c;
		}else{return b>c?b:c;}
	}
}
*/
import java.util.Scanner;
class FunctionTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据");
		int b = sc.nextInt();
		System.out.println("请输入第二个数据");
		int c = sc.nextInt();

		int max = MaxGet(x,y,z);
		System.out.println(max);
	}

	public static int MaxGet(int a,int b,int c){
		return (a>b?((a>c)?a:c):((b>c)?b:c));
	}
}
