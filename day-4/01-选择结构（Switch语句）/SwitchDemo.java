import java.util.Scanner;
class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������һ������");
		int week = sc.nextInt();

		/*
		case��Ӧ��Ϊ�������Ҳ����ظ�
			default����ʡ�ԣ����ǲ��������ԣ�����caseֵ�̶�������ֻ��ABCDѡ��
			���һ��break�ſ�ʡ�ԣ����Զ�������ʡ��
			deault��һ��Ҫ����󣬵���������м�
		*/
		//��weekֵ��case���ֵ��ͬʱ���ڿ���̨������������
		switch(week){
			case 1:                           
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("���������������");
				break;

		}
	}
}
