/*
for循环基本格式：
	for（初始化语句;判断条件语句;控制条件语句）{
	循环体语句;
	}
while循环基本格式；
	初始化语句;
	while（判断条件语句）{
	循环体语句;
	控制条件语句;
	}
*/
/*for循环      ******for循环x不能超出大括号，超出括号x在内存中就不存在了，而whlie则可以保持存在
	如果在一个范围内计算用for循环
	如果计算范围不明确用while循环
*/
//for循环
class  WhileDemo{
	public static void main(String[] args) {
		for (int x = 1;x<=10 ;x++ )
		{
			System.out.println("Hello World!");
		}
	}
}
//while循环
	class  WhileDemo{
	public static void main(String[] args) {
		int x = 0;
		while (x<10)
		{System.out.println(x);
		 x++;
		}
	}
}
