class  OperatorDemo{
	public static void main(String[] args) {
		int a = 3;
		int b = 4;

		System.out.println(3&4);//�������ƺ���0��0
		System.out.println(3|4);//��1��1
		System.out.println(3^4);//��ͬ��0����ͬ��1
		System.out.println(~3);//0��1��1��0���ò������Դ��3
		System.out.println(a^b^a);//���Ϊ4��ĳһ���ݱ���һ����^���Σ��������
		System.out.println(a^b^b);//���Ϊ3
	}
}
