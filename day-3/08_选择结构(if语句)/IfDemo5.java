//����xֵ����Ӧ������ֵ
/*
import java.util.Scanner;
class IfDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("����x��ֵ");
		int x = sc.nextInt();
		int y;
		if (x>=3){
			System.out.println("y:"+(y=2*x+1));//ע�⣺�˺�Ҫ��"*"��ʾ������
		}
		else if (x>=-1&&x<3){
			System.out.println("y:"+(y=2*x));
		}
		else {
			System.out.println("y:"+(y=2*x-1));
		}
	}
}
*/
//��
import java.util.Scanner;
class IfDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("����x��ֵ");
		int x = sc.nextInt();
		int y;              
		if (x>=3){
			y=2*x+1;//ע�⣺�˺�Ҫ��"*"��ʾ������
		}
		else if (x>=-1&&x<3){
			y=2*x;                                 //���ɸ�Ϊ"y:"+(y=2*x+1)��"y:"����System.out.println
		}
		else {
			y=2*x-1;
		}
	}
}