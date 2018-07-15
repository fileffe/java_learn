/*
//求5的阶乘
class ForDemo2 {
	public static void main(String[] args) {
		int jc =1;
		for (int x=1;x<=5;x++)
		{
			jc*=x;
		}
		System.out.println("5的阶乘为:"+jc);
	}
}
*/
//水仙花数:例如153=1*1*1+5*5*5+3*3*3
class ForDemo2 {
	public static void main(String[] args) {
		for (int x=100;x<1000;x++)
		{
			int ge = x%10;                               //除10余数为个位数上值
			int shi = x/10%10;                           //除10后再除10为十位数上值
			int bai = x/10/10%10;                        //除100后再除10为百位数上值
			if (x==(ge*ge*ge+bai*bai*bai+shi*shi*shi))
			{
				System.out.println(x);
			}
		}
	}
}
