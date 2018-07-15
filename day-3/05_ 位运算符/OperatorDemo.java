class  OperatorDemo{
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		//&转换为二进制，有0则0
		System.out.println(3&4);
		//&转换为二进制，有1则1
		System.out.println(3|4);
		//&转换为二进制，相同则0，不同则1（^的特殊用法 例如a^b^b,结果为a）
		System.out.println(3^4);
		/*
		0变1，1变0后得到补码
		补码11111111 11111111 11111111 11111100
		反码11111111 11111111 11111111 11111011（补码减1）
		原码10000000 00000000 00000000 00000100（首位不变，其他相反）
		*/
		System.out.println(~3);
	}
}
