//�߼������&,|,^,!,&&,||��������boolean���͵�ʽ��
/*
&:��false��false
|:��true��true
^:��ͬ��false����ͬ��true��
!:��true��false����false��true
&&:�����&��һ���ģ�ֻ�����ж�·Ч���������false���ұ߲�ִ�С�
||:�����|��һ���ģ�ֻ�����ж�·Ч���������true���ұ߲�ִ�С�
*/
class OperatorDemo {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 3;
		c=b;
		
		System.out.println((a>b)&(b>c));
		System.out.println((a>b)|(b>c));
		System.out.println((a>b)^(b>c));
		System.out.println(!(b==c));
		System.out.println(!!(b==c));
		System.out.println(!!!(b==c));
		System.out.println(b==c);
		System.out.println("b==c");           //���b==c
		System.out.println((a<b)^(b==c));
		/*
		System.out.println((a>b)&&(b>c));//��һ��false����false
		System.out.println((a<b)&&(b==c));
		System.out.println((a<b)&&(b>c));
		System.out.println((a>b)||(b>c));//��һ��true����true
		System.out.println((a<b)||(b==c));
		System.out.println((a<b)||(b>c));
		*/
	
	}
}
