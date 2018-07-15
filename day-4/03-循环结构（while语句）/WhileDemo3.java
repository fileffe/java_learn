//一张纸0.01米，折叠多少次不低于8848米
/*
class WhileDemo3 {
	public static void main(String[] args) {
		int count =0;
		int x =1;
		int y =884800;
		while (y>x)
		{
		 count++;
		 x *= 2;                                
		 System.out.println(x);                 //不放到大括号外
		}
		System.out.println("count:"+count);
	}
}
*/
/* 
do...while循环语句                              //少用
class WhileDemo3 {
	public static void main(String[] args) {
		int x = 0;
		do 
		{
		System.out.println("HelloWorld");
		x++;
		}
		while(x<10)
	}
}
*/
class WhileDemo3 {
	public static void main(String[] args) {
		int count =0;                      
		int x =1;
		int y =884800;
		while (y>x)
		{
			x *= 2;
			System.out.println(x);
			count++;
		}
		System.out.println("count:"+count);
	}
}
