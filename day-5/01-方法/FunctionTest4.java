//����¼�����У���Ӧ������
/*
import java.util.Scanner;
class FunctionTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		int m = sc.nextInt();
		System.out.println("��������");
		int n = sc.nextInt();
		
		printXing(m,n);                              //����ֱ������printXing(m,n); 
	}

		public static void printXing(int m,int n){    //void����
		for (int x =0;x<m ;x++ ){
		for (int y =0;y<n ;y++ )
		{System.out.print("*");                       //����return
		}
		System.out.println();
		}
	}
}
*/
//����¼��n�����nn�˷���n(1<=n<=9)
import java.util.Scanner;
class FunctionTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������n");
		int n = sc.nextInt();
		
		printNN(n);
	}

	public static void printNN(int n){
		for (int x=1;x<=n ;x++ )
		{for (int y=1;y<=x ;y++ )
		{System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}