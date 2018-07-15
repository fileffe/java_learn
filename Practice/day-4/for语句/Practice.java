//1-100偶数和
class Practice {
	public static void main(String[] args) {
		int sum = 0;
		for (int x=0;x<=100;x++ )
		{
			if (x%2==0)
			{
				sum += x;
			}
		}
		System.out.println("sum:"+sum);
	}
}
