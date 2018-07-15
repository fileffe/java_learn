/*
for(初始化语句;判断条件语句;控制条件语句){
				循环体语句;
			}
//控制台输出10次"helloWorld"标准样式
class  ForDemo{
	public static void main(String[] args) {
		for (int x = 1;x<=10 ;x++ )
		{
			System.out.println("Hello World!");
		}
	}
}

//控制台输出1-10
class  ForDemo{
	public static void main(String[] args) {	
		for (int x = 1;x<=10 ;x++ )
		{
			System.out.println(x);
		}
	}
}
或者
class  ForDemo{
	public static void main(String[] args) {
	
		for (int x = 0;x<9 ;x++ )
		{
			System.out.println(x+1);    //重复输出x
		}
	}
}

//求出1-10之和
class  ForDemo{
	public static void main(String[] args) {
		//定义第一个加数sum=0;
		int sum = 0;
		for (int x = 1;x <= 10 ;x++ )
		{
		sum += x;        //重复计算sum
		}//或sum = sum +x
			System.out.println("sum:"+sum);
	}
}

//1-100间的偶数之和
class  ForDemo{
	public static void main(String[] args) {
		int sum = 0;
		for (int x = 1;x <= 100 ;x++ )
		{if (x%2==0)
		{sum += x; 
		}    
		}
			System.out.println("偶数之和为"+sum);
	}
}
*/
//或者
class  ForDemo{
	public static void main(String[] args) {
		int sum = 0;
		for (int x = 0;x <= 100 ;x+=2) {
			sum += x; 
		}  
		System.out.println("偶数之和为"+sum);
	}
}
