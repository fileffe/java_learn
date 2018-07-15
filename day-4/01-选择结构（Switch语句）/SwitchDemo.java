import java.util.Scanner;
class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个数据");
		int week = sc.nextInt();

		/*
		case后应该为常量，且不能重复
			default可以省略，但是不建议神略，除非case值固定，例如只有ABCD选项
			最后一个break才可省略，所以都不建议省略
			deault不一定要在最后，但不建议放中间
		*/
		//当week值与case后的值相同时，在控制台输出结果，结束
		switch(week){
			case 1:                           
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("您输入的数据有误");
				break;

		}
	}
}
