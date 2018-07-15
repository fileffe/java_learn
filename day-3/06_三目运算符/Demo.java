//三元运算符
class Demo{
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		//判断a与b对比，大于则输出冒号前的值，小于则输出冒号后的值
		int max = ((a>b)?a:b);
		System.out.println("max:"+max);
		int temp = ((a>b)?a:b);
		int max1 = ((temp>c)?temp:c);
		System.out.println("max1:"+max1);
		int max2 =(a>b)?((a>c)?a:c):((b>c)?b:c); //一步走
		System.out.println("max2:"+max2);
		boolean flag = (a==b)?true:false;
		System.out.println(flag);
	}
}
