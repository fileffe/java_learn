/*
class Practice3
{
	public static void main(String[] args) 
	{
		for (int x=100;x<=1000 ;x++ )
		{
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/100%10;
			if (x==ge*ge*ge+shi*shi*shi+bai*bai*bai)
			{
				System.out.println("水仙花数有"+x);
			}
		}
	}
}
*/
class Practice3
{
	public static void main(String[] args) 
	{
		int count = 0;
		for (int x=100;x<=1000 ;x++ )
		{
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/100%10;
			if (x==ge*ge*ge+shi*shi*shi+bai*bai*bai)
			{
				count++;
			}
		}
			System.out.println("水仙花数有"+count+"个");
	}
}