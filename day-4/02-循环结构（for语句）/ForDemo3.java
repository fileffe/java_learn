/*
//��λ�����㣺��λ����λ��ͬ��ʮλ��ǧλ��ͬ����λ���ڸ�λ��ʮλ��ǧλ����λ
class ForDemo3 {
	public static void main(String[] args) {
		for (int x=10000;x<100000 ;x++ )
		{int ge = x%10;
		int shi = x/10%10;
		int bai = x/100%10;
		int qian= x/1000%10;
		int wan = x/10000%10;
		if ((ge==wan)&&(shi==qian)&&(bai==ge+shi+qian+wan))
		{System.out.println(x);
		}
		}
		
	}
}
*/
//ˮ�ɻ���:����153=1*1*1+5*5*5+3*3*3,��ˮ�ɻ����ж��ٸ���
class ForDemo3 {
	public static void main(String[] args) {
		int count = 0;                   //*
		for (int x=100;x<1000;x++)
		{int ge = x%10;
		int shi = x/10%10;
		int bai = x/10/10%10;
		if (x==(ge*ge*ge+bai*bai*bai+shi*shi*shi))
		{count ++;                       //*
		}
		}
		System.out.println(count);
		
	}
}
