import java.util.Scanner;
class  SwitchDemo5{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("�������·�");
	int x = sc.nextInt();

	switch (x){
	case 1:
		System.out.println("����");
		break;
	case 2:
		System.out.println("����");
		break;
	case 3:
		System.out.println("����");
		break;
	case 4:
		System.out.println("�ļ�");
		break;
	case 5:
		System.out.println("�ļ�");
		break;
	case 6:
		System.out.println("�ļ�");
		break;
	case 7:
		System.out.println("�＾");
		break;
	case 8:
		System.out.println("�＾");
		break;
	case 9:
		System.out.println("�＾");
		break;
	case 10:
		System.out.println("����");
		break;
	case 11:
		System.out.println("����");
		break;
	case 12:
		System.out.println("����");
		break;
	default:
		System.out.println("�����·ݲ�����Ҫ��");
		break;
	}
	//̫�鷳���������£�ʡ��System.out.println("")��break;
	switch (x){
	case 1:
	case 2:
	case 3:
		System.out.println("����");
		break;
	case 4:
	case 5:
	case 6:
		System.out.println("�ļ�");
		break;
	case 7:
	case 8:
	case 9:
		System.out.println("�＾");
		break;
	case 10:
	case 11:
	case 12:
		System.out.println("����");
		break;
	default:
		System.out.println("�����·ݲ�����Ҫ��");
		break;
	}
	}
}
