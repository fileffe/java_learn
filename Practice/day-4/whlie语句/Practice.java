class  Practice
{
	public static void main(String[] args) 
	{
		int x = 1;
		int y = 884800;
		int count = 0;
		while (x<=y)
		{	
			count++;
			x*=2;
		}
		System.out.println("折叠"+count+"次高为"+x);
	}
}
