import java.util.Scanner;
class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据");
		int b = sc.nextInt();
		System.out.println("请输入第三个数据");
		int c = sc.nextInt();

		int max = maxGet(a,b,c);
		System.out.println("max:"+max);
	}
	public static int maxGet(int a,int b,int c)
	{
		return ((a>b)?(a>c?a:c):(b>c?b:c));
	}

}
