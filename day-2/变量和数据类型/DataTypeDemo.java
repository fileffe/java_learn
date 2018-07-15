class  DataTypeDemo{
	public static void main(String[] args) {
		byte b=10;
		System.out.println(10);
		//把10赋值给了b，此处b输出也为10
		System.out.println(b);
		short s=100;
		System.out.println(s);
		//long后跟L，folat后跟F
		/*
		强制转换（可能损失精度）
		目标数据类型 变量名=（目标数据类型）（被转换的数据）
		例如folat 12.345=(folat)12.345;
		*/
		//c输出100000
		long c=100000L;
		System.out.println(c);
		char a='b';
		boolean flag=true;
		//b转换为a，此处输出b
		//此处字符未参与运算，若参与运算，'a'=97,'A=65','0'=48
		System.out.println(a);
		System.out.println(flag);
	}
}
