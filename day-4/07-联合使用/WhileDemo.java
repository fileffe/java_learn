/*
С������ÿ�����2.5Ԫ��ÿ����һ���Ǵ�Ǯ�ĵ���������5�ı��������ͻỨȥ6Ԫ�����ʣ����������죬С�����Դ浽100Ԫ
A��С��ĸ��ÿ�����2.5Ԫ
	double dayMoney = 2.5;
B�������������
	double daySum = 0;
C���ӵ�һ�쿪ʼ��
	int dayCount = 1;
D�����������죬С�����Դ浽100Ԫ��
	double result = 100;
E����Ǯ���������ı�������ȥ��Ԫ
	daySum -= 6;
F����֪�������죬����100Ԫ���˳�
*/
class WhileDemo {
	public static void main(String[] args) {
		double dayMoney = 2.5;
		double daySum = 0;
		int dayCount = 1;                                  //��һ�쿪ʼ��Ǯ
		int result = 100;
		while (true)                                       //��֪�������죬������while
		{
			daySum += 2.5;
			if (dayCount%5==0)
			{
				daySum-=6;
				System.out.println("��"+dayCount+"����6Ԫ");
			}
			if (daySum>=100)
			{
				System.out.println("��"+dayCount+"�浽Ǯ");    
				break;
			}
			dayCount++;
		}
	}
}
//countΪ1������System.out.println("��"+dayCount+"����6Ԫ");��System.out.println("��"+dayCount+"�浽Ǯ");����