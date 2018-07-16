//密码数据小于八位，每个数字先倒叙，再加上5，再用除以10的余数代替该数，将第一位与最后一位互换
/*
class Test4 {
	public static void main(String[] args) {
		int number = 123456;
		int arr[] = new int [7];
		int index = 0;
		while(number>0) {
			arr[index] = number%10;
			index++;
			number /= 10;
		}
		for (int x=0;x<index ;x++ ) {
			arr[x] += 5;
			arr[x] %= 10;
		}
		int temp = arr[0];
		arr[0]=arr[index-1];
		arr[index-1]=temp;
		for (int x=0;x<index ;x++ ) {
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}
*/
import java.util.Scanner;

class Test4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据，小于八位数");
		int number = sc.nextInt();	

		String result = JaMi(number);
		System.out.println(result);
	}
	public static String JaMi(int number){
		int arr[] = new int [7];
		int index = 0;
		while (number>0) {
			arr[index]=number%10;
			index++;
			number/=10;
		}
		for (int x=0;x<index ;x++ )
		{
			arr[x] += 5;
			arr[x] %= 10;
		}
			int temp = arr[0];
			arr[0]= arr[index-1];
			arr[index-1]= temp;
			String s = "";
		for (int x=0;x<index;x++ )
		{
			s += arr[x];
		}
		return s;
	}
}
