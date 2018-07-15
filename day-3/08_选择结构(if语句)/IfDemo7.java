//求三个数的最大值
/*
import java.util.Scanner;
class IfDemo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("请输入第一个数值");
		int a = sc.nextInt();
		System.out.println("请输入第二个数值");
		int b = sc.nextInt();
		System.out.println("请输入第三个数值");
		int c = sc.nextInt();
		int temp = ((a>b)?a:b);
		int max  = ((temp>c)?temp:c);
		System.out.println("max:"+max);
	}
}
//嵌套
import java.util.Scanner;
class IfDemo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("请输入第一个数值");
		int a = sc.nextInt();
		System.out.println("请输入第二个数值");
		int b = sc.nextInt();
		System.out.println("请输入第三个数值");
		int c = sc.nextInt();
		int max;
		if (a>b)
		{
			if (a>c)
			{
				max=a;
			}else{
				max=c;
				}
		}else{
			if(b>c){
				max=b;
			}else{
				max=c;
				}		
		}
		System.out.println("max:"+max);
	}
}
*/
import java.util.Scanner;
class IfDemo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("请输入第一个数值");
		int a = sc.nextInt();
		System.out.println("请输入第二个数值");
		int b = sc.nextInt();
		System.out.println("请输入第三个数值");
		int c = sc.nextInt();
		int max;
		if (a>b)
		{max=((a>c)?a:c);
		}else{
		max=((b>c)?b:c);
		}
		System.out.println("max:"+max);
		}
}	