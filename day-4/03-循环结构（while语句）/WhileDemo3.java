//һ��ֽ0.01�ף��۵����ٴβ�����8848��
/*
class WhileDemo3 {
	public static void main(String[] args) {
		int count =0;
		int x =1;
		int y =884800;
		while (y>x)
		{
		 count++;
		 x *= 2;                                
		 System.out.println(x);                 //���ŵ���������
		}
		System.out.println("count:"+count);
	}
}
*/
/* 
do...whileѭ�����                              //����
class WhileDemo3 {
	public static void main(String[] args) {
		int x = 0;
		do 
		{
		System.out.println("HelloWorld");
		x++;
		}
		while(x<10)
	}
}
*/
class WhileDemo3 {
	public static void main(String[] args) {
		int count =0;                      
		int x =1;
		int y =884800;
		while (y>x)
		{
			x *= 2;
			System.out.println(x);
			count++;
		}
		System.out.println("count:"+count);
	}
}
