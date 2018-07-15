/*
小芳妈妈每天给他2.5元，每当这一天是存钱的第五条或是5的倍数，他就会花去6元，请问，经过多少天，小芳可以存到100元
A；小芳母亲每天给她2.5元
	double dayMoney = 2.5;
B；她都会存起来
	double daySum = 0;
C；从第一天开始存
	int dayCount = 1;
D；经过多少天，小芳可以存到100元；
	double result = 100;
E；存钱第五天或五的倍数，花去六元
	daySum -= 6;
F；不知道多少天，超过100元就退出
*/
class WhileDemo {
	public static void main(String[] args) {
		double dayMoney = 2.5;
		double daySum = 0;
		int dayCount = 1;                                  //第一天开始存钱
		int result = 100;
		while (true)                                       //不知道多少天，所以用while
		{
			daySum += 2.5;
			if (dayCount%5==0)
			{
				daySum-=6;
				System.out.println("第"+dayCount+"花了6元");
			}
			if (daySum>=100)
			{
				System.out.println("第"+dayCount+"存到钱");    
				break;
			}
			dayCount++;
		}
	}
}
//count为1，放在System.out.println("第"+dayCount+"花了6元");与System.out.println("第"+dayCount+"存到钱");后面