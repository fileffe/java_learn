//输入月份求季节
import java.util.Scanner;
class IfDemo6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		System.out.println("请输入月份");
	int mouth = sc.nextInt();
		if (mouth>=1&&mouth<=3)
		{
			System.out.println("春季");
		}
		else if (mouth>=4&&mouth<=6)
		{
			System.out.println("夏季");
		}
		else if (mouth>=7&&mouth<=9)
		{
			System.out.println("秋季");
		}
		else if (mouth>=10&&mouth<=12)
		{
			System.out.println("冬季");
		}
		else
		{
			System.out.println("你输入的数据不符合要求");
		}
	}
}

