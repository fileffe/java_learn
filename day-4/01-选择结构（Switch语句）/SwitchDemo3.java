import java.util.Scanner;
class  SwitchDemo3{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		System.out.println("���������˭");
		System.out.println("1 �ļ�");
		System.out.println("2 ��ͼ");
		System.out.println("3 �༭");
		System.out.println("4 ����");
		System.out.println("���������ѡ��");

		int choiceNumber = sc.nextInt();        //choiceNumber����1ʱ����char choice = (char)(choiceNumber + 64)ǿ��ת��Ϊ"A"����������
		char choice = (char)(choiceNumber + 64);//'A'=65,'B'=66,'C'=67,'D'=68

		switch (choice){
		case 'A':
			System.out.println("��ϲѡ����ȷ");
			break;
		case 'B':
			System.out.println("ѡ�����");
			break;
		case 'C':
			System.out.println("ѡ�����");
			break;
		case 'D':
			System.out.println("ѡ�����");
			break;
		default:
			System.out.println("��ѡ�����");
			break;
				
		}


	}
}
