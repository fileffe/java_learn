//����¼���������ݣ����������������ֵ
/*
import java.util.Scanner;
class FunctionTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		System.out.println("������ڶ�������");
		int c = sc.nextInt();

		int max = MaxGet(a,b,c);
		System.out.println(max);
	}

	public static int MaxGet(int a,int b,int c){          //�����ж������
		if (a>b)
		{return a>c?a:c;
		}else{return b>c?b:c;}
	}
}
*/
import java.util.Scanner;
class FunctionTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		System.out.println("������ڶ�������");
		int c = sc.nextInt();

		int max = MaxGet(x,y,z);
		System.out.println(max);
	}

	public static int MaxGet(int a,int b,int c){
		return (a>b?((a>c)?a:c):((b>c)?b:c));
	}
}
