import java.util.Scanner;
class  SwitchDemo4{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("请输入你要的字符串");
	String s = sc.nextLine();                 //字符串String

	switch (s){
	case "hello":
		System.out.println("你输入的是hello");
		break;
	case "nice":
		System.out.println("你输入的是nice");
		break;
	case "tree":
		System.out.println("你输入的是tree");
		break;
	default:
		System.out.println("没有需要输入的");
		break;
	}
	
	}
}
