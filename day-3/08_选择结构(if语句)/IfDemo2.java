class IfDemo2 {
	public static void main(String[] args) {
		int x = 10;
		if ((x>5)||(x==10));{
		System.out.println("x����5��xС��10!");
		}
		int a = 100;
		if (a>195);
		{
			System.out.println("a����195");    //"a����195"��"over"����{}�ڣ�����a>195��������ʱ����ִ��
			System.out.println("over"); 
		}
		//ע�⣬"if��b!=100��"�����";"��ʾ���ӽ������˴�Ϊ�վ䣬����Ӱ�����������ݣ����������*���������ֺŲ�ͬʱ���ڡ�
		int b = 100;
		if (b!=100);
		{
			System.out.println("b����195");
			System.out.println("over");
		}
	}
}
