/*
for(��ʼ�����;�ж��������;�����������){
				ѭ�������;
			}
//����̨���10��"helloWorld"��׼��ʽ
class  ForDemo{
	public static void main(String[] args) {
		for (int x = 1;x<=10 ;x++ )
		{
			System.out.println("Hello World!");
		}
	}
}

//����̨���1-10
class  ForDemo{
	public static void main(String[] args) {	
		for (int x = 1;x<=10 ;x++ )
		{
			System.out.println(x);
		}
	}
}
����
class  ForDemo{
	public static void main(String[] args) {
	
		for (int x = 0;x<9 ;x++ )
		{
			System.out.println(x+1);    //�ظ����x
		}
	}
}

//���1-10֮��
class  ForDemo{
	public static void main(String[] args) {
		//�����һ������sum=0;
		int sum = 0;
		for (int x = 1;x <= 10 ;x++ )
		{
		sum += x;        //�ظ�����sum
		}//��sum = sum +x
			System.out.println("sum:"+sum);
	}
}

//1-100���ż��֮��
class  ForDemo{
	public static void main(String[] args) {
		int sum = 0;
		for (int x = 1;x <= 100 ;x++ )
		{if (x%2==0)
		{sum += x; 
		}    
		}
			System.out.println("ż��֮��Ϊ"+sum);
	}
}
*/
//����
class  ForDemo{
	public static void main(String[] args) {
		int sum = 0;
		for (int x = 0;x <= 100 ;x+=2) {
			sum += x; 
		}  
		System.out.println("ż��֮��Ϊ"+sum);
	}
}
