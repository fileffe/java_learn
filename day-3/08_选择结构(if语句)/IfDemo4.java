//�жϳɼ�����
//if(){}else if{}else if{}else{}��䣬��if�������ʽ�����Ƿ���ȷ����ȷִ�е�һ�������ţ���������һ����ֱ�����һ��������
import java.util.Scanner;

class IfDemo4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		System.out.println("������һ������");
	int x = sc.nextInt();
		if(x>=90&&x<=100){
			System.out.println("����");
		}else if (x>=80&&x<90)
			{
			System.out.println("��");
		}else if (x>=70&&x<80)
			{
			System.out.println("��");
		}else if (x>=60&&x<70)
			{
			System.out.println("����");
		}else if (x>=0&&x<=60)
			{
			System.out.println("������");
		}else{
			System.out.println("���ݲ�����Ҫ��");
		}

	}
}



