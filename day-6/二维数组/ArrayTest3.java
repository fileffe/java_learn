//打印杨辉三角形
import java.util.Scanner;
class  ArrayTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入行");
		int n = sc.nextInt();             //***

		int [][] arr = new int [n][n];

		for (int x=0;x<arr.length ;x++ ) {
			arr[x][0]=1;
			arr[x][x]=1;
		}

		for (int x=2;x<arr.length ;x++) {
			for (int y=1;y<=x-1 ;y++ ) {             //y不能等于数值1(或用y<x)
				arr[x][y]=arr[x-1][y-1]+arr[x-1][y]; //上一行的上一列与上一行的本列相加
		}
	}

		for (int x=0;x<arr.length ;x++ )
		{for (int y=0;y<=x ;y++ ) {
			System.out.print(arr[x][y]+"\t");
		}
			System.out.println();
		}
	}
}
