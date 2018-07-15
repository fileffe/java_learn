//键盘录入行列，对应星星数
/*
import java.util.Scanner;
class FunctionTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行");
		int m = sc.nextInt();
		System.out.println("请输入列");
		int n = sc.nextInt();
		
		printXing(m,n);                              //可以直接输入printXing(m,n); 
	}

		public static void printXing(int m,int n){    //void调用
		for (int x =0;x<m ;x++ ){
		for (int y =0;y<n ;y++ )
		{System.out.print("*");                       //不用return
		}
		System.out.println();
		}
	}
}
*/
//键盘录入n，输出nn乘法表，n(1<=n<=9)
import java.util.Scanner;
class FunctionTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入n");
		int n = sc.nextInt();
		
		printNN(n);
	}

	public static void printNN(int n){
		for (int x=1;x<=n ;x++ )
		{for (int y=1;y<=x ;y++ )
		{System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}