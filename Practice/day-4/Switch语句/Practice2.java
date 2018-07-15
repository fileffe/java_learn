/*
import java.util.Scanner;
class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择正确答案");
		System.out.println("A 文件");
		System.out.println("B 编辑");
		System.out.println("C 视图");
		System.out.println("D 搜索");
		
		int choiceNumber = sc.nextInt();
		char choice = (char)(choiceNumber + 64);

		switch (choice){
		case 'A':
			System.out.println("正确");
			break;
		case 'B':
			System.out.println("错误");
			break;
		case 'C':
			System.out.println("错误");
			break;
		case 'D':
			System.out.println("错误");
			break;
		default:
			System.out.println("对不起，超出选项");
			break;
		}
	}
}
*/

import java.util.Scanner;
class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择正确答案");
		System.out.println("A 文件");
		System.out.println("B 编辑");
		System.out.println("C 视图");
		System.out.println("D 搜索");
		
		int choiceNumber = sc.nextInt();

		if (choiceNumber == 1)
		{
			System.out.println("正确");
		}else if(choiceNumber == 2||choiceNumber == 2||choiceNumber == 3)
			{
			System.out.println("错误");
			}
			else
			{
			System.out.println("选项不存在");
			}
	}
}
