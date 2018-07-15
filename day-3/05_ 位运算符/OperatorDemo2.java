class  OperatorDemo{
	public static void main(String[] args) {
		int a = 3;
		int b = 4;

		System.out.println(3&4);//换二进制后，有0则0
		System.out.println(3|4);//有1则1
		System.out.println(3^4);//相同则0，不同则1
		System.out.println(~3);//0变1，1变0，得补码后求源码3
		System.out.println(a^b^a);//结果为4，某一数据被另一数据^两次，结果不变
		System.out.println(a^b^b);//结果为3
	}
}
