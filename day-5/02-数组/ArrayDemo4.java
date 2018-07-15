//随意输入一个数据，表示出周几
import java.util.Scanner;
class   ArrayDemo4{
	public static void main(String[] args) {
		String[] strArray={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数据(1-7)");
		int index = sc.nextInt() - 1;
		if (index<1||index>7) {
			System.out.println("输入不在 1-7内");
		} else {
			System.out.println("查找的日期是: "+strArray[index]);
		}
	}
}
