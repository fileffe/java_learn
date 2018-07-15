//比较运算符==,!=,>,>=,<,<=
class OperatorDemo3{
	public static void main(String[] args){
		int x = 3;
		int y = 4;
		int z = 3;
			System.out.println(x==y);     //****全部为Boolean类型，只有对错
			System.out.println(x==z);
			System.out.println(x!=y);
			System.out.println(x>y);
			System.out.println(x>=y);
			System.out.println(x<y);
			System.out.println(x<=y);
		int a = 10;
		int b = 20;
		int c = (a=b);
			System.out.println(c);          //c输出20
	/*
		int a = (int)'a';                    //强制转换，'a'变为97
		System.out.println(a);
	*/
	}
}