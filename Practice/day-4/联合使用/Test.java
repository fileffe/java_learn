//小芳妈妈每天给她2.5元，每五天或5的倍数天，花去6元，问多少天小芳能积满100元
class  Test
{
	public static void main(String[] args) 
	{
		//count天积满
		int dayCount=0;                       //第一天开始存钱
		//count天，集满daySum元
		double daySum = 0;
		while (true)
		{
			daySum += 2.5;
			if (dayCount%5==0)
			{
				daySum-=6;
			}
			if (daySum>=100)
			{	
				System.out.println(dayCount+"天集满一百元");
				break;
			}
			dayCount++;
		}

	}
}
