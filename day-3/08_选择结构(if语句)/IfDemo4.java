//判断成绩优异
//if(){}else if{}else if{}else{}语句，看if（）表达式内容是否正确，正确执行第一个大括号，否则走下一个，直到最后一个大括号
import java.util.Scanner;

class IfDemo4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		System.out.println("请输入一个数据");
	int x = sc.nextInt();
		if(x>=90&&x<=100){
			System.out.println("优秀");
		}else if (x>=80&&x<90)
			{
			System.out.println("好");
		}else if (x>=70&&x<80)
			{
			System.out.println("良");
		}else if (x>=60&&x<70)
			{
			System.out.println("及格");
		}else if (x>=0&&x<=60)
			{
			System.out.println("不及格");
		}else{
			System.out.println("数据不符合要求");
		}

	}
}



