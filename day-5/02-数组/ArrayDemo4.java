//��������һ�����ݣ���ʾ���ܼ�
import java.util.Scanner;
class   ArrayDemo4{
	public static void main(String[] args) {
		String[] strArray={"����һ","���ڶ�","������","������","������","������","������"};
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������(1-7)");
		int index = sc.nextInt() - 1;
		if (index<1||index>7) {
			System.out.println("���벻�� 1-7��");
		} else {
			System.out.println("���ҵ�������: "+strArray[index]);
		}
	}
}
