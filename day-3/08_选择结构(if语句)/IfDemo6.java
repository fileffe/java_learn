//�����·��󼾽�
import java.util.Scanner;
class IfDemo6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		System.out.println("�������·�");
	int mouth = sc.nextInt();
		if (mouth>=1&&mouth<=3)
		{
			System.out.println("����");
		}
		else if (mouth>=4&&mouth<=6)
		{
			System.out.println("�ļ�");
		}
		else if (mouth>=7&&mouth<=9)
		{
			System.out.println("�＾");
		}
		else if (mouth>=10&&mouth<=12)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("����������ݲ�����Ҫ��");
		}
	}
}

