
/*
//while:1-100֮��
class WhileDemo2 {
	public static void main(String[] args) {
		int sum=0;
		int x =1;
		while (x<=100)
		{sum+=x;                           //*ѭ�������
		 x++;
		}
		System.out.println("sum:"+sum);
	}
}
*/
//ͳ��ˮ�ɻ���
class WhileDemo2 {
	public static void main(String[] args) {
	int count = 0;
	int x = 100;
	while (x<1000)
	{int ge =x%10;
	int shi =x/10%10;
	int bai =x/10/10%10;
	if (x==ge*ge*ge+shi*shi*shi+bai*bai*bai)
	{count++;                                 //*ѭ�������
	}
		x++;
	}
	System.out.println("count:"+count);

	}
}
