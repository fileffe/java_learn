//�Ƚ������==,!=,>,>=,<,<=
class OperatorDemo3{
	public static void main(String[] args){
		int x = 3;
		int y = 4;
		int z = 3;
			System.out.println(x==y);     //****ȫ��ΪBoolean���ͣ�ֻ�жԴ�
			System.out.println(x==z);
			System.out.println(x!=y);
			System.out.println(x>y);
			System.out.println(x>=y);
			System.out.println(x<y);
			System.out.println(x<=y);
		int a = 10;
		int b = 20;
		int c = (a=b);
			System.out.println(c);          //c���20
	/*
		int a = (int)'a';                    //ǿ��ת����'a'��Ϊ97
		System.out.println(a);
	*/
	}
}