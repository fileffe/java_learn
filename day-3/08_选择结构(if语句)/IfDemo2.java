class IfDemo2 {
	public static void main(String[] args) {
		int x = 10;
		if ((x>5)||(x==10));{
		System.out.println("x大于5或x小于10!");
		}
		int a = 100;
		if (a>195);
		{
			System.out.println("a大于195");    //"a大于195"与"over"都在{}内，所以a>195不能满足时都不执行
			System.out.println("over"); 
		}
		//注意，"if（b!=100）"后加了";"表示句子结束，此处为空句，不再影响后面代码内容，可以输出。*左大括号与分号不同时存在。
		int b = 100;
		if (b!=100);
		{
			System.out.println("b大于195");
			System.out.println("over");
		}
	}
}
