/*
//��5�Ľ׳�
class ForDemo2 {
	public static void main(String[] args) {
		int jc =1;
		for (int x=1;x<=5;x++)
		{
			jc*=x;
		}
		System.out.println("5�Ľ׳�Ϊ:"+jc);
	}
}
*/
//ˮ�ɻ���:����153=1*1*1+5*5*5+3*3*3
class ForDemo2 {
	public static void main(String[] args) {
		for (int x=100;x<1000;x++)
		{
			int ge = x%10;                               //��10����Ϊ��λ����ֵ
			int shi = x/10%10;                           //��10���ٳ�10Ϊʮλ����ֵ
			int bai = x/10/10%10;                        //��100���ٳ�10Ϊ��λ����ֵ
			if (x==(ge*ge*ge+bai*bai*bai+shi*shi*shi))
			{
				System.out.println(x);
			}
		}
	}
}
