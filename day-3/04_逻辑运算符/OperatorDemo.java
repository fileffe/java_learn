//逻辑运算符&,|,^,!,&&,||用于连接boolean类型的式子
/*
&:有false则false
|:有true则true
^:相同则false，不同则true。
!:非true则false，非false则true
&&:结果和&是一样的，只不过有短路效果。左边是false，右边不执行。
||:结果和|是一样的，只不过有短路效果。左边是true，右边不执行。
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
		System.out.println("b==c");           //输出b==c
		System.out.println((a<b)^(b==c));
		/*
		System.out.println((a>b)&&(b>c));//有一个false就是false
		System.out.println((a<b)&&(b==c));
		System.out.println((a<b)&&(b>c));
		System.out.println((a>b)||(b>c));//有一个true就是true
		System.out.println((a<b)||(b==c));
		System.out.println((a<b)||(b>c));
		*/
	
	}
}
