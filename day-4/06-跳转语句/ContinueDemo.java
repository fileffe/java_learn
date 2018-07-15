//控制跳转语句
class  ContinueDemo{
	public static void main(String[] args) {
		for (int x=0;x<10 ;x++ )
		{ if (x==3)
		{continue;                             //跳出当前循环，进入下一次循环，即x=3不输出
		}
		 System.out.println(x);
		}
	}
}
