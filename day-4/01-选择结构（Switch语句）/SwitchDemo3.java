import java.util.Scanner;
class  SwitchDemo3{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		System.out.println("下面的人是谁");
		System.out.println("1 文件");
		System.out.println("2 视图");
		System.out.println("3 编辑");
		System.out.println("4 搜索");
		System.out.println("请输入你的选项");

		int choiceNumber = sc.nextInt();        //choiceNumber输入1时，在char choice = (char)(choiceNumber + 64)强制转换为"A"，依此类推
		char choice = (char)(choiceNumber + 64);//'A'=65,'B'=66,'C'=67,'D'=68

		switch (choice){
		case 'A':
			System.out.println("恭喜选择正确");
			break;
		case 'B':
			System.out.println("选择错误");
			break;
		case 'C':
			System.out.println("选择错误");
			break;
		case 'D':
			System.out.println("选择错误");
			break;
		default:
			System.out.println("该选项不存在");
			break;
				
		}


	}
}
