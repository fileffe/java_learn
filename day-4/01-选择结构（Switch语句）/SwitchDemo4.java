import java.util.Scanner;
class  SwitchDemo4{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("��������Ҫ���ַ���");
	String s = sc.nextLine();                 //�ַ���String

	switch (s){
	case "hello":
		System.out.println("���������hello");
		break;
	case "nice":
		System.out.println("���������nice");
		break;
	case "tree":
		System.out.println("���������tree");
		break;
	default:
		System.out.println("û����Ҫ�����");
		break;
	}
	
	}
}
