//参数类型不同
//比较两个数是否相等，参数类型分别为两个byte，两个short，两个int，两个long类型，分别在main中测试
class FunctionTest6 {
	public static void main(String[] args) {
		byte a1=1;
		byte a2=2;
		//正常应当接收后输出，此处省略
		//boolean flag = compare(a1,a2);
		// System.out.println(flag);
		System.out.println("byte"+compare(a1,a2));

		short b1=2;
		short b2=2;
		System.out.println("short"+compare(b1,b2));

		int c1=3;
		int c2=2;
		System.out.println("int"+compare(c1,c2));

		long d1=2;
		long d2=2;
		System.out.println("long"+compare(d1,d2));
	}

	public static boolean compare(byte a,byte b){
		System.out.println("byte");
		return  a == b;
	}

	public static boolean compare(short a,short b){
		System.out.println("short");
		return  a == b;
	}

	public static boolean compare(int a,int b){
		System.out.println("int");
		return  a == b;
	}

	public static boolean compare(long a,long b){
		System.out.println("long");
		return  a == b;
	}
}

