//������ת���break��continue��return��ͬ��
class ReturnDemo {
	public static void main(String[] args) {
		for (int x=0;x<10 ;x++ )
		{if (x==2)
		{
		System.out.println("�˳�");
		//break; ���:0  1  �˳�  over                      ѭ���ڽ���
		//continue;���:0 1 �˳� 3 4 5 6 7 8 9 over         ѭ��������
		return; //���:0 1 �˳���û��over��                 ������������
		}
		System.out.println(x);
		}
		System.out.println("over");
	}
}
