//控制跳转语句break，continue，return不同点
class ReturnDemo {
	public static void main(String[] args) {
		for (int x=0;x<10 ;x++ )
		{if (x==2)
		{
		System.out.println("退出");
		//break; 结果:0  1  退出  over                      循环内结束
		//continue;结果:0 1 退出 3 4 5 6 7 8 9 over         循环内跳过
		return; //结果:0 1 退出（没有over）                 整个方法结束
		}
		System.out.println(x);
		}
		System.out.println("over");
	}
}
