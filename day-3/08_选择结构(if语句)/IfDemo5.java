//输入x值，对应区间求值
/*
import java.util.Scanner;
class IfDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("请输x的值");
		int x = sc.nextInt();
		int y;
		if (x>=3){
			System.out.println("y:"+(y=2*x+1));//注意：乘号要用"*"表示出来。
		}
		else if (x>=-1&&x<3){
			System.out.println("y:"+(y=2*x));
		}
		else {
			System.out.println("y:"+(y=2*x-1));
		}
	}
}
*/
//或
import java.util.Scanner;
class IfDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("请输x的值");
		int x = sc.nextInt();
		int y;              
		if (x>=3){
			y=2*x+1;//注意：乘号要用"*"表示出来。
		}
		else if (x>=-1&&x<3){
			y=2*x;                                 //不可改为"y:"+(y=2*x+1)，"y:"配上System.out.println
		}
		else {
			y=2*x-1;
		}
	}
}